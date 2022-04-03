Feature: This feature would be used to design the login page of an application

//multiple Given statements can be given inside the background section
  Background: Open the application
    Given I have opened the application in the browser
  
  Scenario: Validate Successful login of the application
  
     When I click on Login link
      And I enter username
      And I enter password
      And I click on Login button
     Then I should be landed on Home page
  
  Scenario: Validate Successful login of the application with test data
  
     When I click on Login link
      And I enter username "abc@xyz.com"
      And I enter password "pwd@123"
      And I click on the Login Button
     Then I should be landed on Home page
  
  #Scenario Outline always comes with Examples section
  Scenario Outline: Validate successful login with multiple test data
  
     When I click on Login link
      And I enter username "<username>"
      And I enter password "<password>"
      And I click on the Login Button
     Then I should be landed on Home page
  
    Examples: 
      | username    | password  | 
      | xyz@abc.com | Test@1234 | 
      | abc@xyz.com | Test@4321 | 
  
  
