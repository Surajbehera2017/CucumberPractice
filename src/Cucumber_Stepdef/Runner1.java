package Cucumber_Stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		tags = "@tag3",
		features = "D:/Selenium/Mars_Wrkspace/Cucumber/src/Cucumber_Feature/UPM.feature",
		glue = "Cucumber_Stepdef"
		,monochrome= true
		,format  = "pretty"
		)

public class Runner1 
{
	

}
