@Table
Feature: Test diferent actions on the Static Table Page

Rule: The user can return a value from the table and use it.

    Background: Navigate to Table web app.
        Given I navigate to the static table

    Scenario: As a test engineer, i want to retrieve the value of an static table.
        Then i can return the value i wanted

    Scenario: As a Test Engineer, i want to validate the static table is displayed.
        Then I can validate the table is displayed