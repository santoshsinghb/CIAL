Feature: AUTOMATION FOR  IMPORT GHA TEST CASES

  Background: Launch the GALAXY CIAL application and login the application
    When I login with "CIAL USER" user given in "Login" sheet of excel data

  @cialImport1
  Scenario: To verify User is able to navigate to  Master screen in GHA
    Then move to GHA > Masters

  @cialImport2
  Scenario: To verify User is able to create flight in GHA 
    Then move to GHA > Masters > Flight > Details
    Then Click on New icon
    Then Enter Flight number
    Then Select Aircraft type from drop down
    Then GHA > Masters > Flight > Routing Details
    Then Enter Airport City
    Then Select Departure Date / Time
    Then Enter Airport City
    Then Enter Arrival Date / Time
    Then  Click on Save
    
    @cialImport3
  Scenario: To verify User is unable to create  flight with invalid flight no in GHA
    Then move to GHA > Masters > Flight > Details
    Then Click on New icon
    Then Enter Invalid Flight number
    
     
    @cialImport4
  Scenario: To verify User is able to schedule flight in Master screen
    Then move to GHA > Masters > Flight > Details
    Then Click on New
    Then Click on Airline Schedule
    Then Select one airline
    Then Enter Flight number
    Then Select Aircraft type from drop down
    Then Select From Date
    Then Select To Date
    Then GHA > Masters > Flight schedule > Routing Details
    Then Enter Airport City
    Then Select STD
    Then Enter Airport City
    Then Enter STA
    Then Click on Save
    Then Select the Schedule flight
    Then Click on Generate
    
     @cialImport5
  Scenario: To verify User is able to navigate to GHA Import screen
    Then move to GHA > Import > Import Manifest
    
     @cialImport6
  Scenario: To verify User is able to add ULD in Import Manifest screen
    Given Login into an application
    Then GHA > Import > Import Manifest
    Then Search with flight no
    Then Enter ULD details
    Then Click on Add ULD
    
     @cialImport7
  Scenario: To verify User is able to Change ULD in Import Manifest screen
    Given Login into an application
    Then GHA > Import > Import Manifest
    Then Search with flight no
    Then Enter ULD
    Then Select ULD
    Then Click on Change ULD
    Then Enter Type
    Then Enter Number
    Then Enter Owner
    Then Click on Change ULD
    
     @cialImport8
  Scenario: To verify that user is able to Delete ULD
  Then Go to Export -> Build Manifest Screen
  Then Enter Flight No 
  Then Enter Flight Date 
  Then Click on Search Icon
  Then Enter ULD Type
  Then Enter ULD No.
  Then Enter Airline Code
  Then Click on Add ULD button
  Then Click on Delete icon
  Then Select Delete radio button
  Then Click on OK button
  
   @cialImport9
  Scenario: To verify that user is able to remove ULD from Flight to warehouse Location
  Then Go to Export -> Build Manifest Screen
  Then Enter Flight No. 
  Then Enter Flight Date 
  Then Click on Search Icon
  Then Enter ULD Type
  Then Enter ULD No.
  Then Enter Airline Code
  Then Click on Add ULD button
  Then Click on Delete icon
  Then Select Warehouse radio button
  Then Click on OK button
  
  
   @cialImport10
  Scenario: To verify that user is able to remove ULD from Flight to another(Next) Flight
  Then Go to Export -> Build Manifest Screen
  Then Enter Flight No. 
  Then Enter Flight Date 
  Then Click on Search Icon
  Then Enter ULD Type
  Then Enter ULD No.
  Then Enter Airline Code
  Then Click on Add ULD button
  Then Click on Delete icon
  Then Select Next Flight radio button
  Then Click on OK button
  
   @cialImport11
  Scenario: To verify that user is able to add ULD/Pallet into a Flight
  Then Go to Export -> Build Manifest Screen
  Then Enter Flight No
  Then Enter Flight Date 
  Then Click on Search Icon
  Then Enter ULD Type
  Then Enter ULD No.
  Then Enter Airline Code
  Then Click on Add ULD button
  
   @cialImport12
  Scenario: To verify that user is able to add Stacked to Pallet on Clicking Pallet Hyperlink
  Then Go to Export -> Build Manifest Screen
  Then Enter Flight No. 
  Then Enter Flight Date 
  Then Click on Search Icon
  Then Enter Pallet Type
  Then Enter ULD No.
  Then Enter Airline Code
  Then Click on Add ULD button
  Then Click on Pallet Hyperlink
  Then Enter Stacked Pallet
  Then Click on Save button
  
    @cialImport13
  Scenario: To verify user is able to delete pallet stack
  Then Go to Export -> Build Manifest Screen
  Then Enter Flight No. 
  Then Enter Flight Date 
  Then Click on Search Icon
  Then Enter Pallet Type
  Then Enter ULD No.
  Then Enter Airline Code
  Then Click on Add ULD button
  Then Click on Pallet Hyperlink
  Then Enter Stacked Pallet
  Then Click on Save button
  Then Clear Stacked Pallet details
  Then Click on save button

   @cialImport14
  Scenario: To verify User is able to Delete ULD in Import Manifest screen
  Given Login into an application
  Then GHA > Import > Import Manifest
  Then Search with flight no
  Then Add ULD
  Then Select ULD
  Then Click on Delete ULD
  
  
  @cialImport15
  Scenario: Import : To verify user is able to Remove ULD from flight in GHA application
  Given Login into GHA application
  Then Import > Import Manifest
  Then Search Flight
  Then Enter ULD Details and Click on Add ULD
  Then Click on ULD Delete button
  
  @cialImport16
  Scenario: Import : To verify user is able to change ULD from flight in GHA application
  Given Login into GHA application
  Then Import > Import Manifest
  Then Search Flight
  Then Enter ULD Details and Click on Add ULD
  Then Click on change ULD button
  
  @cialImport17
  Scenario: Import : To verify user is able to record discrepancy from flight in GHA application
  Given Login into GHA application
  Then Import > Import Manifest
  Then Search Flight
  Then Enter ULD Details and Click on Add ULD
  Then Click on change ULD button
  
   @cialImport18
  Scenario: Import : To verify user is able to record found cargo from flight in GHA application
  Given Login into GHA application
  Then Import > Import Manifest
  Then Search Flight
  Then Enter ULD Details and Click on Add ULD
  Then Click on change ULD button
  Then Record Found type shipment
  
   @cialImport19
  Scenario: Import : To verify user is able to record damage cargo from flight in GHA application
  Given Login into GHA application
  Then Import > Import Manifest
  Then Search Flight
  Then Enter ULD Details and Click on Add ULD
  Then Record damage
  