@tcCIAL1
Feature: AUTOMATION FOR CIAL EXPORT TEST CASES

  Background: Launch the CIAL application and login the application
    When I login with "CIAL USER" user given in "Login" sheet of excel data

 
  @VCTgenerationToAwbdetails
  Scenario: To verify flow from login screen to AWBdetails tab
    Then To verify flow from login screen to AWBdetails tab
     
 
  @starting_TO_vctGENERATION_flowcovercial
  Scenario: To verify flow from login screen to VCT generation part
    Then To verify flow from login screen to VCT generation part
     
     
  @VCT_to_SECURITY_flowcovercial
  Scenario: To verify flow from VCT acceptance acreen to security screening part
    Then To verify flow from VCT acceptance acreen to security screening part
    
     @SECURITY_acceptance_flowcial
  Scenario: To verify flow security screening part
    Then To verify flow security screening part
    
     @AWBdeatilsTabFlowCial
  Scenario: To verify in AWB Details HAWB details get to be displayed
    Then To verify in AWB Details HAWB details get to be displayed
 
  @DEMO1 @tc2cial
  Scenario: To verify if user is able to create Direct Shipment or not from VCT generation screen
    Then To verify if user is able to create Direct Shipment or not from VCT generation screen

  @DEMO1 @tc3cial
  Scenario: To verify if user is able to create Console Shipment or not from VCT generation screen
    Then To verify if user is able to create Console Shipment or not from VCT generation screen

  @DEMO1 @tc4cial
  Scenario: To verify if user is able to take VCT print or not from VCT Generation Screen
    Then To verify if user is able to take VCT print or not from VCT Generation Screen

  @DEMO1 @tc5cial
  Scenario: To verify if user is able to search VCT no. or not from  VCT Generation Screen
    Then To verify if user is able to search VCT no. or not from  VCT Generation Screen

  @DEMO1 @tc6cial
  Scenario: To verify if user is able to search with Invalid VCT no in VCT Generation screen  proper validation message is displayed or not
    Then To verify if user is able to search with Invalid VCT no in VCT Generation screen  proper validation message is displayed or not

  @DEMO1 @tc7cial
  Scenario: To verify if user is able to generate one VCT for multiple Shipment from VCT generation screen
    Then To verify if user is able to generate one VCT for multiple Shipment from VCT generation screen

  @DEMO1 @tc8cial
  Scenario: To verify if user is able to delete AWB details from VCT Generation screen
    Then To verify if user is able to delete AWB details from VCT Generation screen

  @DEMO1 @tc10cial
  Scenario: To verify if user is able to create VCT with security status as Non-Secured (Ex) from VCT Generation screen
    Then To verify if user is able to create VCT with security status as Non-Secured (Ex) from VCT Generation screen

  @DEMO1 @tc11cial
  Scenario: To verify if user is able to create VCT with security status as Secured from VCT Generation screen
    Then To verify if user is able to create VCT with security status as Secured from VCT Generation screen

  @DEMO1 @tc12cial
  Scenario: To verify if user is able to search with VCT no. in VCT Acceptance Screen
    Then To verify if user is able to search with VCT no. in VCT Acceptance Screen

  @DEMO1 @tc13cial
  Scenario: To verify user is able to record Gate in details in VCT Acceptance Screen
    Then To verify user is able to record Gate in details in VCT Acceptance Screen

  @DEMO1 @tc14cial
  Scenario: To verify user is able to record Dock in details in VCT Acceptance Screen
    Then To verify user is able to record Dock in details in VCT Acceptance Screen

  @DEMO1 @tc15cial
  Scenario: To verify if system is allowing user to record Dock-In details or not if Gate-In detail is pending to record in VCT Acceptance screen
    Then To verify if system is allowing user to record Dock-In details or not if Gate-In detail is pending to record in VCT Acceptance screen

  @tc16cial
  Scenario: To verify user is able to enter AWB acceptance details at HAWB level in VCT Acceptance Screen
    Then To verify user is able to enter AWB acceptance details at HAWB level in VCT Acceptance Screen

  @tc17cial
  Scenario: To verify if user is able to accept cargo on HAWB level with volumetric weight In VCT Acceptance Screen
    Then To verify if user is able to accept cargo on HAWB level with volumetric weight In VCT Acceptance Screen

  @tc18cial
  Scenario: To verify user is able to accept cargo in part pieces from VCT Acceptance screen
    Then To verify user is able to accept cargo in part pieces from VCT Acceptance screen

  @tc19cial
  Scenario: To verify user is able to submit Dock-out details from VCT Acceptance screen
    Then To verify user is able to submit Dock-out details from VCT Acceptance screen

  @tc20cial
  Scenario: To verify user is able to submit Gate-out details from VCT Acceptance screen
    Then To verify user is able to submit Gate-out details from VCT Acceptance screen
    
 

  @tc21cial
  Scenario: To verify if system is allowing user to record  Gate-out details or not if Dock-Out detail is pending to record in VCT Acceptance screen
    Then To verify if system is allowing user to record  Gate-out details or not if Dock-Out detail is pending to record in VCT Acceptance screen

  @tc22cial
  Scenario: To check system is allow or not  to do Dock-Out if cargo acceptance is pending from VCT Acceptance screen
    Then To check system is allow or not  to do Dock-Out if cargo acceptance is pending from VCT Acceptance screen

  @tc23cial
  Scenario: To verify if Acceptance is done then accepted Cargo details is displayed or not in accepted cargo list from VCT Acceptance
    Then To verify if Acceptance is done then accepted Cargo details is displayed or not in accepted cargo list from VCT Acceptance

  @tc24cial
  Scenario: To verify user is able to complete Acceptance and process till Gate out for Direct Shipment
    Then To verify user is able to complete Acceptance and process till Gate out for Direct Shipment

  @tc25cial
  Scenario: To verify in VCT Acceptance as per acceptance done cargo progress bar percentage will be updated
    Then To verify in VCT Acceptance as per acceptance done cargo progress bar percentage will be updated

  @tc26cial
  Scenario: To verify if security screening is not completed then the shipment should be display in Unsecured List
    Then To verify if security screening is not completed then the shipment should be display in Unsecured List

  @tc27cial
  Scenario: User is able to submit security screening if acceptance is not completed proper validation get to be displayed
    Then User is able to submit security screening if acceptance is not completed proper validation get to be displayed

  @tc28cial
  Scenario: To verify if System is displaying Security Representative details in Security Acceptance screen or not
    Then To verify if System is displaying Security Representative details in Security Acceptance screen or not

  @tc29cial
  Scenario: To verify user is able to search Security Representative Name from Security Acceptance screen
    Then To verify user is able to search Security Representative Name from Security Acceptance screen

  @tc30cial
  Scenario: If user search with invalid AWB no in security screening screen proper validation get to be displayed
    Then If user search with invalid AWB no in security screening screen proper validation get to be displayed

  @tc31cial
  Scenario: If user search with invalid HAWB no in security screening screen proper validation get to be displayed
    Then If user search with invalid HAWB no in security screening screen proper validation get to be displayed

  @tc32cial
  Scenario: In Security screening screen Screen pieces , Remaining pieces , Screening Pieces column get to be displayed correctly
    Then In Security screening screen Screen pieces , Remaining pieces , Screening Pieces column get to be displayed correctly

  @tc33cial
  Scenario: To verify If user is able submit security scaninig twice from security Scaning screen
    Then To verify If user is able submit security scaninig twice from security Scaning screen

  @tc34cial
  Scenario: To verify user is able to submit screening with multiple screening methods
    Then To verify user is able to submit screening with multiple screening methods

  @tc35cial
  Scenario: To verify if final  submitted is not done then screening will not be completed
    Then To verify if final  submitted is not done then screening will not be completed

  @tc36cial
  Scenario: To verify After Screening is completed screening details get to be displayed in screening history
    Then To verify After Screening is completed screening details get to be displayed in screening history

  @tc37cial
  Scenario: To verify proper timestamp get to be display in screening date and time field in security screening screen
    Then To verify proper timestamp get to be display in screening date and time field in security screening screen

  @tc38cial
  Scenario: To verify when user click on Clear button on security screening screen all details get to be cleared
    Then To verify when user click on Clear button on security screening screen all details get to be cleared

  @tc39cial
  Scenario: To verify in Unsecured list screening status percentage get to be reflect as per the screening status in security screening screen
    Then To verify in Unsecured list screening status percentage get to be reflect as per the screening status in security screening screen.

 

  @tc41cial
  Scenario: To verify If flight details are updated in AWB Details screen then if AWB get to be reflect in build manifest in hand shipment screen.
    Then To verify If flight details are updated in AWB Details screen then if AWB get to be reflect in build manifest in hand shipment screen.

  @tc42cial
  Scenario: To verify In AWB details screen if user clicks on clear then all the details get to be cleared
    Then To verify In AWB details screen if user clicks on clear then all the details get to be cleared
    
     @VCTgenerationToAwbdetails
  Scenario: To verify flow from login screen to AWBdetails tab
    Then To verify flow from login screen to AWBdetails tab
    
     @warehouseLocation
  Scenario: To verify flow for warehouse location
    Then To verify flow for warehouse location
    #2919
      @BuildManifest
  Scenario: To verify flow for BuildManifest
    Then To verify flow for BuildManifest
    
      #2987 STARTING LINE NO. IN STEP DEFINATION
     @completeflowCIAL
  Scenario: To verify COMPLETE flow for CIAL
    Then To verify COMPLETE flow for CIAL
    
     