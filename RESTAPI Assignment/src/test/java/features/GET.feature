Feature: GET oepration
  
  @smoke
  Scenario: Verify GET operation 
   
     Given I perform GET operation for "api/v1/employee/1"
    Then I should see the employee name as "test"

