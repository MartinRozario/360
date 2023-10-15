Feature: 360 Assessment
  @Reg
  Scenario Outline: Fillup Page
    Given goto the Registration page
    When User input '<firstName>' and '<lastName>' and '<eMail>'
    And  User input '<phone>' and '<message>'
    And User select the Privacy Policy check box
    And User check Captcha
    And User click Submit button
    Then exit
    Examples:
      | firstName | lastName | eMail | phone | message |
      | First | Last | xyz@gmail.com | 01234567890 | Test |
