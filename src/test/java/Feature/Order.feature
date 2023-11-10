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