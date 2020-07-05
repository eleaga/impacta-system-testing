@crud
Feature: CRUD

  Background:
    Given open page

  Scenario: create
    Given open create page
    When fill form
    And save new
    Then created success


  Scenario: delete
    Given i should delete button

  Scenario: I should read and update first element
    Given click update button
      And update fill form
      And click on update form
    Then I should see update success message