@SEAMLES-2470
Feature: Login functionality

  Background: User should go to the login page

  @SEAMLES-2469
  Scenario: User can see the password in a form of dots by default
    Given User go to login page
    When user enters password "Nuray123"
    And user look at password button
    Then user should see and verify that the password with dots formats as encrtype when password is entered