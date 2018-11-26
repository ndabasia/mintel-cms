package com.mintel.pages;

import io.magentys.cinnamon.webdriver.elements.PageElement;
import org.openqa.selenium.support.FindBy;

import static com.mintel.data.Data.DEFAULT_PASSWORD;
import static com.mintel.data.Data.DEFAULT_USERNAME;
import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.displayed;

public class LoginPage {

    @FindBy(name = "username")
    public PageElement usernameField;
    @FindBy(name = "password")
    public PageElement passwordField;
    @FindBy(id = "page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")
    public PageElement loginButton;

    public LoginPage enterUsername() {
        usernameField.waitUntil(displayed).sendKeys(DEFAULT_USERNAME);
        return this;
    }

    public LoginPage enterPassword() {
        passwordField.sendKeys(DEFAULT_PASSWORD);
        return this;
    }

    public LoginPage clickLoginLink() {
        loginButton.click();
        return this;
    }
}