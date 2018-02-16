package org.buddy.filtered.pagres.config.holder;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Short description text.
 * <p>
 * Long detailed description text for the specific class file.
 *
 * @author SSukhanov
 * @version 16.02.2018
 * @package org.buddy.filtered.pages.config.holder
 */
public class FilteredPagesConfig {

    private static final Set<String> PAGES_LIST = new HashSet<>(Arrays.asList(
            "/affiliatelogin.jsp",
            "/afterssoclose.jsp",
            "/analyticstracking.jsp",
            "/attachment/google_fetching_error.jsp",
            "/attachment/google_importing_error.jsp",
            "/attachment/not_found_error.jsp",
            "/attachment/style.jsp",
            "/decorators/account.jsp",
            "/decorators/affiliatedecorator.jsp",
            "/decorators/authpage-decorator.jsp",
            "/decorators/landing-page1.jsp",
            "/decorators/main-ad.jsp",
            "/decorators/main.jsp",
            "/decorators/mainnew.jsp",
            "/decorators/msteams-auth-decorator.jsp",
            "/decorators/nocache.jsp",
            "/decorators/simple-tmp.jsp",
            "/decorators/standalone-small.jsp",
            "/decorators/standalone.jsp",
            "/emailcancelaccount.jsp",
            "/error.jsp",
            "/error404.jsp",
            "/gadget/index.jsp",
            "/includes/taglibs.jsp",
            "/index.jsp",
            "/invitation_cancelled.jsp",
            "/invitation_cancelled_registration.jsp",
            "/joinwrike.jsp",
            "/joinwrike_new.jsp",
            "/login.jsp",
            "/mobile/download.jsp",
            "/msteams/msteams_accountcreated.jsp",
            "/msteams/msteams_auth.jsp",
            "/msteams/msteams_auth_complete.jsp",
            "/msteams/msteams_auth_tab.jsp",
            "/msteams/msteams_ce_login.jsp",
            "/msteams/msteams_ce_logout.jsp",
            "/msteams/msteams_ce_logout_impossible.jsp",
            "/msteams/msteams_ce_logout_success.jsp",
            "/msteams/msteams_error.jsp",
            "/msteams/msteams_error_tab.jsp",
            "/msteams/msteams_get_locale.jsp",
            "/msteams/msteams_getchannel_tab.jsp",
            "/msteams/msteams_getgroupchannel.jsp",
            "/msteams/msteams_login.jsp",
            "/msteams/msteams_newproject.jsp",
            "/msteams/msteams_overloadstub.jsp",
            "/msteams/msteams_static_auth.jsp",
            "/msteams/msteams_static_auth_complete.jsp",
            "/msteams/msteams_static_login.jsp",
            "/msteams/msteams_static_newproject.jsp",
            "/notsupportedbrowser.jsp",
            "/oauthcallback.jsp",
            "/open_mobile.jsp",
            "/remindersent.jsp",
            "/remindpwd-sso.jsp",
            "/resendconfirmsucceded.jsp",
            "/rest/appforbidden.jsp",
            "/rest/authorize.jsp",
            "/rest/authorize_bb.jsp",
            "/rest/authorize_iphone.jsp",
            "/rest/OAuthProblemException.jsp",
            "/show-error.jsp",
            "/slackchooseaccount.jsp",
            "/smallmenu.jsp",
            "/ssochooseaccount.jsp",
            "/ssoemailconfirmation.jsp",
            "/ssouserparams.jsp",
            "/translate.jsp",
            "/unbounce.jsp",
            "/version.jsp",
            "/warning.jsp"
    ));

    public static Set<String> getPagesList() {
        return Collections.unmodifiableSet(PAGES_LIST);
    }
}
