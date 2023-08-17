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
public class Celebi_master {


	@Then("To verify user is able to login into the application with English Language")
	public void to_verify_user_is_able_to_login_into_the_application_with_english_language() throws InterruptedException {
		Thread.sleep(5000); 
		Select securitydropdown = new Select(driver.findElement(By.name("ddl_lang")));
		  securitydropdown.selectByVisibleText("Turkish");
		  Thread.sleep(3000);
		Select securitydropdown1 = new Select(driver.findElement(By.name("ddl_lang")));
		  securitydropdown1.selectByVisibleText("English");
		  Thread.sleep(3000);
		  ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
	}

	

	@Then("To verify user is able to login into the application with Turkish  Language")
	public void to_verify_user_is_able_to_login_into_the_application_with_turkish_language() throws InterruptedException {
		Thread.sleep(5000); 
		Select securitydropdown = new Select(driver.findElement(By.name("ddl_lang")));
		  securitydropdown.selectByVisibleText("Turkish");
		  Thread.sleep(3000);
		  ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
	}


	@Then("To verify user should not be able to login into the application with invalid credentials and proper validation is displayed")
	public void to_verify_user_should_not_be_able_to_login_into_the_application_with_invalid_credentials_and_proper_validation_is_displayed() throws InterruptedException {
		 Thread.sleep(3000);
		  ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(3000);
		  String text=ce.celibiAlertToEnterValidUserPass.getText();
		  System.out.println("ALERT CAME AFTER ENTERING INVALID CREDENTIALS= "+text);
		  ce.celibiAlertToEnterValidUserPass.isDisplayed();
		  Thread.sleep(5000);
	}
	
	@Then("To verify user is able to navigate to user master screen in GHA")
	public void to_verify_user_is_able_to_navigate_to_user_master_screen_in_gha() throws InterruptedException {
		 Thread.sleep(3000);
		  ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMoreBtn.click();
		  Thread.sleep(3000);
		//  driver.switchTo().frame(0);
		//  Thread.sleep(3000);
		  ce.celibiMoreBtnSystemSetup.click();
		  Thread.sleep(3000);
		  ce.celibiMoreBtnSystemSetupMaster.click();
		  Thread.sleep(3000);
		  
	}
	

