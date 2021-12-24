@Help
Feature: Help
  In order to validate that
  the guest user should be able access Help Page

  Scenario: Guest user should be able to access Help Page
    Given I navigate to the "https://help.stockbit.com/id/"
    Then I should see Help Page