package com.petclinic.tests;

import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.petclinic.stepdefs.CommonHelper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * PetClinicTestRunner Class is a JUnit Cucumber TestRunner for PetClinic
 * feature files
 * 
 * @author mjr (madhusudhan.jr@gmail.com)
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber_test_report" }, features = {
		"classpath:Features/PetClinicHome.feature", "classpath:Features/PetClinicOwners.feature",
		"classpath:Features/PetClinicVeterinarians.feature" }, glue = { "com.petclinic.stepdefs" })
public class PetClinicTestRunner {

	/**
	 * This method executes before executing the Feature files
	 */
	@BeforeClass
	public static void set() {
		System.out.println("\n******Initializing loggers*******");
		PropertyConfigurator.configure("src/main/resources/Logger/log4j.properties");
	}

	/**
	 * This method executes after executing the Feature files
	 */
	@AfterClass
	public static void end() {
		System.out.println("\n******Quit Driver*******");
		CommonHelper.getDriverForThread().quit();
	}
}
