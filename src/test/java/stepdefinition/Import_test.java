package stepdefinition;
import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Given;
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
public class Import_test {
	
	@Then("Cial Import flow")
	public void cial_import_flow() throws InterruptedException {
		 ce.cialIMPORTtab.click();
		    Thread.sleep(3000);
		   
		   ce.cialIMPORTimportmanifest.click();
		    Thread.sleep(3000);
		   
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   
			   ce.cialIMPORTflightsearchICON.click();
			// It will return the parent window name as a String
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
			   Thread.sleep(4000);
			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialIMPORTflightselect1.click();
			//   ce.cialIMPORTflightselect2.click();
			 //  ce.cialIMPORTmanifest3rdFlightSElect.click();
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
			   ce.cialIMPORT_ULDnumber.sendKeys("38975");
			   Thread.sleep(2000);
			   ce.cialIMPORT_carriershort.sendKeys("BA");
			   Thread.sleep(2000);
			   ce.cialIMPORT_carriershort.sendKeys(Keys.ARROW_DOWN);;
			   ce.cialIMPORT_carriershort.sendKeys(Keys.ENTER);;
			   Thread.sleep(3000);
			   ce.cialIMPORTadduldbtn.click();
			   Thread.sleep(3000);
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
			   
			   ce.cialIMPORTaddedULDawbNUM.sendKeys("26062013");
			   Thread.sleep(2000);
			   ce.cialIMPORTaddedULDdestination.click();
			   ce.cialIMPORTaddedULDdestination.sendKeys("DXB");
			   Thread.sleep(2000);
			   ce.cialIMPORTconsoleTIK.click();
			   Thread.sleep(2000);
			   ce.cialIMPORTaddedULDnatureofGOODS.click();
			   ce.cialIMPORTaddedULDnatureofGOODS.sendKeys("CONSOLIDATION");
			   Thread.sleep(2000);
			   ce.cialIMPORTaddedULDnpx.click();
			   ce.cialIMPORTaddedULDnpx.sendKeys("45");
			   Thread.sleep(2000);
			   ce.cialIMPORTaddedUldnpxwt.click();
			   ce.cialIMPORTaddedUldnpxwt.sendKeys("4500");
			   Thread.sleep(2000);
			   ce.cialIMPORTaddedULDchargebleWT.click();
			   ce.cialIMPORTaddedULDchargebleWT.sendKeys("6000");
			   Thread.sleep(2000);
			   ce.cialIMPORTaddedULDconsignee.click();
			   Thread.sleep(2000);
			   ce.cialIMPORTaddedULDconsignee.sendKeys("FLY DUBAI[71]");
			   ce.cialIMPORTaddedULDconsignee.sendKeys(Keys.ARROW_DOWN);;
			   ce.cialIMPORTaddedULDconsignee.sendKeys(Keys.ENTER);;
			   Thread.sleep(2000);
			   ce.cialIMPORTaddbtn.click();
			   Thread.sleep(2000);
			   ce.cialIMPORT2ndprefix.click();
			   ce.cialIMPORT2ndprefix.sendKeys("125");
			   Thread.sleep(2000);
			   ce.cialIMPORT2ndAWBnum.click();
			   ce.cialIMPORT2ndAWBnum.sendKeys("26062024");
			   Thread.sleep(2000);
			   ce.cialIMPORT2ndORIGIN.click();
			   ce.cialIMPORT2ndORIGIN.sendKeys("DXB");
			   Thread.sleep(2000);
			   ce.cialIMPORT2ndcommodity.click();
			   ce.cialIMPORT2ndcommodity.sendKeys("145");
			   ce.cialIMPORT2ndcommodity.sendKeys(Keys.ARROW_DOWN);;
			   ce.cialIMPORT2ndcommodity.sendKeys(Keys.ENTER);;
			   Thread.sleep(2000);
			   ce.cialIMPORT2ndNATUREofGOODS.click();
			   ce.cialIMPORT2ndNATUREofGOODS.sendKeys("CLOTHES ");
			   Thread.sleep(2000);
			   ce.cialIMPORT2ndNPX.click();
			   ce.cialIMPORT2ndNPX.sendKeys("34");
			   Thread.sleep(2000);
			   ce.cialIMPORT2ndNPXwt.click();
			   ce.cialIMPORT2ndNPXwt.sendKeys("3400");
			   Thread.sleep(2000);
			   ce.cialIMPORT2ndCHARGEBLEwt.sendKeys("3400");
			   Thread.sleep(2000);
			   ce.cialIMPORT2ndconsignee.sendKeys("Balkan Cargo[72]");
			   ce.cialIMPORT2ndconsignee.sendKeys(Keys.ARROW_DOWN);;
			   ce.cialIMPORT2ndconsignee.sendKeys(Keys.ENTER);;
			 //  driver.close();
			   Thread.sleep(3000);
			   ce.cialIMPORTAddedULDsavecloseBtn.click();
			   Thread.sleep(2000);
			   driver.switchTo().alert().accept(); 
			   Thread.sleep(3000);
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent2);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			  
			   ce.cialIMPORTsearchBTN.click();
			   Thread.sleep(10000);
			   ce.cialIMPORTcoustomerRefNum.click();
			   Thread.sleep(2000);
			   ce.cialIMPORTcoustomerRefNum.sendKeys("8929340");
			   Thread.sleep(2000);
			   ce.cialIMPORTataDATE.click();
			   Thread.sleep(2000);
			   ce.cialIMPORTataDATE.sendKeys("26/06/2023");
			   Thread.sleep(2000);
			   ce.cialIMPORTtime.sendKeys("0910");
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
			  
