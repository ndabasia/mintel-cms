@complete @comments
Feature: Testing comment functionality
	

  Scenario Outline: Add a comment to a BCPH insight
    Given I have logged in as the correct user
    When I choose Site Type as Contents Hub
    And I choose <Content Hub> as content type
    And I select an insight to add a comment to
    And I add a comment
    Then the comment is saved

    Examples:
      | Content Hub                           |
      | Beauty Personal Care Household (BPCH) |

  @1
  Scenario Outline: Delete a comment to a BCPH insight
    Given I have logged in as the correct user
    When I choose Site Type as Contents Hub
    And I choose <Content Hub> as content type
    And I select an insight to add a comment to
    And I add a comment
    And I delete a comment
    Then the comment is deleted

    Examples:
      | Content Hub                           |
      | Japan Reports                         |

