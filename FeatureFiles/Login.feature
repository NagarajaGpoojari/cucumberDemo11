Feature: User is able to login to the open cart application successfully 
Scenario: verify login scenario 
	Given launch the opencart website using property file 
	When Go to My Account and Select login 
	Then enter the valid credentails and submit 
	