			   ce.cialIMPORT_M_hyperlink.click();
			   Thread.sleep(5000);
			   String parent3=driver.getWindowHandle();

			   Set<String>s3=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I3= s3.iterator();

			   while(I3.hasNext())
			   {

			   String child_window=I3.next();


			   if(!parent3.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialIMPORTslect_M_TOenterHAWBnum.click();
			   Thread.sleep(1000);
			   ce.cialIMPORTslect_M_TOenterHAWBnum.sendKeys("H1");
			   Thread.sleep(2000);
			   ce.cialIMPORTslect_M_TOenterOrigin.click();
			   ce.cialIMPORTslect_M_TOenterOrigin.sendKeys("DXB");
			   Thread.sleep(2000);
			   ce.cialIMPORTslect_M_TOenterCommodity.click();
			   ce.cialIMPORTslect_M_TOenterCommodity.sendKeys("142");
			   Thread.sleep(1000);
			   ce.cialIMPORTslect_M_TOenterNatureofgoods.click();
			   ce.cialIMPORTslect_M_TOenterNatureofgoods.sendKeys("FERTILIZER");
			   Thread.sleep(1000);
			   ce.cialIMPORTnpxTOEnter.click();
			   ce.cialIMPORTnpxTOEnter.sendKeys("20");
			   Thread.sleep(1000);
			   ce.cialIMPORTestWTToenter.click();
			   ce.cialIMPORTestWTToenter.sendKeys("2000");
			   Thread.sleep(1000);
			   ce.cialIMPORTNPXtoenter.click();
			   ce.cialIMPORTNPXtoenter.sendKeys("");
			   Thread.sleep(1000);
			   ce.cialIMPORTWTrecorded.click();
			   ce.cialIMPORTWTrecorded.sendKeys("");
			   Thread.sleep(1000);
			   ce.cialIMPORThouseNPX.click();
			   ce.cialIMPORThouseNPX.sendKeys("");
			   Thread.sleep(1000);
			   ce.cialIMPORThouseWT.click();
			   ce.cialIMPORThouseWT.sendKeys("");
			   Thread.sleep(1000);
			   ce.cialIMPORTchargebleWT.click();
			   ce.cialIMPORTchargebleWT.sendKeys("2000");
			   Thread.sleep(1000);
			   ce.cialIMPORTconsigneename.click();
			   ce.cialIMPORTconsigneename.sendKeys("AL HILAL[69]");
			   Thread.sleep(1000);
			   ce.cialIMPORTaddrowplusbtn.click();
			   Thread.sleep(1000);
			   ce.cialIMPORT2ndHousenumber.click();
			   ce.cialIMPORT2ndHousenumber.sendKeys("H2");
			   Thread.sleep(1000);
			   ce.cialIMPORTtoenter2ndORIGIN.click();
			   ce.cialIMPORTtoenter2ndORIGIN.sendKeys("DXB");
			   Thread.sleep(1000);
			   ce.cialIMPORT2ndDestinationToEnter.click();
			   ce.cialIMPORT2ndDestinationToEnter.sendKeys("KIX");
			   Thread.sleep(1000);
			   ce.cialIMPORTtoenterCommodity.click();
			   ce.cialIMPORTtoenterCommodity.sendKeys("474");
			   Thread.sleep(1000);
			   ce.cialIMPORTtoenter2ndGoodsnature.click();
			   ce.cialIMPORTtoenter2ndGoodsnature.sendKeys("ADDITIVE ");
			   Thread.sleep(1000);
			   ce.cialIMPORTtoENTER2ndNPX.click();
			   ce.cialIMPORTtoENTER2ndNPX.sendKeys("25");
			   Thread.sleep(1000);
			   ce.cialIMPORTtoENTER2ndNPXWT.click();
			   ce.cialIMPORTtoENTER2ndNPXWT.sendKeys("2500");
			   Thread.sleep(1000);
			   ce.cialIMPORTtoEnter2ndNPR.click();
			   ce.cialIMPORTtoEnter2ndNPR.sendKeys("");
			   Thread.sleep(1000);
			   ce.cialIMPORTtoEnter2ndrecordWT.click();
			   ce.cialIMPORTtoEnter2ndrecordWT.sendKeys("");
			   Thread.sleep(1000);
			   ce.cialIMPORTtoenter2NDhouseNPX.click();
			   ce.cialIMPORTtoenter2NDhouseNPX.sendKeys("");
			   Thread.sleep(1000);
			   ce.cialIMPORTtoenter2ndHOUSEwt.click();
			   ce.cialIMPORTtoenter2ndHOUSEwt.sendKeys("");
			   Thread.sleep(1000);
			   ce.cialIMPORT2ndtoenterChargebleWT.click();
			   ce.cialIMPORT2ndtoenterChargebleWT.sendKeys("2500");
			   Thread.sleep(1000);
			   ce.cialIMPORT2NDtoenterCONSIGNEE.click();
			   ce.cialIMPORT2NDtoenterCONSIGNEE.sendKeys("PRIMESPEED[73]");
			   Thread.sleep(3000);
			   ce.cialIMPORTenterMsaveClose.click();
			   Thread.sleep(1000);
			   driver.switchTo().alert().accept(); 
			   Thread.sleep(5000);
			   
			   
			   
			
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent3);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(3000);
			   ce.cialIMPORTdirectshipmentselecTIK.click();
			   Thread.sleep(3000);
			   ce.cialIMPORTDiscrepancyBTN.click();
			   Thread.sleep(5000);
			   String parent4=driver.getWindowHandle();

			   Set<String>s4=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I4= s4.iterator();

			   while(I4.hasNext())
			   {

			   String child_window=I4.next();


			   if(!parent4.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialIMPORThouseDiscrepancyDirectShipmentNPR.click();
			   ce.cialIMPORThouseDiscrepancyDirectShipmentNPR.clear();
			   Thread.sleep(1000);
			   ce.cialIMPORThouseDiscrepancyDirectShipmentNPR.sendKeys("40");
			   Thread.sleep(2000);
			   ce.cialIMPORThouseDiscrepancyDirectShipmentWTrecd.click();
			   ce.cialIMPORThouseDiscrepancyDirectShipmentWTrecd.clear();
			   Thread.sleep(1000);
			   ce.cialIMPORThouseDiscrepancyDirectShipmentWTrecd.sendKeys("4000");
			   Thread.sleep(2000);
			   ce.cialIMPORThouseDiscrepancyDirectShipmentSaveBtn.click();
			   Thread.sleep(2000);
			   driver.switchTo().alert().accept(); 
			   Thread.sleep(5000);
			
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent4);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   
			   Thread.sleep(5000);
			   
			   Thread.sleep(3000);
			   ce.cialIMPORTdirectshipmentselecTIK.click();
			   Thread.sleep(3000);
			  ce.cialIMPORTdamageBtn.click();
			  Thread.sleep(5000);
			  String parent5=driver.getWindowHandle();

			   Set<String>s5=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I5= s5.iterator();

			   while(I5.hasNext())
			   {

			   String child_window=I5.next();


			   if(!parent5.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialIMPORTdamagePICES.click();
			   ce.cialIMPORTdamagePICES.clear();
			   Thread.sleep(1000);
			   ce.cialIMPORTdamagePICES.sendKeys("4");
			   Thread.sleep(2000);
			   ce.cialIMPORTdamageWT.click();
			   ce.cialIMPORTdamageWT.clear();
			   Thread.sleep(1000);
			   ce.cialIMPORTdamageWT.sendKeys("400");
			   Thread.sleep(2000);
			   ce.cialIMPORTasPerDocumentWT.click();
			  // ce.cialIMPORTasPerDocumentWT.clear();
			   Thread.sleep(1000);
			   ce.cialIMPORTasPerDocumentWT.sendKeys("3400");
			   Thread.sleep(2000);
			   ce.cialIMPORTasPerActuakWT.click();
			   ce.cialIMPORTasPerActuakWT.sendKeys("400");
			   Thread.sleep(2000);
			ce.cialIMPORTdamageTIK1.click();
			Thread.sleep(1000);
			ce.cialIMPORTdamageTIK2.click();
			Thread.sleep(1000);
			ce.cialIMPORTdamageTIK3.click();
			Thread.sleep(1000);
			ce.cialIMPORTdamageTIK4.click();
			Thread.sleep(2000);
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 WebElement flag1= driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/fieldset/fieldset/table[3]/tbody/tr[9]/td[2]"));
			 js1.executeScript("arguments[0].scrollIntoView();",flag1);
			 Thread.sleep(5000);
			 ce.cialIMPORTscroolRemark1Field.click();
			 ce.cialIMPORTscroolRemark1Field.sendKeys("4 pices are damage");
			 Thread.sleep(2000);
			 
			 JavascriptExecutor js2 = (JavascriptExecutor) driver;
			 WebElement flag2= driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/fieldset/fieldset/table[3]/tbody/tr[10]/td/table/tbody/tr[2]/td"));
			 js2.executeScript("arguments[0].scrollIntoView();",flag2);
			 Thread.sleep(5000);
			 
			 ce.cialIMPORTscroolRemark2Field.click();
			 ce.cialIMPORTscroolRemark2Field.sendKeys("4 pices are damage");
			 Thread.sleep(2000);
			 
			 ce.cialIMPORTGHArep.click();
			 ce.cialIMPORTGHArep.sendKeys("TESTING");
			 Thread.sleep(2000);
			  ce.cialIMPORTairlineREP.click();
			  ce.cialIMPORTairlineREP.sendKeys("BA");
			  Thread.sleep(2000);
			  ce.cialIMPORTsecurityREP.click();
			  ce.cialIMPORTsecurityREP.sendKeys("KALE");
			  Thread.sleep(2000);
			  
			  JavascriptExecutor js3 = (JavascriptExecutor) driver;
				 WebElement flag3= driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/fieldset/fieldset/table[4]/tbody/tr[2]/td"));
				 js3.executeScript("arguments[0].scrollIntoView();",flag3);
				 Thread.sleep(5000);
				 
				 ce.cialIMPORTdamageSAVEbtn.click();
				 Thread.sleep(2000);
				 driver.switchTo().alert().accept(); 
				   Thread.sleep(20000);
				   Thread.sleep(1000);
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent5);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			   Thread.sleep(2000);
			   
			   ce.cialIMPORTBreakdownBtn.click();
			   Thread.sleep(2000);
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
			   ce.cialIMPORTbreakdownDocumentReciveDate.sendKeys("26/06/2023");
			  
			   Thread.sleep(2000);
			   ce.cialIMPORTBreakdownTime.click();
			   ce.cialIMPORTBreakdownTime.sendKeys("1000");
			   Thread.sleep(2000);
			ce.cialIMPORTSavEBtnBreakdown.click();
			   Thread.sleep(2000);

			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent6);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			  Thread.sleep(2000);
			  
			  
			  ce.cialIMPORTdirectshipmentselecTIK.click();
			   Thread.sleep(3000);
			   ce.cialIMPORTrotationalNUMgeneTAB.click();
			   Thread.sleep(3000);
			   String parent7=driver.getWindowHandle();

			   Set<String>s7=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I7= s7.iterator();

			   while(I7.hasNext())
			   {

			   String child_window=I7.next();


			   if(!parent7.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialIMPORTRotationalnumGENERATEbtn.click();;
			   Thread.sleep(2000);
			 
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent7);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			  Thread.sleep(2000);
			  ce.cialIMPORTdirectshipmentselecTIK.click();
			  Thread.sleep(2000);
			   ce.cialIMPORTconsoleShipmentSelectTik.click();
			   Thread.sleep(3000);
			   ce.cialIMPORTrotationalNUMgeneTAB.click();
			   Thread.sleep(3000);
			   String parent8=driver.getWindowHandle();

			   Set<String>s8=driver.getWindowHandles();

			   // Now iterate using Iterator
			   Iterator<String> I8= s8.iterator();

			   while(I8.hasNext())
			   {

			   String child_window=I8.next();


			   if(!parent8.equals(child_window))
			   {
			   driver.switchTo().window(child_window);

			   System.out.println(driver.switchTo().window(child_window));
			   ce.cialIMPORTRotationalnumGENERATEbtn.click();;
			   Thread.sleep(2000);
			 
			   
			   }

			   }
			   //switch to the parent window
			  driver.switchTo().window(parent8);
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
			  Thread.sleep(5000);
			  ce.cialIMPORTfinalizeBtn.click();
			  Thread.sleep(10000);
			  ce.cialIMPORTfinalizeOKpopBTN.click();
			  Thread.sleep(2000);
			  driver.switchTo().window(parent8);
			   
			   ce.cialIMPORTWAREHOUSElocation.click();
			   Thread.sleep(3000);
			   driver.switchTo().frame(0);
				  Thread.sleep(5000);
				  ce.cialIMPORTwarehouseAWBprefix.click();
				  ce.cialIMPORTwarehouseAWBprefix.sendKeys("125");
				  Thread.sleep(2000);
				  ce.cialIMPORTwarehouseAWBnum.click();
				  ce.cialIMPORTwarehouseAWBnum.sendKeys("26062013");
				  Thread.sleep(2000);
				  ce.cialIMPORTwarehousenumber.click();
				  ce.cialIMPORTwarehousenumber.sendKeys("H1");
				  Thread.sleep(2000);
				  ce.cialIMPORTwarehouseSEARCHbtn.click();
				  Thread.sleep(3000);
				  ce.cialIMPORTwarehouseGroupID.click();
				  ce.cialIMPORTwarehouseGroupID.sendKeys("302001654");
				  Thread.sleep(2000);
				  ce.cialIMPORTwarehouseLOcation.sendKeys("EH001");
				 
				  Thread.sleep(2000);
				  JavascriptExecutor js4 = (JavascriptExecutor) driver;
					 WebElement flag4= driver.findElement(By.name("ctl00$cp$btnLocSave"));
					 js4.executeScript("arguments[0].scrollIntoView();",flag4);  
				
					 Thread.sleep(5000);
					 ce.cialIMPORTwarehouselocationSAVEbtn.click();
					 Thread.sleep(5000);
					 
					 driver.switchTo().window(parent8);
					   Thread.sleep(3000);
					   
					   ce.cialIMPORTAWBdetailsTab.click();
					   Thread.sleep(3000);
					   driver.switchTo().frame(0);
						  Thread.sleep(5000);
						  ce.cialIMPORTawbDEtailsPrefix.click();
						  Thread.sleep(1000);
						  ce.cialIMPORTawbDEtailsPrefix.sendKeys("125");
						  ce.cialIMPORTawbDEtailsPrefix.clear();
						  ce.cialIMPORTawbDEtailsPrefix.sendKeys("125");
						  Thread.sleep(2000);
						  ce.cialIMPORTawbDETAILSawbnum.click();
						  Thread.sleep(1000);
						  ce.cialIMPORTawbDETAILSawbnum.sendKeys("26062013");
						  ce.cialIMPORTawbDETAILSawbnum.clear();
						  ce.cialIMPORTawbDETAILSawbnum.sendKeys("26062013");
						  Thread.sleep(2000);
						  ce.cialIMPORTawbDETAILShawbNUM.click();
						  Thread.sleep(1000);
						  ce.cialIMPORTawbDETAILShawbNUM.sendKeys("H1");
						  ce.cialIMPORTawbDETAILShawbNUM.clear();
						  ce.cialIMPORTawbDETAILShawbNUM.sendKeys("H1");
						  Thread.sleep(2000);
						  ce.cialIMPORTawbDETAILShawbNUM.sendKeys(Keys.ENTER);
						  Thread.sleep(10000);
						  
						  driver.switchTo().window(parent8);
						   Thread.sleep(3000);
						   
						   ce.cialIMPORTAOAtab.click();
						   Thread.sleep(3000);
						   driver.switchTo().frame(0);
							  Thread.sleep(5000);
							  ce.cialIMPORTAOAflightserachICON.click();
							  Thread.sleep(5000);
							  String parent9=driver.getWindowHandle();

							   Set<String>s9=driver.getWindowHandles();

							   // Now iterate using Iterator
							   Iterator<String> I9= s9.iterator();

							   while(I9.hasNext())
							   {

							   String child_window=I9.next();


							   if(!parent9.equals(child_window))
							   {
							   driver.switchTo().window(child_window);

							   System.out.println(driver.switchTo().window(child_window));
							   ce.cialIMPORTAOAflightSELECT.click();
							//   ce.cialIMPORTAOA2ndFlightSelect.click();
							//   ce.cialIMPORTAOA3RDFLIGHTselect.click();
							   Thread.sleep(2000);
							 
							   
							   }

							   }
							   
							   //switch to the parent window
							  driver.switchTo().window(parent9);
							   Thread.sleep(3000);
							   driver.switchTo().frame(0);
							   Thread.sleep(5000);
							   Thread.sleep(5000);
							  ce.cialIMPORTAOAselectSHIPMENTforEMAIL.click();
							  Thread.sleep(3000);
							   Select NotificationTypeDown = new Select(driver.findElement(By.name("ctl00$cp$uxtypenotice$fmsGenericDropDownList")));
							   NotificationTypeDown.selectByVisibleText("NOA");
							   Thread.sleep(3000);
							   
							   Select MeansOFnotificationDown = new Select(driver.findElement(By.name("ctl00$cp$uxMeansOfNotification$fmsGenericDropDownList")));
							   MeansOFnotificationDown.selectByVisibleText("E-MAIL/SMS");
							   Thread.sleep(3000);
							   ce.cialIMPORTAOAselectSHIPMENTforEMAIL.click();
							   Thread.sleep(3000);
							   ce.cialIMPORTaoaNOTIFYbtn.click();
							   Thread.sleep(3000);
							   String parent10=driver.getWindowHandle();

							   Set<String>s10=driver.getWindowHandles();

							   // Now iterate using Iterator
							   Iterator<String> I10= s10.iterator();

							   while(I10.hasNext())
							   {

							   String child_window=I10.next();


							   if(!parent10.equals(child_window))
							   {
							   driver.switchTo().window(child_window);
							   Select DoordrpDown = new Select(driver.findElement(By.name("ctl00$cp$grdNotificationAddress$ctl02$uxddlRefrence")));
							   DoordrpDown.selectByVisibleText("To");
							   Thread.sleep(3000);
							 ce.cialIMPORTAOAemailADDRESS.click();
							 ce.cialIMPORTAOAemailADDRESS.sendKeys("Gaurav.Abhishek@kalelogistics.com");
							 Thread.sleep(3000);
							 ce.cialIMPORTAOAemailsubmitBTN.click();
							// Thread.sleep(3000);
							// driver.switchTo().alert().accept(); 
							 Thread.sleep(10000);
							   }

							   }
							   
							   //switch to the parent window
							  driver.switchTo().window(parent10);
							   Thread.sleep(3000);
							   
							   ce.cialIMPORTwarehousedeliveryOder.click();
							   driver.switchTo().frame(0);
							   Thread.sleep(5000);
							ce.cialIMPORTwarehousedeleveryoderAWBprefix.click();
							ce.cialIMPORTwarehousedeleveryoderAWBprefix.sendKeys("125");
							Thread.sleep(2000);
							ce.cialIMPORTwarehousedeliveryoderAWBNUM.click();
							ce.cialIMPORTwarehousedeliveryoderAWBNUM.sendKeys("26062013");
							Thread.sleep(2000);
							ce.cialIMPORTwarehousedelieryHAWBno.click();
							ce.cialIMPORTwarehousedelieryHAWBno.sendKeys("H1");
							Thread.sleep(2000);
							ce.cialIMPORTwarehousedeliverySERACHbtn.click();
							Thread.sleep(5000);
							ce.cialIMPORTWAREhouseDELIVERYoderDSELECT1ST.click();
							Thread.sleep(2000);
							ce.cialIMPORTwarehouseDELIVERYselectCOUSTOMSno.click();
							ce.cialIMPORTwarehouseDELIVERYselectCOUSTOMSno.sendKeys("1099453");
							Thread.sleep(2000);
							ce.cialIMPORTgenerateWDObtndelivery.click();
							Thread.sleep(2000);
							ce.cialIMPORTprintWDObtnDELIVERY.click();
							Thread.sleep(2000);
							String parent11=driver.getWindowHandle();

							   Set<String>s11=driver.getWindowHandles();

							   // Now iterate using Iterator
							   Iterator<String> I11= s11.iterator();

							   while(I11.hasNext())
							   {

							   String child_window=I11.next();


							   if(!parent11.equals(child_window))
							   {
							   driver.switchTo().window(child_window);

							   System.out.println(driver.switchTo().window(child_window));
							  
							   Thread.sleep(20000);
							   Thread.sleep(5000);
							   
							   }

							   }
							   
							   //switch to the parent window
							  driver.switchTo().window(parent11);
							   Thread.sleep(5000);
							   driver.switchTo().frame(0);
							   Thread.sleep(5000);
							   
							ce.cialIMPORTrealeasedBTNdelivery.click();
							Thread.sleep(10000);
							
							   
							   
	}



	




}
