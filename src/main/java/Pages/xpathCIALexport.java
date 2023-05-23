package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class xpathCIALexport extends Pages.BasePage {

	public xpathCIALexport(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "4")
	public WebElement cialExportTab;

	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[1]/ul/li[2]/a/span")
	public WebElement cialVCTgenerationTab;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_uxAWBNo']")
	public WebElement cialAWBnumberField;
	
	@FindBy(xpath = "//input[@name='ctl00$cp$uxgrdAWBContents$ctl02$uxNPX']")
	public WebElement cialAWNnpx;
	
	@FindBy(xpath = "//input[@name='ctl00$cp$uxgrdAWBContents$ctl02$uxExpWt$Number']")
	public WebElement cial_AWBwt;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_uxNatureOfGoods']")
	public WebElement cial_natureofGoods;
	
	@FindBy(xpath = "//input[@name='ctl00$cp$uxgrdAWBContents$ctl02$uxOrg$FMSAirportSelected']")
	public WebElement cial_originAirport;
	
	@FindBy(xpath = "//input[@name='ctl00$cp$uxgrdAWBContents$ctl02$uxDest$FMSAirportSelected']")
	public WebElement cial_destinationAirport;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_uxAgent_showpopup']")
	public WebElement cial_agentSearch;
	
	@FindBy(xpath = "//input[@name='ctl00$cp$FMSVehicleNo']")
	public WebElement cial_vehicleNumber;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxDriverName']")
	public WebElement cial_driverName;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxBtnSave']")
	public WebElement cial_saveButton;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_gCTN_showpopup']")
	public WebElement cialcommoditysearch;
	
	@FindBy(xpath = "/html/body/form/div[3]/fieldset/fieldset/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[2]/td[1]")
	public WebElement cialgenral;
	
	
	
	@FindBy(xpath = "//*[@id='ctl00_cp_bntclose']")
	public WebElement cialclosebuttoncommodity;
	
	@FindBy(xpath = "/html/body/form/div[3]/fieldset/fieldset/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[2]/td[3]")
	public WebElement cialAUtopartstxt;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_imgMultiSHC']")
	public WebElement cialSHC;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxMultiSHC1_FMSReferenceDataSelected']")
	public WebElement cialSHCbox1;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnOk']")
	public WebElement cialSHCboxCloseBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl08_fmslblName']")
	public WebElement cialagentName;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_uxHAWBNo']")
	public WebElement cialHouseNUMBER;
	
	@FindBy(xpath = "//*[@id='rdCopy']")
	public WebElement cialCOPYBTNconsole;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_imgAdd']")
	public WebElement cialplusbtnConsole;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_uxShipPcs']")
	public WebElement cialshipNPX;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_uxShipWt_Number']")
	public WebElement cialshipweight;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxHAWBNo']")
	public WebElement cial2ndhousebox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxShipPcs']")
	public WebElement cial2ndshipNPX;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxShipWt_Number']")
	public WebElement cial2ndshipwt;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxNatureOfGoods']")
	public WebElement cial2nsgoodsnature;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_gCTN_showpopup']")
	public WebElement cial2ndcommoditysearch;
	
	@FindBy(xpath = "/html/body/form/div[3]/fieldset/fieldset/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[5]/td[3]")
	public WebElement cial2ndgoodsslect;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_imgMultiSHC']")
	public WebElement cial2ndSHCsearch;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxMultiSHC1_FMSReferenceDataSelected']")
	public WebElement cial2ndserchbarforSHC;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnOk']")
	public WebElement cialSHCokBTN;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_imgPrintLbl']")
	public WebElement cialprintbutn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_rtba4']")
	public WebElement ciala4sheetPrintbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxPrint']")
	public WebElement cialfinalPrintBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdVCTList_ctl06_lnkVCTNo']")
	public WebElement cialshipmentselctlast;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxVCTNo']")
	public WebElement cialVCTnumberbox;
	
	
	@FindBy(xpath = "//*[@id='ctl00_Toolbar2_btnSearchNew']")
	public WebElement cialvctSEARCHicon;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_imgDel']")
	public WebElement cialdeleteicon;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_chkSecured']")
	public WebElement cialsecuritysatus;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[1]/ul/li[3]/a/span")
	public WebElement CialVCTacceptanceTab;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_txtVCTNo']")
	public WebElement cialVCTnumbersearchBox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxbtnSearch']")
	public WebElement cialVCTtabSearchbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGateDate_txtDateField']")
	public WebElement cialAcceptanceGateInDate;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGateSTDT_uxTime']")
	public WebElement cialAcceptanceGateInTime;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxbtnGateIn']")
	public WebElement cialGateInBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_ddlDoor']")
	public WebElement cialDookDoordropdown;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxbtnDockIn']")
	public WebElement cialDockInBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdVCTShipments_ctl03_uxSelect']")
	public WebElement cialAWBacceptanceH1selectbox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtGroupId']")
	public WebElement cialgroupid;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtReceivedPkg']")
	public WebElement cialremainingNPX;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_rptPopVol_ctl01_txtNOP']")
	public WebElement cialNOPbox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_rptPopVol_ctl01_txtLength']")
	public WebElement ciallengthbox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_rptPopVol_ctl01_txtWidth']")
	public WebElement cialwidth;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_rptPopVol_ctl01_txtHeight']")
	public WebElement cialheight;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxbtnClear']")
	public WebElement cialAcceptnaceclearbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxbtnSubmit']")
	public WebElement cialacceptanceSubmitBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxDockOutDate_txtDateField']")
	public WebElement cialdockOutDate;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxDockOutSTDT_uxTime']")
	public WebElement cialDockOutTime;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxbtnDockOut']")
	public WebElement cialdockOutBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGateOutDate_txtDateField']")
	public WebElement cialGateOutDate;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGateOutSTDT_uxTime']")
	public WebElement cialGateOutTime;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxbtnGateOut']")
	public WebElement cialGateOutBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[1]/ul/li[4]/a/span")
	public WebElement cialsecurityAcceptance;
	
	@FindBy(xpath = "")
	public WebElement cial896;
	
	@FindBy(xpath = "")
	public WebElement cial6756;
	
	@FindBy(xpath = "")
	public WebElement cial4;
	
	@FindBy(xpath = "")
	public WebElement cial3;
	
	@FindBy(xpath = "")
	public WebElement cial2;
	
	
	
	@FindBy(xpath = "")
	public WebElement cial1;
	
	

}
