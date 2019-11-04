Feature: One's Shopping

  Scenario: Give correct change - isn't this great?
    Given the following groceries:
      | name  | price |
      | milk  | 9     |
      | bread | 7     |
      | soap  | 5     |
    When I pay 25
    Then my change should be 4
    
    Scenario Outline: Give correct change again
    Given grocery price is "<price>"
    When I pay "<payment>"
    Then my change should be "<change>"
    
    Examples:
    | price | payment | change |
    | 2     | 5       | 3      |
    | 2     | 2       | 0      |