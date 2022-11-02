@SEAMLES-2414
Feature: Logout functionality

  Background: User should go to the logout page

@SEAMLES-2413
  Scenario: User can log out and ends up in login page
    Given user go to  the logout page
    When  user is write correct usarname
    And user is correct password
    And user is click dropdown
    And user is logout
    Then user can see seamlessy logo

  @SEAMLES-2412
  Scenario: User can not go to home page again by clicking step back button after successfully logged out.
    Given user is go to the logout page
    When user  write usarname
    And user write password
    And user is click dropdown
    And user is logout
    Then User can not go to home page again by clicking step back
