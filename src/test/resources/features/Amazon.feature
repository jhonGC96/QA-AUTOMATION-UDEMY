@Amazon
Feature: Testing amazon case
    Scenario Outline: Scenario Outline name: As a customer when i search for Alexa i want to see if the third option on the second page is available to purchase and cand be added to the car
        Given than a user i navigate to amazon
        And i search for <product>
        When navigate to the second page
        And select the third item
        Then the user is able to add the item to the car
        Examples:
            | product      |
            | Alexa        |
            | Play station |
            | Nintendo     |
