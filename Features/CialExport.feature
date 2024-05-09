# Feature: AUTOMATION FOR NAS EXPORT all Scenario TEST CASES
Feature: AUTOMATION FOR CIAL EXPORT all Scenario TEST CASES
#Feature: AUTOMATION FOR Celebi EXPORT all Scenario TEST CASES
Background: Launch the  application and login the application


  @CIAL_EXPORT_ALL_Scenario
  Scenario: To verify user is able to create Shipment,able to accept cargo,able to submit security screening,to verify in AWB Details for  Export
    Then To verify if user is able to login into the application or not export
    Then To verify if user is able to create Direct Shipment or not from VCT generation screen export
   Then To verify if user is able to create Console Shipment or not from VCT generation screen export
    Then To verify if user is able to take VCT print or not from VCT Generation Screen export
    Then To verify if user is able to search VCT no. or not from  VCT Generation Screen export
    Then To verify if user is able to search with Invalid VCT no in VCT Generation screen  proper validation message is displayed or not export
    Then To verify if user is able to generate one VCT for multiple Shipment from VCT generation screen export
    Then To verify if user is able to delete AWB details from VCT Generation screen export
    Then To verify if user is able to take VCT Ticket Print from VCT Generation screen export
    Then To verify if user is able to create VCT with security status as Non-Secured (Ex) from VCT Generation screen export
    Then To verify if user is able to create VCT with security status as Secured from VCT Generation screen export
    Then To verify if user is able to search with VCT no. in VCT Acceptance Screen export
    Then To verify user is able to record Gate in details in VCT Acceptance Screen export
    Then To verify user is able to record Dock in details in VCT Acceptance Screen export
    Then To verify if system is allowing user to record Dock-In details or not if Gate-In detail is pending to record in VCT Acceptance screen export
    Then To verify user is able to enter AWB acceptance details at HAWB level in VCT Acceptance Screen export
    Then To verify if user is able to accept cargo on HAWB level with volumetric weight In VCT Acceptance Screen export
    Then To verify user is able to accept cargo in part pieces from VCT Acceptance screen export
    Then To verify user is able to submit Dock-out details from VCT Acceptance screen export
    Then To verify user is able to submit Gate-out details from VCT Acceptance screen export
    Then To verify if system is allowing user to record  Gate-out details or not if Dock-Out detail is pending to record in VCT Acceptance screen export
    Then To check system is allow or not  to do Dock-Out if cargo acceptance is pending from VCT Acceptance screen export
    Then To verify if Acceptance is done then accepted Cargo details is displayed or not in accepted cargo list from VCT Acceptance export
   Then To verify user is able to complete Acceptance and process till Gate out for Direct Shipment export
    Then To verify in VCT Acceptance as per acceptance done cargo progress bar percentage will be updated export
    Then To verify if security screening is not completed then the shipment should be display in Unsecured List export
    Then User is able to submit security screening if acceptance is not completed proper validation get to be displayed export
    Then To verify if System is displaying Security Representative details in Security Acceptance screen or not export
    Then To verify user is able to search Security Representative Name from Security Acceptance screen export
    Then If user search with invalid AWB no in security screening screen proper validation get to be displayed export
    Then If user search with invalid HAWB no in security screening screen proper validation get to be displayed export
    Then In Security screening screen Screen pieces , Remaining pieces , Screening Pieces column get to be displayed correctly export
    Then To verify If user is able submit security scaninig twice from security Scaning screen export
    Then To verify user is able to submit screening with multiple screening methods export
    Then To verify if final  submitted is not done then screening will not be completed export
    Then To verify After Screening is completed screening details get to be displayed in screening history export
    Then To verify proper timestamp get to be display in screening date and time field in security screening screen export
    Then To verify when user click on Clear button on security screening screen all details get to be cleared export
    Then To verify in Unsecured list screening status percentage get to be reflect as per the screening status in security screening screen export
    Then To verify in AWB Details HAWB details get to be displayed export
    Then To verify If flight details are updated in AWB Details screen then if AWB get to be reflect in build manifest in hand shipment screen export
    Then To verify In AWB details screen if user clicks on clear then all the details get to be cleared export    
    Then To verify user is able to print label from AWB Details screen export
   Then To verify user is able to submit DG Details from AWB Details Screen export
    Then To verify If DG details are saved then in AWB details screen red border get to be displayed for the AWB export
   Then To verify user is able to click on Damage button and Pop-up screen get to be displayed export
    Then To verify In AWB details screen legend/milestone for the process done get to be updated export
   Then To verify when user click on Clear button on Document Acceptance screen entered details should be cleared export
    Then To verify user is able to upload document in document acceptance screen export
    Then To verify In Document acceptance screen uploaded document get to be display in uploaded Document list export
    Then To verify user is  able to accept uploaded  document in Document acceptance screen export
    Then To verify If user click on upload document without selecting any document proper validation get to be displayed export
    Then To verify If user is able to to accept document without uploading any document proper validation get to be displayed export
    Then To verify If document acceptance is pending then in document acceptance screen pending status get to be displayed export
    Then If document acceptance is Completed then in document acceptance screen completed status get to be displayed export
    Then To verify user is able to assign location to direct AWB in warehouse location screen export
    Then To verify user is able to assign location to shipment from warehouse location screen export
    Then To verify user is able to move shipment from one  location to another location  by click on move button from warehouse location screen export
    When user search with AWB no in warehouse location in assigned location get to be displayed export
    Then To verify If user enters incorrect location then proper validation get to be displayed export
    Then To verify user is able to assign multiple location to one shipment from warehouse location screen export
    Then To verify user is able to delete location details from warehouse location screen export
    Then To verify if user is able to hold shipment at house level by selecting acceptance method as Letter from Export Custom Action export
    Then To verify if user is able to hold shipment at house level by selecting acceptance method as Verbal from Export Custom Action export
    Then To verify user is able to Unhold shipment at house level from Export Custom Action export
    Then To verify user is able to do Seize shipment  at house level from Export Custom Action export
    Then To verify if system is allowing to manifest hold shipment to flight validation get to be be display export
    Then To verify user able to seize/Clear shipment by click on Clear button in Export custom action export
   Then To verify user is able to hold shipment direct shipment by selecting acceptance method as Letter from Export custom action screen export
    Then To verify user is able to hold shipment direct shipment by selecting acceptance method as Verbal from Export Custom Action screen export
   Then To verify user able to Unhold shipment direct shipment from Export Custom Action export
    Then To verify user is able to do Seize shipment  for direct shipment from Export Custom Action Screen export
    Then To verify User is able to add  ULD details in build plan screen export
    Then To verify If ULD position is not selected in build plan screen proper validation get to be displayed export
    Then To verify user is able to add shipment from Build Plan screen export
    Then To verify if user enter incorrect flight details in build manifest screen proper validation get to be displayed export
    Then To verify user is able to add  ULD details in build manifest screen export
    Then To verify If ULD position is not selected in build manifest screen proper validation get to be displayed export
    Then To verify user is able to  add consol shipment into flight from Build manifest screen export 
    Then To verify user is able to view manifested consol shipment details in build manifest screen export
    Then To verify user is able to add direct shipment into flight from Build manifest screen export
    Then To verify user is able to view  manifested direct shipment details in build manifest screen export
    Then To verify user is able to add AWB in flight on HAWB level from Build manifest screen export
    Then To verify If AWB is added in HAWB level then MAWB total count get to be displayed as total manifested pieces in weight in flight in Build manifest screen export
    Then To verify If screening is pending for a Shipment and when user tries to manifest shipment then proper validation get to be displayed export
    Then To verify If user search with invalid AWB no in Add Ship screen proper validation get to be displayed from build manifest screen export
    Then If user clicks on show All checkbox in Add Shipment screen all the AWB should be displayed in Build manifest screen export
    Then To verify user is able to Remove Shipment in ULD in build manifest screen for direct shipment export
    Then To verify user able to Remove shipment at HAWB level from Build manifest screen export
    Then To verify user is able to remove shipment at part HAWB level from build manifest screen export
    Then To verify If user removes shipment at part HAWB level then MAWB level pieces get to be displayed as total manifested pieces on Build manifest screen export
    Then To verify Remove shipment display in build manifest screen or not export
    Then To verify user is able to move shipment HAWB level or not from build manifest screen export
    Then To verify user is able to view details  move shipment in build manifest screen export
    Then To verify user is able to enter fight Build up details and generate gate pass in build manifest screen export
    Then To verify user is able to generate gate pass and enter flight build up details if ULD is not closed proper validation get to  be displayed export
    Then To verify user is able to Record Flight Departure in build manifest screen export
    Then To verify user is able to offload shipment from build manifest screen export
    Then To verify offload shipment get not to be display in  build manifest screen export
    Then To verify user is able to offload shipment at HAWB level from build manifest screen export
    Then To verify user should be able to offload shipment at part HAWB level from build manifest screen export
    Then To verify If user offload shipment at part HAWB level then MAWB level pieces get to be displayed as total manifested pieces in Build manifest screen export
    Then To verify user is able to take UWS Statement print from build manifest screen
    Then To verify user is able to navigate to BTT Screen export
    Then To verify user is able to do BTT for direct Shipment export
    Then To verify user is able to do BTT for HAWB Shipment export
    Then To verify user is able to do BTT in Part for direct Shipment export
    Then To verify user is able to do BTT in Part for HAWB  Shipment export
    Then To verify user is able to Generate GP from BTT screen export
    Then To verify user is able to generate GP Print from BTT screen export
    Then To verify user is able to Cancel Generated GP from BTT screen export
    Then To verify user is able to Re-Generate Cancelled  GP from BTT screen export
    Then To verify user is able to Release the shipment in BTT screen export
    Then To verify user is able to Generate and cancel GP after Release  in  BTT screen export
