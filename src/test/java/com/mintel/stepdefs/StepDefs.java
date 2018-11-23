package com.mintel.stepdefs;

import static com.mintel.data.Data.DEFAULT_PASSWORD;
import static com.mintel.data.Data.DEFAULT_USERNAME;
import javax.inject.Inject;
import com.mintel.domain.LoginDomain;
import com.mintel.domain.HomePageDomain;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefs {

    @Inject
    private LoginDomain loginDomain;
    @Inject
    private HomePageDomain homePageDomain;

    @Given("^I have logged in as the correct user$")
    public void login_step() {
        loginDomain.doLogin(DEFAULT_USERNAME, DEFAULT_PASSWORD);
    }

    @When("^I choose Site Type as Contents Hub$")
    public void site_navigation() {
        homePageDomain.navigateSiteType();
    }

    @And("^I choose (.*) as content type$")
    public void select_content_type(String hubName) {
        homePageDomain.clickContentType(hubName);
    }
}