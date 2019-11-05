#Author: usagilust@hotmail.com


Feature: Despegar Challenge
	As a web user
  I want to use despegar page
  to book a flight



  
  Scenario Outline: Book a flight from Medellin to Bogota
    Given that Leidy wants book a trip    
    When she reserves the flight from "<origin>" to "<destination>"  "<departureDate>"  "<returnDate>"  "<name>"  "<lastName>"  "<id>"
    Then she should see the data correctly on the screen
      
      Examples:
    |  origin  |destination |departureDate|returnDate| name  |lastName|   id     |
    | Medellin |    Bogota	|     16      |    18    | Leidy |Carvajal|	 43990997|
 			
 		 
