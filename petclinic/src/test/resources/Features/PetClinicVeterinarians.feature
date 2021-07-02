#Author: madhusudhan.jr@gmail.com
Feature: PetClinic Veterinarians Feature Tests

  Scenario: View the list of veterinarians
    Given I as a User of PetClinic
    When I want to view the list of veterinarians
    Then I see the list of veterinarians

  Scenario Outline: Add a visit to the veterinarian
    Given I as a User of PetClinic
    When I search for an existing owner with lastname <lastName>
    And I enter visit description <description>
    And submit the form
    Then I validate the new visit with <description> is added

    Examples: 
      | lastName | description |
      | Lupin    | Vaccination |

  Scenario Outline: View my pets and visit details
    Given I as a User of PetClinic
    When I search for an existing owner with lastname <lastName>
    Then I validate my pets <pet> and visit details <description>

    Examples: 
      | lastName | pet   | description |
      | Lupin    | Tommy | Vaccination |
