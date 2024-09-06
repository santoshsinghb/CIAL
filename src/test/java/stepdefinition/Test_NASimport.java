package stepdefinition;
import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Helper.BaseObjects.*;
import static Helper.BaseVariables.*;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
public class Test_NASimport {
	
	@Given("To verify user is able to login into the application NAS import")
	public void to_verify_user_is_able_to_login_into_the_application_nas_import() throws InterruptedException {
		Thread.sleep(3000);
		  ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.cialIMPORTtab.click();
		    Thread.sleep(3000);
		 
		   ce.cialIMPORTimportmanifest.click();
		    Thread.sleep(3000);
	}
	@Then("To verify user is able to navigate to Import manifest screen NAS import")
	public void to_verify_user_is_able_to_navigate_to_import_manifest_screen_nas_import() throws InterruptedException {
		Thread.sleep(1000);
		 driver.switchTo().frame(0);
		   Thread.sleep(20000);
		   
		   ce.cialIMPORTflightsearchICON.click();
		   String parent1=driver.getWindowHandle();

		   Set<String>s1=driver.getWindowHandles();

		   // Now iterate using Iterator
		   Iterator<String> I1= s1.iterator();

		   while(I1.hasNext())
		   {

		   String child_window=I1.next();


		   if(!parent1.equals(child_window))
		   {
		   driver.switchTo().window(child_window);
		   Thread.sleep(10000);
		   System.out.println(driver.switchTo().window(child_window));
		//   ce.cialIMPORTflightselect1.click();
		//   ce.cialIMPORTflightselect2.click();
		   ce.cialIMPORTmanifest3rdFlightSElect.click();
		   Thread.sleep(2000);
		 //  driver.close();
		   
		   }

		   }
		   //switch to the parent window
		  driver.switchTo().window(parent1);
		   Thread.sleep(3000);
		   driver.switchTo().frame(0);
		   Thread.sleep(3000);
		 
		   ce.cialIMPORTuldTYPE.click();
		   
		   ce.cialIMPORTuldTYPE.sendKeys("AAF");
		   ce.cialIMPORTuldTYPE.sendKeys(Keys.ARROW_DOWN);;
		   ce.cialIMPORTuldTYPE.sendKeys(Keys.ENTER);;
		   Thread.sleep(2000);
		   ce.cialIMPORT_ULDnumber.sendKeys("26048");
		   Thread.sleep(2000);
		   ce.cialIMPORT_carriershort.sendKeys("BA");
		   Thread.sleep(2000);
		   ce.cialIMPORT_carriershort.sendKeys(Keys.ARROW_DOWN);;
		   ce.cialIMPORT_carriershort.sendKeys(Keys.ENTER);;
		   
		   Thread.sleep(3000);
		   ce.cialIMPORTadduldbtn.click();
		   Thread.sleep(30000);
	}
	
