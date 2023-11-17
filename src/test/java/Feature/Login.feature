Feature: Login

  Scenario Outline: Verify login functionality with correct username and correct password
    When User navigated to website
    And Fill his correct "<username>" and correct "<password>"
    Then User should be able to see Homepage of the application.
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: Verify login functionality with incorrect username and correct password
    When User navigated to website
    And Fill his correct "<username>" and correct "<password>"
    Then an error should appear in front of user
    Examples:
      | username     | password     |
      | standard_use | secret_sauce |

  Scenario Outline: Verify login functionality with incorrect username and incorrect password
    When User navigated to website
    And Fill his correct "<username>" and correct "<password>"
    Then an error should appear in front of user
    Examples:
      | username     | password    |
      | standard_use | secret_sauc |

  Scenario Outline: Verify login functionality with correct username and incorrect password
    When User navigated to website
    And Fill his correct "<username>" and correct "<password>"
    Then an error should appear in front of user
    Examples:
      | username      | password    |
      | standard_user | secret_sauc |