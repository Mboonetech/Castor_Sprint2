Feature: Only Sales and Store Managers should have access to the Vehicle Contracts page.

  @WIP
  Scenario Outline: Verify that Store and Sales Managers can access the Vehicle Contracts page
    Given User is on the login page
    And User enters Valid "<username>" and "<password>"
    And User Clicks the LOGIN button
    And User Hovers over Fleet Dropdown Tab
    When User Clicks the Driver Contracts option
    Then User should verify the page url is "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract"
    And User should verify the page title is "All - Vehicle Contract - Entities - System - Car - Entities - System"

    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |