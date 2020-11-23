package com.amazon.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions (
        features = "src/test/resources/features",
        dryRun = false,
        glue = "com.amazon.steps"
)
public class AlexaRunner {

}
