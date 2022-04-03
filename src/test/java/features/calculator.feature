Feature: To create a calculator with add and subtract

  Scenario: To add two numbers
    Given I have a calculator
    When I Add two numbers 4 and 5
    Then The result should be 9

  Scenario: To substract two numbers
    Given I have a calculator
    When I Substract two numbers 6 and 3
    Then The result should be 3

  Scenario Outline: To Add two numbers with test data
    Given I have a calculator
    When I Add two numbers <num1> and <num2>
    Then The result should be <res>

    Examples: 
      | num1 | num2 | res |
      |    1 |    2 |   3 |
      |    3 |    4 |   7 |

  Scenario Outline: To substract two numbers
    Given I have a calculator
    When I Substract two numbers <num1> and <num2>
    Then The result should be <res>

    Examples: 
      | num1 | num2 | res |
      |    4 |    2 |   2 |
      |    6 |    5 |   1 |

   Scenario: Add multiple numbers using a cucumber data table
   Given I have a calculator
   When I add below numbers
   |1|
   |2|
   |4|
   |6|
   |7|
   Then The result should be 20
   
   Scenario: Add multiple numbers using a list
   Given I have a calculator
   When I add below numbers using a list
   |1|
   |2|
   |4|
   |6|
   |7|
   Then The result should be 20
   
   Scenario: To calculate the total bill of the order
   Given I have a calculator
   When order below orders
   |Coffee| 20|
   |Tea   | 30|
   |burger| 60|
   Then The result should be 110
   
   Scenario: To calculate the total bill of the order
   Given I have a calculator
   When order below orders with multiple qty
   |Coffee| 1|20|
   |Tea   | 2|30|
   |burger| 1|60|
   Then The result should be 140