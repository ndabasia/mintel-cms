@complete
Feature: Testing comment functionality
	
  @1
  Scenario: Add a comment to a BCPH insight
    Given I have logged in as the correct user
    When I choose Site Type as Contents Hub
    And I choose Beauty Personal Care Household (BPCH) as content type
    And I select an insight to add a comment to
    And I add a comment
    Then the comment is saved

