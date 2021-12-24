@Login
Feature: Login
  In order to perform successful login
  As a user
  I want to enter correct username and password

  Background:
    Given browser is open
  Scenario Outline: Check login is successful with valid credentials

    And user is on login page
    When user enters username <arg0>
    And user enters password <arg01>
    And user click on login
    Then user is navigated to the home page
    Examples:
      | arg0                     | arg01     |
      | "affixabidita@gmail.com" | "Test123" |