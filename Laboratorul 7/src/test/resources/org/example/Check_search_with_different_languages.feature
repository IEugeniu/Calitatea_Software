Feature: Check whether a user can search with different languages

Scenario Outline: Check whether a user can search with different languages
	Given Google Chrome is open
	And User search '<search1>' in different language
	And User presses Enter and check result
	And User clears search box
	And User search '<search2>' in different language
	And User presses Enter and check result
	Then Result returned

	Examples:
		| search1    | search2   |
		| dictionary | dictionar |