Feature: Free CRM Login Feature

  Scenario: Free CRM Login Test Scenario

    Given User is on login Page1
    When title of login page is FreeCRM
    When User login into application with username "John" and  password "1234"
    Then User click on login button
    Then User enters login Page2
    Then User enters username and password
    Then User clicks on login button
    Then User is on homepage