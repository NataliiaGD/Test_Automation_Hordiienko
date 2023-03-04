Feature: Certificate Validation
  As a user, i want to open the certificate page and validate certificate

  Scenario Outline: check if certificate is not found
    Given User is on the Home Page
    And User clicks on the school dropdown
    And User clicks on the certificate check button
    And User enters '<certificateNumber>'
    And User clicks on the check button
    Then User check if certificate is not found
    Examples:
      |certificateNumber|
      |123456           |
      |1a2b3c4d         |
      |1adgadg22532762  |
      |cfdhhs123456     |

