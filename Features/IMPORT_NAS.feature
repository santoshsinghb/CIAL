 Feature: AUTOMATION FOR NAS IMPORT TEST CASES
 
 Background: Launch the NAS application and login the application
 
  @NASImport_all_Scenario
  Scenario Outline:  IMPORT TEST CASES COMPLETE FLOW
   Given To verify user is able to login into the application NAS import
   Then To verify user is able to navigate to Import manifest screen NAS import
    Then To verify if user is able to add ULD awbnumber "<awbNUM>", destination "<destination>", npx "<npx>",npxwt "<npxwt>",chargebleWT "<chargebleWT>"   from Import Manifest screen NAS import
   Then To verify if user is able to add ULD  from Import Manifest screen NAS import
   Then To verify if user is able to Change ULD in Import Manifest screen NAS import
   Then To verify user is able to Delete ULD from Import Manifest screen NAS import
   Then To verify User is  be able to Add Direct Airway Bill in ULD from Import manifest screen NAS import
   Then To verify user is be able to Add Consol Airway Bill in ULD from Import manifest screen NAS import
   Then To verify User is able to Add Transship Airway Bill in ULD from Import manifest screen NAS import
   Then To verify User is able to Add Console Transship Airway Bill in ULD from Import manifest screen NAS import
   Then To verify user is able to do part shipment from import manifest screen NAS import
   Then To verify user is able to Move Shipment from one ULD to another ULD in import manifest screen NAS import
   Then To verify user is able to Record ATA in import manifest screen NAS import
   Then To verify User is able to Found Airway Bill in import manifest screen NAS import
   Then To verify User is able to Discrepancy Airway Bill in import manifest screen NAS import
   Then To verify user is able to Damage Airway Bill in import manifest screen NAS  import
   Then To verify User is able to view print of Damage report in import manifest screen NAS import
   Then To verify User is able to Revoke Damage Airway Bill in import manifest screen NAS import
   Then To verify User is able to e-Docket Airway Bill in import manifest screen NAS import
   Then To verify user is able to perform direct delivery in import manifest screen NAS import
   Then To verify User is able to Match Airway Bill in import manifest screen NAS import
   Then To verify user is able to generate the rotation number from Draft Manifest screen NAS import
   Then To verify User is able to update airway bill in AWB details screen NAS import
   Then To verify User is able to record Breakdown in the import manifest screen NAS import
   Then To verify if user is able to assign location from Warehouse Location NAS screen
   Then To verify if user is able to move pieces from warehouse location screen in NAS import
   Then To verify user is able to delete pieces from warehouse location screen in NAS import
   Then To verify user is able to do Hold shipment  on custom action screen NAS import
   Then To verify user is able to do UN-Hold shipment  on custom action screen NAS import
   Then To verify user is able to seize shipment  on custom action screen NAS import
   Then To verify user is able to clear seize shipment on custom action screen NAS import
   Then To verify user is able to do Examination shipment  on custom action screen NAS import
   Then To verify data will be clear or not when user click on clear button from examination screen NAS import
   Then To verify user is able to send AOA to the selected notification time from advice of arrival screen NAS import
   Then To verify user is able to view AOA print to the selected notification time from advice of arrival screen NAS import
   Then To verify User is able to Finalize Flight from Import Manifest screen NAS import
   Then To verify user able to Generate WDO from Warehouse Delivery Order screen for Direct AWB at MAWB level NAS import
   Then To verify user able to Generate WDO from Warehouse Delivery Order screen for Consol AWB at HAWB level NAS import
   Then To verify user able to get print of WDO from Warehouse Delivery Order screen NAS import
   Then To verify User able to  Release WDO from Warehouse Delivery Order screen NAS  import
   Then To verify user is unable to Revoke release of WDO before Release WDO from Warehouse Delivery Order screen NAS import
   Then To verify user able to Revoke release of WDO from Warehouse Delivery Order screen NAS import
   Then To verify User able to Cancel WDO from Warehouse Delivery Order screen NAS import
   Then To verify user is able to search event status  against the AWB NAS import
   Then To verify user is able to add the event against the AWB number NAS import
   Then To verify user is able to click on awb no in Import Manifest to search the detail of awb no. NAS import
   
    Examples: 
      |awbNUM  |destination|npx|npxwt|chargebleWT|
      |20240511|     dxb   |50 | 100 |150        |
      
      