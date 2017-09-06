package Cucumber_Feature;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef1 
{
	@Before("@tag1")
	public void tagged_before()
	{
		System.out.println("inside tagged before");
	}
	@Before()
	public void before()
	{
		System.out.println("Normal Before");
	}
	@Given("^The browser is opened$")
	public void the_browser_is_opened() throws Throwable {
	   System.out.println("Given");
	}

	@When("^I enter the Username and password$")
	public void i_enter_the_Username_and_password() throws Throwable {
		System.out.println("When");
	}

	@Then("^The UPM homescreen should open$")
	public void the_UPM_homescreen_should_open() throws Throwable {
		System.out.println("then");
	}

}
