Feature: Test Environment


  @registerTest
  Scenario: Register Account for new User
    Given User is on Test Environment page
    When User click on MyAccount
    And User click on Register
    And User fills Register form with below information
      |firstName|LastName|E-mail|Telephone|password|
      |Marix|Camp|Jenkins12@gmail.com|221540011|marixcamp|
    And User select 'yes' for Subscribe
    And user click privacy and policy button
    And User click Continue button
    Then User should see message 'Your Account Has Been Created!'
