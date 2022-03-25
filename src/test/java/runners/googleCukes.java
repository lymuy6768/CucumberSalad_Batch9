package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//when we run this, it generates report
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports/index.html"},
		monochrome=true,
		//give the feature file path 
		features="src/test/resources/features/",
		glue="stepDef",//package name
		dryRun=false,//=false,The test method MUST have implementation. If there is no matching test method 
		//in the stepdef class, dryRun will fail.  =true, it will NOT check IMPLEMENTATION, not open browser, not check the script
		tags="@google"//"~@SmokeTest"do everything except smoketest
		//"~@SmokeTest, @"
		
		
		)




public class googleCukes {

}
