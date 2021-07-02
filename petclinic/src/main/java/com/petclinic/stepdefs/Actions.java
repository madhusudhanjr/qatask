package com.petclinic.stepdefs;

import cucumber.api.java.en.When;

/**
 * Actions Class contains the Step Definitions for the Cucumber Keyword "When" and "And"
 * 
 * @author madhusudhan.jr@gmail.com
 */
public class Actions extends CommonHelper {

	@When("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		m_homePage = launchURL();
	}

	@When("^I want to add a new owner$")
	public void i_want_to_add_a_new_owner() throws Throwable {
		m_ownersPage = m_homePage.navigateToOwnersPage();
	}

	@When("^I enter the new owner details ([^\\\"]*), ([^\\\"]*), ([^\\\"]*), ([^\\\"]*) and ([^\\\"]*)$")
	public void i_enter_the_new_owner_details(String fName, String lName, String address, String city, String telephone)
			throws Throwable {
		m_ownersPage.enterOwnerDetails(fName, lName, address, city, telephone);
	}

	@When("^submit the form$")
	public void submit_the_form() throws Throwable {
		m_ownersPage.submitForm();
	}

	@When("^I search for an existing owner with lastname ([^\\\"]*)$")
	public void i_search_for_an_existing_owner_with_lastname(String lName) throws Throwable {
		m_homePage.navigateToOwnersPage();
		m_ownersPage.findOwnerByLastName(lName);
	}

	@When("^I enter the updated owner details ([^\\\"]*), ([^\\\"]*) and ([^\\\"]*)$")
	public void i_enter_the_updated_owner_details(String address, String city, String telephone) throws Throwable {
		m_ownersPage.editOwnersInfo(address, city, telephone);
	}

	@When("^I want to view the list of veterinarians$")
	public void i_want_to_view_the_list_of_veterinarians() throws Throwable {
		m_veterinariansPage = m_homePage.navigateToVeterinariansPage();
	}

	@When("^I enter the new pet details ([^\\\"]*), ([^\\\"]*) and ([^\\\"]*)$")
	public void i_enter_the_new_pet_details(String name, String date, String type) throws Throwable {
		m_ownersPage.addNewPet(name, date, type);
	}

	@When("^I enter visit description ([^\\\"]*)$")
	public void i_enter_visit_description(String desc) throws Throwable {
		m_ownersPage.addNewVisit(desc);
	}

}