	@Then("To verify user is able to create new user in GHA user master screen")
	public void to_verify_user_is_able_to_create_new_user_in_gha_user_master_screen() throws InterruptedException {
		 Thread.sleep(3000);
		  ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMoreBtn.click();
		  Thread.sleep(3000);
		//  driver.switchTo().frame(0);
		//  Thread.sleep(3000);
		  ce.celibiMoreBtnSystemSetup.click();
		  Thread.sleep(3000);
		  ce.celibiMoreBtnSystemSetupMaster.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
			  Thread.sleep(2000);
		  ce.celibiNewIconBtn.click();
		  Thread.sleep(5000);
		 
		  ce.celibiGroupselectWindow.click();
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
		   ce.celibiSelectingGroupName.click();
		   Thread.sleep(2000);
		 //  driver.close();
		   
		   }

		   }
		   driver.switchTo().window(parent);
		   Thread.sleep(3000);
		   driver.switchTo().frame(0);
		   Thread.sleep(2000);
		   ce.celibiNewUsernameInput.click();
		   Thread.sleep(1000);
			  ce.celibiNewUsernameInput.sendKeys("REEN");
			  Thread.sleep(1000);
			  ce.celibiNewName.click();
			  Thread.sleep(1000);
			  ce.celibiNewName.sendKeys("RIN");
			  Thread.sleep(1000);
			  ce.celibiNewLastName.click();
			  Thread.sleep(1000);
			  ce.celibiNewLastName.sendKeys("bar");
			  Thread.sleep(3000);
			  ce.celibiNewEmailId.click();
			  ce.celibiNewEmailId.sendKeys("REEN@gmail.com");
			  Thread.sleep(1000);
			  ce.celibiNewLocation.sendKeys("AbA");
			  ce.celibiNewLocationSearchIcon.click();
			  Thread.sleep(3000);
			  String parent2=driver.getWindowHandle();
			   Set<String>s2=driver.getWindowHandles();
			   // Now iterate using Iterator
			   Iterator<String> I2= s2.iterator();
			   while(I.hasNext())
			   {
			   String child_window=I2.next();
			   if(!parent.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.celibinewLocationSelect.click();
			   Thread.sleep(4000);
			 //  driver.close();
			   
			   }

			   }
			   driver.switchTo().window(parent2);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   
			   Select Domaindropdown = new Select(driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxdrpDomain$fmsGenericDropDownList")));
			   Domaindropdown.selectByVisibleText("KLSTHN");
			   Thread.sleep(2000);
			   ce.celibinewPassword.click();
			   ce.celibinewPassword.clear();
			   ce.celibinewPassword.sendKeys("abh@123");
			   Thread.sleep(2000);
			   ce.celibiconfirmNewPassword.clear();
			   ce.celibiconfirmNewPassword.sendKeys("abh@123");
			   Thread.sleep(2000);
			   ce.celibiSaveBtn.click();
			   Thread.sleep(7000);
			   driver.switchTo().window(parent2);
			   Thread.sleep(3000);
			   ce.celibiLogOutBtn.click();
			   Thread.sleep(5000);
			   ce.celibiUserNameInput.click();
				  ce.celibiUserNameInput.sendKeys("REEN");
				  Thread.sleep(3000);
				  ce.celibiPasswordInput.click();
				  ce.celibiPasswordInput.sendKeys("abh@123");
				  Thread.sleep(3000);
				  ce.celibiLoginBtn.click();
				  Thread.sleep(5000);
	}

	@Then("To verify user is able to navigate to group  master screen")
	public void to_verify_user_is_able_to_navigate_to_group_master_screen() throws InterruptedException {
		Thread.sleep(3000);
		  ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMoreBtn.click();
		  Thread.sleep(3000);
		  ce.celibiMoreBtnSystemSetup.click();
		  Thread.sleep(3000);
		  ce.celibiMoreGroupMaster.click();
		  Thread.sleep(3000);
		   driver.switchTo().frame(0);
		  Thread.sleep(3000);
		  
		  ce.celibiGroupMasterUserDetails.click();
		  Thread.sleep(5000);
		  ce.celibiGroupMasterEDITbtn.click();
		  Thread.sleep(3000);
		  ce.celibiEditGroupDescription.click();
		  Thread.sleep(3000);
		  ce.celibiEditGroupDescription.clear();
		  Thread.sleep(1000);
		  ce.celibiEditGroupDescription.sendKeys("AUTOMATION TESTING group");
		  Thread.sleep(3000);
		  ce.celibiSaveBtn.click();
		  Thread.sleep(5000);
		  ce.celibiGroupMasterUserDetails.click();
		  Thread.sleep(5000);
		  ce.celibiGroupMasterEDITbtn.click();
		  Thread.sleep(3000);
		  ce.celibiSystemAuthorization.click();
		  Thread.sleep(3000);
		  ce.celibiAthorizationTik1.click();
		  Thread.sleep(3000);
		  ce.celibiAthorizationTik2.click();
		  Thread.sleep(3000);
		  ce.celibiSaveBtn.click();
		  Thread.sleep(5000);
	}
