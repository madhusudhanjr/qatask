package com.petclinic.stepdefs;

import org.apache.log4j.Logger;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

/**
 * Setup Class contains the Step Definitions for the Cucumber Keyword "Given"
 * 
 * @author madhusudhan.jr@gmail.com
 */
public class Setup extends CommonHelper {

	/**
	 * Class variable which holds the reference to the Logger Object
	 */
	static Logger logger = Logger.getLogger(Setup.class);

	
	/**
	 * This method runs before each Scenario 
	 * @throws Exception
	 */
	@Before
	public static void setup() throws Exception {
		m_browser = getProperty("Browser");
		getDriverForThread();
		logger.info("\n******Test Feature Execution Satrted*******");
	}

	/**
	 * This method runs after each Scenario 
	 * @throws Exception
	 */
	@After
	public static void teardown() {
		getDriverForThread().manage().deleteAllCookies();
		logger.info("\n******Test Feature Execution Ends*******");
	}

	@Given("^I as a User of PetClinic$")
	public void i_as_a_User_of_PetClinic() throws Throwable {
		m_URL = getProperty("URL");
	}

}