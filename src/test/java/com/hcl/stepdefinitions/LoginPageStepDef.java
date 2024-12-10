package com.hcl.stepdefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	
	@Given("the user launch browser with an url")
	public void the_user_launch_browser_with_an_url() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("======the user launch browser with an url========");
		
	}

	@When("the user enters valid credentials as username {string} and password {string}")
	public void the_user_enters_valid_credentials_as_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("the user able to login application")
	public void the_user_able_to_login_application() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Home page will be displayed")
	public void home_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@Given("User is on Home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("User should be able to see an {string}")
	public void user_should_be_able_to_see_an(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}
	

	@Given("User is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
	}
	@When("User enters valid credentials")
	public void user_enters_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<List<String>> list=dataTable.asLists(String.class);
		System.out.println("===============================");
		System.out.println(list.get(0).get(0));
		System.out.println(list.get(0).get(1));
		System.out.println(list.get(1).get(0));
		System.out.println(list.get(1).get(1));
		System.out.println("===============================");
		


		
		
	}
	@Then("User should be able to login successfully and new page open")
	public void user_should_be_able_to_login_successfully_and_new_page_open() {
	    // Write code here that turns the phrase above into concrete actions
	}


	@Then("User enters invalid credentials and Login will be unsuccessful with error message")
	public void user_enters_invalid_credentials_and_login_will_be_unsuccessful_with_error_message(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	}







}
