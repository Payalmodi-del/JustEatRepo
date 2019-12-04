Feature: Use the website to find restaurants
	          So that I can order food
	          As a hungry customer
	           I want to be able to find restaurants in my area
Scenario: Search for restaurants in an area
Given I want food in "AR51 1AA"

When I search for restaurants
Then I should see some restaurants in "AR51 1AA"

Scenario: Entering wrong postcode 
Given I want food at "L6Y 4P9"

When I click on send button
Then it gives an error message

Scenario: Find Help
Given I am on Just-Eat website

When I click on Help button
Then I lend on Help page
