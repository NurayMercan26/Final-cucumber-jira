@SEAMLES-2456
Feature: Login functionality

  Background: User should go to the login page

  @SEAMLES-2455
  Scenario: User can see the "Forgot password?" link on the login page and can see the
  "Reset Password" button on the next page after clicking on forget password link
    Given User should go to login page
    When User see on the Forgot Password? link and click
    And user clicks Reset Password button
    Then User can see username or email