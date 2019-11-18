Feature: Basic test events/example for component tests
All tests should be handled by Sealights properly

	Scenario: Test should pass
	    Given no input - a test that should pass
    	When try run the passing test
    	Then it should pass
    	
	#Scenario: Test should fail
	#    Given no input - a test that should fail
    #	When try run the failing test
    #	Then it should fail

	Scenario: Test should be skipped by TIA
	    Given no input - a test that should be skipped by TIA
    	When try run the test that should pass 
    	Then it should be skipped by TIA
    	
    @Skipped
	Scenario: Test should be skipped
	    Given no input - a test that should be skipped
    	When try run the skipped test
    	Then it should be skipped
    	
	Scenario Outline: Unnamed example should pass 
	    Given no input - a test example that should pass
    	When try run the example
    	Then it also should pass
    	
    Examples:
    |name|
    |un-one|
    |un-two|

	Scenario Outline: Named example <name> should pass 
	    Given no input - a test example that should pass
    	When try run the example
    	Then it also should pass
    	
    Examples:
    |name|
    |one|
    |two|

    @Skipped
	Scenario Outline: Example test should be skipped 
    	When try run the example that should be skipped
    	Then it should be also skipped    	
    Examples:
    |ctr|
    | 1 |
    | 2 |
    	
