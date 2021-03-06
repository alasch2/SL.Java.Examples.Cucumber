package io.sl.ex.cucumber2.junit4.basetestevents;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
        features = "src/test/resources/test_events.feature",
        monochrome = true,
        tags = {"not @Skipped"})
public class RunCucumberTest {
}
