Feature: Postemployee
 

  @smoke
  Scenario: Verify POST operation
    Given I Perform POST operation for “api/v1/create" with body
      | name | salary |age|

      | test | 123      | 23|
    Then I should see the employee has name as "test"