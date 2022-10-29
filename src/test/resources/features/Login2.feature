
@SEAMLES-2410
Feature: Login functionality

  Background: User should go to the login page
  @SEAMLES-2406
  Scenario: User should be able to login with invalid usarname
    Given user can on the login page
    When  user is incorrect usarname
    And user  correct password
    Then user should able see  "Wrong usarname or password"
@SEAMLES-2407
  Scenario: User should be able to login with invalid password
    Given user can on the login page
    When  user is correct usarname
    And user  incorrect password
    Then user should able see  "Wrong usarname or password"
@SEAMLES-2408
  Scenario: User should be able to login with empty password
    Given user can on the login page
    When  user is correct usarname
    And user  empty password
    Then  User clicks "<ButtonType>" "<errorOrAlertMessage>"
  @SEAMLES-2409
  Scenario: User should be able to login with empty usarname
    Given user can on the login page
    When  user is empty usarname
    And user  correct password
    Then User clicks "<ButtonType>" "<errorOrAlertMessage>"