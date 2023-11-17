Feature: Check order functionality

  Scenario Outline: Check that user is able to order an product from the application
    When User navigated to website
    And Fill his correct "<username>" and correct "<password>"
    And selects his product which he want to order
    Then user will be able to order his product after filling his delivery information
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |


  Scenario Outline: check that user is able to make a successful order for multiple selected products
    When User navigated to website
    And Fill his correct "<username>" and correct "<password>"
    And selects his products which he want to order
    Then user will be able to order his product after filling his delivery information
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: Check that user is able to get an error when user didn't provide firstname under delivery information page
    When User navigated to website
    And Fill his correct "<username>" and correct "<password>"
    And selects his product which he want to order
    Then user should be able to an error if don't provide any firstname under delivery information page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: Check that user is able to get an error when user didn't provide lastname under delivery information page
    When User navigated to website
    And Fill his correct "<username>" and correct "<password>"
    And selects his product which he want to order
    Then user should be able to an error if don't provide any lastname under delivery information page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: Check that user is able to get an error when user didn't provide ZipCode under delivery information page
    When User navigated to website
    And Fill his correct "<username>" and correct "<password>"
    And selects his product which he want to order
    Then user should be able to an error if don't provide any ZipCode under delivery information page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |