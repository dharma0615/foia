Feature: Login Page Functionality

  Background: 
    Given the user launch browser with an url

  @smoke
  Scenario: 
    When the user enters valid credentials as username "dharma" and password "dharma123"
    Then the user able to login application
    And Home page will be displayed

  @regression
  Scenario Outline: Login with invalid credentials
    Given User is on Home page
    When User enters username as "<username>" and password as "<password>"
    Then User should be able to see an "<errorMessage>"

    Examples: 
      | username | password | errorMessage             |
      | Admin1   | admin1   | Invalid credentials      |
      |          | admin123 | Username cannot be empty |
      | Admin    |          | Password cannot be empty |

  Scenario: Login with valid credentials - Data Table without Header
    Given User is on HRMLogin page
    When User enters valid credentials
      | Admin  | admin123  |
      | Dharma | dharma123 |
    Then User should be able to login successfully and new page open

  Scenario: Login with invalid credential - Header with Single Row
    Given User is on HRMLogin page
    Then User enters invalid credentials and Login will be unsuccessful with error message
      | Username | Password   | ErrorMessage        |
      | Admin1   | admin123!$ | Invalid credentials |
