package com.petclinic.stepdefs;

import java.util.Map;

import org.junit.Assert;

import cucumber.api.java.en.Then;

/**
 * Verifications Class contains the Step Definitions for the Cucumber Keyword
 * "Then"
 * 
 * @author madhusudhan.jr@gmail.com
 */
public class Verifications extends CommonHelper {

	@Then("^I see the pet clinic logo below the welcome text\\.$")
	public void i_see_the_pet_clinic_logo_below_the_welcome_text() throws Throwable {

		Assert.assertTrue("Pet Clinic Logo Not Displayed", m_homePage.getPetClinicLogoElement().isDisplayed());
	}

	@Then("^I validate the new owner ([^\\\"]*), ([^\\\"]*) is added$")
	public void i_validate_the_new_owner_is_added(String fName, String lName) throws Throwable {

		Map<String, String> ownerInfo = m_ownersPage.getOwnersInformaiton();
		Assert.assertEquals(fName + " " + lName, ownerInfo.get("Name"));

	}

	@Then("^I validate the owner details ([^\\\"]*), ([^\\\"]*) and ([^\\\"]*) is updated$")
	public void i_validate_the_owner_details_is_updated(String address, String city, String telephone)
			throws Throwable {

		Map<String, String> updatedOwnersInfo = m_ownersPage.getOwnersInformaiton();
		Assert.assertEquals(address, updatedOwnersInfo.get("Address"));
		Assert.assertEquals(city, updatedOwnersInfo.get("City"));
		Assert.assertEquals(telephone, updatedOwnersInfo.get("Telephone"));
	}

	@Then("^I validate the owner details of ([^\\\"]*)$")
	public void i_validate_the_existing_owner_details(String lName) throws Throwable {

		Map<String, String> existingOwnersInfo = m_ownersPage.getOwnersInformaiton();
		Assert.assertTrue("Owners LastName did not match!", existingOwnersInfo.get("Name").contains(lName));
		Assert.assertTrue("Owners Address not found!", !existingOwnersInfo.get("Address").isEmpty());
		Assert.assertTrue("Owners City not found!", !existingOwnersInfo.get("City").isEmpty());
		Assert.assertTrue("Owners Telephone not found!", !existingOwnersInfo.get("Telephone").isEmpty());
	}

	@Then("^I see the list of veterinarians$")
	public void i_see_the_list_of_veterinarians() throws Throwable {

		Map<String, String> vetsInfo = m_veterinariansPage.getVetsInformaiton();
		Assert.assertTrue("Vets Information not found", vetsInfo.size() != 0);
	}

	@Then("^I validate the new pet ([^\\\"]*) is added$")
	public void i_validate_the_new_pet_is_added(String name) throws Throwable {

		Map<String, String> petsInfo = m_ownersPage.getPetsInformaiton();
		Assert.assertEquals(name, petsInfo.get("Name"));
	}

	@Then("^I validate the new visit with ([^\\\"]*) is added$")
	public void i_validate_the_new_visit_is_added(String desc) throws Throwable {

		Map<String, String> visitsInfo = m_ownersPage.getVisitsInformaiton();
		Assert.assertTrue("Visits Info Not found!", visitsInfo.containsValue(desc));
	}

	@Then("^I validate my pets ([^\\\"]*) and visit details ([^\\\"]*)$")
	public void i_validate_my_pets_and_visit_details(String name, String desc) throws Throwable {

		Map<String, String> petsInfo = m_ownersPage.getPetsInformaiton();
		Assert.assertEquals(name, petsInfo.get("Name"));
		Map<String, String> visitsInfo = m_ownersPage.getVisitsInformaiton();
		Assert.assertTrue("Visits Info Not found!", visitsInfo.containsValue(desc));

	}
}