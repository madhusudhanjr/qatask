#Author: madhusudhan.jr@gmail.com
Feature: PetClinic Home Feature Tests

  Scenario: Verify clinic logo image
    Given I as a User of PetClinic
    When I am on the home page
    Then I see the pet clinic logo below the welcome text.