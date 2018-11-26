package com.mintel.hooks;

import javax.inject.Inject;

import io.magentys.cinnamon.conf.Env;
import cucumber.api.java.Before;
import cucumber.api.java.After;

import static io.magentys.cinnamon.webdriver.Browser.open;

public class Hooks {

    private final Env env;

    @Inject
    public Hooks(final Env env) {
        this.env = env;
    }

    // The website URL is automatically navigated to before each scenario tagged with @complete
    @Before("@complete")
    public void openWebSite() {
        open(env.config.getString("base-url"));
    }

    @After()
    public void logout() throws Throwable {
        Thread.sleep(2000);
    }
}