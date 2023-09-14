@Buggy
Feature: BuggyCars
    I as a user
    I want to navigae in Buggy cars
    To execute some actions


    Scenario Outline: As a user i try to register in buggycars
        Given that the user navigate to buggycars
        And the user clicks to the register button
        When the user fills out the form with the login, name <nombre>, lastname <apellido>, y contraseña <password>
        And i send the form with the register button
        Then i can show the message 'Registration is successful'
        Examples:
            | nombre | apellido  | password |
            | jose   | carreto   | Prueba1. |
            | juan   | hernandez | Prueba1. |
            | carlos | guerrero  | Prueba1. |