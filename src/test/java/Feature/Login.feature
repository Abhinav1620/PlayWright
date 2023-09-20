Feature: Login

  Scenario Outline: Verify login functionality with correct username and correct password
    When User navigated to website
    And Fill his correct "<username>" and correct "<password>"
    Then User should be able to see Homepage of the application.
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |