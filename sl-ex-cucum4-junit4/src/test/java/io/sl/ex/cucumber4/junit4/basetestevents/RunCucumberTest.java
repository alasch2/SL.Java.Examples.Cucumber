package io.sl.ex.cucumber4.junit4.basetestevents;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","summary"},
        features = "src/test/resources/test_events.feature",
        tags = {"~@Skipped"}, 
        monochrome = true)
public class RunCucumberTest {
}
