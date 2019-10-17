package io.sl.ex.cucumber2.junit4;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-report.json"})
public class RunCucumberTest {

}
