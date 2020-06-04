package runner;


import org.testng.annotations.BeforeTest;

import com.acme.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions(features ="src/test/java/features/acme.feature",glue="com/acme/step.definitions",
                 monochrome =true
                 //tags= {"@Sanity"}
                 //dryRun = true,
                 //snippets =SnippetType.CAMELCASE
                 //plugin= {"pretty"}
                 )

public class TC001_ACMELogin_CountrySelection extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		testcaseName ="TC001_ACMELogin_CountrySelection";
		testcaseDec="ACME Login and Country Selection";
		author="Vidhyananth";
		category="Functional Test Case";
		
	}

}
