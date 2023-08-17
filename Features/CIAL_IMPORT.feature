
@tag
Feature: AUTOMATION FOR CIAL IMPORT TEST CASES
  
Background: Launch the CIAL application and login the application
 #   When I login with "CIAL USER" user given in "Login" sheet of excel data

  @cialImport
  Scenario: CIAL IMPORT COMPLETE FLOW
   
    Then Cial Import flow 
   

  @cialImport_all_Scenario
  Scenario: CIAL IMPORT COMPLETE FLOW
   Given To verify user is able to login into the application import
   Then To verify user is able to navigate to Import manifest screen import
   Then To verify if user is able to add ULD  from Import Manifest screen import
   Then To verify if user is able to Change ULD in Import Manifest screen import
   Then To verify user is able to Delete ULD from Import Manifest screen import
   Then To verify User is  be able to Add Direct Airway Bill in ULD from Import manifest screen import
   Then To verify user is be able to Add Consol Airway Bill in ULD from Import manifest screen import
   Then To verify User is able to Add Transship Airway Bill in ULD from Import manifest screen import
   Then To verify User is able to Add Console Transship Airway Bill in ULD from Import manifest screen import
   Then To verify user is able to do part shipment from import manifest screen import
   Then To verify user is able to Move Shipment from one ULD to another ULD in import manifest screen import
   Then To verify user is able to Record ATA in import manifest screen import
   Then To verify User is able to Found Airway Bill in import manifest screen import
   Then To verify User is able to Discrepancy Airway Bill in import manifest screen import
   Then To verify user is able to Damage Airway Bill in import manifest screen import
   Then To verify User is able to view print of Damage report in import manifest screen import
   Then To verify User is able to Revoke Damage Airway Bill in import manifest screen import
   Then To verify User is able to e-Docket Airway Bill in import manifest screen import
   Then To verify user is able to perform direct delivery in import manifest screen import
   Then To verify User is able to Match Airway Bill in import manifest screen import
   Then To verify user is able to generate the rotation number from Draft Manifest screen import
   Then To verify User is able to update airway bill in AWB details screen import
   Then To verify User is able to record Breakdown in the import manifest screen import
   Then To verify if user is able to assign location from Warehouse Location screen
   Then To verify if user is able to move pieces from warehouse location screen in import
   Then To verify user is able to delete pieces from warehouse location screen in import
   Then To verify user is able to do Hold shipment  on custom action screen import
   Then To verify user is able to do UN-Hold shipment  on custom action screen import
   Then To verify user is able to seize shipment  on custom action screen import
   Then To verify user is able to clear seize shipment on custom action screen import
   Then To verify user is able to do Examination shipment  on custom action screen import
   Then To verify data will be clear or not when user click on clear button from examination screen import
   Then To verify user is able to send AOA to the selected notification time from advice of arrival screen import
   Then To verify user is able to view AOA print to the selected notification time from advice of arrival screen import
   Then To verify User is able to Finalize Flight from Import Manifest screen import
   Then To verify user able to Generate WDO from Warehouse Delivery Order screen for Direct AWB at MAWB level import
   Then To verify user able to Generate WDO from Warehouse Delivery Order screen for Consol AWB at HAWB level import
   Then To verify user able to get print of WDO from Warehouse Delivery Order screen import
   Then To verify User able to  Release WDO from Warehouse Delivery Order screen import
   Then To verify user is unable to Revoke release of WDO before Release WDO from Warehouse Delivery Order screen import
   Then To verify user able to Revoke release of WDO from Warehouse Delivery Order screen import
   Then To verify User able to Cancel WDO from Warehouse Delivery Order screen import
   Then To verify user is able to search event status  against the AWB import
   Then To verify user is able to add the event against the AWB number import
   Then To verify user is able to click on awb no in Import Manifest to search the detail of awb no. import