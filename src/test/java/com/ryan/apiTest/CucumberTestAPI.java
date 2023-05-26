package com.ryan.apiTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        glue = {"com.ryan.apiTest"},
        features = {"src/test/resources/API"},
        plugin = {"pretty", "html:reports/cucumber.html", "json:reports/cucumber.json"}

)
public class CucumberTestAPI {
}
