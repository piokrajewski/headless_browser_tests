Feature: Login Page

	Scenario: User should not be able to log in with invalid credentials
		Given Facebook page is opened
		When Invalid credentials are provided
		Then User should not be able to view dashboard page
		
	Scenario: Login to instagram account
		Given Instagram page is opened
		When User put valid credentials
		Then Page should display main menu