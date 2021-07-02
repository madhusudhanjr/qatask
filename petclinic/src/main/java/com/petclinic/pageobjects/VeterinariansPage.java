package com.petclinic.pageobjects;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.petclinic.utils.CommonUtil;

/**
 * VeterinariansPage Class contains info on all the WebElements and its Actions
 * 
 * @author madhusudhan.jr@gmail.com
 */
public class VeterinariansPage extends BasePage {

	/**
	 * Class variables which holds the reference to the Veterinarians Page
	 * WebElements
	 */

	@FindBy(xpath = "//h2[.='Veterinarians']")
	WebElement vetsHeader;

	@FindBy(css = "#vets tbody")
	WebElement vetsTable;

	public VeterinariansPage(WebDriver driver) {

		super(driver);
	}

	/**
	 * This method is used to get the VetsInformation Element
	 */
	private WebElement getVetsInformationTableElement() {

		return CommonUtil.explicitWaitTillVisible(m_driver, 30, vetsTable);
	}

	/**
	 * This method is used to get the Vets Information from the Vets web table
	 * 
	 * @return Map<Key, Value> vetsInfo
	 */
	public Map<String, String> getVetsInformaiton() {

		Map<String, String> vetsInfo = new HashMap<String, String>();
		for (WebElement rowElement : getVetsInformationTableElement().findElements(By.tagName("tr"))) {
			vetsInfo.put(rowElement.findElement(By.tagName("td")).getText(),
					rowElement.findElement(By.tagName("span")).getText());
		}
		return vetsInfo;
	}

}
