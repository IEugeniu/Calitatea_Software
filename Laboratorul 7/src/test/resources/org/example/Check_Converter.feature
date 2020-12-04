Feature: Check when a user search for Google converter services then the converter service should be displayed in the top of the search result

	Scenario Outline: Check when a user search for Google converter services then the converter service should be displayed in the top of the search result
		Given Google Chrome is open
		And User enters '<Search>' in search field
		And User presses Enter
		Then Check converter is displayed

		Examples:
			| Search        |
			| bit converter |