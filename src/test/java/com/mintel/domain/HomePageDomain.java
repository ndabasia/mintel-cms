package com.mintel.domain;

import com.google.inject.Inject;
import com.mintel.pages.HomePage;

public class HomePageDomain {

    @Inject
    private HomePage homePage;

    public HomePageDomain navigateSiteType()  {
        homePage
                .dashboardTitle()
                .clickSiteType()
                .selectContentSite();
        return this;
    }

    public HomePageDomain clickContentType(String hubName)  {
        homePage
                .selectHubType(hubName);
        return this;
    }
}
