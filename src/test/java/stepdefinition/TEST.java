package stepdefinition;

import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Helper.BaseObjects.*;
import static Helper.BaseVariables.*;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
	
	
//2
	@Then("To verify if user is able to create Direct Shipment or not from VCT generation screen")
	public void to_verify_if_user_is_able_to_create_direct_shipment_or_not_from_vct_generation_screen() throws InterruptedException {
	    ce.cialExportTab.click();
	    Thread.sleep(3000);
	   ce.cialVCTgenerationTab.click();
	    Thread.sleep(3000);
	   
		  
		   driver.switchTo().frame(0);
		   Thread.sleep(3000);
	    ce.cialAWBnumberField.click();
	    ce.cialAWBnumberField.sendKeys("12520041630");
	    Thread.sleep(2000);
	    ce.cialAWNnpx.click();
	    ce.cialAWNnpx.sendKeys("30");
	    Thread.sleep(2000);
	    ce.cial_AWBwt.click();
	    Thread.sleep(1000);
	    ce.cial_AWBwt.sendKeys("00.56");
	    Thread.sleep(2000);
//	   ce.cial_natureofGoods.click();
//	   Thread.sleep(1000);
//	   ce.cial_natureofGoods.sendKeys("");
//	   Thread.sleep(2000);
	   
	   
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
		   ce.cialgenral.click();
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
		    ce.cialAWBnumberField.click();
		    ce.cialAWBnumberField.sendKeys("12520049632");
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
		   Thread.sleep(2000);
		   ce.cial_destinationAirport.click();
		   ce.cial_destinationAirport.sendKeys("DXB");
		   ce.cial_destinationAirport.sendKeys(Keys.ARROW_DOWN);
		   ce.cial_destinationAirport.sendKeys(Keys.ENTER);
		   Thread.sleep(3000);
		   
		   ce.cial_driverName.click();
		   ce.cial_driverName.sendKeys("DRIVER_FIVE");
			   Thread.sleep(2000);
			   ce.cial_vehicleNumber.click();
			   ce.cial_vehicleNumber.sendKeys("JH01FC5022");
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
			   ce.cialgenral.click();
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


	
	
	//4
	@Then("To verify if user is able to take VCT print or not from VCT Generation Screen")
	public void to_verify_if_user_is_able_to_take_vct_print_or_not_from_vct_generation_screen() throws InterruptedException {
		
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		   
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cialshipmentselctlast.click();
			   Thread.sleep(3000);
			   ce.cialprintbutn.click();
				  Thread.sleep(3000);
				  
				  String parent8=driver.getWindowHandle();

				   Set<String>s18=driver.getWindowHandles();

				   // Now iterate using Iterator
				   Iterator<String> I18= s18.iterator();

				   while(I18.hasNext())
				   {

				   String child_window=I18.next();


				   if(!parent8.equals(child_window))
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
				   driver.switchTo().window(parent8);
				   Thread.sleep(3000);
				   driver.switchTo().frame(0);
				   Thread.sleep(2000);}
		/*    ce.cialAWBnumberField.click();
		    ce.cialAWBnumberField.sendKeys("12520035643");
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
			   String parent4=driver.getWindowHandle();

			   Set<String>s4=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I14= s4.iterator();

			   while(I14.hasNext())
			   {

			   String child_window=I14.next();


			   if(!parent4.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialgenral.click();
			  // String goodsnature = ce.cialAUtopartstxt.getText();
			   Thread.sleep(2000);
			 //  ce.cialclosebuttoncommodity.click();
			 //  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent4);
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
			   String parent5=driver.getWindowHandle();

			   Set<String>s15=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I15= s15.iterator();

			   while(I15.hasNext())
			   {

			   String child_window=I15.next();


			   if(!parent5.equals(child_window))
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
			  driver.switchTo().window(parent5);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			 
			  Thread.sleep(2000);
			  ce.cial_saveButton.click();
			  Thread.sleep(5000);
			  
			  driver.switchTo().alert().accept();
			  Thread.sleep(5000);
			  Thread.sleep(10000);
			  Thread.sleep(5000);
			  Thread.sleep(10000);
	   
			  String parent6=driver.getWindowHandle();

			   Set<String>s16=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I16= s16.iterator();

			   while(I16.hasNext())
			   {

			   String child_window=I16.next();


			   if(!parent6.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			 
			   Thread.sleep(2000);
			  
			//  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent6);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			  ce.cialprintbutn.click();
			  Thread.sleep(3000);
			  
			  String parent7=driver.getWindowHandle();

			   Set<String>s17=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I17= s17.iterator();

			   while(I17.hasNext())
			   {

			   String child_window=I17.next();


			   if(!parent6.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			 
			   Thread.sleep(2000);
			  ce.ciala4sheetPrintbtn.click();
			  Thread.sleep(1000);
			  ce.cial1PrintBtn.click();
			  Thread.sleep(2000);
			  Thread.sleep(10000);
			  Thread.sleep(5000);
			  Thread.sleep(10000);
			  driver.close();
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent7);
			   Thread.sleep(3000);
			   */
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
			   Thread.sleep(5000);
			   
	}
	
//7
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
		   ce.cialVCTnumberbox.sendKeys("T2023051200003");
		   ce.cialvctSEARCHicon.click();
		   Thread.sleep(3000);
		   ce.cialdeleteicon.click();
		   Thread.sleep(3000);
		   driver.switchTo().alert().accept();
			  Thread.sleep(5000);
			  Thread.sleep(10000);
	}

	
