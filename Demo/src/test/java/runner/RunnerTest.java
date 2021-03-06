package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="src/test/resources/features",
		glue="stepdefinitions",
		tags={"@smoke"},
        
		plugin = {"pretty",
				"html:target/html/",
				"json:target/json/file.json"
				
		}
		

		)
//RunnerClass
public class RunnerTest{
	
}

