package io.sl.ex.cucumber4.junit4;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"progress", "summary", "json:target/cucumber-report.json"})
public class RunCucumberTest {

}
