Feature: Login to Test Environment page
  This feature will test all scenarios on login page 
  of Test Environment.
  # On each featire file you can write up to 25 scenario and scenarion outlines.
  #Any steps which are repeating and are in begining steps in scenario or scenario outline
  # can be placed under Background keyword to prevent redundency. And it must be first steps for all
  # Scenario and Scenario outline in a feature
  # tags are used to run one , many or all scenarios in a feater file  tags starat with @ annotaions
  # we use tag on feature level or scenario and scenario outline level.
  # if @tags are in top of feature file and above feature it will run all scenario and scenario outline in that feature
  Background: 
    Given User is on Test Environment website  # precondtion and applies to all scenarios in this feature

  Scenario: Test Environment login Test case
    When User click on MyAccount
    And User provide username 'sdet@tekschool.us' and Password 'sdet'
    Then User should be logged in to MyAccount

  Scenario: Adding items to shopping card
    When User click on Mac book
    And User selects quantity to 4
    And User click on add to shopping card
    Then User should see items added in shopping card

  #The Difference between Scenario and Scenario outline
  # Scenario runs only once with specified data
  # Scenario outline run same scenario with different data set provided in Examples.
  Scenario Outline: Test Environment login Test case with multiple users
    When User click on MyAccount
    And User provide username '<email>' and Password '<password>'
    Then User should be logged in to MyAccount

    Examples: 
      | email                 | password  |
      | student@tekschool.us  | student   |
      | customer@tekschool.us | customer  |
      | consumer@tekschool.us | consumenr |
