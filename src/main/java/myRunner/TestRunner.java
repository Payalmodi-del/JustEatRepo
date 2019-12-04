

package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Selenium_Workspace\\JustEatWithBDD_Payal\\src\\main\\java\\features\\JustEat.feature",
			glue={"stepDefinitions"}, 
			//to generate different types of reporting
			plugin = { "pretty", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml",
					 "html:target/cucumber-reports"},
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false//to check the mapping is proper between feature file and step def file
			)
	 
	public class TestRunner {

		public static void main(String[] args) {
			
		}
	 
	}
	