//8
	@Then("To verify if user is able to generate one VCT for multiple Shipment from VCT generation screen")
	public void to_verify_if_user_is_able_to_generate_one_vct_for_multiple_shipment_from_vct_generation_screen() throws InterruptedException {
		 ce.cialExportTab.click();
		    Thread.sleep(3000);
		   ce.cialVCTgenerationTab.click();
		    Thread.sleep(3000);
		   
			  
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
		    ce.cialAWBnumberField.click();
		    ce.cialAWBnumberField.sendKeys("12520035610");
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
			   ce.cialgenral.click();
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
		    ce.cialAWBnumberField.sendKeys("12520035632");
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
			   ce.cialgenral.click();
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
		    ce.cialAWBnumberField.sendKeys("12520035691");
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
			   ce.cialgenral.click();
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
			   ce.cialVCTnumbersearchBox.sendKeys("T2023051600001");
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
		   ce.cialVCTnumbersearchBox.sendKeys("T2023051600001");
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
		   ce.cialVCTnumbersearchBox.sendKeys("T2023051600001");
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
		   ce.cialVCTnumbersearchBox.sendKeys("T2023051700001");
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
		   JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 WebElement flag1= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
			 js1.executeScript("arguments[0].scrollIntoView();",flag1);
			 Thread.sleep(5000);
		   ce.cialacceptanceSubmitBtn.click();
		   Thread.sleep(3000);
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
		   JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 WebElement flag1= driver.findElement(By.xpath("//*[@id='ctl00_cp_uxbtnClear']"));
			 js1.executeScript("arguments[0].scrollIntoView();",flag1);
			 Thread.sleep(5000);
		   ce.cialacceptanceSubmitBtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000);
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
		   ce.cialVCTnumbersearchBox.sendKeys("T2023051700001");
		   Thread.sleep(2000);
		   ce.cialVCTtabSearchbtn.click();
		   Thread.sleep(3000);
		   Thread.sleep(3000); 
		   ce.cialdockOutDate.click();
		   ce.cialdockOutDate.sendKeys("18/05/2023");
		   Thread.sleep(2000);
		   ce.cialDockOutTime.click();
		   ce.cialDockOutTime.sendKeys("0730");
		   Thread.sleep(2000);
		   
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
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
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
	public void to_verify_in_awb_details_hawb_details_get_to_be_displayed() {
	   
	}

//41

	@Then("To verify If flight details are updated in AWB Details screen then if AWB get to be reflect in build manifest in hand shipment screen.")
	public void to_verify_if_flight_details_are_updated_in_awb_details_screen_then_if_awb_get_to_be_reflect_in_build_manifest_in_hand_shipment_screen() {
	   
	}

//42
	

	@Then("To verify In AWB details screen if user clicks on clear then all the details get to be cleared")
	public void to_verify_in_awb_details_screen_if_user_clicks_on_clear_then_all_the_details_get_to_be_cleared() {
	   
	}







	


	





	










































}
