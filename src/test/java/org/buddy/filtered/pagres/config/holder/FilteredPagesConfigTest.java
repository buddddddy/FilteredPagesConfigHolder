package org.buddy.filtered.pagres.config.holder;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Short description text.
 * <p>
 * Long detailed description text for the specific class file.
 *
 * @author SSukhanov
 * @version 16.02.2018
 * @package org.buddy.filtered.pages.config.holder
 */

public class FilteredPagesConfigTest {

    private static final String SKIPPED_DIRECTORY = "WEB-INF";
    private static final String JSP_FILE_EXTENSION = ".jsp";

    //TODO set to WebContent directory
    private static final String ROOT_DIRECTORY = "src/test/resources/test_directory";

    @Test
    public void testAllJspFromWebContentExistsInFilteredPagesConfig() throws IOException {

        Path path = Paths.get(ROOT_DIRECTORY);

        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                if (shouldSkip(dir)) {
                    return FileVisitResult.SKIP_SUBTREE;
                }
                return super.preVisitDirectory(dir, attrs);
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

                if (file.endsWith(JSP_FILE_EXTENSION)) {

                    final String relativeFilePath =
                            separatorsToSystem(File.separatorChar + path.relativize(file).toString());

                    if (!FilteredPagesConfig.getPagesList().contains(relativeFilePath)) {
                        throw new IllegalStateException("File: " + relativeFilePath + " exists on file system " +
                                "and doesn't exists in filtered pages config!");
                    }
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }

    @Test
    public void testAllFilesFromFilteredPagesConfigExistsInWebContentDirectory() throws IOException {
        Path rootPath = Paths.get(ROOT_DIRECTORY);

        FilteredPagesConfig.getPagesList().stream().forEach(fileString -> {
            if (!fileString.endsWith(JSP_FILE_EXTENSION)) {
                throw new IllegalStateException("Invalid file name: " + fileString +
                        " exists in filtered pages config! Only JSP-files allowed!");
            }

            File file = new File(rootPath.toAbsolutePath().toString() + Paths.get(fileString));
            if (!file.exists()) {
                throw new IllegalStateException("File: " + file.getAbsolutePath() +
                        " exists in filtered pages config and doesn't exists on file system!");
            }
        });
    }

    private static String separatorsToSystem(String path) {
        if (path == null) return null;

        if (File.separatorChar == '\\') {
            // From Windows to Linux/Mac
            return path.replace('\\', '/');
        }
        return path;
    }

    private static boolean shouldSkip(Path path) {
        return path.getFileName().toString().equals(SKIPPED_DIRECTORY);
    }
}
