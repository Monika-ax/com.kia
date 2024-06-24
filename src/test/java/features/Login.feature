

Feature: Validate the login page
 

  
  Scenario: Validate the login with valid details
    Given Launch the URL
    And Enter the username and pass
    When Click on the login button
    Then Sucessful login
    