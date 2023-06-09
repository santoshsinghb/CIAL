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
//1
public class TEST {
	@When("I login with {string} user given in {string} sheet of excel data")
	public void i_login_with_gs_auser_given_in_sheet_of_excel_data(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
	    Thread.sleep(500);
	    System.out.println("usr= "+Username);
	    System.out.println("pwd= "+Password);
	
	    loginScreen.Login(Entity, Username, Password);
	   
	    Thread.sleep(5000);

	}
	
	
	

	@Then("To verify flow from login screen to VCT generation part")
	public void to_verify_flow_from_login_screen_to_vct_generation_part() throws InterruptedException {
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		   
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cial_driverName.click();
			   ce.cial_driverName.sendKeys("JHON");
				   Thread.sleep(2000);
				   ce.cial_vehicleNumber.click();
				   ce.cial_vehicleNumber.sendKeys("JH01DV1000");
				   Thread.sleep(2000);
		    ce.cialAWBnumberField.click();
		    ce.cialAWBnumberField.sendKeys("12529052166");
		    Thread.sleep(2000);
		    ce.cialgenerationRemarkBox.click();
		    ce.cialgenerationRemarkBox.sendKeys("THIS IS FOR AUTOMATION TESTING");
		    ce.cialAWNnpx.click();
		    ce.cialAWNnpx.sendKeys("20");
		    Thread.sleep(2000);
		    ce.cial_AWBwt.click();
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
		   ce.cialfertilizer.click();
		   Thread.sleep(2000);
		 //  driver.close();
		   
		   }

		   }
		   //switch to the parent window
		  driver.switchTo().window(parent);
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
		   String parent1=driver.getWindowHandle();

		   Set<String>s1=driver.getWindowHandles();

		   // Now iterate using Iterator
		   Iterator<String> I11= s1.iterator();

		   while(I11.hasNext())
		   {

		   String child_window=I11.next();


		   if(!parent1.equals(child_window))
		   {
		   driver.switchTo().window(child_window);

		   System.out.println(driver.switchTo().window(child_window));
		   ce.cialagentName.click();;
		   Thread.sleep(2000);
		
		   }

		   }
		   //switch to the parent window
		  driver.switchTo().window(parent1);
		   Thread.sleep(3000);
		   driver.switchTo().frame(0);
		   Thread.sleep(2000);
		   Select securitydropdown = new Select(driver.findElement(By.name("ctl00$cp$uxgrdAWBContents$ctl02$chkSecured")));
		   ce.cialsecuritysatus.click();
		 //  ce.cialsecuritysatus.sendKeys(Keys.ARROW_DOWN);
		   Thread.sleep(2000);
		   securitydropdown.selectByVisibleText("Secured");
		   Thread.sleep(2000);
		   ce.cialplusbtnConsole.click();
		   Thread.sleep(5000);
		   
		   ce.cialVCTgeneration2ndAWBfield.click();
		   ce.cialVCTgeneration2ndAWBfield.sendKeys("12529052170");;
		   Thread.sleep(1000);
		   ce.cialVCTgeneration2ndHOUSEfield.click();
		   ce.cialVCTgeneration2ndHOUSEfield.sendKeys("HH1");
		   Thread.sleep(1000);
		   ce.cialVCTgeneration2ndAWBNPXfield.click();
		   ce.cialVCTgeneration2ndAWBNPXfield.sendKeys("30");
		   Thread.sleep(1000);
		   ce.cialVCTgeneration2ndAWBwtfield.click();
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
			   String parent2ndc=driver.getWindowHandle();

			   Set<String>s2ndc=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I2ndc= s2ndc.iterator();

			   while(I2ndc.hasNext())
			   {

			   String child_window=I2ndc.next();


			   if(!parent2ndc.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialVCTgeneration2ndcommodityselectbtn.click();
			   Thread.sleep(2000);
			 //  driver.close();
			   
			   }

			   }
			   driver.switchTo().window(parent);
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
			   String parent2ndagnt=driver.getWindowHandle();

			   Set<String>s2ndagnt=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I2ndagnt= s2ndagnt.iterator();

			   while(I2ndagnt.hasNext())
			   {

			   String child_window=I2ndagnt.next();


			   if(!parent2ndagnt.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialVCT2ndAGENTNAMEselection.click();
			   Thread.sleep(2000);
			 //  driver.close();
			   
			   }

			   }
			   driver.switchTo().window(parent2ndagnt);
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
				   driver.switchTo().window(parent);
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
		  Thread.sleep(5000);
		  Thread.sleep(10000);
		  Thread.sleep(5000);
		  Thread.sleep(10000);
	/*	  Thread.sleep(10000);
	  driver.switchTo().window(parent);
		   Thread.sleep(3000);
		  ce.CialVCTacceptanceTab.click();
		  Thread.sleep(10000);
		  Thread.sleep(10000); */
		 
			 //1223331  
	}



	
	