	@Then("To verify if user is able to add ULD awbnumber {string}, destination {string}, npx {string},npxwt {string},chargebleWT {string}   from Import Manifest screen NAS import")
	public void to_verify_if_user_is_able_to_add_uld_awbnumber_destination_npx_npxwt_chargeble_wt_from_import_manifest_screen_nas_import(String awbnumber, String destination, String npx, String npxwt, String chargebleWT) throws InterruptedException {
		Thread.sleep(2000);
		
		ce.cialIMPORTaddedULDselect.click();
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
		   ce.cialIMPORTaddedULDflightPREFIX.click();
		   ce.cialIMPORTaddedULDflightPREFIX.sendKeys("125");
		   Thread.sleep(2000);
		   
		   ce.cialIMPORTaddedULDawbNUM.sendKeys(awbnumber);
		   Thread.sleep(2000);
		   ce.cialIMPORTaddedULDdestination.click();
		   ce.cialIMPORTaddedULDdestination.sendKeys(destination);
		   Thread.sleep(4000);
		   ce.cialIMPORTaddedULDnatureofGOODS.click();
		   ce.cialIMPORTaddedULDnatureofGOODS.sendKeys("CONSOLIDATION");
		   Thread.sleep(2000);
		   Thread.sleep(2000);
		   ce.cialIMPORTaddedULDnpx.click();
		   ce.cialIMPORTaddedULDnpx.sendKeys(npx);
		   Thread.sleep(2000);
		   ce.cialIMPORTaddedUldnpxwt.click();
		   ce.cialIMPORTaddedUldnpxwt.sendKeys(npxwt);
		   Thread.sleep(2000);
		   ce.cialIMPORTaddedULDchargebleWT.click();
		   ce.cialIMPORTaddedULDchargebleWT.sendKeys(chargebleWT);
		   Thread.sleep(2000);
		   ce.cialIMPORTaddedULDconsignee.click();
		   Thread.sleep(2000);
		   ce.cialIMPORTaddedULDconsignee.sendKeys("FLY DUBAI[71]");
		   ce.cialIMPORTaddedULDconsignee.sendKeys(Keys.ARROW_DOWN);;
		   ce.cialIMPORTaddedULDconsignee.sendKeys(Keys.ENTER);;
		   Thread.sleep(2000);
		   

		 //  driver.close();
		   Thread.sleep(3000);
		   ce.cialIMPORTAddedULDsavecloseBtn.click();
		   Thread.sleep(5000);
		   driver.switchTo().alert().accept(); 
		   Thread.sleep(20000);
		 
		   }}
		   //switch to the parent window
		   driver.switchTo().window(parent2);
		   Thread.sleep(3000);
		   driver.switchTo().frame(0);
		   Thread.sleep(2000);
			  
			   ce.cialIMPORTsearchBTN.click();
			   Thread.sleep(5000);
			   ce.cialIMPORTcoustomerRefNum.click();
			   Thread.sleep(2000);
			   ce.cialIMPORTcoustomerRefNum.sendKeys("9123024");
			   Thread.sleep(2000);
			   ce.cialIMPORTataDATE.click();
			   Thread.sleep(2000);
			   ce.cialIMPORTataDATE.sendKeys("26/04/2024");
			   Thread.sleep(2000);
			   ce.cialIMPORTtime.sendKeys("0404");
			   Thread.sleep(2000);
			   ce.cialIMPORTrecordATAbtn.click();
			   Thread.sleep(10000);
			   ce.cialIMPORTtoSelectAllAWBnumCreated.click();
			   Thread.sleep(2000);
			   ce.cialIMPORTmatchBTN.click();
			   Thread.sleep(2000);
			   ce.cialIMPORTafterMatchOkBTN.click();
			//   driver.switchTo().alert().accept(); 
			   Thread.sleep(3000);
			//   driver.switchTo().alert().accept(); 
			   Thread.sleep(3000);
			   
			   Thread.sleep(1000);
					driver.switchTo().defaultContent();
					   Thread.sleep(3000);
					   driver.switchTo().frame(0);
					   Thread.sleep(2000);
					   
					   ce.cialIMPORTBreakdownBtn.click();
					   Thread.sleep(20000);
					   String parent6=driver.getWindowHandle();

					   Set<String>s6=driver.getWindowHandles();

					   // Now iterate using Iterator
					   Iterator<String> I6= s6.iterator();

					   while(I6.hasNext())
					   {

					   String child_window=I6.next();


					   if(!parent6.equals(child_window))
					   {
					   driver.switchTo().window(child_window);

					   System.out.println(driver.switchTo().window(child_window));
					   ce.cialIMPORTbreakdownDocumentReciveDate.click();;
					   Thread.sleep(2000);
					   ce.cialIMPORTbreakdownDocumentReciveDate.sendKeys("26/04/2023");
					  
					   Thread.sleep(2000);
					   ce.cialIMPORTBreakdownTime.click();
					   ce.cialIMPORTBreakdownTime.sendKeys("0420");
					   Thread.sleep(2000);
					ce.cialIMPORTSavEBtnBreakdown.click();
					   Thread.sleep(5000);
					   ce.breakdownClose.click();

					   Thread.sleep(10000);
					   }
					   

					   }
					   
					   driver.switchTo().window(parent6);
					   Thread.sleep(3000);
					   driver.switchTo().frame(0);
					   Thread.sleep(2000);
					   ce.FinaliseFlightImport.click(); 
					   Thread.sleep(50000);
	}



	
	
	@Then("To verify if user is able to add ULD  from Import Manifest screen NAS import")
	public void to_verify_if_user_is_able_to_add_uld_from_import_manifest_screen_nas_import() throws InterruptedException {
		
	}
	@Then("To verify if user is able to Change ULD in Import Manifest screen NAS import")
	public void to_verify_if_user_is_able_to_change_uld_in_import_manifest_screen_nas_import() {
	 
	}
	@Then("To verify user is able to Delete ULD from Import Manifest screen NAS import")
	public void to_verify_user_is_able_to_delete_uld_from_import_manifest_screen_nas_import() {
	  
	}
	@Then("To verify User is  be able to Add Direct Airway Bill in ULD from Import manifest screen NAS import")
	public void to_verify_user_is_be_able_to_add_direct_airway_bill_in_uld_from_import_manifest_screen_nas_import() {
	  
	}
	@Then("To verify user is be able to Add Consol Airway Bill in ULD from Import manifest screen NAS import")
	public void to_verify_user_is_be_able_to_add_consol_airway_bill_in_uld_from_import_manifest_screen_nas_import() {
	  
	}
	@Then("To verify User is able to Add Transship Airway Bill in ULD from Import manifest screen NAS import")
	public void to_verify_user_is_able_to_add_transship_airway_bill_in_uld_from_import_manifest_screen_nas_import() {
	  
	}
	@Then("To verify User is able to Add Console Transship Airway Bill in ULD from Import manifest screen NAS import")
	public void to_verify_user_is_able_to_add_console_transship_airway_bill_in_uld_from_import_manifest_screen_nas_import() {
	   
	}
	@Then("To verify user is able to do part shipment from import manifest screen NAS import")
	public void to_verify_user_is_able_to_do_part_shipment_from_import_manifest_screen_nas_import() {
	  
	}
	@Then("To verify user is able to Move Shipment from one ULD to another ULD in import manifest screen NAS import")
	public void to_verify_user_is_able_to_move_shipment_from_one_uld_to_another_uld_in_import_manifest_screen_nas_import() {
	 
	}
	@Then("To verify user is able to Record ATA in import manifest screen NAS import")
	public void to_verify_user_is_able_to_record_ata_in_import_manifest_screen_nas_import() {
	  
	}
	@Then("To verify User is able to Found Airway Bill in import manifest screen NAS import")
	public void to_verify_user_is_able_to_found_airway_bill_in_import_manifest_screen_nas_import() {
	 
	}
	@Then("To verify User is able to Discrepancy Airway Bill in import manifest screen NAS import")
	public void to_verify_user_is_able_to_discrepancy_airway_bill_in_import_manifest_screen_nas_import() {
	 
	}
	@Then("To verify user is able to Damage Airway Bill in import manifest screen NAS  import")
	public void to_verify_user_is_able_to_damage_airway_bill_in_import_manifest_screen_nas_import() {
	 
	}
	@Then("To verify User is able to view print of Damage report in import manifest screen NAS import")
	public void to_verify_user_is_able_to_view_print_of_damage_report_in_import_manifest_screen_nas_import() {
	   
	}
	@Then("To verify User is able to Revoke Damage Airway Bill in import manifest screen NAS import")
	public void to_verify_user_is_able_to_revoke_damage_airway_bill_in_import_manifest_screen_nas_import() {
	 
	}
	@Then("To verify User is able to e-Docket Airway Bill in import manifest screen NAS import")
	public void to_verify_user_is_able_to_e_docket_airway_bill_in_import_manifest_screen_nas_import() {
	  
	}
	@Then("To verify user is able to perform direct delivery in import manifest screen NAS import")
	public void to_verify_user_is_able_to_perform_direct_delivery_in_import_manifest_screen_nas_import() {
	 
	}
	@Then("To verify User is able to Match Airway Bill in import manifest screen NAS import")
	public void to_verify_user_is_able_to_match_airway_bill_in_import_manifest_screen_nas_import() {
	 
	}
	@Then("To verify user is able to generate the rotation number from Draft Manifest screen NAS import")
	public void to_verify_user_is_able_to_generate_the_rotation_number_from_draft_manifest_screen_nas_import() {
	  
	}
	@Then("To verify User is able to update airway bill in AWB details screen NAS import")
	public void to_verify_user_is_able_to_update_airway_bill_in_awb_details_screen_nas_import() {
	 
	}
	@Then("To verify User is able to record Breakdown in the import manifest screen NAS import")
	public void to_verify_user_is_able_to_record_breakdown_in_the_import_manifest_screen_nas_import() {
	
	}
	@Then("To verify if user is able to assign location from Warehouse Location NAS screen")
	public void to_verify_if_user_is_able_to_assign_location_from_warehouse_location_nas_screen() {
	 
	}
	@Then("To verify if user is able to move pieces from warehouse location screen in NAS import")
	public void to_verify_if_user_is_able_to_move_pieces_from_warehouse_location_screen_in_nas_import() {
	 
	}
	@Then("To verify user is able to delete pieces from warehouse location screen in NAS import")
	public void to_verify_user_is_able_to_delete_pieces_from_warehouse_location_screen_in_nas_import() {
	  
	}
	@Then("To verify user is able to do Hold shipment  on custom action screen NAS import")
	public void to_verify_user_is_able_to_do_hold_shipment_on_custom_action_screen_nas_import() {
	  
	}
	@Then("To verify user is able to do UN-Hold shipment  on custom action screen NAS import")
	public void to_verify_user_is_able_to_do_un_hold_shipment_on_custom_action_screen_nas_import() {
	 
	}
	@Then("To verify user is able to seize shipment  on custom action screen NAS import")
	public void to_verify_user_is_able_to_seize_shipment_on_custom_action_screen_nas_import() {
	 
	}
	@Then("To verify user is able to clear seize shipment on custom action screen NAS import")
	public void to_verify_user_is_able_to_clear_seize_shipment_on_custom_action_screen_nas_import() {
	 
	}
	@Then("To verify user is able to do Examination shipment  on custom action screen NAS import")
	public void to_verify_user_is_able_to_do_examination_shipment_on_custom_action_screen_nas_import() {
	  
	}
	@Then("To verify data will be clear or not when user click on clear button from examination screen NAS import")
	public void to_verify_data_will_be_clear_or_not_when_user_click_on_clear_button_from_examination_screen_nas_import() {
	  
	}
	@Then("To verify user is able to send AOA to the selected notification time from advice of arrival screen NAS import")
	public void to_verify_user_is_able_to_send_aoa_to_the_selected_notification_time_from_advice_of_arrival_screen_nas_import() {
	   
	}
	@Then("To verify user is able to view AOA print to the selected notification time from advice of arrival screen NAS import")
	public void to_verify_user_is_able_to_view_aoa_print_to_the_selected_notification_time_from_advice_of_arrival_screen_nas_import() {
	 
	}
	@Then("To verify User is able to Finalize Flight from Import Manifest screen NAS import")
	public void to_verify_user_is_able_to_finalize_flight_from_import_manifest_screen_nas_import() {
	 
	}
	@Then("To verify user able to Generate WDO from Warehouse Delivery Order screen for Direct AWB at MAWB level NAS import")
	public void to_verify_user_able_to_generate_wdo_from_warehouse_delivery_order_screen_for_direct_awb_at_mawb_level_nas_import() {
	 
	}
	@Then("To verify user able to Generate WDO from Warehouse Delivery Order screen for Consol AWB at HAWB level NAS import")
	public void to_verify_user_able_to_generate_wdo_from_warehouse_delivery_order_screen_for_consol_awb_at_hawb_level_nas_import() {
	 
	}
	@Then("To verify user able to get print of WDO from Warehouse Delivery Order screen NAS import")
	public void to_verify_user_able_to_get_print_of_wdo_from_warehouse_delivery_order_screen_nas_import() {
	  
	}
	@Then("To verify User able to  Release WDO from Warehouse Delivery Order screen NAS  import")
	public void to_verify_user_able_to_release_wdo_from_warehouse_delivery_order_screen_nas_import() {
	  
	}
	@Then("To verify user is unable to Revoke release of WDO before Release WDO from Warehouse Delivery Order screen NAS import")
	public void to_verify_user_is_unable_to_revoke_release_of_wdo_before_release_wdo_from_warehouse_delivery_order_screen_nas_import() {
	 
	}
	@Then("To verify user able to Revoke release of WDO from Warehouse Delivery Order screen NAS import")
	public void to_verify_user_able_to_revoke_release_of_wdo_from_warehouse_delivery_order_screen_nas_import() {
	  
	}
	@Then("To verify User able to Cancel WDO from Warehouse Delivery Order screen NAS import")
	public void to_verify_user_able_to_cancel_wdo_from_warehouse_delivery_order_screen_nas_import() {
	 
	}
	@Then("To verify user is able to search event status  against the AWB NAS import")
	public void to_verify_user_is_able_to_search_event_status_against_the_awb_nas_import() {
	 
	}
	@Then("To verify user is able to add the event against the AWB number NAS import")
	public void to_verify_user_is_able_to_add_the_event_against_the_awb_number_nas_import() {
	  
	}
	@Then("To verify user is able to click on awb no in Import Manifest to search the detail of awb no. NAS import")
	public void to_verify_user_is_able_to_click_on_awb_no_in_import_manifest_to_search_the_detail_of_awb_no_nas_import() {
	  
	}




	



}
