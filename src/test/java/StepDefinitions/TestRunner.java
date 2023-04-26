package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
	glue = {"StepDefinitions"},
	monochrome = true,
	plugin = {"pretty","html:target/Reports/HTML_Report/report.html","json:target/Reports/JSON_Report/report.json","junit:target/Reports/JUNIT_Report/report.xml"})
public class TestRunner {

}