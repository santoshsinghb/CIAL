package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"Features"}, 
	                 glue = "stepdefinition",
	                 monochrome = true,
	                 plugin = { "json:target/cucumber.json",
	                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	                		 "rerun:Rerun/rerun1.txt" },
	                 		
	              //   tags ="@warehouseLocation")
	                // tags ="@starting_TO_vctGENERATION_flowcovercial")
	               //  tags ="@VCT_to_SECURITY_flowcovercial")
                   //  tags ="@SECURITY_acceptance_flowcial")
	               //   tags ="@AWBdeatilsTabFlowCial")
	                 tags ="@BuildManifest")

public class TestRunner {

}