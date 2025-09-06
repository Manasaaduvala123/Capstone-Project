package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features",
    glue = {"stepDefinitions"},   // 👈 this must match your package name
    plugin = {"pretty", "html:target/htmlreport.html",
    		"json:target/jsonreport",
    		"junit:target/junitreport"
    		},
    monochrome = true
)
public class TestRunner {
}
