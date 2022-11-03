@SEAMLES-2443
Feature:  Login feature

  Background:
    Given user enter on the login page

  @SEAMLES-2442
  Scenario Outline:User should be able to login with invalid credentials

    When student enters username "<username>"
    And student enters password "<password>"
    Then  user should be able to see dashboard "<message error>"

    Examples: invalid credentials for student user

      | username          | password | message error               |
      | employee100       | nGdNzH1e | Wrong username or password. |
      | employee          | y5pYTlqY | Wrong username or password. |
      | employee34        | 2eMI9Uyk | Wrong username or password. |
      | employee45        | zzTYIurO | Wrong username or password. |
      | student24@library | OwsiR4u5 | Wrong username or password. |

