@SEAMLES-2453
Feature: Login functionality

  Background: User should go to the login page

  @SEAMLES-2452
    Scenario: user can see the password explicitly if needed verify that password seen explicitly
    Given User go to login page
    When user enters password "blabla"
    And user clicks password box eye
    Then user can see the password explicitly if needed verify that password seen explicitly