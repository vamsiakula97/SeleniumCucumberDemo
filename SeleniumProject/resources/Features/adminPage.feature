@backgroundTest
Feature:User edit the General Information Page under Organization module of Admin

  Background:Single user able to login with valid credentials
    Given User is on login page
    When  User enters username as "Admin" and enters password as "admin123"
    And User clicks submit button
    Then User is redirected to Home Page

#This scenario is for validating the edited fields on General Information Page and Login to application is done using Background keyword
  Scenario Outline:Validating the edited fields on General Information Page
    Given User is on "<section>" page under "<sub_module_name>" module of "<module_name>" tab
    When  User clicks "<editBtn>" button
    And User updates the field "<fieldName>" with "<dataForFieldName>"
    And User clicks "<saveBtn>" button
    And User will refresh the webpage
    Then User will find the updated field "<fieldName>" with "<dataForFieldName>"

    Examples:
    |module_name|sub_module_name|section            |fieldName       |dataForFieldName|editBtn|saveBtn|
    |Admin|Organization|General Information|Registration Number|123456789|Edit|Save|

  Scenario Outline:Validating the edited fields on General Information Page ..
    Given User is on "<section>" page under "<sub_module_name>" module of "<module_name>" tab
    When  User clicks "<editBtn>" button
    And User updates the field "<fieldName>" with "<dataForFieldName>"
    And User clicks "<saveBtn>" button
    And User will refresh the webpage
    Then User will find the updated field "<fieldName>" with "<dataForFieldName>"

    Examples:
      |module_name|sub_module_name|section            |fieldName       |dataForFieldName|editBtn|saveBtn|
      |Admin|Organization|General Information|Registration Number|12340000000|Edit|Save|
