@crud
Feature: CRUD

  Background:
    Given open create page

  Scenario: create
    When fill form
    And save new
    Then created success