//2
	@Then("To verify if user is able to create Direct Shipment or not from VCT generation screen")
	public void to_verify_if_user_is_able_to_create_direct_shipment_or_not_from_vct_generation_screen() throws InterruptedException {
	    ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.cialVCTgenerationTab.click();
	    Thread.sleep(3000);
	   
		   driver.switchTo().frame(0);
		   Thread.sleep(3000);
		   ce.cial_driverName.click();
		   ce.cial_driverName.sendKeys("DRIVER_two");
			   Thread.sleep(2000);
			   ce.cial_vehicleNumber.click();
			   ce.cial_vehicleNumber.sendKeys("JH01DV6022");
			   Thread.sleep(2000);
	    ce.cialAWBnumberField.click();
	    ce.cialAWBnumberField.sendKeys("12510602012");
	    Thread.sleep(2000);
	    ce.cialAWNnpx.click();
	    ce.cialAWNnpx.clear();
	    ce.cialAWNnpx.sendKeys("30");
	    Thread.sleep(5000);
	    ce.cial_AWBwt.click();
	    Thread.sleep(1000);
	    ce.cial_AWBwt.clear();
	    ce.cial_AWBwt.sendKeys("300");
	    Thread.sleep(5000);

	/*   ce.cial_originAirport.click();
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
		   Thread.sleep(1000);
		// It will return the parent window name as a String
		   String parent=driver.getWindowHandle();

		   Set<String>s=driver.getWindowHandles();

		   // Now iterate using Iterator
		   Iterator<String> I1= s.iterator();

		   while(I1.hasNext())
		   {

		   String child_window=I1.next();


		   if(!parent.equals(child_window))
		   {
		   driver.switchTo().window(child_window);
		   Thread.sleep(4000);
		   System.out.println(driver.switchTo().window(child_window));
		   ce.cialfertilizer.click();
		  // String goodsnature = ce.cialAUtopartstxt.getText();
		   Thread.sleep(2000);
		 //  ce.cialclosebuttoncommodity.click();
		 //  driver.close();
		   
		   }

		   }
		   //switch to the parent window
		  driver.switchTo().window(parent);
		   Thread.sleep(3000);
		   driver.switchTo().frame(0);
		   Thread.sleep(2000);
		   ce.cial_natureofGoods.sendKeys("AUTO PARTS");
		   Thread.sleep(2000);
		   ce.cial_natureofGoods.sendKeys(Keys.ARROW_DOWN);;
		   ce.cial_natureofGoods.sendKeys(Keys.ENTER);;
		   Thread.sleep(2000);
		   ce.cialSHC.click();
		   Thread.sleep(2000);
		   ce.cialSHCbox1.sendKeys("GEN");
		   Thread.sleep(2000);
		   ce.cialSHCbox1.sendKeys(Keys.ARROW_DOWN);
		   Thread.sleep(2000);
		   ce.cialSHCboxCloseBtn.click();
		   Thread.sleep(2000);
		   ce.cial_agentSearch.click();
		   Thread.sleep(2000);
		   String parent1=driver.getWindowHandle();

		   Set<String>s1=driver.getWindowHandles();

		   // Now iterate using Iterator
		   Iterator<String> I11= s1.iterator();

		   while(I11.hasNext())
		   {

		   String child_window=I11.next();


		   if(!parent1.equals(child_window))
		   {
		   driver.switchTo().window(child_window);

		   System.out.println(driver.switchTo().window(child_window));
		   ce.cialagentName.click();;
		   Thread.sleep(2000);
		  // String goodsnature = ce.cialAUtopartstxt.getText();
		//   Thread.sleep(2000);
		 //  ce.cialclosebuttoncommodity.click();
		 //  driver.close();
		   
		   }

		   }
		   //switch to the parent window
		  driver.switchTo().window(parent);
		   Thread.sleep(3000);
		   driver.switchTo().frame(0);
		   Thread.sleep(2000);
		  
		  ce.cial_saveButton.click();
		  Thread.sleep(5000);
		  
		  driver.switchTo().alert().accept();
		  Thread.sleep(5000);
		  Thread.sleep(10000);
		  Thread.sleep(5000);
		  Thread.sleep(10000);
		  Thread.sleep(10000);
		  driver.switchTo().window(parent);
		   Thread.sleep(3000);
		  ce.CialVCTacceptanceTab.click();
		  Thread.sleep(10000);
		  Thread.sleep(10000); 
		  */
		   }


	 
	   
	    
	//3
	@Then("To verify if user is able to create Console Shipment or not from VCT generation screen")
	public void to_verify_if_user_is_able_to_create_console_shipment_or_not_from_vct_generation_screen() throws InterruptedException {
	 
		
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		   
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cial_driverName.click();
			   ce.cial_driverName.sendKeys("DRIVER_FIVE");
				   Thread.sleep(2000);
				   ce.cial_vehicleNumber.click();
				   ce.cial_vehicleNumber.sendKeys("JH01FC5022");
				   Thread.sleep(2000);
		    ce.cialAWBnumberField.click();
		    ce.cialAWBnumberField.sendKeys("12576453893");
		    Thread.sleep(2000);
		    ce.cialHouseNUMBER.click();
		    ce.cialHouseNUMBER.sendKeys("H1");
		    ce.cialAWNnpx.click();
		    ce.cialAWNnpx.sendKeys("30");
		    Thread.sleep(2000);
		    ce.cial_AWBwt.click();
		    Thread.sleep(1000);
		    ce.cial_AWBwt.sendKeys("300.00");
		    Thread.sleep(2000);
		    ce.cialshipNPX.click();
		    ce.cialshipNPX.clear();
		   ce.cialshipNPX.sendKeys("20");
		    Thread.sleep(2000);
		    ce.cialshipweight.click();
		    ce.cialshipweight.clear();
		    ce.cialshipweight.sendKeys("200");
		    Thread.sleep(2000);
//		   ce.cial_natureofGoods.click();
//		   Thread.sleep(1000);
//		   ce.cial_natureofGoods.sendKeys("");
//		   Thread.sleep(2000);
//		   
		   
		   ce.cial_originAirport.click();
		   ce.cial_originAirport.sendKeys("COK");
		   Thread.sleep(2000);
		   ce.cial_originAirport.sendKeys(Keys.ARROW_DOWN);
		   ce.cial_originAirport.sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
		   ce.cial_destinationAirport.click();
		   ce.cial_destinationAirport.sendKeys("DXB");
		   ce.cial_destinationAirport.sendKeys(Keys.ARROW_DOWN);
		   ce.cial_destinationAirport.sendKeys(Keys.ENTER);
		   Thread.sleep(3000);
		   
		  
			  
			   ce.cialcommoditysearch.click();
			   Thread.sleep(3000);
			//   driver.switchTo().frame(3);
			   Thread.sleep(1000);
			// It will return the parent window name as a String
			   String parent=driver.getWindowHandle();

			   Set<String>s=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I1= s.iterator();

			   while(I1.hasNext())
			   {

			   String child_window=I1.next();


			   if(!parent.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialfertilizer.click();
			  // String goodsnature = ce.cialAUtopartstxt.getText();
			   Thread.sleep(2000);
			 //  ce.cialclosebuttoncommodity.click();
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   ce.cial_natureofGoods.sendKeys("AUTO PARTS");
			   Thread.sleep(2000);
			   ce.cial_natureofGoods.sendKeys(Keys.ARROW_DOWN);;
			   ce.cial_natureofGoods.sendKeys(Keys.ENTER);;
			   Thread.sleep(2000);
			   ce.cialSHC.click();
			   Thread.sleep(2000);
			   ce.cialSHCbox1.sendKeys("GEN");
			   Thread.sleep(2000);
			   ce.cialSHCbox1.sendKeys(Keys.ARROW_DOWN);
			   Thread.sleep(2000);
			   ce.cialSHCboxCloseBtn.click();
			   Thread.sleep(2000);
			   ce.cial_agentSearch.click();
			   Thread.sleep(2000);
			   String parent1=driver.getWindowHandle();

			   Set<String>s1=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I11= s1.iterator();

			   while(I11.hasNext())
			   {

			   String child_window=I11.next();


			   if(!parent1.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialagentName.click();;
			   Thread.sleep(2000);
			  // String goodsnature = ce.cialAUtopartstxt.getText();
			//   Thread.sleep(2000);
			 //  ce.cialclosebuttoncommodity.click();
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			  ce.cialCOPYBTNconsole.click();
			  Thread.sleep(2000);
			  ce.cialplusbtnConsole.click();
			  Thread.sleep(2000);
			  ce.cial2ndhousebox.click();
			  Thread.sleep(1000);
			  ce.cial2ndhousebox.sendKeys("H2");
			  Thread.sleep(2000);
			  ce.cial2ndshipNPX.clear();
			  ce.cial2ndshipNPX.sendKeys("10");
			  Thread.sleep(2000);
			  ce.cial2ndshipwt.clear();
			  ce.cial2ndshipwt.sendKeys("100");
			  Thread.sleep(2000); 
			  ce.cial2ndcommoditysearch.click();
			   Thread.sleep(3000);
			//   driver.switchTo().frame(3);
			   Thread.sleep(1000);
			// It will return the parent window name as a String
			   String parent2=driver.getWindowHandle();

			   Set<String>s2=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I12= s2.iterator();

			   while(I12.hasNext())
			   {

			   String child_window=I12.next();


			   if(!parent2.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cial2ndgoodsslect.click();
			  // String goodsnature = ce.cialAUtopartstxt.getText();
			   Thread.sleep(2000);
			 //  ce.cialclosebuttoncommodity.click();
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent2);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   ce.cial2nsgoodsnature.sendKeys("GOLD JEWELLER");
			   Thread.sleep(2000);
			   ce.cial2nsgoodsnature.sendKeys(Keys.ARROW_DOWN);;
			   ce.cial2nsgoodsnature.sendKeys(Keys.ENTER);;
			   Thread.sleep(2000);
			   ce.cial2ndSHCsearch.click();
			   Thread.sleep(2000);
			   ce.cial2ndserchbarforSHC.sendKeys("VAL");
			   Thread.sleep(2000);
			   ce.cial2ndserchbarforSHC.sendKeys(Keys.ARROW_DOWN);
			   ce.cial2ndserchbarforSHC.sendKeys(Keys.ENTER);
			   ce.cialSHCokBTN.click();
			   Thread.sleep(2000);
			   
			   Thread.sleep(2000);
			  ce.cial_saveButton.click();
			  Thread.sleep(5000);
			  
			  driver.switchTo().alert().accept();
			  Thread.sleep(5000);
			  Thread.sleep(10000);
			  Thread.sleep(5000);
			  Thread.sleep(10000);
			  Thread.sleep(5000);
			  Thread.sleep(10000);
			   }


	
	
	//4
	@Then("To verify if user is able to take VCT print or not from VCT Generation Screen")
	public void to_verify_if_user_is_able_to_take_vct_print_or_not_from_vct_generation_screen() throws InterruptedException {
		
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		   
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cialVCTgenerationVCTsearchbox.click();
			   ce.cialVCTgenerationVCTsearchbox.clear();
			   ce.cialVCTgenerationVCTsearchbox.sendKeys("T2023052400004");
			   ce.cialVCTgenerationVCTsearchbox.sendKeys(Keys.ENTER);
			   Thread.sleep(3000);
			   
			   ce.cialprintbutn.click();
				  Thread.sleep(3000);
				  String parent7=driver.getWindowHandle();

				   Set<String>s17=driver.getWindowHandles();

				   // Now iterate using Iterator
				   Iterator<String> I17= s17.iterator();

				   while(I17.hasNext())
				   {

				   String child_window=I17.next();


				   if(!parent7.equals(child_window))
				   {
				   driver.switchTo().window(child_window);

				   System.out.println(driver.switchTo().window(child_window));
				 
				   Thread.sleep(2000);
				  ce.ciala4sheetPrintbtn.click();
				  Thread.sleep(1000);
				  ce.cialfinalPrintBtn.click();
				  Thread.sleep(2000);
				  Thread.sleep(10000);
				  Thread.sleep(5000);
				  Thread.sleep(10000);

				   }
				   driver.switchTo().window(parent7);
				   Thread.sleep(3000);}
		
	}
	
	//5
	@Then("To verify if user is able to search VCT no. or not from  VCT Generation Screen")
	public void to_verify_if_user_is_able_to_search_vct_no_or_not_from_vct_generation_screen() throws InterruptedException {
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		   
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cialVCTnumberbox.click();
			   Thread.sleep(1000);
			   ce.cialVCTnumberbox.sendKeys("T2023051200001");
			   ce.cialvctSEARCHicon.click();
			   Thread.sleep(5000);
			   
	}
	
	//6
	@Then("To verify if user is able to search with Invalid VCT no in VCT Generation screen  proper validation message is displayed or not")
	public void to_verify_if_user_is_able_to_search_with_invalid_vct_no_in_vct_generation_screen_proper_validation_message_is_displayed_or_not() throws InterruptedException {
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		   
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cialVCTnumberbox.click();
			   Thread.sleep(1000);
			   ce.cialVCTnumberbox.sendKeys("T20230512000");
			   ce.cialvctSEARCHicon.click();
			   Thread.sleep(7000);
			   
	}
	
//8
	@Then("To verify if user is able to delete AWB details from VCT Generation screen")
	public void to_verify_if_user_is_able_to_delete_awb_details_from_vct_generation_screen() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.cialVCTgenerationTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(3000);
		   ce.cialVCTnumberbox.click();
		   Thread.sleep(1000);
		   ce.cialVCTnumberbox.sendKeys("T2023052500001");
		   ce.cialvctSEARCHicon.click();
		   Thread.sleep(3000);
		   ce.cialdeleteicon.click();
		   Thread.sleep(3000);
		   driver.switchTo().alert().accept();
			  Thread.sleep(5000);
			  ce.cialdeleteRemarkcomment.click();
			  ce.cialdeleteRemarkcomment.sendKeys("wrong deatils filled");
			  ce.cialdeleteRemarkcommentOkBTN.click();
			  Thread.sleep(10000);
			  driver.switchTo().alert().accept();
			  Thread.sleep(5000);
	}

	
//7
	@Then("To verify if user is able to generate one VCT for multiple Shipment from VCT generation screen")
	public void to_verify_if_user_is_able_to_generate_one_vct_for_multiple_shipment_from_vct_generation_screen() throws InterruptedException {
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		   
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
		    ce.cialAWBnumberField.click();
		    ce.cialAWBnumberField.sendKeys("12576454092");
		    Thread.sleep(2000);
		    ce.cialHouseNUMBER.click();
		    ce.cialHouseNUMBER.sendKeys("H1");
		    ce.cialAWNnpx.click();
		    ce.cialAWNnpx.sendKeys("30");
		    Thread.sleep(2000);
		    ce.cial_AWBwt.click();
		    Thread.sleep(1000);
		    ce.cial_AWBwt.sendKeys("200.00");
		    Thread.sleep(2000);
		    ce.cialshipNPX.click();
		    ce.cialshipNPX.clear();
		    ce.cialshipNPX.sendKeys("20");
		    Thread.sleep(2000);
		    
//		   ce.cial_natureofGoods.click();
//		   Thread.sleep(1000);
//		   ce.cial_natureofGoods.sendKeys("");
//		   Thread.sleep(2000);
//		   
		   
		   ce.cial_originAirport.click();
		   ce.cial_originAirport.sendKeys("COK");
		   Thread.sleep(2000);
		   ce.cial_originAirport.sendKeys(Keys.ARROW_DOWN);
		   ce.cial_originAirport.sendKeys(Keys.ENTER);
		   Thread.sleep(1000);
		   ce.cial_destinationAirport.click();
		   ce.cial_destinationAirport.sendKeys("DXB");
		   ce.cial_destinationAirport.sendKeys(Keys.ARROW_DOWN);
		   ce.cial_destinationAirport.sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
		   
		   ce.cial_driverName.click();
		   ce.cial_driverName.sendKeys("DRIVER_two");
			   Thread.sleep(2000);
			   ce.cial_vehicleNumber.click();
			   ce.cial_vehicleNumber.sendKeys("JH01DV6022");
			   Thread.sleep(2000);
			  
			   ce.cialcommoditysearch.click();
			   Thread.sleep(3000);
			//   driver.switchTo().frame(3);
			   Thread.sleep(1000);
			// It will return the parent window name as a String
			   String parent=driver.getWindowHandle();

			   Set<String>s=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I1= s.iterator();

			   while(I1.hasNext())
			   {

			   String child_window=I1.next();


			   if(!parent.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialfertilizer.click();
			  // String goodsnature = ce.cialAUtopartstxt.getText();
			   Thread.sleep(2000);
			 //  ce.cialclosebuttoncommodity.click();
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   ce.cial_natureofGoods.sendKeys("AUTO PARTS");
			   Thread.sleep(2000);
			   ce.cial_natureofGoods.sendKeys(Keys.ARROW_DOWN);;
			   ce.cial_natureofGoods.sendKeys(Keys.ENTER);;
			   Thread.sleep(2000);
			   ce.cialSHC.click();
			   Thread.sleep(2000);
			   ce.cialSHCbox1.sendKeys("GEN");
			   Thread.sleep(2000);
			   ce.cialSHCbox1.sendKeys(Keys.ARROW_DOWN);
			   Thread.sleep(2000);
			   ce.cialSHCboxCloseBtn.click();
			   Thread.sleep(2000);
			   ce.cial_agentSearch.click();
			   Thread.sleep(2000);
			   String parent1=driver.getWindowHandle();

			   Set<String>s1=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I11= s1.iterator();

			   while(I11.hasNext())
			   {

			   String child_window=I11.next();


			   if(!parent1.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialagentName.click();;
			   Thread.sleep(2000);
			  // String goodsnature = ce.cialAUtopartstxt.getText();
			//   Thread.sleep(2000);
			 //  ce.cialclosebuttoncommodity.click();
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			  ce.cialCOPYBTNconsole.click();
			  Thread.sleep(2000);
			  ce.cialplusbtnConsole.click();
			  Thread.sleep(2000);
			  ce.cial2ndhousebox.click();
			  Thread.sleep(1000);
			  ce.cial2ndhousebox.sendKeys("H2");
			  Thread.sleep(2000);
			  ce.cial2ndshipNPX.clear();
			  ce.cial2ndshipNPX.sendKeys("10");
			  Thread.sleep(2000);
			  ce.cial2ndshipwt.clear();
			  ce.cial2ndshipwt.sendKeys("100");
			  Thread.sleep(2000); 
			  ce.cial2ndcommoditysearch.click();
			   Thread.sleep(3000);
			//   driver.switchTo().frame(3);
			   Thread.sleep(1000);
			// It will return the parent window name as a String
			   String parent2=driver.getWindowHandle();

			   Set<String>s2=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I12= s2.iterator();

			   while(I12.hasNext())
			   {

			   String child_window=I12.next();


			   if(!parent2.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cial2ndgoodsslect.click();
			  // String goodsnature = ce.cialAUtopartstxt.getText();
			   Thread.sleep(2000);
			 //  ce.cialclosebuttoncommodity.click();
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent2);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   ce.cial2nsgoodsnature.sendKeys("GOLD JEWELLER");
			   Thread.sleep(2000);
			   ce.cial2nsgoodsnature.sendKeys(Keys.ARROW_DOWN);;
			   ce.cial2nsgoodsnature.sendKeys(Keys.ENTER);;
			   Thread.sleep(2000);
			   ce.cial2ndSHCsearch.click();
			   Thread.sleep(2000);
			   ce.cial2ndserchbarforSHC.sendKeys("VAL");
			   Thread.sleep(2000);
			   ce.cial2ndserchbarforSHC.sendKeys(Keys.ARROW_DOWN);
			   ce.cial2ndserchbarforSHC.sendKeys(Keys.ENTER);
			   ce.cialSHCokBTN.click();
			   Thread.sleep(2000);
			   
			   Thread.sleep(2000);
			  ce.cial_saveButton.click();
			  Thread.sleep(5000);
			  
			  driver.switchTo().alert().accept();
			  Thread.sleep(5000);
			  Thread.sleep(10000);
			  Thread.sleep(5000);
			  Thread.sleep(10000);
	}


	
//10
	@Then("To verify if user is able to create VCT with security status as Non-Secured \\(Ex) from VCT Generation screen")
	public void to_verify_if_user_is_able_to_create_vct_with_security_status_as_non_secured_ex_from_vct_generation_screen() throws InterruptedException {
	  
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		    driver.switchTo().frame(0);
			   Thread.sleep(3000);
		   ce.cialsecuritysatus.click();
		   Thread.sleep(3000);
		   ce.cialsecuritysatus.sendKeys(Keys.ENTER);
		   Thread.sleep(3000);
			  
		    ce.cialAWBnumberField.click();
		    ce.cialAWBnumberField.sendKeys("12576455094");
		    Thread.sleep(2000);
		    ce.cialAWNnpx.click();
		    ce.cialAWNnpx.sendKeys("30");
		    Thread.sleep(2000);
		    ce.cial_AWBwt.click();
		    Thread.sleep(1000);
		    ce.cial_AWBwt.sendKeys("00.56");
		    Thread.sleep(2000);
//		   ce.cial_natureofGoods.click();
//		   Thread.sleep(1000);
//		   ce.cial_natureofGoods.sendKeys("");
//		   Thread.sleep(2000);
		   
		   
		   ce.cial_originAirport.click();
		   ce.cial_originAirport.sendKeys("COK");
		   Thread.sleep(2000);
		   ce.cial_originAirport.sendKeys(Keys.ARROW_DOWN);
		   ce.cial_originAirport.sendKeys(Keys.ENTER);
		   Thread.sleep(1000);
		   ce.cial_destinationAirport.click();
		   ce.cial_destinationAirport.sendKeys("DXB");
		   ce.cial_destinationAirport.sendKeys(Keys.ARROW_DOWN);
		   ce.cial_destinationAirport.sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
		   
		   ce.cial_driverName.click();
		   ce.cial_driverName.sendKeys("DRIVER_two");
			   Thread.sleep(2000);
			   ce.cial_vehicleNumber.click();
			   ce.cial_vehicleNumber.sendKeys("JH01DV6022");
			   Thread.sleep(2000);
			  
			   ce.cialcommoditysearch.click();
			   Thread.sleep(3000);
			//   driver.switchTo().frame(3);
			   Thread.sleep(1000);
			// It will return the parent window name as a String
			   String parent=driver.getWindowHandle();

			   Set<String>s=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I1= s.iterator();

			   while(I1.hasNext())
			   {

			   String child_window=I1.next();


			   if(!parent.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialfertilizer.click();
			  // String goodsnature = ce.cialAUtopartstxt.getText();
			   Thread.sleep(2000);
			 //  ce.cialclosebuttoncommodity.click();
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   ce.cial_natureofGoods.sendKeys("AUTO PARTS");
			   Thread.sleep(2000);
			   ce.cial_natureofGoods.sendKeys(Keys.ARROW_DOWN);;
			   ce.cial_natureofGoods.sendKeys(Keys.ENTER);;
			   Thread.sleep(2000);
			   ce.cialSHC.click();
			   Thread.sleep(2000);
			   ce.cialSHCbox1.sendKeys("GEN");
			   Thread.sleep(2000);
			   ce.cialSHCbox1.sendKeys(Keys.ARROW_DOWN);
			   Thread.sleep(2000);
			   ce.cialSHCboxCloseBtn.click();
			   Thread.sleep(2000);
			   ce.cial_agentSearch.click();
			   Thread.sleep(2000);
			   String parent1=driver.getWindowHandle();

			   Set<String>s1=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I11= s1.iterator();

			   while(I11.hasNext())
			   {

			   String child_window=I11.next();


			   if(!parent1.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialagentName.click();;
			   Thread.sleep(2000);
			  // String goodsnature = ce.cialAUtopartstxt.getText();
			//   Thread.sleep(2000);
			 //  ce.cialclosebuttoncommodity.click();
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   Select securitydropdown = new Select(driver.findElement(By.name("ctl00$cp$uxgrdAWBContents$ctl02$chkSecured")));
			   ce.cialsecuritysatus.click();
			 //  ce.cialsecuritysatus.sendKeys(Keys.ARROW_DOWN);
			   Thread.sleep(2000);
			   securitydropdown.selectByVisibleText("Non-Secured (Ex)");
			   Thread.sleep(2000);
			  ce.cial_saveButton.click();
			  Thread.sleep(5000);
			  
			  driver.switchTo().alert().accept();
			  Thread.sleep(5000);
			  Thread.sleep(10000);
			  Thread.sleep(5000);
			  Thread.sleep(10000);
			  
	}

	//11
	@Then("To verify if user is able to create VCT with security status as Secured from VCT Generation screen")
	public void to_verify_if_user_is_able_to_create_vct_with_security_status_as_secured_from_vct_generation_screen() throws InterruptedException {
	   
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		   
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
		    ce.cialAWBnumberField.click();
		    ce.cialAWBnumberField.sendKeys("12576456096");
		    Thread.sleep(2000);
		    ce.cialAWNnpx.click();
		    ce.cialAWNnpx.sendKeys("30");
		    Thread.sleep(2000);
		    ce.cial_AWBwt.click();
		    Thread.sleep(1000);
		    ce.cial_AWBwt.sendKeys("00.56");
		    Thread.sleep(2000);
//		   ce.cial_natureofGoods.click();
//		   Thread.sleep(1000);
//		   ce.cial_natureofGoods.sendKeys("");
//		   Thread.sleep(2000);
		   
		   
		   ce.cial_originAirport.click();
		   ce.cial_originAirport.sendKeys("COK");
		   Thread.sleep(2000);
		   ce.cial_originAirport.sendKeys(Keys.ARROW_DOWN);
		   ce.cial_originAirport.sendKeys(Keys.ENTER);
		   Thread.sleep(1000);
		   ce.cial_destinationAirport.click();
		   ce.cial_destinationAirport.sendKeys("DXB");
		   ce.cial_destinationAirport.sendKeys(Keys.ARROW_DOWN);
		   ce.cial_destinationAirport.sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
		   
		   ce.cial_driverName.click();
		   ce.cial_driverName.sendKeys("DRIVER_two");
			   Thread.sleep(2000);
			   ce.cial_vehicleNumber.click();
			   ce.cial_vehicleNumber.sendKeys("JH01DV6022");
			   Thread.sleep(2000);
			  
			   ce.cialcommoditysearch.click();
			   Thread.sleep(3000);
			//   driver.switchTo().frame(3);
			   Thread.sleep(1000);
			// It will return the parent window name as a String
			   String parent=driver.getWindowHandle();

			   Set<String>s=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I1= s.iterator();

			   while(I1.hasNext())
			   {

			   String child_window=I1.next();


			   if(!parent.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialfertilizer.click();
			  // String goodsnature = ce.cialAUtopartstxt.getText();
			   Thread.sleep(2000);
			 //  ce.cialclosebuttoncommodity.click();
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   ce.cial_natureofGoods.sendKeys("AUTO PARTS");
			   Thread.sleep(2000);
			   ce.cial_natureofGoods.sendKeys(Keys.ARROW_DOWN);;
			   ce.cial_natureofGoods.sendKeys(Keys.ENTER);;
			   Thread.sleep(2000);
			   ce.cialSHC.click();
			   Thread.sleep(2000);
			   ce.cialSHCbox1.sendKeys("GEN");
			   Thread.sleep(2000);
			   ce.cialSHCbox1.sendKeys(Keys.ARROW_DOWN);
			   Thread.sleep(2000);
			   ce.cialSHCboxCloseBtn.click();
			   Thread.sleep(2000);
			   ce.cial_agentSearch.click();
			   Thread.sleep(2000);
			   String parent1=driver.getWindowHandle();

			   Set<String>s1=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I11= s1.iterator();

			   while(I11.hasNext())
			   {

			   String child_window=I11.next();


			   if(!parent1.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialagentName.click();;
			   Thread.sleep(2000);
			  // String goodsnature = ce.cialAUtopartstxt.getText();
			//   Thread.sleep(2000);
			 //  ce.cialclosebuttoncommodity.click();
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			  Thread.sleep(2000);
			   Select drpCountry = new Select(driver.findElement(By.name("ctl00$cp$uxgrdAWBContents$ctl02$chkSecured")));
			   ce.cialsecuritysatus.click();
			 //  ce.cialsecuritysatus.sendKeys(Keys.ARROW_DOWN);
			   Thread.sleep(2000);
			   drpCountry.selectByVisibleText("Secured");
			//   ce.cialsecuritysatus.sendKeys(Keys.ENTER);
			   Thread.sleep(5000);
			  ce.cial_saveButton.click();
			  Thread.sleep(5000);
			  
			  driver.switchTo().alert().accept();
			  Thread.sleep(5000);
			  Thread.sleep(10000);
			  Thread.sleep(5000);
			  Thread.sleep(10000);
			  
	}

	
//12
	@Then("To verify if user is able to search with VCT no. in VCT Acceptance Screen")
	public void to_verify_if_user_is_able_to_search_with_vct_no_in_vct_acceptance_screen() throws InterruptedException {
	   
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.CialVCTacceptanceTab.click();
		    Thread.sleep(3000);
		   
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cialVCTnumbersearchBox.click();
			   Thread.sleep(2000);
			   ce.cialVCTnumbersearchBox.clear();
			   Thread.sleep(2000);
			   ce.cialVCTnumbersearchBox.sendKeys("T2023052500002");
			   Thread.sleep(2000);
			   ce.cialVCTtabSearchbtn.click();
			   Thread.sleep(3000);
			   Thread.sleep(3000);
	}


//13
	@Then("To verify user is able to record Gate in details in VCT Acceptance Screen")
	public void to_verify_user_is_able_to_record_gate_in_details_in_vct_acceptance_screen() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.CialVCTacceptanceTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(3000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.clear();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.sendKeys("T2023052500002");
		   Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   ce.cialAcceptanceGateInDate.click();
		   ce.cialAcceptanceGateInDate.sendKeys("24/05/2023");
		   Thread.sleep(3000);
		   ce.cialAcceptanceGateInTime.click();
		   ce.cialAcceptanceGateInTime.sendKeys("1229");
		   Thread.sleep(3000);
		   ce.cialGateInBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
	}

//14
	@Then("To verify user is able to record Dock in details in VCT Acceptance Screen")
	public void to_verify_user_is_able_to_record_dock_in_details_in_vct_acceptance_screen() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.CialVCTacceptanceTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(3000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.clear();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.sendKeys("T2023052500002");
		   Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   ce.cialAcceptanceGateInDate.click();
		   ce.cialAcceptanceGateInDate.sendKeys("24/05/2023");
		   Thread.sleep(3000);
		   ce.cialAcceptanceGateInTime.click();
		   ce.cialAcceptanceGateInTime.sendKeys("1229");
		   Thread.sleep(3000);
		   ce.cialGateInBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   ce.cialDookDoordropdown.click();
		   Select DoordrpDown = new Select(driver.findElement(By.name("ctl00$cp$ddlDoor")));
		   DoordrpDown.selectByVisibleText("Door 2");
		   Thread.sleep(3000);
		   ce.cialDockInBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
	}

//15
	@Then("To verify if system is allowing user to record Dock-In details or not if Gate-In detail is pending to record in VCT Acceptance screen")
	public void to_verify_if_system_is_allowing_user_to_record_dock_in_details_or_not_if_gate_in_detail_is_pending_to_record_in_vct_acceptance_screen() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.CialVCTacceptanceTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(3000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.clear();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.sendKeys("T2023052400004");
		   Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000); 
		   Thread.sleep(3000);
		   ce.cialDookDoordropdown.click();
		   Select DoordrpDown = new Select(driver.findElement(By.name("ctl00$cp$ddlDoor")));
		   DoordrpDown.selectByVisibleText("Door 2");
		   Thread.sleep(3000);
		   ce.cialDockInBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
	}
//16
	
	@Then("To verify user is able to enter AWB acceptance details at HAWB level in VCT Acceptance Screen")
	public void to_verify_user_is_able_to_enter_awb_acceptance_details_at_hawb_level_in_vct_acceptance_screen() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.CialVCTacceptanceTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(3000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.clear();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.sendKeys("T2023052500005");
		   Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
/*		   ce.cialAcceptanceGateInDate.click();
		   ce.cialAcceptanceGateInDate.sendKeys("24/05/2023");
		   Thread.sleep(3000);
		   ce.cialAcceptanceGateInTime.click();
		   ce.cialAcceptanceGateInTime.sendKeys("1229");
		   Thread.sleep(3000);
		   ce.cialGateInBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   ce.cialDookDoordropdown.click();
		   Select DoordrpDown = new Select(driver.findElement(By.name("ctl00$cp$ddlDoor")));
		   DoordrpDown.selectByVisibleText("Door 2");
		   Thread.sleep(3000);
		   ce.cialDockInBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   */
		   ce.cialAWBacceptanceH1selectbox.click();
		   Thread.sleep(2000);
		   ce.cialremainingNPX.click();
		   ce.cialremainingNPX.clear();
		   ce.cialremainingNPX.sendKeys("20");
		   Thread.sleep(2000);
		   ce.cialNOPbox.click();
		   ce.cialNOPbox.sendKeys("20");
		   Thread.sleep(2000);
		   ce.ciallengthbox.click();
		   ce.ciallengthbox.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialwidth.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialheight.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialgroupid.click();
		   ce.cialgroupid.sendKeys("1441016239");
		   Thread.sleep(3000);
		   ce.cialAWBacceptanceH2selectbox.click();
		   Thread.sleep(1000);
		   
		   ce.cialremainingNPX.click();
		   ce.cialremainingNPX.clear();
		   ce.cialremainingNPX.sendKeys("10");
		   Thread.sleep(2000);
		   ce.cialNOPbox.click();
		   ce.cialNOPbox.sendKeys("10");
		   Thread.sleep(2000);
		   ce.ciallengthbox.click();
		   ce.ciallengthbox.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialwidth.sendKeys("200");
		   Thread.sleep(1000);
		   ce.cialheight.sendKeys("300");
		   Thread.sleep(1000);
		   ce.cialgroupid.click();
		   ce.cialgroupid.sendKeys("14410162");
		   Thread.sleep(3000);
		   
		   Thread.sleep(3000);
		   JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 WebElement flag1= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
			 js1.executeScript("arguments[0].scrollIntoView();",flag1);
			 Thread.sleep(5000);
		  
	}
//17

	@Then("To verify if user is able to accept cargo on HAWB level with volumetric weight In VCT Acceptance Screen")
	public void to_verify_if_user_is_able_to_accept_cargo_on_hawb_level_with_volumetric_weight_in_vct_acceptance_screen() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.CialVCTacceptanceTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(3000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.clear();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.sendKeys("T2023052500005");
		   Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
	/*	   ce.cialAcceptanceGateInDate.click();
		   ce.cialAcceptanceGateInDate.sendKeys("24/05/2023");
		   Thread.sleep(3000);
		   ce.cialAcceptanceGateInTime.click();
		   ce.cialAcceptanceGateInTime.sendKeys("1229");
		   Thread.sleep(3000);
		   ce.cialGateInBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   ce.cialDookDoordropdown.click();
		   Select DoordrpDown = new Select(driver.findElement(By.name("ctl00$cp$ddlDoor")));
		   DoordrpDown.selectByVisibleText("Door 2");
		   Thread.sleep(3000);
		   ce.cialDockInBtn.click();
		   */
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   
		   ce.cialAWBacceptanceH1selectbox.click();
		   Thread.sleep(2000);
		   ce.cialremainingNPX.click();
		   ce.cialremainingNPX.clear();
		   ce.cialremainingNPX.sendKeys("20");
		   Thread.sleep(2000);
		   ce.cialNOPbox.click();
		   ce.cialNOPbox.sendKeys("20");
		   Thread.sleep(2000);
		   ce.ciallengthbox.click();
		   ce.ciallengthbox.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialwidth.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialheight.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialgroupid.click();
		   ce.cialgroupid.sendKeys("1441016239");
		   Thread.sleep(3000);
		   
		   ce.cialAWBacceptanceH2selectbox.click();
		   Thread.sleep(1000);
		   
		   ce.cialremainingNPX.click();
		   ce.cialremainingNPX.clear();
		   ce.cialremainingNPX.sendKeys("10");
		   Thread.sleep(2000);
		   ce.cialNOPbox.click();
		   ce.cialNOPbox.sendKeys("10");
		   Thread.sleep(2000);
		   ce.ciallengthbox.click();
		   ce.ciallengthbox.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialwidth.sendKeys("200");
		   Thread.sleep(1000);
		   ce.cialheight.sendKeys("300");
		   Thread.sleep(1000);
		   ce.cialgroupid.click();
		   ce.cialgroupid.sendKeys("14410162");
		   Thread.sleep(3000);
		   
		   
		   Thread.sleep(3000);
		   JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 WebElement flag1= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
			 js1.executeScript("arguments[0].scrollIntoView();",flag1);
			 Thread.sleep(5000);
		//   ce.cialacceptanceSubmitBtn.click();
		//   Thread.sleep(3000);
		   Thread.sleep(3000);
		   Thread.sleep(3000);
	}

//18

	@Then("To verify user is able to accept cargo in part pieces from VCT Acceptance screen")
	public void to_verify_user_is_able_to_accept_cargo_in_part_pieces_from_vct_acceptance_screen() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.CialVCTacceptanceTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(3000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.clear();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.sendKeys("T2023052500005");
		   Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   ce.cialAcceptanceGateInDate.click();
		   ce.cialAcceptanceGateInDate.clear();
		   ce.cialAcceptanceGateInDate.sendKeys("24/05/2023");
		   Thread.sleep(3000);
		   ce.cialAcceptanceGateInTime.click();
		   ce.cialAcceptanceGateInTime.clear();
		   ce.cialAcceptanceGateInTime.sendKeys("1229");
		   Thread.sleep(3000);
		   ce.cialGateInBtn.click();
		   Thread.sleep(10000);
		   Thread.sleep(3000);
		   ce.cialDookDoordropdown.click();
		   Select DoordrpDown = new Select(driver.findElement(By.name("ctl00$cp$ddlDoor")));
		   DoordrpDown.selectByVisibleText("Door 2");
		   Thread.sleep(3000);
		   ce.cialDockInBtn.click();
		   Thread.sleep(10000);
		   Thread.sleep(3000);
		   
		   ce.cialAWBacceptanceH2selectbox.click();
		   Thread.sleep(2000);
		   ce.cialremainingNPX.click();
		   ce.cialremainingNPX.clear();
		   ce.cialremainingNPX.sendKeys("5");
		   Thread.sleep(2000);
		   ce.cialNOPbox.click();
		   ce.cialNOPbox.sendKeys("5");
		   Thread.sleep(2000);
		   ce.ciallengthbox.click();
		   ce.ciallengthbox.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialwidth.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialheight.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialgroupid.click();
		   ce.cialgroupid.sendKeys("1442016239");
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 WebElement flag1= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
			 js1.executeScript("arguments[0].scrollIntoView();",flag1);
			 Thread.sleep(5000);
		   ce.cialacceptanceSubmitBtn.click();
		   Thread.sleep(10000);
		   Thread.sleep(5000);
		   ce.cialAWBacceptanceH2selectbox.click();
		   Thread.sleep(1000);
		   ce.cialAWBacceptanceH2selectbox.click();
		   Thread.sleep(2000);
		   ce.cialremainingNPX.click();
		   ce.cialremainingNPX.clear();
		   ce.cialremainingNPX.sendKeys("5");
		   Thread.sleep(2000);
		   ce.cialNOPbox.click();
		   ce.cialNOPbox.sendKeys("5");
		   Thread.sleep(2000);
		   ce.ciallengthbox.click();
		   ce.ciallengthbox.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialwidth.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialheight.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialgroupid.click();
		   ce.cialgroupid.sendKeys("14410262");
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   JavascriptExecutor js2 = (JavascriptExecutor) driver;
			 WebElement flag2= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
			 js2.executeScript("arguments[0].scrollIntoView();",flag2);
			 Thread.sleep(5000);
		   ce.cialacceptanceSubmitBtn.click();
		   Thread.sleep(10000);
		   Thread.sleep(5000);
		   
		   Thread.sleep(3000);
	}

//19

	@Then("To verify user is able to submit Dock-out details from VCT Acceptance screen")
	public void to_verify_user_is_able_to_submit_dock_out_details_from_vct_acceptance_screen() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.CialVCTacceptanceTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(5000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(1000);
		   ce.cialVCTnumbersearchBox.clear();
		   Thread.sleep(3000);
		   ce.cialVCTnumbersearchBox.sendKeys("T2023052500005");
		   Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000); 
		   ce.cialdockOutDate.click();
		   ce.cialdockOutDate.sendKeys("24/05/2023");
		   Thread.sleep(1000);
		  
		   ce.cialDockOutTime.click();
		   ce.cialDockOutTime.sendKeys("0730");
		   Thread.sleep(2000);
		   ce.cialdockOutBtn.click();
		   Thread.sleep(10000);
		   
	}
//20

	@Then("To verify user is able to submit Gate-out details from VCT Acceptance screen")
	public void to_verify_user_is_able_to_submit_gate_out_details_from_vct_acceptance_screen() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.CialVCTacceptanceTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(5000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.clear();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.sendKeys("T2023052500005");
		   Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		  
		  
		   ce.cialGateOutDate.click();
		   ce.cialGateOutDate.sendKeys("25/05/2023");
		   Thread.sleep(1000);
		   ce.cialGateOutTime.click();
		   ce.cialGateOutTime.sendKeys("0930");
		  
		   Thread.sleep(2000);
		   ce.cialGateOutBtn.click();
		   ce.cialGateOutBtn.click();
		   Thread.sleep(10000);
	}

//21
	
	@Then("To verify if system is allowing user to record  Gate-out details or not if Dock-Out detail is pending to record in VCT Acceptance screen")
	public void to_verify_if_system_is_allowing_user_to_record_gate_out_details_or_not_if_dock_out_detail_is_pending_to_record_in_vct_acceptance_screen() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.CialVCTacceptanceTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(5000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.clear();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.sendKeys("T2023051700001");
		   Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   ce.cialGateOutDate.click();
		   ce.cialGateOutDate.sendKeys("18/05/2023");
		   Thread.sleep(1000);
		   ce.cialGateOutTime.click();
		   ce.cialGateOutTime.sendKeys("0930");
		   Thread.sleep(3000);
		   Thread.sleep(1000);
		   ce.cialGateOutBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
	}

//22
	@Then("To check system is allow or not  to do Dock-Out if cargo acceptance is pending from VCT Acceptance screen")
	public void to_check_system_is_allow_or_not_to_do_dock_out_if_cargo_acceptance_is_pending_from_vct_acceptance_screen() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.CialVCTacceptanceTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(3000);
		   ce.cialVCTnumbersearchBox.click();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.clear();
		   Thread.sleep(2000);
		   ce.cialVCTnumbersearchBox.sendKeys("T2023051700001");
		   Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   ce.cialAcceptanceGateInDate.click();
		   ce.cialAcceptanceGateInDate.sendKeys("16/05/2023");
		   Thread.sleep(3000);
		   ce.cialAcceptanceGateInTime.click();
		   ce.cialAcceptanceGateInTime.sendKeys("1229");
		   Thread.sleep(3000);
		   ce.cialGateInBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   ce.cialDookDoordropdown.click();
		   Select DoordrpDown = new Select(driver.findElement(By.name("ctl00$cp$ddlDoor")));
		   DoordrpDown.selectByVisibleText("Door 2");
		   Thread.sleep(3000);
		   ce.cialDockInBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   
		   ce.cialAWBacceptanceH1selectbox.click();
		   Thread.sleep(2000);
		   ce.cialremainingNPX.click();
		   ce.cialremainingNPX.clear();
		   ce.cialremainingNPX.sendKeys("5");
		   Thread.sleep(2000);
		   ce.cialNOPbox.click();
		   ce.cialNOPbox.sendKeys("5");
		   Thread.sleep(2000);
		   ce.ciallengthbox.click();
		   ce.ciallengthbox.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialwidth.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialheight.sendKeys("100");
		   Thread.sleep(1000);
		   ce.cialgroupid.click();
		   ce.cialgroupid.sendKeys("1441016239");
		   Thread.sleep(3000);
		   Thread.sleep(3000);
//		   JavascriptExecutor js1 = (JavascriptExecutor) driver;
//			 WebElement flag1= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
//			 js1.executeScript("arguments[0].scrollIntoView();",flag1);
//			 Thread.sleep(5000);
//		//   ce.cialacceptanceSubmitBtn.click();
		   Thread.sleep(3000);
		   
		   ce.cialdockOutDate.click();
		   ce.cialdockOutDate.sendKeys("18/05/2023");
		   Thread.sleep(2000);
		   ce.cialDockOutTime.click();
		   ce.cialDockOutTime.sendKeys("0730");
		   
		   Thread.sleep(2000);
		   ce.cialdockOutBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
	}
//23
	
	@Then("To verify if Acceptance is done then accepted Cargo details is displayed or not in accepted cargo list from VCT Acceptance")
	public void to_verify_if_acceptance_is_done_then_accepted_cargo_details_is_displayed_or_not_in_accepted_cargo_list_from_vct_acceptance() {
	   
	}

//24

	@Then("To verify user is able to complete Acceptance and process till Gate out for Direct Shipment")
	public void to_verify_user_is_able_to_complete_acceptance_and_process_till_gate_out_for_direct_shipment() throws InterruptedException {
		
			   
			   ce.cialExportTab.click();
			    Thread.sleep(3000);
			   ce.CialVCTacceptanceTab.click();
			    Thread.sleep(3000);
			   
				  
				   driver.switchTo().frame(0);
				   Thread.sleep(3000);
				   ce.cialVCTnumbersearchBox.click();
				   Thread.sleep(2000);
				   ce.cialVCTnumbersearchBox.clear();
				   Thread.sleep(2000);
				   ce.cialVCTnumbersearchBox.sendKeys("T2023051700002");
				   Thread.sleep(2000);
				   ce.cialVCTtabSearchbtn.click();
				   Thread.sleep(3000);
				   Thread.sleep(3000);
				   ce.cialAcceptanceGateInDate.click();
				   ce.cialAcceptanceGateInDate.sendKeys("17/05/2023");
				   Thread.sleep(3000);
				   ce.cialAcceptanceGateInTime.click();
				   ce.cialAcceptanceGateInTime.sendKeys("1015");
				   Thread.sleep(3000);
				   ce.cialGateInBtn.click();
				  
				   ce.cialDookDoordropdown.click();
				   Select DoordrpDown = new Select(driver.findElement(By.name("ctl00$cp$ddlDoor")));
				   DoordrpDown.selectByVisibleText("Door 2");
				   Thread.sleep(3000);
				   ce.cialDockInBtn.click();
				   Thread.sleep(3000);
				   Thread.sleep(3000);
				   ce.cialAWBacceptanceH1selectbox.click();
				   Thread.sleep(2000);
				   ce.cialremainingNPX.click();
				   ce.cialremainingNPX.clear();
				   ce.cialremainingNPX.sendKeys("5");
				   Thread.sleep(2000);
				   ce.cialNOPbox.click();
				   ce.cialNOPbox.sendKeys("5");
				   Thread.sleep(2000);
				   ce.ciallengthbox.click();
				   ce.ciallengthbox.sendKeys("100");
				   Thread.sleep(1000);
				   ce.cialwidth.sendKeys("100");
				   Thread.sleep(1000);
				   ce.cialheight.sendKeys("100");
				   Thread.sleep(1000);
				   ce.cialgroupid.click();
				   ce.cialgroupid.sendKeys("1441016239");
				   Thread.sleep(3000);
				   Thread.sleep(3000);
				   JavascriptExecutor js4 = (JavascriptExecutor) driver;
					 WebElement flag4= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
					 js4.executeScript("arguments[0].scrollIntoView();",flag4);
					 Thread.sleep(5000);
					
					 
					 JavascriptExecutor js = (JavascriptExecutor) driver;
					 js.executeScript("window.scrollBy(0,-250)", "");
					 
					
					   Thread.sleep(3000);
					 
					 
					 ce.cialdockOutDate.click();
					   ce.cialdockOutDate.sendKeys("18/05/2023");
					   Thread.sleep(2000);
					   ce.cialDockOutTime.click();
					   ce.cialDockOutTime.sendKeys("0730");
					   
					   Thread.sleep(2000);
					   ce.cialdockOutBtn.click();
					   Thread.sleep(3000);
					   ce.cialGateOutDate.click();
					   ce.cialGateOutDate.sendKeys("18/05/2023");
					   Thread.sleep(1000);
					   Thread.sleep(1000);
					   ce.cialGateOutTime.click();
					   ce.cialGateOutTime.sendKeys("0930");
					   Thread.sleep(3000);
					   
					   ce.cialGateOutBtn.click();
					   Thread.sleep(3000);
					   Thread.sleep(3000);
					   driver.switchTo().alert().accept();
						  Thread.sleep(5000);
						  Thread.sleep(10000);
						  Thread.sleep(5000);
						  Thread.sleep(10000);
						  Thread.sleep(5000);
					   
	}
//25

	@Then("To verify in VCT Acceptance as per acceptance done cargo progress bar percentage will be updated")
	public void to_verify_in_vct_acceptance_as_per_acceptance_done_cargo_progress_bar_percentage_will_be_updated() throws InterruptedException {
	   
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.CialVCTacceptanceTab.click();
		    Thread.sleep(3000);
		   
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cialVCTnumbersearchBox.click();
			   Thread.sleep(2000);
			   ce.cialVCTnumbersearchBox.clear();
			   Thread.sleep(2000);
			   ce.cialVCTnumbersearchBox.sendKeys("T2023051700002");
			   Thread.sleep(2000);
			   ce.cialVCTtabSearchbtn.click();
			   Thread.sleep(3000);
			   Thread.sleep(3000);
	}

	
//26
	@Then("To verify if security screening is not completed then the shipment should be display in Unsecured List")
	public void to_verify_if_security_screening_is_not_completed_then_the_shipment_should_be_display_in_unsecured_list() throws InterruptedException {
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		    ce.cialsecurityAcceptance.click();
		    Thread.sleep(3000);
			   Thread.sleep(3000);
	}
//27
	
	@Then("User is able to submit security screening if acceptance is not completed proper validation get to be displayed")
	public void user_is_able_to_submit_security_screening_if_acceptance_is_not_completed_proper_validation_get_to_be_displayed() {
	   
	}
//28
	

	@Then("To verify if System is displaying Security Representative details in Security Acceptance screen or not")
	public void to_verify_if_system_is_displaying_security_representative_details_in_security_acceptance_screen_or_not() {
	    
	}
//29
	

	@Then("To verify user is able to search Security Representative Name from Security Acceptance screen")
	public void to_verify_user_is_able_to_search_security_representative_name_from_security_acceptance_screen() {
	   
	}
//30
	

	@Then("If user search with invalid AWB no in security screening screen proper validation get to be displayed")
	public void if_user_search_with_invalid_awb_no_in_security_screening_screen_proper_validation_get_to_be_displayed() {
	   
	}
//31
	
	@Then("If user search with invalid HAWB no in security screening screen proper validation get to be displayed")
	public void if_user_search_with_invalid_hawb_no_in_security_screening_screen_proper_validation_get_to_be_displayed() {
	   
	}
	
	//32
	

	@Then("In Security screening screen Screen pieces , Remaining pieces , Screening Pieces column get to be displayed correctly")
	public void in_security_screening_screen_screen_pieces_remaining_pieces_screening_pieces_column_get_to_be_displayed_correctly() {
	   
	}
//33

	@Then("To verify If user is able submit security scaninig twice from security Scaning screen")
	public void to_verify_if_user_is_able_submit_security_scaninig_twice_from_security_scaning_screen() {
	   
	}
//34
	

	@Then("To verify user is able to submit screening with multiple screening methods")
	public void to_verify_user_is_able_to_submit_screening_with_multiple_screening_methods() {
	   
	}
//35
	

	@Then("To verify if final  submitted is not done then screening will not be completed")
	public void to_verify_if_final_submitted_is_not_done_then_screening_will_not_be_completed() {
	   
	}
//36
	
	@Then("To verify After Screening is completed screening details get to be displayed in screening history")
	public void to_verify_after_screening_is_completed_screening_details_get_to_be_displayed_in_screening_history() {
	   
	}
//37

	@Then("To verify proper timestamp get to be display in screening date and time field in security screening screen")
	public void to_verify_proper_timestamp_get_to_be_display_in_screening_date_and_time_field_in_security_screening_screen() {
	   
	}
//38

	@Then("To verify when user click on Clear button on security screening screen all details get to be cleared")
	public void to_verify_when_user_click_on_clear_button_on_security_screening_screen_all_details_get_to_be_cleared() {
	   
	}
//39
	

	@Then("To verify in Unsecured list screening status percentage get to be reflect as per the screening status in security screening screen.")
	public void to_verify_in_unsecured_list_screening_status_percentage_get_to_be_reflect_as_per_the_screening_status_in_security_screening_screen() {
	   
	}

//40
	

	@Then("To verify in AWB Details HAWB details get to be displayed")
	public void to_verify_in_awb_details_hawb_details_get_to_be_displayed() throws InterruptedException {
		ce.cialExportTab.click();
	    Thread.sleep(3000);
	    ce.cialAWB_DetailsTab.click();
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
		   Thread.sleep(3000);
	   
	    ce.cialawbdeatilsAWB.click();
	    ce.cialawbdeatilsAWB.sendKeys("125");
	    Thread.sleep(1000);
	    ce.cialAWBdetailsawbentryfield.click();
	    ce.cialAWBdetailsawbentryfield.sendKeys("20016894");
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
		   
		/*   ce.cialAWBdetailsAIRwayBILL.click();
		    Thread.sleep(3000);
		    
		    String parentAWD=driver.getWindowHandle();

			   Set<String>sAWD=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> IAWD= sAWD.iterator();

			   while(IAWD.hasNext())
			   {

			   String child_window=IAWD.next();


			   if(!parentAWD.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialAWBdetailsAIRwaypopverifired.click();
			   Thread.sleep(2000);
		//	   driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parentAWD);
			   Thread.sleep(5000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
		   */
	    ce.cialAWBdetailsflightnumfield.click();
	    Thread.sleep(1000);
	    ce.cialAWBdetailsflightnumfield.sendKeys("BA101");
	    Thread.sleep(2000);
	    ce.cialAWBdetailsflightnumfield.sendKeys(Keys.ARROW_DOWN);
	    ce.cialAWBdetailsflightnumfield.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    ce.cialAWBdetailsflightdatefield.click();
	    ce.cialAWBdetailsflightdatefield.sendKeys("08-JUN-2023");
	    Thread.sleep(5000);
	    ce.cialAWBdetailsCOUSTOMinfoBTN.click();
	    
	    String parentAWD2=driver.getWindowHandle();

		   Set<String>sAWD2=driver.getWindowHandles();

		   // Now iterate using Iterator
		   Iterator<String> IAWD2= sAWD2.iterator();

		   while(IAWD2.hasNext())
		   {

		   String child_window=IAWD2.next();


		   if(!parentAWD2.equals(child_window))
		   {
		   driver.switchTo().window(child_window);
		   Thread.sleep(4000);
		   System.out.println(driver.switchTo().window(child_window));
		   ce.cialAWBdetailsCSBnum.click();
		   ce.cialAWBdetailsCSBnum.sendKeys("20236716");
		   Thread.sleep(1000);
		   ce.cialAWBdetaisCSBdate.click();
		   ce.cialAWBdetaisCSBdate.sendKeys("07/06/2023");
		   Thread.sleep(1000);
		   ce.cialAWBdetailsPicesesfiled.sendKeys("20");
		   Thread.sleep(1000);
		   ce.cialAWBdetailsGrossweight.clear();
		   Thread.sleep(5000);
		   ce.cialAWBdetailsGrossweight.click();
		   Thread.sleep(5000);
		   ce.cialAWBdetailsGrossweight.sendKeys("20");
		   Thread.sleep(1000);
		 
		   ce.cialAWBdetailschargebleweight.clear();
		   Thread.sleep(5000);
		   ce.cialAWBdetailschargebleweight.click();
		   Thread.sleep(5000);
		   ce.cialAWBdetailschargebleweight.sendKeys("20");
		   Thread.sleep(1000);
		   ce.cialAWBdetailsFOBvalue.clear();
		   Thread.sleep(5000);
		   ce.cialAWBdetailsFOBvalue.click();
		   Thread.sleep(5000);
		   ce.cialAWBdetailsFOBvalue.sendKeys("45");
		   Thread.sleep(2000);
		   
		   ce.cialAWBdetailscoustomsaveBTN.click();
		   Thread.sleep(2000);
		   driver.switchTo().alert().accept();
			  Thread.sleep(3000);
		   ce.cialAWBdetailsSendCarrBTN.click();
		   Thread.sleep(1000);
		   ce.cialAWBdetailscoustomsaveBTN.click();
		   Thread.sleep(1000);
		   driver.switchTo().alert().accept();
		   Thread.sleep(1000);
		   ce.cialAWBfdetailsLeonumFiled.sendKeys("556677123");
		   Thread.sleep(1000);
		   ce.cialAWBdeatailsLEOdate.sendKeys("08/06/2023");
		   Thread.sleep(1000);
		   ce.cialAWBdetailsLEOtime.sendKeys("1730");
		   Thread.sleep(1000);
		   ce.cialAWBdetailscoustomsaveBTN.click();
		   Thread.sleep(1000);
		   driver.switchTo().alert().accept();
		   Thread.sleep(1000);
	//	   driver.close();
		   
		   }

		   }
		   //switch to the parent window
		  driver.switchTo().window(parentAWD2);
		   Thread.sleep(5000);
		   driver.switchTo().frame(0);
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement flag= driver.findElement(By.xpath("/html/body/form/div[6]/fieldset/div/div[1]/div/table/tbody/tr/td[6]"));
		 js.executeScript("arguments[0].scrollIntoView();",flag);
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
			 WebElement flag1= driver.findElement(By.xpath("/html/body/form/div[6]/fieldset/div/div[2]/table"));
			 js.executeScript("arguments[0].scrollIntoView();",flag1);
			 Thread.sleep(3000);
			 ce.cialAWBdetailsverifiedTikBox.click();
			 Thread.sleep(4000);
			 ce.cialAWBdeatailsClearBtn.click();
			 Thread.sleep(4000);
	}

//41

	@Then("To verify If flight details are updated in AWB Details screen then if AWB get to be reflect in build manifest in hand shipment screen.")
	public void to_verify_if_flight_details_are_updated_in_awb_details_screen_then_if_awb_get_to_be_reflect_in_build_manifest_in_hand_shipment_screen() {
	   
	}

//42
	

	@Then("To verify In AWB details screen if user clicks on clear then all the details get to be cleared")
	public void to_verify_in_awb_details_screen_if_user_clicks_on_clear_then_all_the_details_get_to_be_cleared() throws InterruptedException {
		
	}

	

	@Then("To verify flow from VCT acceptance acreen to security screening part")
	public void to_verify_flow_from_vct_acceptance_acreen_to_security_screening_part() throws InterruptedException {
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.CialVCTacceptanceTab.click();
		    Thread.sleep(3000);
		   
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cialVCTnumbersearchBox.click();
			   Thread.sleep(2000);
			   ce.cialVCTnumbersearchBox.clear();
			   Thread.sleep(2000);
			   ce.cialVCTnumbersearchBox.sendKeys("T2023053000007");
			   Thread.sleep(2000);
			   ce.cialVCTtabSearchbtn.click();
			   Thread.sleep(3000);
			   Thread.sleep(3000);
			   ce.cialAcceptanceGateInDate.click();
			   ce.cialAcceptanceGateInDate.clear();
			   ce.cialAcceptanceGateInDate.sendKeys("30/05/2023");
			   Thread.sleep(2000);
			   ce.cialAcceptanceGateInTime.click();
			   ce.cialAcceptanceGateInTime.clear();
			   ce.cialAcceptanceGateInTime.sendKeys("1012");
			   Thread.sleep(2000);
			   ce.cialGateInBtn.click();
			   Thread.sleep(3000);
			   ce.cialDookDoordropdown.click();
			   Select DoordrpDown = new Select(driver.findElement(By.name("ctl00$cp$ddlDoor")));
			   DoordrpDown.selectByVisibleText("Door 2");
			   Thread.sleep(3000);
			   ce.cialVCTdockINdate.click();
			   ce.cialVCTdockINdate.clear();
			   ce.cialVCTdockINdate.sendKeys("30/05/2023");
			   Thread.sleep(2000);
			   ce.cialVCTdockINtime.click();
			   ce.cialVCTdockINtime.clear();
			   ce.cialVCTdockINtime.sendKeys("1015");
			   ce.cialDockInBtn.click();
			   Thread.sleep(3000);
			   
			  ce.cialacceptance1stAWBtikbox.click();
			//  ce.cialacceptance1stAWBtikbox.click();
			//  ce.cialacceptance1stAWBtikbox.click();
			  Thread.sleep(2000);
			  ce.cialVCTacceptacnce1stTIKgroupID.click();
			  ce.cialVCTacceptacnce1stTIKgroupID.sendKeys("15858016009");
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
				//   ce.cialacceptance1stAWBtikbox.click();
				//   ce.cialacceptance1stAWBtikbox.click();
				//	  ce.cialacceptance1stAWBtikbox.click();
				//	  ce.cialacceptance1stAWBtikbox.click();
					//  Thread.sleep(2000);
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
							  ce.cialVCTacceptacnce1stTIKgroupID.sendKeys("90950016229");
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
									 
	}


	

	@Then("To verify flow security screening part")
	public void to_verify_flow_security_screening_part() throws InterruptedException {
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialSecurityAceeptanceTab.click();
		    Thread.sleep(3000);
		 
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cialsecurityacceptancedetailsbtn.click();
			   Thread.sleep(1000);
			   ce.cialsecurityacceptanceairlineprifixfiled.click();
			   ce.cialsecurityacceptanceairlineprifixfiled.sendKeys("125");
			   Thread.sleep(1000);
			   ce.cialsecurityacceptanceAWBnumfield.click();
			   ce.cialsecurityacceptanceAWBnumfield.sendKeys("29052122"); 
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
				  JavascriptExecutor jsff4 = (JavascriptExecutor) driver;
					 jsff4.executeScript("window.scrollBy(0,-300)", "");
					 Thread.sleep(3000);
					 
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
					   ce.cialsecurityacceptanceAWBnumfield.sendKeys("29052133"); 
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
						  JavascriptExecutor js3 = (JavascriptExecutor) driver;
							 js3.executeScript("window.scrollBy(0,-300)", "");
							 Thread.sleep(3000);
							  
					 
					 
				 ce.cialsecurityacceptancfinalsubmitBtn.click();
				 Thread.sleep(10000);
	}



	

	@Then("To verify flow from login screen to AWBdetails tab")
	public void to_verify_flow_from_login_screen_to_aw_bdetails_tab() {
	  
	}

	
	@Then("To verify flow for warehouse location")
	public void to_verify_flow_for_warehouse_location() throws InterruptedException {
		
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialWarehouseLocationTab.click();
		    Thread.sleep(3000);
		 
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   
			   ce.cialWarehouseLocationAWBprfixfield.click();
			   ce.cialWarehouseLocationAWBprfixfield.sendKeys("125");
			   Thread.sleep(2000);
			   ce.cialWarehouseLocationAWBnumfield.click();
			   ce.cialWarehouseLocationAWBnumfield.sendKeys("20238676");
			   Thread.sleep(2000);
			   ce.cialWarehouseLocationHAWBnumfield.click();
			   ce.cialWarehouseLocationHAWBnumfield.sendKeys("");
			   Thread.sleep(2000);
			   ce.cialWarehouseLocationSEARCHbtn.click();
			   Thread.sleep(2000);
			   ce.cialWarehouseLocationGroupId.click();
			   ce.cialWarehouseLocationGroupId.sendKeys("6245144101");
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
			   ce.cialWarehouseLocationGroupId.sendKeys("6246144202");
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
	}

	@Then("To verify flow for BuildManifest")
	public void to_verify_flow_for_build_manifest() throws InterruptedException {
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		    ce.cialMoreTab.click();
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
			   ce.cialmoreBuildManifestflightSelect.click();
			   Thread.sleep(3000);
		//	   driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parentBM);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   
			   ce.cialmoreBuildManifestULDprefixfield.click();
			   ce.cialmoreBuildManifestULDprefixfield.sendKeys("HH");
			   ce.cialmoreBuildManifestULDprefixfield.sendKeys(Keys.ARROW_DOWN);
			   ce.cialmoreBuildManifestULDprefixfield.sendKeys(Keys.ENTER);
			   Thread.sleep(3000);
			   ce.cialmoreBuildManifestULDnumfield.click();
			   ce.cialmoreBuildManifestULDnumfield.sendKeys("20238676");
			   ce.cialmoreBuildManifestflightname.sendKeys("cx");
			   Thread.sleep(3000);
			   Select ULDdrpDown1 = new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$uxdrpAircraftPosition")));
			   ULDdrpDown1.selectByVisibleText("MD");
			   Thread.sleep(3000);
			   ce.cialmoreBuildManifestADDULDbtn.click();
			   Thread.sleep(5000);
			  
			   ce.cialmoreBuildManifestAddedeULDselect.click();
			   Thread.sleep(2000);
			   ce.cialmoreBuildManifestaddshipbtn.click();
			   Thread.sleep(5000);
			   
			   
			   
			   ce.cialmoreBuildManifestawbnumclickdeatilsSHOW.click();
			   
			   Thread.sleep(5000);
	}
//FOR COMPLETE FLOW OF CIAL

	@Then("To verify COMPLETE flow for CIAL")
	public void to_verify_complete_flow_for_cial() throws InterruptedException, AWTException {
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		   
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cial_driverName.click();
			   ce.cial_driverName.sendKeys("JHONdriver");
				   Thread.sleep(2000);
				   ce.cial_vehicleNumber.click();
				   ce.cial_vehicleNumber.sendKeys("JH20DV1010");
				   Thread.sleep(2000);
				   int awb1=20238676;
				   int awb2=20238680;
				   int grpid1=303446244;
				   int grpid2=303446245;
				   int csbnum=64532346;
		    ce.cialAWBnumberField.click();
		    ce.cialAWBnumberField.sendKeys("125"+awb1);
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
		   ce.cialplusbtnConsole.click();
		   Thread.sleep(5000);
		   
		   ce.cialVCTgeneration2ndAWBfield.click();
		   ce.cialVCTgeneration2ndAWBfield.sendKeys("125"+awb2);;
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
		  Thread.sleep(5000);
		  Thread.sleep(10000);
		  Thread.sleep(5000);
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
		
		  
	  driver.switchTo().window(parentVG4);
		   Thread.sleep(3000);
		   
		   //VCT ACCEPTANCE PART STARTING
		   
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
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   ce.cialAcceptanceGateInDate.click();
		   ce.cialAcceptanceGateInDate.clear();
		   ce.cialAcceptanceGateInDate.sendKeys("01/06/2023");
		   Thread.sleep(2000);
		   ce.cialAcceptanceGateInTime.click();
		   ce.cialAcceptanceGateInTime.clear();
		   ce.cialAcceptanceGateInTime.sendKeys("1012");
		   Thread.sleep(2000);
		   ce.cialGateInBtn.click();
		   Thread.sleep(3000);
		   ce.cialDookDoordropdown.click();
		   Select DoordrpDown = new Select(driver.findElement(By.name("ctl00$cp$ddlDoor")));
		   DoordrpDown.selectByVisibleText("Door 2");
		   Thread.sleep(3000);
		/*   ce.cialVCTdockINdate.click();
		   ce.cialVCTdockINdate.clear();
		   ce.cialVCTdockINdate.sendKeys("13/06/2023");
		   Thread.sleep(2000);
		   ce.cialVCTdockINtime.click();
		   ce.cialVCTdockINtime.clear();
		   ce.cialVCTdockINtime.sendKeys("1115"); */
		   ce.cialDockInBtn.click();
		   Thread.sleep(3000);
		   
		  ce.cialacceptance1stAWBtikbox.click();
		//  ce.cialacceptance1stAWBtikbox.click();
		//  ce.cialacceptance1stAWBtikbox.click();
		  Thread.sleep(2000);
		  ce.cialVCTacceptacnce1stTIKgroupID.click();
		  ce.cialVCTacceptacnce1stTIKgroupID.sendKeys(""+grpid1);
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
			//   ce.cialacceptance1stAWBtikbox.click();
			//   ce.cialacceptance1stAWBtikbox.click();
			//	  ce.cialacceptance1stAWBtikbox.click();
			//	  ce.cialacceptance1stAWBtikbox.click();
				//  Thread.sleep(2000);
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
						  ce.cialVCTacceptacnce1stTIKgroupID.sendKeys(""+grpid2);
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
						
			//security screening part starting
								 driver.switchTo().window(parentVG4);
								   Thread.sleep(3000);
								
								   ce.cialSecurityAceeptanceTab.click();
								    Thread.sleep(3000);
								 
									  
									   driver.switchTo().frame(0);
									   Thread.sleep(3000);
									   ce.cialsecurityacceptancedetailsbtn.click();
									   Thread.sleep(1000);
									   ce.cialsecurityacceptanceairlineprifixfiled.click();
									   ce.cialsecurityacceptanceairlineprifixfiled.sendKeys("125");
									   Thread.sleep(1000);
									   ce.cialsecurityacceptanceAWBnumfield.click();
									   ce.cialsecurityacceptanceAWBnumfield.sendKeys(""+awb1);
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
										  JavascriptExecutor jsSA = (JavascriptExecutor) driver;
											 jsSA.executeScript("window.scrollBy(0,-300)", "");
											 Thread.sleep(3000);
											 
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
											   ce.cialsecurityacceptanceAWBnumfield.sendKeys(""+awb2); 
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
												  JavascriptExecutor js3 = (JavascriptExecutor) driver;
													 js3.executeScript("window.scrollBy(0,-300)", "");
													 Thread.sleep(3000);
													  
											 
											 
										 ce.cialsecurityacceptancfinalsubmitBtn.click();
										 Thread.sleep(10000);
										 
//------------------------------------------AWB DETAILS PART STARTING
										 driver.switchTo().window(parentVG4);
										   Thread.sleep(3000);
										 
										 ce.cialAWB_DetailsTab.click();
										    Thread.sleep(3000);
										    driver.switchTo().frame(0);
											   Thread.sleep(3000);
										   
										    ce.cialawbdeatilsAWB.click();
										    ce.cialawbdeatilsAWB.sendKeys("125");
										    Thread.sleep(1000);
										    ce.cialAWBdetailsawbentryfield.click();
										    ce.cialAWBdetailsawbentryfield.sendKeys(""+awb1);
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
											   
									/*		   ce.cialAWBdetailsAIRwayBILL.click();
											    Thread.sleep(3000);
											    
											    String parentAWD=driver.getWindowHandle();

												   Set<String>sAWD=driver.getWindowHandles();

												   // Now iterate using Iterator
												   Iterator<String> IAWD= sAWD.iterator();

												   while(IAWD.hasNext())
												   {

												   String child_window=IAWD.next();


												   if(!parentAWD.equals(child_window))
												   {
												   driver.switchTo().window(child_window);
												   Thread.sleep(4000);
												   System.out.println(driver.switchTo().window(child_window));
												  // ce.cialAWBdetailsenterHAWBNUM.sendKeys("H1");
												   Thread.sleep(2000);
												   ce.cialAWBdetailsAIRwaypopverifired.click();
												   Thread.sleep(2000);
												   ce.cialAWBdetailssaveHAWB.click();
												   Thread.sleep(2000);
												   driver.switchTo().alert().accept();
													  Thread.sleep(3000);
											//	   driver.close();
												   
												   }

												   }
												   //switch to the parent window
												  driver.switchTo().window(parentAWD);
												   Thread.sleep(5000);
												   driver.switchTo().frame(0);
												   Thread.sleep(2000);
											   */
										    ce.cialAWBdetailsflightnumfield.click();
										    Thread.sleep(1000);
										    ce.cialAWBdetailsflightnumfield.sendKeys("BA101");
										    Thread.sleep(2000);
										    ce.cialAWBdetailsflightnumfield.sendKeys(Keys.ARROW_DOWN);
										    ce.cialAWBdetailsflightnumfield.sendKeys(Keys.ENTER);
										    Thread.sleep(2000);
										    ce.cialAWBdetailsflightdatefield.click();
										    ce.cialAWBdetailsflightdatefield.sendKeys("08-JUN-2023");
										    Thread.sleep(5000);
										    ce.cialAWBdetailsCOUSTOMinfoBTN.click();
										    
										    String parentAWD2=driver.getWindowHandle();

											   Set<String>sAWD2=driver.getWindowHandles();

											   // Now iterate using Iterator
											   Iterator<String> IAWD2= sAWD2.iterator();

											   while(IAWD2.hasNext())
											   {

											   String child_window=IAWD2.next();


											   if(!parentAWD2.equals(child_window))
											   {
											   driver.switchTo().window(child_window);
											   Thread.sleep(4000);
											   System.out.println(driver.switchTo().window(child_window));
											   ce.cialAWBdetailsCSBnum.click();
											   ce.cialAWBdetailsCSBnum.sendKeys(""+csbnum);
											   Thread.sleep(1000);
											   ce.cialAWBdetaisCSBdate.click();
											   ce.cialAWBdetaisCSBdate.sendKeys("07/06/2023");
											   Thread.sleep(1000);
											   ce.cialAWBdetailsPicesesfiled.sendKeys("20");
											   Thread.sleep(1000);
											   ce.cialAWBdetailsGrossweight.clear();
											   Thread.sleep(5000);
											   ce.cialAWBdetailsGrossweight.click();
											   Thread.sleep(5000);
											   ce.cialAWBdetailsGrossweight.sendKeys("20");
											   Thread.sleep(1000);
											 
											   ce.cialAWBdetailschargebleweight.clear();
											   Thread.sleep(5000);
											   ce.cialAWBdetailschargebleweight.click();
											   Thread.sleep(5000);
											   ce.cialAWBdetailschargebleweight.sendKeys("20");
											   Thread.sleep(1000);
											   ce.cialAWBdetailsFOBvalue.clear();
											   Thread.sleep(5000);
											   ce.cialAWBdetailsFOBvalue.click();
											   Thread.sleep(5000);
											   ce.cialAWBdetailsFOBvalue.sendKeys("45");
											   Thread.sleep(2000);
											   
											   ce.cialAWBdetailscoustomsaveBTN.click();
											   Thread.sleep(2000);
											   driver.switchTo().alert().accept();
												  Thread.sleep(3000);
											   ce.cialAWBdetailsSendCarrBTN.click();
											   Thread.sleep(1000);
											//   ce.cialAWBdetailscoustomsaveBTN.click();
											//   Thread.sleep(1000);
											//   driver.switchTo().alert().accept();
											//   Thread.sleep(1000);
											   ce.cialAWBfdetailsLeonumFiled.sendKeys("557777123");
											   Thread.sleep(1000);
											   ce.cialAWBdeatailsLEOdate.sendKeys("08/06/2023");
											   Thread.sleep(1000);
											   ce.cialAWBdetailsLEOtime.sendKeys("1730");
											   Thread.sleep(1000);
											   ce.cialAWBdetailscoustomsaveBTN.click();
											   Thread.sleep(1000);
											   driver.switchTo().alert().accept();
											   Thread.sleep(1000);
										//	   driver.close();
											   
											   }

											   }
											   //switch to the parent window
											  driver.switchTo().window(parentAWD2);
											   Thread.sleep(5000);
											   driver.switchTo().frame(0);
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
												 WebElement flag1= driver.findElement(By.xpath("/html/body/form/div[6]/fieldset/div/div[2]/table"));
												 js.executeScript("arguments[0].scrollIntoView();",flag1);
												 Thread.sleep(3000);
												 ce.cialAWBdetailsverifiedTikBox.click();
												 Thread.sleep(4000);
												ce.cialAWBdetailsSAVEBUTTON.click();
												 Thread.sleep(10000);	  
		  
	}









	


	





	










































}
