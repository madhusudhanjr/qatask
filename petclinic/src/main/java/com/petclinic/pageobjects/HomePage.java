package com.petclinic.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.petclinic.utils.CommonUtil;

/**
 * PetClinic HomePage Class contains info on all the WebElements and its actions
 * 
 * @author mjr (madhusudhan.jr@gmail.com)
 */
public class HomePage extends BasePage {

	@FindBy(css = ".img-responsive")
	WebElement petClinicLogo;

	@FindBy(css = "a[title='find owners']")
	WebElement findOwners;

	@FindBy(css = "a[title='veterinarians']")
	WebElement veterinarians;

	public HomePage(WebDriver driver) {

		super(driver);
	}

	/**
	 * This method is used to get the FirstName Element
	 */
	public WebElement getPetClinicLogoElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, petClinicLogo);
	}

	/**
	 * This method is used to get the Find Owners Element
	 */
	private WebElement getfindOwnersElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, findOwners);
	}

	/**
	 * This method is used to get the veterinarians Element
	 */
	private WebElement getVeterinariansElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, veterinarians);
	}

	/**
	 * This method is used to click the "Find Owners" link in Home Page
	 */
	private void clickFindOwnnersLink() {

		getfindOwnersElement().click();
	}

	/**
	 * This method is used to click the "veterinarians" link in Home Page
	 */
	private void clickVeterinariansLink() {

		getVeterinariansElement().click();
	}

	/**
	 * This method is used to navigate to Owners page
	 * 
	 * @return OwnersPage
	 */
	public OwnersPage navigateToOwnersPage() {

		clickFindOwnnersLink();
		return new OwnersPage(m_driver);

	}

	/**
	 * This method is used to navigate to Veterinarians page
	 * 
	 * @return VeterinariansPage
	 */
	public VeterinariansPage navigateToVeterinariansPage() {

		clickVeterinariansLink();
		return new VeterinariansPage(m_driver);

	}
}
