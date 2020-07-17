Feature: Login to Test Environment

  Background: 
    Given User is on Test Environment page

  @loginTest
  Scenario: Login to MyAccount
    When User click on MyAccount
    And User click on Login
    And User enters username 'sdet@tekschool.us' and Password 'sdet'
    And USer click on Login button
    Then User should be logged in to user Dashboard

  @MultipleUsers
  Scenario Outline: Login to MyAccount
    When User click on MyAccount
    And User click on Login
    And User enters username '<userName>' and Password '<password>'
    And USer click on Login button
    Then User should be logged in to user Dashboard

    Examples: 
      | userName              | password |
      | sdet@tekschool.us     | sdet     |
      | student@tekschool.us  | TEST     |
      | teacher@tekSchool.us  | teacher  |
      | consumer@tekschool.us | JBond    |

  @logout
  Scenario: Logout to MyAccount
    When User click on MyAccount
    And User click on Login
    And User enters username 'sdet@tekschool.us' and Password 'sdet'
    And USer click on Login button
    Then User should be logged in to user Dashboard
    When User click on MyAccount
    And User click on Logout
    Then User should be logged out
