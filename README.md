# QA-AUTOMATION-UDEMY

--- Excersices with Gradle, Selenium, Cucumber and Java. ---


--- Pre-conditions ---


you must have installed the next tools:

1.- Gradle 8.3

2.- JDK 17

3.- Gradle extension pack in VSCode or similar.

4.- Selenium plugin in VSCode or similar.

5.- Cucumber plugin in VSCode or similar.


----- Features automated -----


1.- Amazon: add to the cart the third product.

2.- BuggyCars: Registrar user, update user and vote for a car

3.- Google: Make a search and validate

4.- Sandbox: validate that the city is present inside the list.

5.- Table: Validate a static table


----- How to execute -------


Amazon.- use the tag '@Amazon'.

BuggyCars.- all case use '@Buggy'.

Google.- use the tag '@Google'.

Sandbox.- use the tag '@Sandbox'.

Table.- @Table.


---- Example ----


if you want to execute 'BuggyCars' follow the next steps:

1.- go to src/test/java/runner/

2.- open file runner.java

3.- in the line number 14 put the next code 'tags = "@Buggy"'

4.- finally you have to save and clic on the button run (execute test).
