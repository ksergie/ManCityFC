Feature: Show the required fields on the Registration form
  As unregister user I want to see the required fields
  on the Registration form after clicking the 'Register' link
  Scenario: an unregistered user should be able to see required fields on the Registration form
    Given unregistered user has opened the Registration page
    When unregistered user clicks the JOIN CITYZENS link
    Then unregistered user should be able to see next tooltips:
    | DayOfBirth      | Day of birth is required                                                                                       |
    | MonthOfBirth    | Month of birth is required                                                                                     |
    | YearOfBirth     | Year of birth is required                                                                                      |
    | Email           | A valid email address is required.                                                                             |
    | Password        | Password must be between 6 and 30 characters, contain at least 1 lowercase letter, uppercase letter and number |
    | ConfirmPassword | Field required and passwords need to match                                                                     |
    | AnswerYesNo     | Please select one option                                                                                       |