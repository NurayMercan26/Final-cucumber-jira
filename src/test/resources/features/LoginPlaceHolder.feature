@SEAMLES-2460
Feature: Login functionality

  Background: User should go to the login page
   @SEAMLES-2459
  Scenario: User can see valid placeholders on Username and Password fields
    Given User should go to login page
    When User see on placeholders on Username
    And user User see on placeholders on password
    Then User can  verify that placeholder username or email