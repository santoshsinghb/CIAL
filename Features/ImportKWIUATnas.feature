Feature: AUTOMATION FOR IMPORT GALAXY KWIUAT NAS
 
Background: Launch the CIAL application and login the application

  @NASImport
  Scenario:  IMPORT FLOW FLOW FOR GALAXY KWIUAT NAS
   Given user is login into the application import  KWIUAT NAS
   Then  user is navigate to Import manifest screen import  KWIUAT NAS
   Then user is  added ULD  from Import Manifest screen import  KWIUAT NAS
   
  