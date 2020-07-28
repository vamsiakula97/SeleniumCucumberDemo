Feature:User Login into application


  Scenario:Single user able to login with valid credentials
    Given User is on login page
    When  User enters username as "Admin" and enters password as "admin123"
    And User clicks submit button
    Then User is redirected to Home Page

  Scenario Outline:User login with invalid credentials
    Given User is on login page
    When  User enters username as "<Username>" and enters password as "<Pass Key>"
    And User clicks submit button
    Then User is on login page only
    Examples:
    |Username|Pass Key|
    |Admin   |admin123|
    |Admin   |        |
    |        |admin123|
    |        |        |

  Scenario: Login with correct username and password
    Given User is on login page
    When  User enters username and password using DataTable
      | username | password |
      | Admin    | admin123 |
    And User clicks submit button
    Then User is redirected to Home Page


  Scenario:User login
    * User is on login page
    * User enters username as "Admin" and enters password as "admin123"
    * User clicks submit button
    * User is redirected to Home Page