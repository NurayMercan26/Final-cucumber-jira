
@SEAMLES-2397
Feature: Login functionality

  Background: User should go to the login page

    @SEAMLES-2395
   Scenario: User should be able to login with valid credentials as a student
    Given user is on the login page
    When  user is write correct usarname
    And user is correct password
    Then user should able see  dashboard
    And user is click dropdown
    And user is logout
  @SEAMLES-2396
    Scenario: User is login valid usarname and password
      Given user is on the login page
      When user is write usarname "Employee111"
      And user writes "Employee123" in password
      And user is click button
      Then user is see  seamlessly in  URL


