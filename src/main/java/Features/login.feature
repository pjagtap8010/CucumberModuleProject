Feature: Login

  
  Scenario: user should login into the application
    Given user having valid URL    
    When enter valid credentials
    When user hit the login button
    Then user enters into the application
    
    
    