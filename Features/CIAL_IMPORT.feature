
@tag
Feature: AUTOMATION FOR CIAL IMPORT TEST CASES
  
Background: Launch the CIAL application and login the application
    When I login with "CIAL USER" user given in "Login" sheet of excel data

  @cialImport
  Scenario: CIAL IMPORT COMPLETE FLOW
   
    Then Cial Import flow 
   

 
