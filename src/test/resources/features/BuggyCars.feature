@Buggy
Feature: BuggyCars
    I as a user
    I want to navigae in Buggy cars
    To execute some actions

    Background:
        Given that the user navigate to buggycars


    Rule: The user only can to register once

        Scenario Outline: As a user i try to register in buggycars
            And the user clicks to the register button
            When the user fills out the form with the login, name <nombre>, lastname <apellido>, y contraseña <password>
            And i send the form with the register button
            Then i can show the message 'Registration is successful'
            Examples:
                | nombre | apellido  | password |
                | jose   | carreto   | Prueba1. |
                | juan   | hernandez | Prueba1. |
                | carlos | guerrero  | Prueba1. |

    Rule: The fields 'name' and 'lastname' must be required and they cannot be empty

        Scenario Outline: As a user i want to update the user profile
            And the user fills the login form with username <user> and password <pass>
            And the user clicks in login button
            When the user clicks in profile button
            And the user puts the new name <name>, lastname <lastname>, adress <adress>, phone <phone>, and hobby <hobby>
            And the user clicks in the Save button
            Then The user can see the message 'The profile has been saved successful'


            Examples:
                | user     | pass     | name  | lastname  | adress   | phone      | hobby       |
                | jhonGC96 | Prueba1. | juana | hernandez | calle 27 | 5547329394 | Reading     |
                | jhonGC96 | Prueba1. | Jhon  | Carreto   | calle 27 | 5547329394 | Video Games |

    Rule: The user only can vote once for a car

        Scenario Outline: As i user i want to vote for the most popular model car
            And the user fills the credentials form with username <user> and password <pass>
            And the user goes to click in login button
            When the user clicks on 'Popular make' option
            And the user clicks on the car <car> they like the most
            And the user clicks on button vote!
            Then the user can see the message 'Thank you for your vote!'

            Examples:
                | user    | pass     | car                 |
                | Yanira  | Prueba1. | Guilia Quadrifoglio |
                | Ward    | Prueba1. | Mito                |
                | Lorilee | Prueba1. | Giulietta           |

