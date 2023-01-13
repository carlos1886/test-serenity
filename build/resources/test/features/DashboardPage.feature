Feature: Validate Dashboard page

  Background:
    Given User is on Serenity page "https://demo.serenity.is/"
    When User enters username as "admin" and password as "serenity"
    Given User should be on "Dashboard" page

  Scenario: Validate Orders box summary
    Then User should see in orders box "21" "Open Orders"

  Scenario: Validate Orders graphs
    Then User should see orders graph

  Scenario: Validate chat
    Then User should see chat

  Scenario: Validate world graph
    Then User should world graph