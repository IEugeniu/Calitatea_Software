Feature: Check some Google service like calculator service is it displaying when a user search for calculator
	Scenario Outline: Check some Google service like calculator service is it displaying when a user search for calculator
	Given Google Chrome is open
	And User enters '<search1>' in search field
	When User clicks on search button
	Then Check calculator is displayed

	Examples:
		| search1    |
		| Calculator |