//--------------------#14

	@Then("To verify user is able to navigate to password policy screen in GHA")
	public void to_verify_user_is_able_to_navigate_to_password_policy_screen_in_gha() throws InterruptedException {
		Thread.sleep(3000);
		  ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMoreBtn.click();
		  Thread.sleep(3000);
		  ce.celibiMoreBtnSystemSetup.click();
		  Thread.sleep(3000);
		  ce.celibiPasswordPolicyTab.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		  Thread.sleep(3000);
		  ce.celibipaswordpolicytik1.click();
		  Thread.sleep(1000);
		  ce.celibipaswordpolicytik1.click();
		  Thread.sleep(1000);
		  ce.celibipaswordpolicytik2.click();
		  Thread.sleep(1000);
		  ce.celibipaswordpolicytik2.click();
		  Thread.sleep(1000);
		  ce.celibiUpdatePasswordPolicyBtn.click();
		  Thread.sleep(5000);
	}

	@Then("To verify user is able to create new Airline into Airline screen in Masters of GHA application")
	public void to_verify_user_is_able_to_create_new_airline_into_airline_screen_in_masters_of_gha_application() throws InterruptedException {
		 ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiMasterAirline.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		  ce.celibiNewIconBtn.click();
		  Thread.sleep(3000);
		  ce.celibiCarrierCode.sendKeys("0AH");
		  Thread.sleep(2000);
		  ce.celibiShortCode.sendKeys("GRN");
		  Thread.sleep(2000);
		  ce.celibiAirlineName.sendKeys("GRENFLY");
		  Thread.sleep(2000);
		  ce.celibiWOCcode.sendKeys(" ");
		  Thread.sleep(2000);
		  ce.celibiprefixDetailsBtn.click();
		  Thread.sleep(2000);
		  ce.celibiPrefixField.sendKeys("229");
		  Thread.sleep(2000);
		  ce.celibiCheckDigitTikMark.click();
		  Thread.sleep(2000);
		  ce.celibiDefaultPrefixTikMark.click();
		  Thread.sleep(2000);
	  ce.celibiairlineOkBtn.click();
		  Thread.sleep(2000);
		  ce.celibiFLOPPYSAVEbtn.click();
		  Thread.sleep(5000);
		/*  ce.celibicarrierCodeSearchField.click();
		  Thread.sleep(2000);
		  ce.celibicarrierCodeSearchField.sendKeys("go airline");
		//  ce.celibisearchicon.click();
		  Thread.sleep(10000);
		  ce.celibiAirlineForDetailsClick.click();
		  Thread.sleep(5000);
		  ce.celibieditbtn.click();
		  Thread.sleep(2000);
		  ce.celibicontactName.click();
		  ce.celibicontactName.sendKeys("gaurav");
		  Thread.sleep(2000);
		  ce.celibiHeadContactName.click();
		  ce.celibiHeadContactName.sendKeys("Abishek");
		  Thread.sleep(2000);
		  ce.celibiFLOPPYSAVEbtn.click();
		  Thread.sleep(5000); */
	}



	@Then("To verify user is able to navigate to Airline Schedule in Masters of GHA application")
	public void to_verify_user_is_able_to_navigate_to_airline_schedule_in_masters_of_gha_application() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiAirlineShedule.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		  ce.celibiNewIconBtn.click();
		  Thread.sleep(3000);
		  ce.celibischeduleairlineNameFiled.click();
		  ce.celibischeduleairlineNameFiled.sendKeys("TEA");
		  Thread.sleep(2000);
		  ce.celibischeduleairlineFromdate.sendKeys("16/08/2023");
		  Thread.sleep(2000);
		  ce.celibischeduleairlineTOdate.sendKeys("31/12/2023");
		  Thread.sleep(2000);
		  ce.celibischeduleairlineCommentField.sendKeys("TESTING ");
		  Thread.sleep(2000);
		  ce.celibiFLOPPYSAVEbtn.click();
		  Thread.sleep(3000);
		/*  ce.celibischeduleairlinedetailseditselect.click();
		  Thread.sleep(2000);
		  ce.celibieditbtn.click();
		  Thread.sleep(2000);
		  ce.celibiFloppyCancleBtn.click();
		  Thread.sleep(3000);*/
	}

	@Then("To verify user is able to navigate to Airport City in GHA Masters")
	public void to_verify_user_is_able_to_navigate_to_airport_city_in_gha_masters() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiAirportCityTab.click();
		  Thread.sleep(2000);
		  driver.switchTo().frame(0);
		  ce.celibiNewIconBtn.click();
		  Thread.sleep(2000);
		  ce.celibiAirportCityAirportCode.sendKeys("ROC");
		  Thread.sleep(3000);
		  
		  ce.celibiAirportCityNameAirport.sendKeys("roc_INTERNATIONAL");
		  Thread.sleep(3000);
		  driver.switchTo().alert().accept();
		   Thread.sleep(3000);
		  ce.celibiAirportCityCode.sendKeys("roc");
		  Thread.sleep(2000);
		  ce.celibiAirportCityName.sendKeys("roci");
		  Thread.sleep(2000);
		  ce.celibiAirportCityStateCode.sendKeys("04");
		  Thread.sleep(2000);
		  ce.celibiAirportCityCountryCode.sendKeys("IN");
		  Thread.sleep(2000);
		  ce.celibiAirportCitySitaAddress.sendKeys("TEAISKK");
		  Thread.sleep(2000);
		  ce.celibiAirportCityCustPermissionNum.sendKeys("127584");
		  Thread.sleep(2000);
		  ce.celibiFLOPPYSAVEbtn.click();
		  Thread.sleep(20000);
	}
	

	@Then("To verify user is able to navigate to Country Master in GHA Masters")
	public void to_verify_user_is_able_to_navigate_to_country_master_in_gha_masters() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiMasterMoreTab.click();
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCountryMaster.click();
		  Thread.sleep(5000);
		 
		  driver.switchTo().frame(0);
		  ce.celibiNewIconBtn.click();
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCountryMasterCountryCode.sendKeys("TC");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCountryMasterFullName.sendKeys("TEA COUNTRY");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCountryMasterCurrency.sendKeys("AED");
		  Thread.sleep(2000);
		  Select Regiondropdown = new Select(driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$GenericDropDownList1$fmsGenericDropDownList")));
		  Regiondropdown.selectByVisibleText("ASIA");
		  Thread.sleep(5000);
		  ce.celibiFLOPPYSAVEbtn.click();
		  Thread.sleep(5000); 
		/*  ce.celibiMasterMoreCountryMasterCountryCodeSearching.sendKeys("GC");
		  Thread.sleep(30000);
		  Thread.sleep(5000);
		  ce.celibiMasterMoreCountryMasterCountryCodeSearchingSelect.click();
		  Thread.sleep(5000);
		  ce.celibieditbtn.click();
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCountryMasterFullName.clear();
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCountryMasterFullName.sendKeys("GULF COUNTRY");
		  Thread.sleep(2000);
		  ce.celibiFLOPPYSAVEbtn.click();
		  Thread.sleep(30000);*/
	}

	

	@Then("To verify user is able to navigate to Customer Master in GHA Masters")
	public void to_verify_user_is_able_to_navigate_to_customer_master_in_gha_masters() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiMasterMoreTab.click();
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerMaster.click();
		  Thread.sleep(5000);
		 
		  driver.switchTo().frame(0);
		  
		  ce.celibiNewIconBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterMoreCustomerMasterShortCode.sendKeys("TEA");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerMasterCustomername.sendKeys(" TEA ALL");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerMasterSreetAddress.sendKeys("THANEnew");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerMasterplace.sendKeys("THANEnew");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerStatecode.sendKeys("");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerstate.sendKeys("MAHARASHTRA");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomercountry.sendKeys("IN");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerpostalcode.sendKeys("400080");
		  Thread.sleep(2000);
	}
	

	@Then("To verify user is able to update customer as Active  from GHA customer master screen")
	public void to_verify_user_is_able_to_update_customer_as_active_from_gha_customer_master_screen() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiMasterMoreTab.click();
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerMaster.click();
		  Thread.sleep(5000);
		 
		  driver.switchTo().frame(0);
		  
		  ce.celibiNewIconBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterMoreCustomerMasterShortCode.sendKeys("CAN");
		  Thread.sleep(2000);
		  Select statusdropdown = new Select(driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$drpStatus")));
		  statusdropdown.selectByVisibleText("Active");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerMasterCustomername.sendKeys(" CAN ALL NEW");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerMasterSreetAddress.sendKeys("NEW THANE HI");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerMasterplace.sendKeys("NEW THANE HI");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerStatecode.sendKeys("");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerstate.sendKeys("MAHARASHTRA");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomercountry.sendKeys("IN");
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerpostalcode.sendKeys("400080");
		  Thread.sleep(2000);
		 
	}
	
	@Then("To verify user is able to add TAX details to selected customer from customer master screen")
	public void to_verify_user_is_able_to_add_tax_details_to_selected_customer_from_customer_master_screen() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiMasterMoreTab.click();
		  Thread.sleep(2000);
		  ce.celibiMasterMoreCustomerMaster.click();
		  Thread.sleep(5000);
		 
		  driver.switchTo().frame(0);
		  driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div[2]/div/fieldset/div/div[2]/div[1]/div/div[1]/div/table/tbody/tr[2]/td[4]")).click();;
		  Thread.sleep(2000);
		  ce.celibieditbtn.click();
		  Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement flag= driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$btnTaxdetails"));
		  js.executeScript("arguments[0].scrollIntoView();",flag);
		  Thread.sleep(3000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$btnTaxdetails")).click();;
		  Thread.sleep(2000);
		  
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
		   Select TaxIddropdown = new Select(driver.findElement(By.name("ctl00$cp$drpTaxType$fmsGenericDropDownList")));
		   TaxIddropdown.selectByVisibleText("GSTIN");
			  Thread.sleep(2000);
		   driver.findElement(By.name("ctl00$cp$txtTaxIdNo")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.name("ctl00$cp$txtTaxIdNo")).sendKeys("97546245");
		   Thread.sleep(2000);
		   driver.findElement(By.name("ctl00$cp$btnSave")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.name("ctl00$cp$grdTaxDetails$ctl02$btnDeleteTax")).click();
		   Thread.sleep(5000);
		 //  driver.close();
		   driver.findElement(By.name("ctl00$cp$btnClose")).click();
		   Thread.sleep(5000);
		   }

		   }
		   driver.switchTo().window(parent);
		   Thread.sleep(3000);
		   driver.switchTo().frame(0);
		   Thread.sleep(2000);
		   driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$btnDocAcept")).click();
		   Thread.sleep(3000);
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
		   driver.findElement(By.name("select")).click();
		   Thread.sleep(2000);
		   WebElement browse = driver.findElement(By.xpath("//*[@id='fileUpload_0']"));
		   //click on ‘Choose file’ to upload the desired file
		   browse.sendKeys("C:\\Users\\Gaurav.Abhishek\\Downloads\\SBI STATEMENT (67).xlsx"); //Uploading the file using sendKeys
		   System.out.println("File is Uploaded Successfully");
         //  ce.celibicustomermasterDocumentUploadBrowseBtn.click();
		   Thread.sleep(5000);
		 //  driver.close();
		   driver.findElement(By.name("ctl00$cp$FMSButton1")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.id("btnDelete_0")).click();
		   Thread.sleep(3000);
		   }

		   }
		   driver.switchTo().window(parent2);
		   Thread.sleep(3000);
		   driver.switchTo().frame(0);
		   Thread.sleep(2000);
	}

	@Then("To verify user is able to navigate to Currency Master in GHA Masters")
	public void to_verify_user_is_able_to_navigate_to_currency_master_in_gha_masters() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiMasterMoreTab.click();
		  Thread.sleep(2000);
		  ce.celibicustomermasterCurrencyMaster.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		   Thread.sleep(2000);
		  ce.celibiNewIconBtn.click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxCurrencyCode")).sendKeys("HOD");
		  Thread.sleep(1000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxDecimalPlaces")).sendKeys("4");
		  Thread.sleep(1000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxCurrencyName")).sendKeys("Indian NOTE");
		  Thread.sleep(1000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxDecimalDesc")).sendKeys("0");
		  Thread.sleep(1000);
		  ce.celibiFLOPPYSAVEbtn.click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("ctl00_cp_tc_tp1_ctl00_uxgrdCurrency_ctl02_fmsName")).click();
		  Thread.sleep(3000);
		  ce.celibieditbtn.click();
		  Thread.sleep(3000);
		  ce.celibiFloppyCancleBtn.click();
		  Thread.sleep(5000);
	}

	@Then("To verify user is able to add new commodity in commodity master in GHA application")
	public void to_verify_user_is_able_to_add_new_commodity_in_commodity_master_in_gha_application() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		
		  ce.celibicustomercommodityMaster.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		   Thread.sleep(2000);
		  ce.celibiNewIconBtn.click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxIATAComodityGrp$FMSReferenceDataSelected")).sendKeys("GEN");
		  Thread.sleep(1000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxtxtDensityKg")).sendKeys("1004");
		  Thread.sleep(1000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxtxtDensityGroup")).sendKeys("1002");
		  Thread.sleep(1000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxtxtCommodityType")).sendKeys("CAR PARTS");
		  Thread.sleep(1000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxTxtIATAComodityCode")).sendKeys("11G");
		  Thread.sleep(1000);
		
		  ce.celibiFLOPPYSAVEbtn.click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/fieldset/div/div[2]/div[1]/div/table/tbody/tr[2]/td[2]")).click();
			  Thread.sleep(3000);
			  ce.celibieditbtn.click();
			  Thread.sleep(3000);
			  ce.celibiFloppyCancleBtn.click();
			  Thread.sleep(3000);
	}

	@Then("To verify User is able to create flight in GHA")
	public void to_verify_user_is_able_to_create_flight_in_gha() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiMasterMoreTab.click();
		  Thread.sleep(2000);
		  ce.celibiMasterMoreFlight.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		   Thread.sleep(2000);
		  ce.celibiNewIconBtn.click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxFlightNo")).sendKeys("AI241");
		   Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxAircraftType$FMSReferenceDataSelected")).sendKeys("A220");
			  Thread.sleep(2000);
			  ce.celibiMasterMoreflightRoutingDetails.click();
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl02$uxAirport$FMSAirportSelected")).sendKeys("AAA");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl02$uxDepartureDate$txtDateField")).sendKeys("16/08/2023");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl02$txtDepartureTimeDummy")).sendKeys("22");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl02$txtDepartureTimeDummyMin")).sendKeys("22");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl03$uxAirport$FMSAirportSelected")).sendKeys("AAE");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl03$uxArrivalDate$txtDateField")).sendKeys("16/08/2023");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl03$txtArrivalTimeDummy")).sendKeys("20");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl03$txtArrivalTimeDummyMin")).sendKeys("20");
			  Thread.sleep(2000);
			  ce.celibiFLOPPYSAVEbtn.click();
			  Thread.sleep(2000);
	}
	

	@Then("To verify User is able to schedule flight in Master screen")
	public void to_verify_user_is_able_to_schedule_flight_in_master_screen() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiMasterMoreTab.click();
		  Thread.sleep(2000);
		  ce.celibiMasterMoreflightscheduleBtn.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		   Thread.sleep(2000);
		  ce.celibiNewIconBtn.click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxbutAirlineSchedule")).click();
		  Thread.sleep(2000);
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
		   driver.findElement(By.id("ctl00_cp_uxgrdAirlineSchedule_ctl03_fmslblEndDate")).click();
		   Thread.sleep(2000);
		 //  driver.close();
		   
		   }

		   }
		   driver.switchTo().window(parent);
		   Thread.sleep(3000);
		   driver.switchTo().frame(0);
		   Thread.sleep(2000);
		   driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxFlightNo")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxFlightNo")).sendKeys("8A7409");
		   Thread.sleep(2000);
		   driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxAircraftType$FMSReferenceDataSelected")).sendKeys("319");
		   Thread.sleep(2000);
		   driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxFromDate$txtDateField")).sendKeys("16/08/2023");
		   Thread.sleep(2000);
		   driver.findElement(By.name("ctl00$cp$tc$tp2$ctl00$uxToDate$txtDateField")).sendKeys("31/08/2023");
		   Thread.sleep(2000);
		   ce.celibiMasterMoreflightRoutingDetails.click();
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl02$uxOrigin$FMSAirportSelected")).sendKeys("AAA");
			  Thread.sleep(2000);
			//  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl02$uxDepartureDate$txtDateField")).sendKeys("16/07/2023");
			//  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl02$txtSTDDummy")).sendKeys("22");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl02$txtSTDDummyMin")).sendKeys("22");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl03$uxOrigin$FMSAirportSelected")).sendKeys("AAE");
			  Thread.sleep(2000);
			//  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl03$uxArrivalDate$txtDateField")).sendKeys("17/07/2023");
			//  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl03$txtSTADummy")).sendKeys("20");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$tc$tp3$ctl00$uxgrdRoutingDetails$ctl03$txtSTADummyMin")).sendKeys("20");
			  Thread.sleep(2000);
			  ce.celibiFLOPPYSAVEbtn.click();
			  Thread.sleep(5000);
	}



	

	@Then("To verify user is able to navigate to Airline ULD mapping screen in GHA application")
	public void to_verify_user_is_able_to_navigate_to_airline_uld_mapping_screen_in_gha_application() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiMasterMoreTab.click();
		  Thread.sleep(2000);
		  ce.celibiMasterMorAirlineUldMapping.click();
		  Thread.sleep(2000);
		  driver.switchTo().frame(0);
		   Thread.sleep(2000);
		   driver.findElement(By.name("ctl00$cp$uxULDOwner$FMSAirlineSelected")).sendKeys("4A");
		   Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$uxULDType$FMSReferenceDataSelected")).sendKeys("EET");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$uxtxtTareWt$Number")).sendKeys("229");
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$uxtxtMaxAllowed$Number")).sendKeys("2139");
			  Thread.sleep(2000);
			  ce.celibiFLOPPYSAVEbtn.click();
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$grdAirlineULD$ctl02$uxbtnEdit")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$uxtxtTareWt$Number")).clear();
			  Thread.sleep(1000);
			  driver.findElement(By.name("ctl00$cp$uxtxtTareWt$Number")).sendKeys("219");
			  Thread.sleep(2000);
			  ce.celibiFLOPPYSAVEbtn.click();
			  Thread.sleep(2000);
			  driver.findElement(By.name("ctl00$cp$grdAirlineULD$ctl02$uxbtnDelete")).click();
			  Thread.sleep(2000);
			 driver.switchTo().alert().accept();
			  Thread.sleep(2000);
			  
	}

	

	@Then("To verify user is able to navigate to screen-er master screen in GHA application")
	public void to_verify_user_is_able_to_navigate_to_screen_er_master_screen_in_gha_application() throws InterruptedException {
		ce.celibiUserNameInput.click();
		  ce.celibiUserNameInput.sendKeys("kale");
		  Thread.sleep(3000);
		  ce.celibiPasswordInput.click();
		  ce.celibiPasswordInput.sendKeys("Kale@123");
		  Thread.sleep(3000);
		  ce.celibiLoginBtn.click();
		  Thread.sleep(5000);
		  ce.celibiMasterTab.click();
		  Thread.sleep(3000);
		  ce.celibiMasterMoreTab.click();
		  Thread.sleep(2000);
		  ce.celibiMasterMoreScreenerMaster.click();
		  Thread.sleep(2000);
		  driver.switchTo().frame(0);
		   Thread.sleep(2000);
		  Select userdropdown = new Select(driver.findElement(By.name("ctl00$cp$uxGrdM$ctl12$uxFUserName$fmsGenericDropDownList")));
		  userdropdown.selectByVisibleText("MIKE");
		  Thread.sleep(2000);
		  driver.findElement(By.name("ctl00$cp$uxGrdM$ctl12$uxFtxtLicense")).click();
		  driver.findElement(By.name("ctl00$cp$uxGrdM$ctl12$uxFtxtLicense")).sendKeys("Lic9045");
		  driver.findElement(By.name("ctl00$cp$uxGrdM$ctl12$uxFdtExp$txtDateField")).sendKeys("30/07/2023");
		  Select RAdropdown = new Select(driver.findElement(By.name("ctl00$cp$uxGrdM$ctl12$uxFRAType$fmsGenericDropDownList")));
		  RAdropdown.selectByVisibleText("RA3");
		  Thread.sleep(2000);
		  driver.findElement(By.name("ctl00$cp$uxGrdM$ctl12$imgSave")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.name("ctl00$cp$uxGrdM$ctl02$imgEdit")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.name("ctl00$cp$uxGrdM$ctl02$uxEdtExp$txtDateField")).clear();
		  Thread.sleep(2000);
		  driver.findElement(By.name("ctl00$cp$uxGrdM$ctl02$uxEdtExp$txtDateField")).sendKeys("31/08/2023");
		  Thread.sleep(2000);
		  driver.findElement(By.name("ctl00$cp$uxGrdM$ctl02$imgUpdate")).click();
		  Thread.sleep(5000);
		  
	}






























}
