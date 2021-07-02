package com.petclinic.pageobjects;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.petclinic.utils.CommonUtil;

/**
 * OwnersPage Class contains info of all the WebElements of PetClinic -> Owners
 * and its Actions
 * 
 * @author mjr (madhusudhan.jr@gmail.com)
 */
public class OwnersPage extends BasePage {

	/**
	 * Class variables which holds the reference to the OwnersPage WebElements
	 */

	@FindBy(id = "firstName")
	WebElement firstName;

	@FindBy(id = "lastName")
	WebElement lastName;

	@FindBy(id = "address")
	WebElement address;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(id = "telephone")
	WebElement telephone;

	@FindBy(css = "[type='submit']")
	WebElement submit;

	@FindBy(xpath = "//a[.='Add Owner']")
	WebElement addOwner;

	// Owners Information
	@FindBy(xpath = "//h2[.='Owner Information']")
	WebElement ownerInformationHeader;

	@FindBy(css = ".table-striped tbody")
	WebElement ownerInformationTable;

	@FindBy(css = "#owners a")
	WebElement ownerNameLink;

	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement editOwner;

	@FindBy(xpath = "//a[contains(.,'Add')]")
	WebElement addNewPet;

	@FindBy(xpath = "//button[.='Update Owner']")
	WebElement updateOwner;

	// Add new Pet
	@FindBy(id = "name")
	WebElement petName;

	@FindBy(id = "birthDate")
	WebElement petBirthDate;

	@FindBy(id = "type")
	WebElement petType;

	@FindBy(css = ".dl-horizontal")
	WebElement petsTable;

	// Add Visit
	@FindBy(css = ".table-condensed")
	WebElement visitsTable;

	@FindBy(xpath = "//table[@class='table-condensed'] //a[contains(.,'Add')]")
	WebElement addVisit;

	@FindBy(id = "description")
	WebElement visitDescription;

	public OwnersPage(WebDriver driver) {

		super(driver);
	}

