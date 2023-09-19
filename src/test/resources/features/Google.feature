@Google
Feature: Probar la busqueda en Google
Scenario: As a user i enter a search creteria in Google
Given i am on the Google search page
When i enter a search criteria
And clic on the search button 
Then the results match the criteria


