package stepdefinition;
import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Helper.BaseObjects.*;
import static Helper.BaseVariables.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.When;
public class Test_cialExport {
	
	@Then("To verify if user is able to login into the application or not export")
	public void to_verify_if_user_is_able_to_login_into_the_application_or_not_export() throws InterruptedException {
		Thread.sleep(3000);
		  ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.cialExportTab.click();
		    Thread.sleep(200000);
	}
	@Then("To verify if user is able to create Direct Shipment or not from VCT generation screen export")
	public void to_verify_if_user_is_able_to_create_direct_shipment_or_not_from_vct_generation_screen_export() throws InterruptedException {
	/*
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		   
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cial_driverName.click();
			   ce.cial_driverName.sendKeys("JHONdriver");
				   Thread.sleep(2000);
				   ce.cial_vehicleNumber.click();
				   ce.cial_vehicleNumber.sendKeys("JH20DV2020");
				   Thread.sleep(2000);
				   
				 
				   
		    ce.cialAWBnumberField.click();
		    ce.cialAWBnumberField.sendKeys("12518042426");
		    Thread.sleep(2000);
		    ce.cialgenerationRemarkBox.click();
		    ce.cialgenerationRemarkBox.sendKeys("THIS IS FOR AUTOMATION TESTING");
		    ce.cialAWNnpx.click();
		    ce.cialAWNnpx.clear();
		    ce.cialAWNnpx.sendKeys("20");
		    Thread.sleep(2000);
		    ce.cial_AWBwt.click();
		    Thread.sleep(1000);
		    ce.cial_AWBwt.clear();
		    Thread.sleep(1000);
		    ce.cial_AWBwt.sendKeys("200");
		    Thread.sleep(2000);
		   ce.cial_originAirport.click();
		   ce.cial_originAirport.sendKeys("COK");
		   Thread.sleep(2000);
		   ce.cial_originAirport.sendKeys(Keys.ARROW_DOWN);
		   ce.cial_originAirport.sendKeys(Keys.ENTER);
		   Thread.sleep(1000);
		   ce.cial_destinationAirport.click();
		   ce.cial_destinationAirport.sendKeys("DXB");
		   Thread.sleep(2000);
		   ce.cial_destinationAirport.sendKeys(Keys.ARROW_DOWN);
		   ce.cial_destinationAirport.sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
		   
		   ce.cialcommoditysearch.click();
		   Thread.sleep(3000);
		//   driver.switchTo().frame(3);
		   Thread.sleep(2000);
		// It will return the parent window name as a String
		   String parentVG1=driver.getWindowHandle();

		   Set<String>sVG1=driver.getWindowHandles();

		   // Now iterate using Iterator
		   Iterator<String> IVG1= sVG1.iterator();

		   while(IVG1.hasNext())
		   {

		   String child_window=IVG1.next();


		   if(!parentVG1.equals(child_window))
		   {
		   driver.switchTo().window(child_window);
		   Thread.sleep(4000);
		   System.out.println(driver.switchTo().window(child_window));
		   ce.cialfertilizer.click();
		   Thread.sleep(2000);
		 //  driver.close();
		   
		   }

		   }
		   //switch to the parent window
		  driver.switchTo().window(parentVG1);
		   Thread.sleep(3000);
		   driver.switchTo().frame(0);
		   Thread.sleep(2000);
		   ce.cial_natureofGoods.sendKeys("FERTILIZER");
		   Thread.sleep(2000);
		   ce.cial_natureofGoods.sendKeys(Keys.ARROW_DOWN);;
		   ce.cial_natureofGoods.sendKeys(Keys.ENTER);;
		   Thread.sleep(2000);
		   ce.cialSHC.click();
		   Thread.sleep(4000);
		   ce.cialSHCbox1.sendKeys("GEN");
		   Thread.sleep(2000);
		   ce.cialSHCbox1.sendKeys(Keys.ARROW_DOWN);
		   Thread.sleep(2000);
		   ce.cialSHCboxCloseBtn.click();
		   Thread.sleep(2000);
		   ce.cial_agentSearch.click();
		   Thread.sleep(3000);
		   String parentVG2=driver.getWindowHandle();

		   Set<String>sVG2=driver.getWindowHandles();

		   // Now iterate using Iterator
		   Iterator<String> IVG2= sVG2.iterator();

		   while(IVG2.hasNext())
		   {

		   String child_window=IVG2.next();


		   if(!parentVG2.equals(child_window))
		   {
		   driver.switchTo().window(child_window);

		   System.out.println(driver.switchTo().window(child_window));
		   ce.cialagentName.click();;
		   Thread.sleep(2000);
		
		   }

		   }
		   //switch to the parent window
		  driver.switchTo().window(parentVG2);
		   Thread.sleep(3000);
		   driver.switchTo().frame(0);
		   Thread.sleep(2000);
		   Select securitydropdown = new Select(driver.findElement(By.name("ctl00$cp$uxgrdAWBContents$ctl02$chkSecured")));
		   ce.cialsecuritysatus.click();
		 //  ce.cialsecuritysatus.sendKeys(Keys.ARROW_DOWN);
		   Thread.sleep(2000);
		   securitydropdown.selectByVisibleText("Secured");
		   Thread.sleep(2000);
		   */
		   
	}
	@Then("To verify if user is able to create Console Shipment or not from VCT generation screen export")
	public void to_verify_if_user_is_able_to_create_console_shipment_or_not_from_vct_generation_screen_export() throws InterruptedException {
		 
		   
		Thread.sleep(2000);
	/*	   ce.cialplusbtnConsole.click();
		   Thread.sleep(5000);
		   
		   ce.cialVCTgeneration2ndAWBfield.click();
		   ce.cialVCTgeneration2ndAWBfield.sendKeys("12527122045");;
		   Thread.sleep(1000);
		   ce.cialVCTgeneration2ndHOUSEfield.click();
		   ce.cialVCTgeneration2ndHOUSEfield.sendKeys("HH1");
		   Thread.sleep(1000);
		   ce.cialVCTgeneration2ndAWBNPXfield.click();
		   ce.cialVCTgeneration2ndAWBNPXfield.clear();
		   ce.cialVCTgeneration2ndAWBNPXfield.sendKeys("30");
		   Thread.sleep(1000);
		   ce.cialVCTgeneration2ndAWBwtfield.click();
		   ce.cialVCTgeneration2ndAWBwtfield.clear();
		   ce.cialVCTgeneration2ndAWBwtfield.sendKeys("300");
		   Thread.sleep(1000);
		   
		   ce.cialVCTgenration2ndshipNPXfield.click();
		   ce.cialVCTgenration2ndshipNPXfield.clear();
		   ce.cialVCTgenration2ndshipNPXfield.sendKeys("20");
		   Thread.sleep(1000);
		   ce.cialVCTgeneration2ndSHIPwtfield.click();
		   ce.cialVCTgeneration2ndSHIPwtfield.clear();
		   ce.cialVCTgeneration2ndSHIPwtfield.sendKeys("200");
		   Thread.sleep(1000);
		   ce.cialCTgeneration2ndCOMMODITYbutton.click();
		   Thread.sleep(2000);
		   Thread.sleep(3000);
			//   driver.switchTo().frame(3);
			   Thread.sleep(2000);
			// It will return the parent window name as a String
			   String parentVG3=driver.getWindowHandle();

			   Set<String>sVG3=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> IVG3= sVG3.iterator();

			   while(IVG3.hasNext())
			   {

			   String child_window=IVG3.next();


			   if(!parentVG3.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialVCTgeneration2ndcommodityselectbtn.click();
			   Thread.sleep(2000);
			 //  driver.close();
			   
			   }

			   }
			   driver.switchTo().window(parentVG3);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   ce.cialVCTgeneration2ndNATUREOFGOODSfield.click();
			   ce.cialVCTgeneration2ndNATUREOFGOODSfield.sendKeys("AIR RIFLE");
			   Thread.sleep(2000);
			   ce.cialVCTgeneration2ndNATUREOFGOODSfield.sendKeys(Keys.ARROW_DOWN);
			   ce.cialVCTgeneration2ndNATUREOFGOODSfield.sendKeys(Keys.ENTER);
			   Thread.sleep(2000);
			   ce.cialVCTgenration2ndSHCbutton.click();
			   Thread.sleep(1000);
			   ce.cialVCTgeneration2ndSHCsearchbox.sendKeys("GEN");
			   Thread.sleep(2000);
			   ce.cialVCTgeneration2ndSHCsearchbox.sendKeys(Keys.ARROW_DOWN);
			   ce.cialVCTgeneration2ndSHCsearchbox.sendKeys(Keys.ENTER);
			   Thread.sleep(2000);
			   ce.cialVCTgeneration2ndSHCpopupboxokbtn.click();
			   Thread.sleep(2000);
			   ce.cialVCTgeneration2ndORIGINfield.click();
			   Thread.sleep(1000);
			   ce.cialVCTgeneration2ndORIGINfield.sendKeys("COK");
			   Thread.sleep(1000);
			   ce.cialVCTgeneration2ndORIGINfield.sendKeys(Keys.ARROW_DOWN);
			   Thread.sleep(1000);
			   ce.cialVCTgeneration2ndORIGINfield.sendKeys(Keys.ENTER);
			   Thread.sleep(2000);
			   ce.cialVCTgeneration2ndDESTINATIONfield.sendKeys("DXB");
			   Thread.sleep(1000);
			   ce.cialVCTgeneration2ndDESTINATIONfield.sendKeys(Keys.ARROW_DOWN);
			   Thread.sleep(1000);
			   ce.cialVCTgeneration2ndDESTINATIONfield.sendKeys(Keys.ENTER);
			   Thread.sleep(2000);
			   ce.cialVCTgeneration2ndAGENTSEARCHicon.click();
			// It will return the parent window name as a String
			   String parentVG4=driver.getWindowHandle();

			   Set<String>sVG4=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> IVG4= sVG4.iterator();

			   while(IVG4.hasNext())
			   {

			   String child_window=IVG4.next();


			   if(!parentVG4.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialVCT2ndAGENTNAMEselection.click();
			   Thread.sleep(2000);
			 //  driver.close();
			   
			   }

			   }
			   driver.switchTo().window(parentVG4);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   Select securitydropdown1 = new Select(driver.findElement(By.name("ctl00$cp$uxgrdAWBContents$ctl03$chkSecured")));
			//   ce.cialsecuritysatus.click();
			 //  ce.cialsecuritysatus.sendKeys(Keys.ARROW_DOWN);
			   Thread.sleep(2000);
			   securitydropdown1.selectByVisibleText("Non-Secured");
			   Thread.sleep(2000);
			   
			   ce.cialVCTgeneration2ndcopytikbox.click();
			   Thread.sleep(1000);
			   ce.cialVCTgeneration2ndplusbtn.click();
			   Thread.sleep(3000);
			   ce.cialVCTgeneration3rdhouseno.click();
			   ce.cialVCTgeneration3rdhouseno.sendKeys("HH2");
			   Thread.sleep(1000);
			   ce.cialVCTgeneration3rdshipNPX.clear();
			   Thread.sleep(1000);
			   ce.cialVCTgeneration3rdshipNPX.sendKeys("10");
			   Thread.sleep(1000);
			   ce.cialVCTgeneration3rdshipweight.clear();
			   Thread.sleep(1000);
			   ce.cialVCTgeneration3rdshipweight.sendKeys("100");
			   Thread.sleep(2000);
			   ce.cialVCTgeneration3rdcommodity.click();
			   Thread.sleep(3000);
				//   driver.switchTo().frame(3);
				   Thread.sleep(2000);
				// It will return the parent window name as a String
				   String parent3rdc=driver.getWindowHandle();

				   Set<String>s3rdc=driver.getWindowHandles();

				   // Now iterate using Iterator
				   Iterator<String> I3rdc= s3rdc.iterator();

				   while(I3rdc.hasNext())
				   {

				   String child_window=I3rdc.next();


				   if(!parent3rdc.equals(child_window))
				   {
				   driver.switchTo().window(child_window);
				   Thread.sleep(4000);
				   System.out.println(driver.switchTo().window(child_window));
				   ce.cialVCTgeneration3rdcommodityselect.click();
				   Thread.sleep(2000);
				 //  driver.close();
				   
				   }

				   }
				   driver.switchTo().window(parentVG4);
				   Thread.sleep(3000);
				   driver.switchTo().frame(0);
				   Thread.sleep(2000);
				   ce.cialVCTgeneration3rdgoodsnature.click();
				   ce.cialVCTgeneration3rdgoodsnature.sendKeys("ADDITIVE");
				   Thread.sleep(1000);
				   ce.cialVCTgeneration3rdgoodsnature.sendKeys(Keys.ARROW_DOWN);
				   Thread.sleep(1000);
				   ce.cialVCTgeneration3rdgoodsnature.sendKeys(Keys.ENTER);
				   Thread.sleep(5000);
				   Select securitydropdown2 = new Select(driver.findElement(By.name("ctl00$cp$uxgrdAWBContents$ctl04$chkSecured")));
				//   ce.cialsecuritysatus.click();
				 //  ce.cialsecuritysatus.sendKeys(Keys.ARROW_DOWN);
				   Thread.sleep(2000);
				   securitydropdown2.selectByVisibleText("Non-Secured");
				   Thread.sleep(2000); 
				   ce.cial_saveButton.click();
					  Thread.sleep(5000);
					  
					  driver.switchTo().alert().accept();
					  */
					  Thread.sleep(5000);
					  Thread.sleep(10000);
					  Thread.sleep(50000);
				   
	}
	@Then("To verify if user is able to take VCT print or not from VCT Generation Screen export")
	public void to_verify_if_user_is_able_to_take_vct_print_or_not_from_vct_generation_screen_export() {
	   
	}
	@Then("To verify if user is able to search VCT no. or not from  VCT Generation Screen export")
	public void to_verify_if_user_is_able_to_search_vct_no_or_not_from_vct_generation_screen_export() throws InterruptedException, AWTException {
	/*
		//Double click on element             
	      Actions act = new Actions(driver);
	      WebElement VCT_GENERATED_NUM = driver.findElement(By.name("ctl00$cp$uxVCTNo")); 
	      act.doubleClick(VCT_GENERATED_NUM).perform();
	  Robot robot=new Robot();
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_C);
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_C);
		  
		  
		  
		//  String VCT_GENERATED_NUM1 = driver.findElement(By.xpath("//*[@id='ctl00_cp_uxVCTNo']")).getText();
		//  driver.findElement(By.xpath("your element path")).sendKeys(VCT_GENERATED_NUM);
		//  System.out.println("the VCR number is"+VCT_GENERATED_NUM);
		
	////switch to default window
	   driver.switchTo().defaultContent();  
	 // driver.switchTo().window(parentVG4);
		   Thread.sleep(3000);
		   
//----------------------------------VCT ACCEPTANCE PART STARTING
		   
		  ce.CialVCTacceptanceTab.click();
		  Thread.sleep(10000);
		  driver.switchTo().frame(0);
		   Thread.sleep(3000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.clear();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(2000);
		   robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
			  robot.keyRelease(KeyEvent.VK_V);
			  Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
*/
	}
	@Then("To verify if user is able to search with Invalid VCT no in VCT Generation screen  proper validation message is displayed or not export")
	public void to_verify_if_user_is_able_to_search_with_invalid_vct_no_in_vct_generation_screen_proper_validation_message_is_displayed_or_not_export() {
	   
	}
	@Then("To verify if user is able to generate one VCT for multiple Shipment from VCT generation screen export")
	public void to_verify_if_user_is_able_to_generate_one_vct_for_multiple_shipment_from_vct_generation_screen_export() {
	  
	}
	@Then("To verify if user is able to delete AWB details from VCT Generation screen export")
	public void to_verify_if_user_is_able_to_delete_awb_details_from_vct_generation_screen_export() {
	    
	}
	@Then("To verify if user is able to take VCT Ticket Print from VCT Generation screen export")
	public void to_verify_if_user_is_able_to_take_vct_ticket_print_from_vct_generation_screen_export() {
	   
	}
	@Then("To verify if user is able to create VCT with security status as Non-Secured \\(Ex) from VCT Generation screen export")
	public void to_verify_if_user_is_able_to_create_vct_with_security_status_as_non_secured_ex_from_vct_generation_screen_export() {
	  
	}
	@Then("To verify if user is able to create VCT with security status as Secured from VCT Generation screen export")
	public void to_verify_if_user_is_able_to_create_vct_with_security_status_as_secured_from_vct_generation_screen_export() {
	  
	}
	@Then("To verify if user is able to search with VCT no. in VCT Acceptance Screen export")
	public void to_verify_if_user_is_able_to_search_with_vct_no_in_vct_acceptance_screen_export() {
	 
	}
	@Then("To verify user is able to record Gate in details in VCT Acceptance Screen export")
	public void to_verify_user_is_able_to_record_gate_in_details_in_vct_acceptance_screen_export() throws InterruptedException {
		 Thread.sleep(3000);
	/*	   Thread.sleep(3000);
		   ce.cialAcceptanceGateInDate.click();
		   ce.cialAcceptanceGateInDate.clear();
		   ce.cialAcceptanceGateInDate.sendKeys("18/04/2024");
		   Thread.sleep(2000);
		   ce.cialAcceptanceGateInTime.click();
		   ce.cialAcceptanceGateInTime.clear();
		   ce.cialAcceptanceGateInTime.sendKeys("1612");
		   Thread.sleep(2000);
		   ce.cialGateInBtn.click();
		   
		   Thread.sleep(3000);*/
		  
	}
	@Then("To verify user is able to record Dock in details in VCT Acceptance Screen export")
	public void to_verify_user_is_able_to_record_dock_in_details_in_vct_acceptance_screen_export() throws InterruptedException {
	/*	 ce.cialDookDoordropdown.click();
		   Select DoordrpDown = new Select(driver.findElement(By.name("ctl00$cp$ddlDoor")));
		   DoordrpDown.selectByVisibleText("Door 2");
		   Thread.sleep(3000);
		
		   ce.cialDockInBtn.click();
		   */
		   Thread.sleep(3000);
		   
	}
	@Then("To verify if system is allowing user to record Dock-In details or not if Gate-In detail is pending to record in VCT Acceptance screen export")
	public void to_verify_if_system_is_allowing_user_to_record_dock_in_details_or_not_if_gate_in_detail_is_pending_to_record_in_vct_acceptance_screen_export() {
	  
	}
	@Then("To verify user is able to enter AWB acceptance details at HAWB level in VCT Acceptance Screen export")
	public void to_verify_user_is_able_to_enter_awb_acceptance_details_at_hawb_level_in_vct_acceptance_screen_export() throws InterruptedException {
		Thread.sleep(2000);
		 
		
	}
	@Then("To verify if user is able to accept cargo on HAWB level with volumetric weight In VCT Acceptance Screen export")
	public void to_verify_if_user_is_able_to_accept_cargo_on_hawb_level_with_volumetric_weight_in_vct_acceptance_screen_export() throws InterruptedException {
		/*
		ce.cialacceptance1stAWBtikbox.click();
		
		  Thread.sleep(2000);
		  ce.cialVCTacceptacnce1stTIKgroupID.click();
		  ce.cialVCTacceptacnce1stTIKgroupID.sendKeys("20232112");// TO BE CHANGE ON EVRYRUN
		  Thread.sleep(2000);
		  ce.cialVCTacceptance1stTikNPXremaining.click();
		  ce.cialVCTacceptance1stTikNPXremaining.clear();
		  ce.cialVCTacceptance1stTikNPXremaining.sendKeys("10");
		  Thread.sleep(2000);
		  ce.cialVCTacceptance1stTikNOP.click();
		  ce.cialVCTacceptance1stTikNOP.clear();
		  ce.cialVCTacceptance1stTikNOP.sendKeys("10");
		  Thread.sleep(2000);
		  ce.cialVCTacceptance1stTikLength.click();
		  ce.cialVCTacceptance1stTikLength.sendKeys("100");
		  Thread.sleep(2000);
		  ce.cialVCTacceptance1stTikwidth.click();
		  ce.cialVCTacceptance1stTikwidth.sendKeys("100");
		  Thread.sleep(2000);
		  ce.cialVCTacceptance1stTikHeight.click();
		  ce.cialVCTacceptance1stTikHeight.sendKeys("100");
		  Thread.sleep(2000);
		  ce.cialVCTaccptanceVolumebox.click();
		  Thread.sleep(2000);
		  JavascriptExecutor jsf = (JavascriptExecutor) driver;
			 WebElement flagf= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
			 jsf.executeScript("arguments[0].scrollIntoView();",flagf);
			 Thread.sleep(5000);  
		   ce.cialacceptanceSubmitBtn.click();
		   Thread.sleep(3000);
		   JavascriptExecutor jsff = (JavascriptExecutor) driver;
			 jsff.executeScript("window.scrollBy(0,-250)", "");
			 
			   Thread.sleep(5000);
			   Thread.sleep(2000);
				  ce.cialVCTacceptacnce1stTIKgroupID.click();
				  ce.cialVCTacceptacnce1stTIKgroupID.sendKeys("20232113");// TO BE CHANGE ON EVRYRUN
				  Thread.sleep(2000);
			   ce.cialVCTacceptance1stTikNPXremaining.click();
				  ce.cialVCTacceptance1stTikNPXremaining.clear();
				  ce.cialVCTacceptance1stTikNPXremaining.sendKeys("10");
				  Thread.sleep(2000);
				  ce.cialVCTacceptance1stTikNOP.click();
				  ce.cialVCTacceptance1stTikNOP.clear();
				  ce.cialVCTacceptance1stTikNOP.sendKeys("10");
				  Thread.sleep(2000);
				  ce.cialVCTacceptance1stTikLength.click();
				  ce.cialVCTacceptance1stTikLength.sendKeys("100");
				  Thread.sleep(2000);
				  ce.cialVCTacceptance1stTikwidth.click();
				  ce.cialVCTacceptance1stTikwidth.sendKeys("100");
				  Thread.sleep(2000);
				  ce.cialVCTacceptance1stTikHeight.click();
				  ce.cialVCTacceptance1stTikHeight.sendKeys("100");
				  Thread.sleep(2000);
				  ce.cialVCTaccptanceVolumebox.click();
				  Thread.sleep(2000);
				  JavascriptExecutor jsf2 = (JavascriptExecutor) driver;
					 WebElement flagf2= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
					 jsf2.executeScript("arguments[0].scrollIntoView();",flagf2);
					 Thread.sleep(3000);
				   ce.cialacceptanceSubmitBtn.click();
				   Thread.sleep(3000);
				   JavascriptExecutor jsff2 = (JavascriptExecutor) driver;
					 jsff2.executeScript("window.scrollBy(0,-250)", "");
					 
					   Thread.sleep(5000);
					   ce.cialVCTacceptanceHH1tikbox.click();
					   Thread.sleep(2000);
					   Thread.sleep(2000);
						  ce.cialVCTacceptacnce1stTIKgroupID.click();
						  ce.cialVCTacceptacnce1stTIKgroupID.sendKeys("20232114");// TO BE CHANGE ON EVRYRUN
						  Thread.sleep(2000);
					   ce.cialVCTacceptance1stTikNPXremaining.click();
						  ce.cialVCTacceptance1stTikNPXremaining.clear();
						  ce.cialVCTacceptance1stTikNPXremaining.sendKeys("20");
						  Thread.sleep(2000);
						  ce.cialVCTacceptance1stTikNOP.click();
						  ce.cialVCTacceptance1stTikNOP.clear();
						  ce.cialVCTacceptance1stTikNOP.sendKeys("20");
						  Thread.sleep(2000);
						  ce.cialVCTacceptance1stTikLength.click();
						  ce.cialVCTacceptance1stTikLength.sendKeys("100");
						  Thread.sleep(2000);
						  ce.cialVCTacceptance1stTikwidth.click();
						  ce.cialVCTacceptance1stTikwidth.sendKeys("100");
						  Thread.sleep(2000);
						  ce.cialVCTacceptance1stTikHeight.click();
						  ce.cialVCTacceptance1stTikHeight.sendKeys("300");
						  Thread.sleep(2000);
						  ce.cialVCTaccptanceVolumebox.click();
						  Thread.sleep(2000);
						  JavascriptExecutor jsf3 = (JavascriptExecutor) driver;
							 WebElement flagf3= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
							 jsf3.executeScript("arguments[0].scrollIntoView();",flagf3);
							 Thread.sleep(5000);
						   ce.cialacceptanceSubmitBtn.click();
						   Thread.sleep(3000);
						   JavascriptExecutor jsff3 = (JavascriptExecutor) driver;
							 jsff3.executeScript("window.scrollBy(0,-250)", "");
							 Thread.sleep(3000);
							 
							 ce.cialVCTacceptanceHH2tikbox.click();
							 Thread.sleep(2000);
							 driver.findElement(By.id("ctl00_cp_uxtxtGroupId")).sendKeys("20232115");// TO BE CHANGE ON EVRYRUN
							 Thread.sleep(2000);
							 ce.cialVCTacceptance1stTikNPXremaining.click();
							  ce.cialVCTacceptance1stTikNPXremaining.clear();
							  ce.cialVCTacceptance1stTikNPXremaining.sendKeys("10");
							  Thread.sleep(2000);
							  ce.cialVCTacceptance1stTikNOP.click();
							  ce.cialVCTacceptance1stTikNOP.clear();
							  ce.cialVCTacceptance1stTikNOP.sendKeys("10");
							  Thread.sleep(2000);
							  ce.cialVCTacceptance1stTikLength.click();
							  ce.cialVCTacceptance1stTikLength.sendKeys("100");
							  Thread.sleep(2000);
							  ce.cialVCTacceptance1stTikwidth.click();
							  ce.cialVCTacceptance1stTikwidth.sendKeys("200");
							  Thread.sleep(2000);
							  ce.cialVCTacceptance1stTikHeight.click();
							  ce.cialVCTacceptance1stTikHeight.sendKeys("100");
							  Thread.sleep(2000);
							  ce.cialVCTaccptanceVolumebox.click();
							  Thread.sleep(2000);
							  JavascriptExecutor jsf4 = (JavascriptExecutor) driver;
								 WebElement flagf4= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
								 jsf4.executeScript("arguments[0].scrollIntoView();",flagf4);
								 Thread.sleep(5000);
							   ce.cialacceptanceSubmitBtn.click();
							   Thread.sleep(3000);
							   JavascriptExecutor jsff4 = (JavascriptExecutor) driver;
								 jsff4.executeScript("window.scrollBy(0,-250)", "");
							 
								 Thread.sleep(5000);
								 Thread.sleep(5000);
						*/		 
								 
	}
	@Then("To verify user is able to accept cargo in part pieces from VCT Acceptance screen export")
	public void to_verify_user_is_able_to_accept_cargo_in_part_pieces_from_vct_acceptance_screen_export() throws InterruptedException {
		
	}
	@Then("To verify user is able to submit Dock-out details from VCT Acceptance screen export")
	public void to_verify_user_is_able_to_submit_dock_out_details_from_vct_acceptance_screen_export() {
	  
	}
	@Then("To verify user is able to submit Gate-out details from VCT Acceptance screen export")
	public void to_verify_user_is_able_to_submit_gate_out_details_from_vct_acceptance_screen_export() {
	  
	}
	@Then("To verify if system is allowing user to record  Gate-out details or not if Dock-Out detail is pending to record in VCT Acceptance screen export")
	public void to_verify_if_system_is_allowing_user_to_record_gate_out_details_or_not_if_dock_out_detail_is_pending_to_record_in_vct_acceptance_screen_export() {
	  
	}
	@Then("To check system is allow or not  to do Dock-Out if cargo acceptance is pending from VCT Acceptance screen export")
	public void to_check_system_is_allow_or_not_to_do_dock_out_if_cargo_acceptance_is_pending_from_vct_acceptance_screen_export() {
	
	}
	@Then("To verify if Acceptance is done then accepted Cargo details is displayed or not in accepted cargo list from VCT Acceptance export")
	public void to_verify_if_acceptance_is_done_then_accepted_cargo_details_is_displayed_or_not_in_accepted_cargo_list_from_vct_acceptance_export() {
	  
	}
	@Then("To verify user is able to complete Acceptance and process till Gate out for Direct Shipment export")
	public void to_verify_user_is_able_to_complete_acceptance_and_process_till_gate_out_for_direct_shipment_export() {
	   
	}
	@Then("To verify in VCT Acceptance as per acceptance done cargo progress bar percentage will be updated export")
	public void to_verify_in_vct_acceptance_as_per_acceptance_done_cargo_progress_bar_percentage_will_be_updated_export() throws InterruptedException {
		  
	}
	@Then("To verify if security screening is not completed then the shipment should be display in Unsecured List export")
	public void to_verify_if_security_screening_is_not_completed_then_the_shipment_should_be_display_in_unsecured_list_export() throws InterruptedException {
	////switch to default window
		
		/*
		driver.switchTo().defaultContent();
		   Thread.sleep(3000);
		   ce.cialSecurityAceeptanceTab.click();
		    Thread.sleep(4000);
		 
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cialsecurityacceptancedetailsbtn.click();
			   Thread.sleep(1000);
			   ce.cialsecurityacceptanceairlineprifixfiled.click();
			   ce.cialsecurityacceptanceairlineprifixfiled.sendKeys("125");
			   Thread.sleep(1000);
			   ce.cialsecurityacceptanceAWBnumfield.click();
			   ce.cialsecurityacceptanceAWBnumfield.sendKeys("27122034");
			   Thread.sleep(1000);
			   ce.cialsecurityacceptanceHousenum.click();
			   ce.cialsecurityacceptanceHousenum.sendKeys("");
			   Thread.sleep(1000);
			   ce.cialsecurityAcceptanceDeatilssearchbtn.click();
			   Thread.sleep(3000);
			   
			   ce.cialsecurityacceptancemachinedropdow.click();
			   Select machinedrpDown = new Select(driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxddlMachine$fmsGenericDropDownList")));
			   machinedrpDown.selectByVisibleText("XRAY 7");
			   Thread.sleep(3000);
			   ce.cialsecurityacceptancstickerstrtnumber.click();
			   ce.cialsecurityacceptancstickerstrtnumber.sendKeys("1");
			   Thread.sleep(2000);
			   ce.cialsecurityacceptancstickerEndnumber.click();
			   Thread.sleep(1000);
			   ce.cialsecurityacceptancscreeningmethod1sttik.click();
			   Thread.sleep(1000);
			   ce.cialsecurityacceptancscreeningmethod1sttikpices.sendKeys("10");
			   Thread.sleep(2000);
			   ce.cialsecurityacceptancscreeningmethod2ndtik.click();
			   Thread.sleep(1000);
			   ce.cialsecurityacceptancscreeningmethod2ndtikpices.sendKeys("10");
			   Thread.sleep(2000);
			   ce.cialsecurityacceptancsecuritytypeUnknownCargo.click();
			   Thread.sleep(3000);
			   ce.cialsecurityacceptancagentname.sendKeys("tester");
				 Thread.sleep(2000);
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
				 WebElement flag= driver.findElement(By.xpath("//*[@id='ctl00_cp_tc_tp2_ctl00_uxSave']"));
				 js.executeScript("arguments[0].scrollIntoView();",flag);
				 Thread.sleep(3000);
				
				 ce.cialsecurityacceptancsaveBtn.click();
				 Thread.sleep(7000);
				  JavascriptExecutor js3 = (JavascriptExecutor) driver;
					 js3.executeScript("window.scrollBy(0,-300)", "");
					 Thread.sleep(3000);
					  
			 
			 
		 ce.cialsecurityacceptancfinalsubmitBtn.click();
		 Thread.sleep(10000);
					 
					driver.navigate().refresh();
					ce.cialExportTab.click();
				    Thread.sleep(3000);
				   ce.cialSecurityAceeptanceTab.click();
				    Thread.sleep(3000);
				 
					  
					   driver.switchTo().frame(0);
					   Thread.sleep(3000);
					   ce.cialsecurityacceptancedetailsbtn.click();
					   Thread.sleep(1000);
					 
					 ce.cialsecurityacceptanceairlineprifixfiled.click();
					// ce.cialsecurityacceptanceairlineprifixfiled.clear();
					   ce.cialsecurityacceptanceairlineprifixfiled.sendKeys("125");
					   Thread.sleep(1000);
					   ce.cialsecurityacceptanceAWBnumfield.click();
					   ce.cialsecurityacceptanceAWBnumfield.clear();
					   ce.cialsecurityacceptanceAWBnumfield.sendKeys("27122045"); 
					   Thread.sleep(1000);
					   ce.cialsecurityacceptanceHousenum.click();
					   ce.cialsecurityacceptanceHousenum.sendKeys("");
					   Thread.sleep(1000);
					   ce.cialsecurityAcceptanceDeatilssearchbtn.click();
					   Thread.sleep(3000);
					   
					   ce.cialsecurityacceptancemachinedropdow.click();
					   Select machinedrpDown1 = new Select(driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxddlMachine$fmsGenericDropDownList")));
					   machinedrpDown1.selectByVisibleText("XRAY 7");
					   Thread.sleep(3000);
					   ce.cialsecurityacceptancstickerstrtnumber.click();
					   ce.cialsecurityacceptancstickerstrtnumber.sendKeys("1");
					   Thread.sleep(2000);
					   ce.cialsecurityacceptancstickerEndnumber.click();
					   Thread.sleep(1000);
					   ce.cialsecurityacceptancscreeningmethod1sttik.click();
					   Thread.sleep(1000);
					   ce.cialsecurityacceptancscreeningmethod1sttikpices.sendKeys("15");
					   Thread.sleep(2000);
					   ce.cialsecurityacceptancscreeningmethod2ndtik.click();
					   Thread.sleep(1000);
					   ce.cialsecurityacceptancscreeningmethod2ndtikpices.sendKeys("15");
					   Thread.sleep(2000);
					   ce.cialsecurityacceptancsecuritytypeUnknownCargo.click();
					   Thread.sleep(3000);
					   ce.cialsecurityacceptancagentname.sendKeys("tester");
						 Thread.sleep(2000);
					   
					   JavascriptExecutor js2 = (JavascriptExecutor) driver;
						 WebElement flag2= driver.findElement(By.xpath("//*[@id='ctl00_cp_tc_tp2_ctl00_uxSave']"));
						 js2.executeScript("arguments[0].scrollIntoView();",flag2);
						 Thread.sleep(3000);
						
						 ce.cialsecurityacceptancsaveBtn.click();
						 Thread.sleep(7000);
						  JavascriptExecutor js4 = (JavascriptExecutor) driver;
							 js4.executeScript("window.scrollBy(0,-300)", "");
							 Thread.sleep(3000);
							  
					 
					 
				 ce.cialsecurityacceptancfinalsubmitBtn.click();
				 
				 Thread.sleep(10000);
				 
				 */
		
	}
	@Then("User is able to submit security screening if acceptance is not completed proper validation get to be displayed export")
	public void user_is_able_to_submit_security_screening_if_acceptance_is_not_completed_proper_validation_get_to_be_displayed_export() {
	    
	}
	@Then("To verify if System is displaying Security Representative details in Security Acceptance screen or not export")
	public void to_verify_if_system_is_displaying_security_representative_details_in_security_acceptance_screen_or_not_export() {
	   
	}
	@Then("To verify user is able to search Security Representative Name from Security Acceptance screen export")
	public void to_verify_user_is_able_to_search_security_representative_name_from_security_acceptance_screen_export() {
	   
	}
	@Then("If user search with invalid AWB no in security screening screen proper validation get to be displayed export")
	public void if_user_search_with_invalid_awb_no_in_security_screening_screen_proper_validation_get_to_be_displayed_export() {
	   
	}
	@Then("If user search with invalid HAWB no in security screening screen proper validation get to be displayed export")
	public void if_user_search_with_invalid_hawb_no_in_security_screening_screen_proper_validation_get_to_be_displayed_export() {
	    
	}
	@Then("In Security screening screen Screen pieces , Remaining pieces , Screening Pieces column get to be displayed correctly export")
	public void in_security_screening_screen_screen_pieces_remaining_pieces_screening_pieces_column_get_to_be_displayed_correctly_export() {
	   
	}
	@Then("To verify If user is able submit security scaninig twice from security Scaning screen export")
	public void to_verify_if_user_is_able_submit_security_scaninig_twice_from_security_scaning_screen_export() {
	   
	}
	@Then("To verify user is able to submit screening with multiple screening methods export")
	public void to_verify_user_is_able_to_submit_screening_with_multiple_screening_methods_export() {
	  
	}
	@Then("To verify if final  submitted is not done then screening will not be completed export")
	public void to_verify_if_final_submitted_is_not_done_then_screening_will_not_be_completed_export() {
	   
	}
	@Then("To verify After Screening is completed screening details get to be displayed in screening history export")
	public void to_verify_after_screening_is_completed_screening_details_get_to_be_displayed_in_screening_history_export() {
	   
	}
	@Then("To verify proper timestamp get to be display in screening date and time field in security screening screen export")
	public void to_verify_proper_timestamp_get_to_be_display_in_screening_date_and_time_field_in_security_screening_screen_export() {
	    
	}
	@Then("To verify when user click on Clear button on security screening screen all details get to be cleared export")
	public void to_verify_when_user_click_on_clear_button_on_security_screening_screen_all_details_get_to_be_cleared_export() {
	    
	}
	@Then("To verify in Unsecured list screening status percentage get to be reflect as per the screening status in security screening screen export")
	public void to_verify_in_unsecured_list_screening_status_percentage_get_to_be_reflect_as_per_the_screening_status_in_security_screening_screen_export() {
	  
	}
	@Then("To verify in AWB Details HAWB details get to be displayed export")
	public void to_verify_in_awb_details_hawb_details_get_to_be_displayed_export() throws InterruptedException {
	////switch to default window
	/*	
		driver.switchTo().defaultContent();
		   Thread.sleep(3000);
		 
		 ce.cialAWB_DetailsTab.click();
		    Thread.sleep(3000);
		    driver.switchTo().frame(0);
			   Thread.sleep(3000);
		   
		    ce.cialawbdeatilsAWB.click();
		    ce.cialawbdeatilsAWB.sendKeys("125");
		    Thread.sleep(1000);
		    ce.cialAWBdetailsawbentryfield.click();
		    ce.cialAWBdetailsawbentryfield.sendKeys("19122051");
		    ce.cialAWBdetailsawbentryfield.sendKeys(Keys.ENTER);
		    Thread.sleep(3000);
		   
		    ce.cialAWBdetailsShippernameaddress.click();
		    Thread.sleep(3000);
		  //  Thread.sleep(3000);
			//   driver.switchTo().frame(3);
			   Thread.sleep(2000);
			// It will return the parent window name as a String
			   String parent=driver.getWindowHandle();

			   Set<String>s=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I= s.iterator();

			   while(I.hasNext())
			   {

			   String child_window=I.next();


			   if(!parent.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialAWBdeatilsshipperselct.click();
			   Thread.sleep(2000);
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
		    ce.cialAWBdetailsconsigneenameadress.click();
		    Thread.sleep(3000);
		 // It will return the parent window name as a String
			   String parent2=driver.getWindowHandle();

			   Set<String>s2=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I2= s2.iterator();

			   while(I2.hasNext())
			   {

			   String child_window=I2.next();


			   if(!parent2.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialAWBdetailsconsineeselect.click();
			   Thread.sleep(2000);
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent2);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   
	
		    ce.cialAWBdetailsflightnumfield.click();
		    Thread.sleep(1000);
		    ce.cialAWBdetailsflightnumfield.sendKeys("BA101");
		    Thread.sleep(2000);
		    ce.cialAWBdetailsflightnumfield.sendKeys(Keys.ARROW_DOWN);
		    ce.cialAWBdetailsflightnumfield.sendKeys(Keys.ENTER);
		    Thread.sleep(2000);
		    ce.cialAWBdetailsflightdatefield.click();
		    ce.cialAWBdetailsflightdatefield.sendKeys("19-DEC-2023");
		    Thread.sleep(5000);
		
		    JavascriptExecutor jsAD = (JavascriptExecutor) driver;
			 WebElement flagAD= driver.findElement(By.xpath("/html/body/form/div[6]/fieldset/div/div[1]/div/table/tbody/tr/td[6]"));
			 jsAD.executeScript("arguments[0].scrollIntoView();",flagAD);
			 Thread.sleep(3000);
			 ce.cialAWBdetailschargebleweightfiled.click();
			 ce.cialAWBdetailschargebleweightfiled.clear();
			 ce.cialAWBdetailschargebleweightfiled.sendKeys("100");
			 Thread.sleep(3000);
			 ce.cialAWBdetailsRatefiled.click();
			 Thread.sleep(3000);
			 driver.switchTo().alert().accept();
			  Thread.sleep(3000);
			  ce.cialAWBdetailschargebleweightfiled.clear();
				 ce.cialAWBdetailschargebleweightfiled.sendKeys("400");
				 Thread.sleep(5000);
				 ce.cialAWBdetailsRatefiled.click();
				 ce.cialAWBdetailsRatefiled.clear();
				 ce.cialAWBdetailsRatefiled.sendKeys("50");
				 Thread.sleep(3000);
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 WebElement flag1= driver.findElement(By.xpath("/html/body/form/div[6]/fieldset/div/div[2]/table"));
				 js.executeScript("arguments[0].scrollIntoView();",flag1);
				 Thread.sleep(3000);
				 ce.cialAWBdetailsverifiedTikBox.click();
				 Thread.sleep(4000);
				ce.cialAWBdetailsSAVEBUTTON.click();
				Thread.sleep(2000);
				 driver.switchTo().alert().accept();
				 Thread.sleep(2000);
				 driver.switchTo().alert().accept();
				 
				 Thread.sleep(10000);
				*/ 
				 
	}
	@Then("To verify If flight details are updated in AWB Details screen then if AWB get to be reflect in build manifest in hand shipment screen export")
	public void to_verify_if_flight_details_are_updated_in_awb_details_screen_then_if_awb_get_to_be_reflect_in_build_manifest_in_hand_shipment_screen_export() {
	   
	}
	@Then("To verify In AWB details screen if user clicks on clear then all the details get to be cleared export")
	public void to_verify_in_awb_details_screen_if_user_clicks_on_clear_then_all_the_details_get_to_be_cleared_export() {
	   
	}
	@Then("To verify user is able to print label from AWB Details screen export")
	public void to_verify_user_is_able_to_print_label_from_awb_details_screen_export() {
	   
	}
	@Then("To verify user is able to submit DG Details from AWB Details Screen export")
	public void to_verify_user_is_able_to_submit_dg_details_from_awb_details_screen_export() {
	   
	}
	@Then("To verify If DG details are saved then in AWB details screen red border get to be displayed for the AWB export")
	public void to_verify_if_dg_details_are_saved_then_in_awb_details_screen_red_border_get_to_be_displayed_for_the_awb_export() throws InterruptedException {
		
	}
	@Then("To verify user is able to click on Damage button and Pop-up screen get to be displayed export")
	public void to_verify_user_is_able_to_click_on_damage_button_and_pop_up_screen_get_to_be_displayed_export() {
	   
	}
	@Then("To verify In AWB details screen legend\\/milestone for the process done get to be updated export")
	public void to_verify_in_awb_details_screen_legend_milestone_for_the_process_done_get_to_be_updated_export() {
	  
	}
	@Then("To verify when user click on Clear button on Document Acceptance screen entered details should be cleared export")
	public void to_verify_when_user_click_on_clear_button_on_document_acceptance_screen_entered_details_should_be_cleared_export() throws InterruptedException {
		
	}
	@Then("To verify user is able to upload document in document acceptance screen export")
	public void to_verify_user_is_able_to_upload_document_in_document_acceptance_screen_export() {
	   
	}
	@Then("To verify In Document acceptance screen uploaded document get to be display in uploaded Document list export")
	public void to_verify_in_document_acceptance_screen_uploaded_document_get_to_be_display_in_uploaded_document_list_export() {
	    
	}
	@Then("To verify user is  able to accept uploaded  document in Document acceptance screen export")
	public void to_verify_user_is_able_to_accept_uploaded_document_in_document_acceptance_screen_export() {
	   
	}
	@Then("To verify If user click on upload document without selecting any document proper validation get to be displayed export")
	public void to_verify_if_user_click_on_upload_document_without_selecting_any_document_proper_validation_get_to_be_displayed_export() throws InterruptedException {
		
	}
	@Then("To verify If user is able to to accept document without uploading any document proper validation get to be displayed export")
	public void to_verify_if_user_is_able_to_to_accept_document_without_uploading_any_document_proper_validation_get_to_be_displayed_export() {
	   
	}
	@Then("To verify If document acceptance is pending then in document acceptance screen pending status get to be displayed export")
	public void to_verify_if_document_acceptance_is_pending_then_in_document_acceptance_screen_pending_status_get_to_be_displayed_export() {
	    
	}
	@Then("If document acceptance is Completed then in document acceptance screen completed status get to be displayed export")
	public void if_document_acceptance_is_completed_then_in_document_acceptance_screen_completed_status_get_to_be_displayed_export() throws InterruptedException {
		
	}
	@Then("To verify user is able to assign location to direct AWB in warehouse location screen export")
	public void to_verify_user_is_able_to_assign_location_to_direct_awb_in_warehouse_location_screen_export() throws InterruptedException {
	////switch to default window
		/*
		driver.switchTo().defaultContent();
		   Thread.sleep(3000);
		 ce.cialWarehouseLocationTab.click();
		    Thread.sleep(3000);
		 
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   
			   ce.cialWarehouseLocationAWBprfixfield.click();
			   ce.cialWarehouseLocationAWBprfixfield.sendKeys("125");
			   Thread.sleep(2000);
			   ce.cialWarehouseLocationAWBnumfield.click();
			   ce.cialWarehouseLocationAWBnumfield.sendKeys("19122051");
			   Thread.sleep(2000);
			   ce.cialWarehouseLocationHAWBnumfield.click();
			   ce.cialWarehouseLocationHAWBnumfield.sendKeys("");
			   Thread.sleep(2000);
			   ce.cialWarehouseLocationSEARCHbtn.click();
			   Thread.sleep(2000);
			   ce.cialWarehouseLocationGroupId.click();
			   ce.cialWarehouseLocationGroupId.sendKeys("20232115");
			   Thread.sleep(2000);
			   ce.cialWarehouseLocation_locationsearchicon.click();
			   Thread.sleep(2000);
			   
			   String parentLA=driver.getWindowHandle();

			   Set<String>sLA=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> ILA= sLA.iterator();

			   while(ILA.hasNext())
			   {

			   String child_window=ILA.next();


			   if(!parentLA.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialWarehouseLocation_selectlocation.click();
			   Thread.sleep(2000);
		//	   driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parentLA);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   
			   ce.cialWarehouseLocationNOPFIELD.clear();
			   ce.cialWarehouseLocationNOPFIELD.sendKeys("10");
			   Thread.sleep(2000);
			   ce.cialWarehouseLocationWeightfield.click();
			   Thread.sleep(3000);
			   ce.cialWarehouseLocationSaveBtn.click();
			   Thread.sleep(3000);
			   
			   ce.cialWarehouseLocationGroupId.click();
			   ce.cialWarehouseLocationGroupId.sendKeys("20232116");
			   Thread.sleep(2000);
			   ce.cialWarehouseLocation_locationsearchicon.click();
			   Thread.sleep(2000);
			   
			   String parentWL2=driver.getWindowHandle();

			   Set<String>sWL2=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> IWL2= sWL2.iterator();

			   while(IWL2.hasNext())
			   {

			   String child_window=IWL2.next();


			   if(!parentWL2.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialWarehouseLocation_select2ndlocation.click();
			   Thread.sleep(2000);
		//	   driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parentWL2);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   
			   ce.cialWarehouseLocationNOPFIELD.clear();
			   ce.cialWarehouseLocationNOPFIELD.sendKeys("10");
			   Thread.sleep(2000);
			   ce.cialWarehouseLocationWeightfield.click();
			   Thread.sleep(3000);
			   ce.cialWarehouseLocationSaveBtn.click();
			   Thread.sleep(5000);
			   
			   ce.cialWarehouseLocationChangeLocationicon.click();
			   Thread.sleep(2000);
			   ce.cialWarehouseLocation_locationsearchicon.click();
			   Thread.sleep(2000);
			   
			   String parentWL3=driver.getWindowHandle();

			   Set<String>sWL3=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> IWL3= sWL3.iterator();

			   while(IWL3.hasNext())
			   {

			   String child_window=IWL3.next();


			   if(!parentWL3.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialWarehouseLocationselect3rdlocation.click();
			   Thread.sleep(2000);
		//	   driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parentWL3);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   ce.cialWarehouseLocationSaveBtn.click();
			   
			   Thread.sleep(3000);
			*/   
	}
	@Then("To verify user is able to assign location to shipment from warehouse location screen export")
	public void to_verify_user_is_able_to_assign_location_to_shipment_from_warehouse_location_screen_export() {
	  
	}
	@Then("To verify user is able to move shipment from one  location to another location  by click on move button from warehouse location screen export")
	public void to_verify_user_is_able_to_move_shipment_from_one_location_to_another_location_by_click_on_move_button_from_warehouse_location_screen_export() {
	   
	}
	@When("user search with AWB no in warehouse location in assigned location get to be displayed export")
	public void user_search_with_awb_no_in_warehouse_location_in_assigned_location_get_to_be_displayed_export() {
	   
	}
	@Then("To verify If user enters incorrect location then proper validation get to be displayed export")
	public void to_verify_if_user_enters_incorrect_location_then_proper_validation_get_to_be_displayed_export() {
	  
	}
	@Then("To verify user is able to assign multiple location to one shipment from warehouse location screen export")
	public void to_verify_user_is_able_to_assign_multiple_location_to_one_shipment_from_warehouse_location_screen_export() {
	   
	}
	@Then("To verify user is able to delete location details from warehouse location screen export")
	public void to_verify_user_is_able_to_delete_location_details_from_warehouse_location_screen_export() {
	   
	}
	@Then("To verify if user is able to hold shipment at house level by selecting acceptance method as Letter from Export Custom Action export")
	public void to_verify_if_user_is_able_to_hold_shipment_at_house_level_by_selecting_acceptance_method_as_letter_from_export_custom_action_export() throws InterruptedException {
	////switch to default window
		
		//	driver.switchTo().defaultContent();
			   Thread.sleep(3000);
		/*
			   ce.cialMoreTab.click();
			    Thread.sleep(5000);
		ce.cialMoreExportcustomsactionTab.click();
		    Thread.sleep(3000);
		    driver.switchTo().frame(0);
		    ce.cialexportcustomactionAWBprefix.click();
		    Thread.sleep(1000);
		    ce.cialexportcustomactionAWBprefix.sendKeys("125");
		    Thread.sleep(3000);
		    ce.cialexportcustomactionAWBnum.click();
		    ce.cialexportcustomactionAWBnum.sendKeys("19122036");
		    ce.cialexportcustomactionHAWBnofield.click();
		    ce.cialexportcustomactionHAWBnofield.sendKeys("");
		    ce.cialexportcustomactionSerchBtn.click();
		    
		    Thread.sleep(3000);
		    ce.cialexportCustomActionHoldBtn.click();
		    Thread.sleep(3000);
		    String parentCA=driver.getWindowHandle();
			   Set<String>sCA=driver.getWindowHandles();
			   // Now iterate using Iterator
			   Iterator<String> ICA= sCA.iterator();
			   while(ICA.hasNext())
			   {
			   String child_window=ICA.next();
			   if(!parentCA.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialexportHoldVerbalCheckboxTik.click();
			   Thread.sleep(1000);
			   Select HoldTypeDown = new Select(driver.findElement(By.name("ctl00$cp$drpHoldType$fmsGenericDropDownList")));
			   HoldTypeDown.selectByVisibleText("Hold");
			   Thread.sleep(3000);
			   ce.cialexportCustomActionOrderNumber.click();
			   Thread.sleep(1000);
			   ce.cialexportCustomActionOrderNumber.sendKeys("202320");
			   Thread.sleep(1000);
			   ce.cialexportCustomActionAuthorityName.click();
			   Thread.sleep(1000);
			   ce.cialexportCustomActionAuthorityName.sendKeys("kale");
			   Thread.sleep(1000);
			   ce.cialexportCustomActionAuthorityDetails.click();
			   Thread.sleep(1000);
			   ce.cialexportCustomActionAuthorityDetails.sendKeys("from kale admin");
			   Thread.sleep(1000);
			   ce.cialexportcustomactionRemarkField.click();
			   Thread.sleep(1000);
			   ce.cialexportcustomactionRemarkField.sendKeys("this is for testing HOLD");
			   Thread.sleep(1000);
			   ce.cialexportCustomActionFinalHoldBtn.click();
			   Thread.sleep(5000);
		//	   driver.close();
			   }
			   }
			   //switch to the parent window
			  driver.switchTo().window(parentCA);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			  ce.cialexportCustomActionHoldBtn.click();
			   Thread.sleep(3000);
			   String parentCA1=driver.getWindowHandle();

			   Set<String>sCA1=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> ICA1= sCA1.iterator();

			   while(ICA1.hasNext())
			   {

			   String child_window=ICA1.next();


			   if(!parentCA1.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialexportToUnholdEditBtn.click();
			   Thread.sleep(2000);
			   ce.cialexportSelectShipment.click();
			   Thread.sleep(2000);
			   ce.cialexportUnholdBtn.click();
			   Thread.sleep(3000);
		//	   driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parentCA1);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cialEXPORTLocationSelectSeize.click();
			   Thread.sleep(2000);
			   ce.cialEXPORTSeizeBtn.click();
			   Thread.sleep(5000);
			   ce.cialEXPORTUnSeizeBtn.click();
			   Thread.sleep(2000);
			   driver.switchTo().alert().accept();
				  Thread.sleep(5000);
				*/ 
				  
	}
	@Then("To verify if user is able to hold shipment at house level by selecting acceptance method as Verbal from Export Custom Action export")
	public void to_verify_if_user_is_able_to_hold_shipment_at_house_level_by_selecting_acceptance_method_as_verbal_from_export_custom_action_export() {
	  
	}
	@Then("To verify user is able to Unhold shipment at house level from Export Custom Action export")
	public void to_verify_user_is_able_to_unhold_shipment_at_house_level_from_export_custom_action_export() {
	   
	}
	@Then("To verify user is able to do Seize shipment  at house level from Export Custom Action export")
	public void to_verify_user_is_able_to_do_seize_shipment_at_house_level_from_export_custom_action_export() {
	  
	}
	@Then("To verify if system is allowing to manifest hold shipment to flight validation get to be be display export")
	public void to_verify_if_system_is_allowing_to_manifest_hold_shipment_to_flight_validation_get_to_be_be_display_export() {
	   
	}
	@Then("To verify user able to seize\\/Clear shipment by click on Clear button in Export custom action export")
	public void to_verify_user_able_to_seize_clear_shipment_by_click_on_clear_button_in_export_custom_action_export() {
	   
	}
	@Then("To verify user is able to hold shipment direct shipment by selecting acceptance method as Letter from Export custom action screen export")
	public void to_verify_user_is_able_to_hold_shipment_direct_shipment_by_selecting_acceptance_method_as_letter_from_export_custom_action_screen_export() {
	   
	}
	@Then("To verify user is able to hold shipment direct shipment by selecting acceptance method as Verbal from Export Custom Action screen export")
	public void to_verify_user_is_able_to_hold_shipment_direct_shipment_by_selecting_acceptance_method_as_verbal_from_export_custom_action_screen_export() {
	   
	}
	@Then("To verify user able to Unhold shipment direct shipment from Export Custom Action export")
	public void to_verify_user_able_to_unhold_shipment_direct_shipment_from_export_custom_action_export() {
	   
	}
	@Then("To verify user is able to do Seize shipment  for direct shipment from Export Custom Action Screen export")
	public void to_verify_user_is_able_to_do_seize_shipment_for_direct_shipment_from_export_custom_action_screen_export() {
	   
	}
	@Then("To verify User is able to add  ULD details in build plan screen export")
	public void to_verify_user_is_able_to_add_uld_details_in_build_plan_screen_export() throws InterruptedException {
	
	//	driver.switchTo().defaultContent();
	/*	    ce.cialMoreTab.click();
		    Thread.sleep(5000);
		    ce.cialmoreBuildManifestTab.click();
		    Thread.sleep(5000);
		    driver.switchTo().frame(0);
		   ce.cialmoreBuildManifestflightsearchIcon.click();
		    Thread.sleep(5000);
		    
		    String parentBM=driver.getWindowHandle();

			   Set<String>sBM=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> IBM= sBM.iterator();

			   while(IBM.hasNext())
			   {

			   String child_window=IBM.next();


			   if(!parentBM.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   driver.findElement(By.id("ctl00_cp_GrdSearch_ctl04_fmslblFlight")).click();
			 //  ce.cialmoreBuildManifestflightSelect.click();
			   Thread.sleep(3000);
		//	   driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parentBM);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   
			   ce.cialmoreBuildManifestULDprefixfield.click();
			   ce.cialmoreBuildManifestULDprefixfield.sendKeys("HMA");
			   ce.cialmoreBuildManifestULDprefixfield.sendKeys(Keys.ARROW_DOWN);
			   ce.cialmoreBuildManifestULDprefixfield.sendKeys(Keys.ENTER);
			   Thread.sleep(3000);
			   ce.cialmoreBuildManifestULDnumfield.click();
			   ce.cialmoreBuildManifestULDnumfield.sendKeys("201002");
			   ce.cialmoreBuildManifestflightname.sendKeys("AI");
			   Thread.sleep(3000);
			   Select ULDdrpDown1 = new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$uxdrpAircraftPosition")));
			   ULDdrpDown1.selectByVisibleText("MD");
			   Thread.sleep(3000);
			   ce.cialmoreBuildManifestADDULDbtn.click();
			   Thread.sleep(5000); 
			  //14072015
			   ce.cialmoreBuildManifestAddedeULDselect.click();
			   Thread.sleep(3000);
			   ce.cialmoreBuildManifestaddshipbtn.click();
			   Thread.sleep(5000);
			   String parentP=driver.getWindowHandle();
			   Set<String>sP=driver.getWindowHandles();
			   // Now iterate using Iterator
			   Iterator<String> IP= sP.iterator();
			   while(IP.hasNext())
			   {
			   String child_window=IP.next();
			   if(!parentP.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   driver.findElement(By.id("ctl00_cp_uxAWB_FMSAWBPrefixSelected")).clear();
			    Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_cp_uxAWB_FMSAWBPrefixSelected")).sendKeys("125");
			    Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_cp_uxAWB_FMSAWBNoSelected")).clear();
			    Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_cp_uxAWB_FMSAWBNoSelected")).sendKeys("19122036");
			    Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_cp_uxSearch")).click();
			    Thread.sleep(3000);
			   driver.findElement(By.id("ctl00_cp_gS_ctl02_uxSelect")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.name("ctl00$cp$uxOk")).click();
			    Thread.sleep(3000);
			   Thread.sleep(2000);
			 //  driver.close();
			   
			   }

			   }
			   driver.switchTo().window(parentP);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0); 
			   Thread.sleep(2000);
			   driver.findElement(By.id("ctl00_ContentPlaceHolder1_uxCustomReference")).sendKeys("2132017");
			    Thread.sleep(3000);
			   driver.findElement(By.id("ctl00_ContentPlaceHolder1_uxAircraftReg")).sendKeys("9080");
			    Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_ContentPlaceHolder1_uxActualDepartureDate_txtDateField")).sendKeys("19/12/2023");
			    Thread.sleep(3000);
			   driver.findElement(By.id("ctl00_ContentPlaceHolder1_uxATDT_uxTime")).sendKeys("1600");
			    Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_ContentPlaceHolder1_uxRecordFlightDeparture")).click();
			    Thread.sleep(5000);
			//   driver.findElement(By.id("ctl00_cp_gS_ctl02_uxSelect")).click();
			    Thread.sleep(1000);
			  */  
			  
	}
	@Then("To verify If ULD position is not selected in build plan screen proper validation get to be displayed export")
	public void to_verify_if_uld_position_is_not_selected_in_build_plan_screen_proper_validation_get_to_be_displayed_export() {
	   
	}
	@Then("To verify user is able to add shipment from Build Plan screen export")
	public void to_verify_user_is_able_to_add_shipment_from_build_plan_screen_export() {
	  
	}
	@Then("To verify if user enter incorrect flight details in build manifest screen proper validation get to be displayed export")
	public void to_verify_if_user_enter_incorrect_flight_details_in_build_manifest_screen_proper_validation_get_to_be_displayed_export() {
	    
	}
	@Then("To verify user is able to add  ULD details in build manifest screen export")
	public void to_verify_user_is_able_to_add_uld_details_in_build_manifest_screen_export() {
	   
	}
	@Then("To verify If ULD position is not selected in build manifest screen proper validation get to be displayed export")
	public void to_verify_if_uld_position_is_not_selected_in_build_manifest_screen_proper_validation_get_to_be_displayed_export() {
	  
	}
	@Then("To verify user is able to  add consol shipment into flight from Build manifest screen export")
	public void to_verify_user_is_able_to_add_consol_shipment_into_flight_from_build_manifest_screen_export() {
	   
	}
	@Then("To verify user is able to view manifested consol shipment details in build manifest screen export")
	public void to_verify_user_is_able_to_view_manifested_consol_shipment_details_in_build_manifest_screen_export() {
	   
	}
	@Then("To verify user is able to add direct shipment into flight from Build manifest screen export")
	public void to_verify_user_is_able_to_add_direct_shipment_into_flight_from_build_manifest_screen_export() {
	  
	}
	@Then("To verify user is able to view  manifested direct shipment details in build manifest screen export")
	public void to_verify_user_is_able_to_view_manifested_direct_shipment_details_in_build_manifest_screen_export() {
	  
	}
	@Then("To verify user is able to add AWB in flight on HAWB level from Build manifest screen export")
	public void to_verify_user_is_able_to_add_awb_in_flight_on_hawb_level_from_build_manifest_screen_export() {
	  
	}
	@Then("To verify If AWB is added in HAWB level then MAWB total count get to be displayed as total manifested pieces in weight in flight in Build manifest screen export")
	public void to_verify_if_awb_is_added_in_hawb_level_then_mawb_total_count_get_to_be_displayed_as_total_manifested_pieces_in_weight_in_flight_in_build_manifest_screen_export() {
	   
	}
	@Then("To verify If screening is pending for a Shipment and when user tries to manifest shipment then proper validation get to be displayed export")
	public void to_verify_if_screening_is_pending_for_a_shipment_and_when_user_tries_to_manifest_shipment_then_proper_validation_get_to_be_displayed_export() {
	   
	}
	@Then("To verify If user search with invalid AWB no in Add Ship screen proper validation get to be displayed from build manifest screen export")
	public void to_verify_if_user_search_with_invalid_awb_no_in_add_ship_screen_proper_validation_get_to_be_displayed_from_build_manifest_screen_export() {
	   
	}
	@Then("If user clicks on show All checkbox in Add Shipment screen all the AWB should be displayed in Build manifest screen export")
	public void if_user_clicks_on_show_all_checkbox_in_add_shipment_screen_all_the_awb_should_be_displayed_in_build_manifest_screen_export() {
	 
	}
	@Then("To verify user is able to Remove Shipment in ULD in build manifest screen for direct shipment export")
	public void to_verify_user_is_able_to_remove_shipment_in_uld_in_build_manifest_screen_for_direct_shipment_export() {
	    
	}
	@Then("To verify user able to Remove shipment at HAWB level from Build manifest screen export")
	public void to_verify_user_able_to_remove_shipment_at_hawb_level_from_build_manifest_screen_export() {
	   
	}
	@Then("To verify user is able to remove shipment at part HAWB level from build manifest screen export")
	public void to_verify_user_is_able_to_remove_shipment_at_part_hawb_level_from_build_manifest_screen_export() {
	   
	}
	@Then("To verify If user removes shipment at part HAWB level then MAWB level pieces get to be displayed as total manifested pieces on Build manifest screen export")
	public void to_verify_if_user_removes_shipment_at_part_hawb_level_then_mawb_level_pieces_get_to_be_displayed_as_total_manifested_pieces_on_build_manifest_screen_export() {
	   
	}
	@Then("To verify Remove shipment display in build manifest screen or not export")
	public void to_verify_remove_shipment_display_in_build_manifest_screen_or_not_export() {
	  
	}
	@Then("To verify user is able to move shipment HAWB level or not from build manifest screen export")
	public void to_verify_user_is_able_to_move_shipment_hawb_level_or_not_from_build_manifest_screen_export() {
	 
	}
	@Then("To verify user is able to view details  move shipment in build manifest screen export")
	public void to_verify_user_is_able_to_view_details_move_shipment_in_build_manifest_screen_export() {
	   
	}
	@Then("To verify user is able to enter fight Build up details and generate gate pass in build manifest screen export")
	public void to_verify_user_is_able_to_enter_fight_build_up_details_and_generate_gate_pass_in_build_manifest_screen_export() {
	   
	}
	@Then("To verify user is able to generate gate pass and enter flight build up details if ULD is not closed proper validation get to  be displayed export")
	public void to_verify_user_is_able_to_generate_gate_pass_and_enter_flight_build_up_details_if_uld_is_not_closed_proper_validation_get_to_be_displayed_export() {
	 
	}
	@Then("To verify user is able to Record Flight Departure in build manifest screen export")
	public void to_verify_user_is_able_to_record_flight_departure_in_build_manifest_screen_export() {
	   
	}
	@Then("To verify user is able to offload shipment from build manifest screen export")
	public void to_verify_user_is_able_to_offload_shipment_from_build_manifest_screen_export() {
	 
	}
	@Then("To verify offload shipment get not to be display in  build manifest screen export")
	public void to_verify_offload_shipment_get_not_to_be_display_in_build_manifest_screen_export() {
	   
	}
	@Then("To verify user is able to offload shipment at HAWB level from build manifest screen export")
	public void to_verify_user_is_able_to_offload_shipment_at_hawb_level_from_build_manifest_screen_export() {
	  
	}
	@Then("To verify user should be able to offload shipment at part HAWB level from build manifest screen export")
	public void to_verify_user_should_be_able_to_offload_shipment_at_part_hawb_level_from_build_manifest_screen_export() {
	 
	}
	@Then("To verify If user offload shipment at part HAWB level then MAWB level pieces get to be displayed as total manifested pieces in Build manifest screen export")
	public void to_verify_if_user_offload_shipment_at_part_hawb_level_then_mawb_level_pieces_get_to_be_displayed_as_total_manifested_pieces_in_build_manifest_screen_export() {
	    
	}
	@Then("To verify user is able to take UWS Statement print from build manifest screen")
	public void to_verify_user_is_able_to_take_uws_statement_print_from_build_manifest_screen() {
	  
	}
	@Then("To verify user is able to navigate to BTT Screen export")
	public void to_verify_user_is_able_to_navigate_to_btt_screen_export() {
	   
	}
	@Then("To verify user is able to do BTT for direct Shipment export")
	public void to_verify_user_is_able_to_do_btt_for_direct_shipment_export() {
	
	}
	@Then("To verify user is able to do BTT for HAWB Shipment export")
	public void to_verify_user_is_able_to_do_btt_for_hawb_shipment_export() {
	  
	}
	@Then("To verify user is able to do BTT in Part for direct Shipment export")
	public void to_verify_user_is_able_to_do_btt_in_part_for_direct_shipment_export() {
	   
	}
	@Then("To verify user is able to do BTT in Part for HAWB  Shipment export")
	public void to_verify_user_is_able_to_do_btt_in_part_for_hawb_shipment_export() {
	   
	}
	@Then("To verify user is able to Generate GP from BTT screen export")
	public void to_verify_user_is_able_to_generate_gp_from_btt_screen_export() {
	   
	}
	@Then("To verify user is able to generate GP Print from BTT screen export")
	public void to_verify_user_is_able_to_generate_gp_print_from_btt_screen_export() {
	   
	}
	@Then("To verify user is able to Cancel Generated GP from BTT screen export")
	public void to_verify_user_is_able_to_cancel_generated_gp_from_btt_screen_export() {
	   
	}
	@Then("To verify user is able to Re-Generate Cancelled  GP from BTT screen export")
	public void to_verify_user_is_able_to_re_generate_cancelled_gp_from_btt_screen_export() {
	    
	}
	@Then("To verify user is able to Release the shipment in BTT screen export")
	public void to_verify_user_is_able_to_release_the_shipment_in_btt_screen_export() {
	   
	}
	@Then("To verify user is able to Generate and cancel GP after Release  in  BTT screen export")
	public void to_verify_user_is_able_to_generate_and_cancel_gp_after_release_in_btt_screen_export() {
	   
	}




	


}
