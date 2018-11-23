package com.mintel.acceptancetests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "io.magentys.cinnamon", "com.mintel" },
        features = "src/test/resources/features",
        format = { "pretty",
                "json:target/cucumber-reports/cucumber.json",
                "rerun:target/cucumber-reports/failedscenarios.txt"},
        tags = { "@complete,@accepted" })

public class AllTests {
}
