package Cucumber_Stepdef;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef1 {

	@Given("^The browser is opened$")
	public void the_browser_is_opened() {
		System.out.println("The browser is opened");
	}

	@When("^I enter the \"(.*)\" and \"(.*)\"$")
	// @When("^I enter the Suraj and behera$")
	public void i_enter_the_Uname_and_Pwd(String Uname, String pwd) {
		System.out.println(Uname + "     " + pwd);
	}

	@Then("^The UPM homescreen should open$")
	public void the_UPM_homescreen_should_open() {
		System.out.println("The UPM homescreen should open");
	}

	@When("^I enter the Username and password$")
	public void i_enter_the_Username_and_password(DataTable credentials) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>> data =  credentials.raw();
		System.out.println(data.get(0).get(0));
		Thread.sleep(3000);
		
		System.out.println(data.get(0).get(1));
		Thread.sleep(3000);

		System.out.println(data.get(1).get(0));
		Thread.sleep(3000);

		System.out.println(data.get(1).get(1));
		Thread.sleep(3000);

	}
	
	@When("^I enter the credentials and login$")
	public void i_enter_the_credentials_and_login(List<credentials> cred) throws Exception {
	 
		credentials obj1 = cred.get(0);
		System.out.println(obj1.userName);
		Thread.sleep(3000);
		System.out.println(obj1.password);
		Thread.sleep(3000);
		
		credentials obj2 = cred.get(1);
		System.out.println(obj2.userName);
		Thread.sleep(3000);
		System.out.println(obj2.password);
		Thread.sleep(3000);
		
	}
	
	public class credentials{
		String userName;
		String password;	
	}

}
