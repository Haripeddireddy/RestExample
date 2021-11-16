Feature: Delete
  

  @smoke
  Scenario: Verify DELETE operation 
    Given I Perform DELETE operation for "api/v1/delete/2"
      | name |
      | test     |
    And I perform GET operation with path parameter for "api/v1/employee/1"
      | name |
      | test    |
    Then I "should not" see the employee with name as "test"
