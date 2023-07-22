package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src//test//java//FeatureFiles", 
				glue = "stepDefinition",
				plugin= {"pretty","html:target/CucumberReport.html"})
public class Runner {

}
