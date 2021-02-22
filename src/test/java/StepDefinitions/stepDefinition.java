package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^User is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("navigated to login url");
	}

	@When("^User login into application  with username and passoword$")
	public void user_login_into_application_with_username_and_passoword() throws Throwable {
		System.out.println("Logged in successfully");
	}

	@Then("^Homepage is populated$")
	public void homepage_is_populated() throws Throwable {
		System.out.println("login validated");
	}

	@And("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("cards validated");
	}

}