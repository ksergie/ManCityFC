Feature: Register the new user
  As unregister user I want to be able to register the site
  Scenario: an unregistered user should be able to register the site
    Given unregistered user has opened the Registration page
    When unregistered user fills out the Register form with next details and generated Email address:
    | DateOfBirth   | 15                   |
    | MonthOfBirth  | July                 |
    | YearOfBirth   | 1980                 |
    | Password      | Q_123456789q         |
    Then unregistered user should be register and LOGOUT item of menu is displayed