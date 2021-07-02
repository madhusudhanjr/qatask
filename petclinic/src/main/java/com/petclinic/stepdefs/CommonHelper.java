package com.petclinic.stepdefs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.petclinic.pageobjects.HomePage;
import com.petclinic.pageobjects.OwnersPage;
import com.petclinic.pageobjects.VeterinariansPage;
import com.petclinic.utils.PropertiesFileParser;

/**
 * CommonHelper class contains the reusable functions which can be used across the
 * Step definitions
 * 
 * @author madhusudhan.jr@gmail.com
 */
public class CommonHelper {

	/**
	 * Class variable which holds the reference to the Logger Object
	 */
	static Logger logger = Logger.getLogger(CommonHelper.class);

	public static WebDriver m_driver;
	public static String m_browser;
	public static HomePage m_homePage = null;
	public static OwnersPage m_ownersPage = null;
	public static VeterinariansPage m_veterinariansPage = null;
	public static String m_URL = null;

	enum Drivers {

		CHROME;
	}

	/**
	 * Synchronized list of web drivers that stores the browser driver instance for
	 * each thread instance
	 */
	private static List<WebDriver> m_listOfWebDrivers = Collections.synchronizedList(new ArrayList<WebDriver>());
	private static ThreadLocal<WebDriver> m_driverForThread = new ThreadLocal<WebDriver>() {

		@Override
		protected WebDriver initialValue() {
			WebDriver driver = null;
			try {
				driver = initialiseDriver();

			} catch (Exception e) {
				e.printStackTrace();
			}

			m_listOfWebDrivers.add(driver);
			return driver;
		}
	};

	/**
	 * This method is used to navigate to the PetClinic application URL
	 * 
	 * @param url
	 */
	public static HomePage launchURL() {

		getDriverForThread().get(m_URL);
		m_homePage = new HomePage(getDriverForThread());
		return m_homePage;
	}

	/**
	 * Creates a instance of driver corresponding to the thread id and returns the
	 * driver If a driver instance already exists for thread id then it will just
	 * return that instance
	 * 
	 * @return WebDriver
	 */
	public static WebDriver getDriverForThread() {
		return m_driverForThread.get();
	}

	/**
	 * This method used to setup and initialise the WebDriver instance
	 * 
	 * @return WebDriver
	 * @throws Exception
	 */
	public static WebDriver initialiseDriver() throws Exception {

		logger.info("Setup  Driver with Platform:: " + m_browser);

		WebDriver driver = null;
		switch (Drivers.valueOf(m_browser)) {
		case CHROME:

			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--incognito");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			System.setProperty("webdriver.chrome.driver", getProperty("ChromeDriverPath"));
			driver = new ChromeDriver(options);
			break;

		default:
			throw new Exception(m_browser + ":: Browser Not Implemented!!");
		}
		return driver;
	}

	/**
	 * This method used to read the config file and get the property values
	 * 
	 * @return value
	 */
	public static String getProperty(String property) {

		logger.info("Get property from config file:: " + property);
		
		return PropertiesFileParser.getProperty(property);
	}

}
