Feature: User login and chat bot program
	
	
	Scenario Outline: User login and chat bot program
	
	Given The user in the home page and enters "<email>" , "<password>"
	When User clicks on configure button and change the name of the bot name and desc as "<botName>" , "<botDesc>"
	Then The user clicks on bot operations and verifies
	
	Examples:
	
	| email | password | botName | botDesc |
	| cbauto983@gmail.com | cbAuto123 | My Test HealthCare Bot| Welcome to Test bot|
	
	
	
	