@Sandbox
Feature: Test diferent actions on a sandbox page.

    Scenario: As a test engineer, i try out different actions on a sandbox page.
        Given i navigate to the sandbox page
        And select a value from the dropdown

    Scenario Outline: Scenario Outline name: As a Test engineer, i want to validate that the city is present inside the list.
        Given I navigate to the list page
        When I search <state> in the list
        Then I can find <city> in the list
        Examples:
            | state | city       |
            | Wa    | Washington |
            | Illi  | Illinois   |
            | l     | Colorado   |
            | u     | Kentucky   |