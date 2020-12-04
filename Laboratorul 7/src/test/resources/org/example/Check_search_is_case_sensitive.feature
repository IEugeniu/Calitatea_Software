Feature: Check Google search functionality is case sensitive or not
Scenario Outline: Check Google search functionality is case sensitive or not
	Given Google Chrome is open
	And User enters '<search1>' in search field
	And User presses Enter
	And Check result
	And User clears search box
	And User enters '<search2>' in search field
	And User presses Enter
	And Check result
 	Then Get same results

	Examples:
	|search1 |search2 |
	|Apple   |apple   |