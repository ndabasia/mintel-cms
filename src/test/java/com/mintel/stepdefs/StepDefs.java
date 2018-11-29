package com.mintel.stepdefs;

import static com.mintel.data.Data.DEFAULT_PASSWORD;
import static com.mintel.data.Data.DEFAULT_USERNAME;
import javax.inject.Inject;

import com.mintel.domain.BpchDomain;
import com.mintel.domain.HomePageDomain;
import com.mintel.domain.InsightDomain;
import com.mintel.domain.LoginDomain;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {

    @Inject
    private LoginDomain loginDomain;
    @Inject
    private HomePageDomain homePageDomain;
    @Inject
    private BpchDomain bcphDomain;
    @Inject
    private InsightDomain insightDomain;

    @Given("^I have logged in as the correct user$")
    public void login_step() {
        loginDomain.doLogin();
    }

    @When("^I choose Site Type as Contents Hub$")
    public void site_navigation() {
        homePageDomain.navigateSiteType();
    }

    @And("^I choose (.*) as content type$")
    public void select_content_type(String hubName) {
        homePageDomain.clickContentType(hubName);
    }

    @And("^I select an insight to add a comment to$")
    public void select_insight() {
        bcphDomain.clickInsight();
    }

    @And("^I add a comment$")
    public void add_comment() {
        insightDomain.addComment();
    }

    @And("^I delete a comment$")
    public void delete_comment() {
        insightDomain.deleteComment();
    }

    @Then("^the comment is saved$")
    public void check_comment_saved() {
        insightDomain.checkCommentSaved();
    }

    @Then("^the comment is deleted$")
    public void check_comment_deleted() {
        insightDomain.checkCommentDeleted();
    }
}