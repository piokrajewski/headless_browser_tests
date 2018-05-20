Feature: Searchbox

	Scenario: I would like to open first page after putting a phase
		When browser is opened
		And i put phase into the searchbox field
		Then page title of the opened page should be proper