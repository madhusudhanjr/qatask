QA Task

**Goal:**
To automate given features of a sample web application using Java - BDD Cucumber 


**Test Framework overview**

Created a reusable testing framework using Java OOPs concepts with Page Object Model design pattern for reusability and less maintainence.
Test case are split into multiple feature files which contains test scenarios written using Gherkin language of Cucumber framework. Scenarios are parameterised to 
run tests against different test data.


**Technology Stack details:**

1. Project Type: Maven
2. Automation Tool: Selenium Webdriver Java binding (v 3.141.59)
3. Program Language: Java (v 1.8 SDK)
4. Testing Framework: BDD Cucumber with JUnit
5. Test Framework Design: Page Object Model (POM) with Page Factory Pattern
6. Loggers: Log4j
7. Reporting: Default Cucumber HTML Reporting
8. Browser Tested: Chrome (v 90.0.4430.212 (Official Build) (x86_64))
9. Platform Used: macOS Big Sur (v11.4)


**Steps to run the Tests:**

Pre-requisites: Platform specific dependencies like Chrome browser, chrome driver executable etc. 

Import as existing Maven project to any IDE like (Eclipse/InteliJ) and clean and build the project to download the project dependencies set in **petclinic/pom.xml**
Run the project as JUnit Test. Tests starts executing on the Chrome browser. 
Alternatively we can also run from the CLI using command maven commands like **mvn test**.

**Key files:**

Junit Test runner class: **/petclinic/src/test/java/com/petclinic/tests/PetClinicTestRunner.java**

Feature files:

1. **/petclinic/src/test/resources/Features/PetClinicHome.feature** 
2. **/petclinic/src/test/resources/Features/PetClinicOwners.feature** 
3. **/petclinic/src/test/resources/Features/PetClinicVeterinarians.feature** 

Config file - **/petclinic/src/test/resources/config.properties**

Test execution reports path - **target/cucumber_test_report/index.html**

Sample test execution report - **/petclinic/SampleCucumberTestsReport.html**


**Testing Notes:**

The tests were run on MacBook Pro with macOS Big Sur (v11.4) on Chrome browser (v91.0.4472.114).
