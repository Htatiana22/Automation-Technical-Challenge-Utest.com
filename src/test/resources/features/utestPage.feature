@Stories

Feature: Create a new user on the page utest.com
  As a user
  Want to enter Utest page
  To create a new user

@scenario1
  Scenario: Verify successful registration
    Given User wants to register Utest page
    When User clicks Join Today button
    And User fills in form to create a user
    | strFirstName | strLastName | strEmail               | strLanguages | strCity  | strPostalCode | strCreatePassword | strConfirmPassword |
    | Tatiana      | Pescador    | tatiana.122@gmail.com | Spanish      | Medellin | 179022        | Estranged*1031    | Estranged*1031     |

    Then User verifies successful registration
      | strVerifySuccessfulRegistration |
      | The last step    |


