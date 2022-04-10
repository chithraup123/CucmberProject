package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = {"html:target/cucumber-html", "json:target/cucumber.json"},
		features = "src/test/java/features",
		// tags = { "@Sanity"}--> for single
		
		//"@anno1, @anno2"--->OR
		//tags = { "@Sanity, @Regression" }, 
		
		//"@anno1", "@anno2"--->AND
		//tags = { "@Regression", "@Rapid" },	
		
		// if we have 100 scenarios but if some is getting failed in jenkins job, for time timebeing if we want ot ignore those then use this
		//tags = { "not @Rapid" },
		 tags = { "@Sanity and not @Rapid", "@Regression"},
		
		glue = { "stepDefs" })
public class TestRunner {
}