	/**
	 * This method is used to get the FirstName Element
	 */
	private WebElement getFirstNameElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, firstName);
	}

	/**
	 * This method is used to get the LastName Element
	 */
	private WebElement getLastNameElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, lastName);
	}

	/**
	 * This method is used to get the Address Element
	 */
	private WebElement getAddressElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, address);
	}

	/**
	 * This method is used to get the City Element
	 */
	private WebElement getCityElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, city);
	}

	/**
	 * This method is used to get the Telephone Element
	 */
	private WebElement getTelephoneElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, telephone);
	}

	/**
	 * This method is used to get the AddOwner Element
	 */
	private WebElement getAddOwnerElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, addOwner);
	}

	/**
	 * This method is used to get the SubmitForm Element
	 */
	private WebElement getSubmitFormElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, submit);
	}

	/**
	 * This method is used to get the OwnersInformation Element
	 */
	private WebElement getOwnerInformationTableElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, ownerInformationTable);
	}

	/**
	 * This method is used to get the EditOwners Element
	 */
	private WebElement getEditOwnerElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, editOwner);
	}

	/**
	 * This method is used to get the AddNewPet Element
	 */
	private WebElement getAddNewPetElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, addNewPet);
	}

	/**
	 * This method is used to get the AddVisit Element
	 */
	private WebElement getAddVisitElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, addVisit);
	}

	/**
	 * This method is used to get the VisitDesc Element
	 */
	private WebElement getVisitDescElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, visitDescription);
	}

	/**
	 * This method is used to get the PetName Element
	 */
	private WebElement getPetNameElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, petName);
	}

	/**
	 * This method is used to get the Pet BirthDate Element
	 */
	private WebElement getPetBirthDateElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, petBirthDate);
	}

	/**
	 * This method is used to get the Pet Type Element
	 */
	private WebElement getPetTypeElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, petType);
	}

	/**
	 * This method is used to get the PetsInformation Element
	 */
	private WebElement getPetsInformationTableElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, petsTable);
	}

	/**
	 * This method is used to get the VisitsInformation Element
	 */
	private WebElement getVisitsInformationTableElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, visitsTable);
	}

	/**
	 * This method is used to enter FirstName
	 */
	private void enterFirsttName(String firstName) {

		getFirstNameElement().sendKeys(firstName);
	}

	/**
	 * This method is used to enter LastName
	 */
	private void enterLastName(String lastName) {

		getLastNameElement().sendKeys(lastName);
	}

	/**
	 * This method is used to enter Address
	 */
	private void enterAddress(String address) {

		getAddressElement().clear();
		getAddressElement().sendKeys(address);
	}

	/**
	 * This method is used to enter City
	 */
	private void enterCity(String city) {

		getCityElement().clear();
		getCityElement().sendKeys(city);
	}

	/**
	 * This method is used to enter Telephone
	 */
	private void enterTelephone(String telephone) {

		getTelephoneElement().clear();
		getTelephoneElement().sendKeys(telephone);
	}

	/**
	 * This method is used to enter Pet Name
	 */
	private void enterPetName(String name) {

		getPetNameElement().clear();
		getPetNameElement().sendKeys(name);
	}

	/**
	 * This method is used to enter Pet BirthDate
	 */
	private void enterPetBirthDate(String date) {

		getPetBirthDateElement().clear();
		getPetBirthDateElement().sendKeys(date);
	}

	/**
	 * This method is used to enter Visit Desc
	 */
	private void enterVisitDesc(String desc) {

		getVisitDescElement().clear();
		getVisitDescElement().sendKeys(desc);
	}

	/**
	 * This method is used to select the Pet type from the dropdown
	 */
	private void selectPetType(String type) {

		CommonUtil.selectOptionByVisibleText(getPetTypeElement(), type);
	}

	/**
	 * This method is used to click the AddOwner link
	 */
	private void clickAddOwnerLink() {

		getAddOwnerElement().click();
	}

	/**
	 * This method is used to click the AddOwner link
	 */
	public void submitForm() {

		getSubmitFormElement().click();
	}

	/**
	 * This method is used to click the EditOwner link
	 */
	private void clickEditOwnerLink() {

		getEditOwnerElement().click();
	}

	/**
	 * This method is used to click the AddNewPet link
	 */
	private void clickAddNewPetLink() {

		CommonUtil.clickUsginJSExecutor(m_driver, getAddNewPetElement());
	}

	/**
	 * This method is used to click the AddNewPet link
	 */
	private void clickAddVisitsLink() {

		getAddVisitElement().click();
	}

	/**
	 * This method is used to add Owner with details
	 * 
	 * @param fName
	 * @param lName
	 * @param address
	 * @param city
	 * @param telephone
	 */
	public void enterOwnerDetails(String fName, String lName, String address, String city, String telephone) {

		clickAddOwnerLink();
		enterFirsttName(fName);
		enterLastName(lName);
		enterAddress(address);
		enterCity(city);
		enterTelephone(telephone);
	}

	/**
	 * This method is used to search an existing owner using Last Name
	 */
	public void findOwnerByLastName(String lName) {

		enterLastName(lName);
		submitForm();
	}

	/**
	 * This method is used to edit the the Owners Information
	 * 
	 * @param address
	 * @param city
	 * @param telephone
	 */
	public void editOwnersInfo(String address, String city, String telephone) {

		clickEditOwnerLink();
		enterAddress(address);
		enterCity(city);
		enterTelephone(telephone);
	}

	/**
	 * This method is used to add New Pet
	 * 
	 * @param name
	 * @param birthDate
	 * @param type
	 */
	public void addNewPet(String name, String birthDate, String type) {

		clickAddNewPetLink();
		enterPetName(name);
		enterPetBirthDate(birthDate);
		selectPetType(type);
	}

	/**
	 * This method is used to add new visit for an existing pet
	 * 
	 * @param desc
	 */
	public void addNewVisit(String desc) {

		clickAddVisitsLink();
		enterVisitDesc(desc);
	}

	/**
	 * This method is used to get the Owners Information from the Owners web table
	 * 
	 * @return Map<Key, Value> ownerInfo
	 */
	public Map<String, String> getOwnersInformaiton() {

		Map<String, String> ownerInfo = new HashMap<String, String>();
		for (WebElement rowElement : getOwnerInformationTableElement().findElements(By.tagName("tr"))) {
			ownerInfo.put(rowElement.findElement(By.tagName("th")).getText(),
					rowElement.findElement(By.tagName("td")).getText());
		}
		return ownerInfo;
	}

	/**
	 * This method is used to get the Pets Information from the Pets web table
	 * 
	 * @return Map<Key, Value> petsInfo
	 */
	public Map<String, String> getPetsInformaiton() {

		Map<String, String> petsInfo = new HashMap<String, String>();
		int i = 0;
		for (WebElement rowElement : getPetsInformationTableElement().findElements(By.tagName("dt"))) {
			petsInfo.put(rowElement.getText(),
					getPetsInformationTableElement().findElements(By.tagName("dd")).get(i).getText());
			i++;
		}
		return petsInfo;
	}

	/**
	 * This method is used to get the Visits Information from the Visits web table
	 * 
	 * @return Map<Key, Value> visitsInfo
	 */
	public Map<String, String> getVisitsInformaiton() {

		Map<String, String> visitsInfo = new HashMap<String, String>();
		for (WebElement rowElement : getVisitsInformationTableElement().findElements(By.tagName("tr"))) {
			if (rowElement.findElements(By.tagName("td")).size() != 0)
				visitsInfo.put(rowElement.findElements(By.tagName("td")).get(0).getText(),
						rowElement.findElements(By.tagName("td")).get(1).getText());
		}
		return visitsInfo;
	}
}
