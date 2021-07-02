#Author: madhusudhan.jr@gmail.com
Feature: PetClinic Owners Feature Tests

  Scenario: Verify clinic logo image
    Given I as a User of PetClinic
    When I am on the home page
    Then I see the pet clinic logo below the welcome text.

  Scenario Outline: Add a new owner
    Given I as a User of PetClinic
    When I want to add a new owner
    And I enter the new owner details <firstName>, <lastName>, <address>, <city> and <telephone>
    And submit the form
    Then I validate the new owner <firstName>, <lastName> is added

    Examples: 
      | firstName | lastName | address          | city    | telephone |
      | Arsene    | Lupin    | 1196 Park Street | Phoenix | 637376373 |

  Scenario Outline: Update an existing owner
    Given I as a User of PetClinic
    When I search for an existing owner with lastname <lastName>
    And I enter the updated owner details <address>, <city> and <telephone>
    And submit the form
    Then I validate the owner details <address>, <city> and <telephone> is updated

    Examples: 
      | lastName | address      | city    | telephone |
      | Lupin    | 107 Downtown | Seattle | 678362725 |

  Scenario Outline: Search for an existing owner
    Given I as a User of PetClinic
    When I search for an existing owner with lastname <lastName>
    Then I validate the owner details of <lastName>

    Examples: 
      | lastName |
      | Lupin    |

  Scenario Outline: Add a new pet for an existing owner
    Given I as a User of PetClinic
    When I search for an existing owner with lastname <lastName>
    And I enter the new pet details <name>, <birthDate> and <type>
    And submit the form
    Then I validate the new pet <name> is added

    Examples: 
      | lastName | name  | birthDate  | type |
      | Lupin    | Tommy | 2021-01-01 | dog  |
