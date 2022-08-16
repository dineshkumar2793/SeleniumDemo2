Feature: Login AirAsia Application


  Scenario Outline: application launch with defferent url
  	Given User launch the  Application "<url>"
    When User login into the application with "<MOBILENO>","<PASSWORD>"

    Examples: 
      | url | MOBILENO | PASSWORD |
      | preprod | MOBILENO | PASSWORD |
      

      
