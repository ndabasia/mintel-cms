package com.mintel.domain;

import com.google.inject.Inject;
import com.mintel.pages.LoginPage;

public class LoginDomain {

    @Inject
    private LoginPage loginPage;

    public LoginDomain doLogin() {
        loginPage
                .enterUsername()
                .enterPassword()
                .clickLoginLink();
        return this;
    }
}
