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
	
	@FindBy(xpath = "//*[@ID='ctl00_cp_uxgrdAWBContents_ctl02_uxAgent_showpopup']")
	public WebElement cial_agentSearch;
	
	@FindBy(xpath = "//input[@name='ctl00$cp$FMSVehicleNo']")
	public WebElement cial_vehicleNumber;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxDriverName']")
	public WebElement cial_driverName;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxBtnSave']")
	public WebElement cial_saveButton;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl02_gCTN_showpopup']")
	public WebElement cialcommoditysearch;
	
	@FindBy(xpath = "//*[text()='GENERAL CARGO']")
	public WebElement cialfertilizer;
	
	
	
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
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl03_fmslblNumber']")
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
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdVCTShipments_ctl04_uxSelect']")
	public WebElement cialAWBacceptanceH2selectbox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtGroupId']")
	public WebElement cialgroupid;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtGroupId']")
	public WebElement cialgroupidH2;
	
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
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[1]/ul/li[5]/a/span")
	public WebElement cialAWB_DetailsTab;
	
	@FindBy(xpath = "/html/body/form/div[6]/fieldset/div/div[1]/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/div/table/tbody/tr[2]/td[1]/input")
	public WebElement cialawbdeatilsAWB;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp1_ctl00_grdEcsd_ctl01_txtFilter0']")
	public WebElement cialunsecuredlistAirlinecode;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp1_ctl00_grdEcsd_ctl01_txtFilter1']")
	public WebElement cialunsecuredListAwbNumber;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxVCTNo']")
	public WebElement cialVCTgenerationVCTsearchbox;
	
	//76453694
	
	@FindBy(xpath = "//*[@id='ctl00_cp_txtRemark']")
	public WebElement cialdeleteRemarkcomment;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnSaveRemark']")
	public WebElement cialdeleteRemarkcommentOkBTN;
	
	@FindBy(xpath = "//*[@id='ctl00_Toolbar2_btnSave']")
	public WebElement cialVCTacceptanceSaveBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxRemarks_txtData']")
	public WebElement cialgenerationRemarkBox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_txtRemark']")
	public WebElement cialdeleteRemarkcomment33;

	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxAWBNo']")
	public WebElement cialVCTgeneration2ndAWBfield;
	
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxHAWBNo']")
	public WebElement cialVCTgeneration2ndHOUSEfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxNPX']")
	public WebElement cialVCTgeneration2ndAWBNPXfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxExpWt_Number']")
	public WebElement cialVCTgeneration2ndAWBwtfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxShipPcs']")
	public WebElement cialVCTgenration2ndshipNPXfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxShipWt_Number']")
	public WebElement cialVCTgeneration2ndSHIPwtfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxNatureOfGoods']")
	public WebElement cialVCTgeneration2ndNATUREOFGOODSfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_imgMultiSHC']")
	public WebElement cialVCTgenration2ndSHCbutton;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_gCTN_showpopup']")
	public WebElement cialCTgeneration2ndCOMMODITYbutton;
	
	@FindBy(xpath = "/html/body/form/div[3]/fieldset/fieldset/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[7]/td[3]")
	public WebElement cialVCTgeneration2ndcommodityselectbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxOrg_FMSAirportSelected']")
	public WebElement cialVCTgeneration2ndORIGINfield;

	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxDest_FMSAirportSelected']")
	public WebElement cialVCTgeneration2ndDESTINATIONfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_uxAgent_showpopup']")
	public WebElement cialVCTgeneration2ndAGENTSEARCHicon;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl05_fmslblName']")
	public WebElement cialVCT2ndAGENTNAMEselection;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxMultiSHC1_FMSReferenceDataSelected']")
	public WebElement cialVCTgeneration2ndSHCsearchbox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnOk']")
	public WebElement cialVCTgeneration2ndSHCpopupboxokbtn;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div[2]/div[2]/div[1]/fieldset/div[4]/table/tbody/tr/td/div/div/table/tbody/tr[3]/td[16]/input")
	public WebElement cialVCTgeneration2ndcopytikbox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl03_imgAdd']")
	public WebElement cialVCTgeneration2ndplusbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl04_uxHAWBNo']")
	public WebElement cialVCTgeneration3rdhouseno;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl04_uxShipPcs']")
	public WebElement cialVCTgeneration3rdshipNPX;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl04_uxShipWt_Number']")
	public WebElement cialVCTgeneration3rdshipweight;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl04_gCTN_showpopup']")
	public WebElement cialVCTgeneration3rdcommodity;
	
	@FindBy(xpath = "/html/body/form/div[3]/fieldset/fieldset/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[4]/td[3]")
	public WebElement cialVCTgeneration3rdcommodityselect;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxgrdAWBContents_ctl04_uxNatureOfGoods']")
	public WebElement cialVCTgeneration3rdgoodsnature;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxDate_txtDateField']")
	public WebElement cialVCTdockINdate;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxSTDT_uxTime']")
	public WebElement cialVCTdockINtime;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdVCTShipments_ctl02_uxSelect']")
	public WebElement cialacceptance1stAWBtikbox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtGroupId']")
	public WebElement cialVCTacceptacnce1stTIKgroupID;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtReceivedPkg']")
	public WebElement cialVCTacceptance1stTikNPXremaining;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_rptPopVol_ctl01_txtNOP']")
	public WebElement cialVCTacceptance1stTikNOP;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_rptPopVol_ctl01_txtLength']")
	public WebElement cialVCTacceptance1stTikLength;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_rptPopVol_ctl01_txtWidth']")
	public WebElement cialVCTacceptance1stTikwidth;

	@FindBy(xpath = "//*[@id='ctl00_cp_rptPopVol_ctl01_txtHeight']")
	public WebElement cialVCTacceptance1stTikHeight;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_rptPopVol_ctl01_txtVolume']")
	public WebElement cialVCTaccptanceVolumebox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdVCTShipments_ctl04_uxSelect']")
	public WebElement cialVCTacceptanceHH1tikbox;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdVCTShipments_ctl05_uxSelect']")
	public WebElement cialVCTacceptanceHH2tikbox;
	
	@FindBy(xpath = "//*[@id='968']")
	public WebElement cialSecurityAceeptanceTab;
	
	@FindBy(xpath = "//*[@id='__tab_ctl00_cp_tc_tp2']")
	public WebElement cialsecurityacceptancedetailsbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxAWBS_FMSAWBPrefixSelected']")
	public WebElement cialsecurityacceptanceairlineprifixfiled;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxAWBS_FMSAWBNoSelected']")
	public WebElement cialsecurityacceptanceAWBnumfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxAWBS_FMSHAWNoSelected']")
	public WebElement cialsecurityacceptanceHousenum;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxSearch']")
	public WebElement cialsecurityAcceptanceDeatilssearchbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxddlMachine_fmsGenericDropDownList']")
	public WebElement cialsecurityacceptancemachinedropdow;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_txtStStart']")
	public WebElement  cialsecurityacceptancstickerstrtnumber;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_txtStEnd']")
	public WebElement  cialsecurityacceptancstickerEndnumber;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_repScreeningmethod_ctl01_uxchkboxScreeningMethod']")
	public WebElement  cialsecurityacceptancscreeningmethod1sttik;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_repScreeningmethod_ctl01_uxtxtPCS']")
	public WebElement  cialsecurityacceptancscreeningmethod1sttikpices;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_repScreeningmethod_ctl02_uxchkboxScreeningMethod']")
	public WebElement  cialsecurityacceptancscreeningmethod2ndtik;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_repScreeningmethod_ctl02_uxtxtPCS']")
	public WebElement  cialsecurityacceptancscreeningmethod2ndtikpices;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxrblistSecurityType_1']")
	public WebElement  cialsecurityacceptancsecuritytypeUnknownCargo;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxSave']")
	public WebElement  cialsecurityacceptancsaveBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxSubmit']")
	public WebElement  cialsecurityacceptancfinalsubmitBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtAgentName']")
	public WebElement  cialsecurityacceptancagentname;
	
	@FindBy(xpath = "//*[@id='__tab_ctl00_cp_tc_tp1']")
	public WebElement  cialsecurityacceptancunsecuredlistbtn;
	
	@FindBy(xpath = "//*[@id='uxAWB_FMSAWBNoSelected']")
	public WebElement  cialAWBdetailsawbentryfield;
	
	@FindBy(xpath = "//*[@id='uxPopShipper']")
	public WebElement  cialAWBdetailsShippernameaddress;
	
	@FindBy(xpath = "//*[@id='uxPopConsignee']")
	public WebElement  cialAWBdetailsconsigneenameadress;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl03_fmslblName']")
	public WebElement  cialAWBdeatilsshipperselct;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl04_fmslblName']")
	public WebElement cialAWBdetailsconsineeselect;
	
	@FindBy(xpath = "//*[@id='txtFlightNo1']")
	public WebElement cialAWBdetailsflightnumfield;
	
	@FindBy(xpath = "//*[@id='FlightDate1']")
	public WebElement cialAWBdetailsflightdatefield;
	
	@FindBy(xpath = "//*[@id='repRCP_ctl00_uxChWt']")
	public WebElement cialAWBdetailschargebleweightfiled;
	
	@FindBy(xpath = "//*[@id='repRCP_ctl00_uxRate']")
	public WebElement cialAWBdetailsRatefiled;
	
	@FindBy(xpath = "/html/body/form/div[6]/fieldset/div/div[2]/table]")
	public WebElement cialAWBdetailsscrollingdown;
	
	@FindBy(xpath = "//*[@id='chkVerified']")
	public WebElement cialAWBdetailsverifiedTikBox;
	
	@FindBy(xpath = "//*[@id='btnClr']")
	public WebElement cialAWBdeatailsClearBtn;
	
	@FindBy(xpath = "//*[@id='247']")
	public WebElement cialWarehouseLocationTab;
	
	@FindBy(xpath = "//*[@id='lnkHAWB']")
	public WebElement cialAWBdetailsAIRwayBILL;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_chkVerified']")
	public WebElement cialAWBdetailsAIRwaypopverifired;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSAWBPrefixSelected']")
	public WebElement cialWarehouseLocationAWBprfixfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSAWBNoSelected']")
	public WebElement cialWarehouseLocationAWBnumfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSHAWNoSelected']")
	public WebElement cialWarehouseLocationHAWBnumfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnSearchShipments']")
	public WebElement cialWarehouseLocationSEARCHbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdSplitLoc_ctl02_uxtxtGroupId']")
	public WebElement cialWarehouseLocationGroupId;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdSplitLoc_ctl02_uxWHLoc_showpopup']")
	public WebElement cialWarehouseLocation_locationsearchicon;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdLocPopUp_ctl03_fmslblName']")
	public WebElement cialWarehouseLocation_selectlocation;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdLocPopUp_ctl04_fmslblName']")
	public WebElement cialWarehouseLocation_select2ndlocation;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdSplitLoc_ctl02_uxtxtNPR']")
	public WebElement cialWarehouseLocationNOPFIELD;
	
	
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnLocSave']")
	public WebElement cialWarehouseLocationSaveBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdSplitLoc_ctl02_uxtxtWtRec_Number']")
	public WebElement cialWarehouseLocationWeightfield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdLocHistory_ctl03_uxLMove']")
	public WebElement cialWarehouseLocationChangeLocationicon;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdLocPopUp_ctl08_fmslblName']")
	public WebElement cialWarehouseLocationselect3rdlocation;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[1]/ul/li[8]")
	public WebElement cialMoreTab;
	
	@FindBy(xpath = "//*[@id='246']")
	public WebElement cialmoreBuildManifestTab;
	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_uxFlightBox_showpopup']")
	public WebElement cialmoreBuildManifestflightsearchIcon;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl05_fmslblFlight']")
	public WebElement cialmoreBuildManifestflightSelect;
	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_uxULD_FMSULDType']")
	public WebElement cialmoreBuildManifestULDprefixfield;
	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_uxULD_FMSULDNumber']")
	public WebElement cialmoreBuildManifestULDnumfield;
	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_uxULD_FMSULDOwner']")
	public WebElement cialmoreBuildManifestflightname;
	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_btnULDSave']")
	public WebElement cialmoreBuildManifestADDULDbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_uxgrdMan_ctl03_uxSelect']")
	public WebElement cialmoreBuildManifestAddedeULDselect;
	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_uxAddShipment']")
	public WebElement cialmoreBuildManifestaddshipbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_uxgrdULDCont_ctl02_uxAwbNo']")
	public WebElement cialmoreBuildManifestawbnumclickdeatilsSHOW;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxVCTNo']")
	public WebElement cialVCTgeneratednumfiled;
	
	@FindBy(xpath = "//*[@id='uxCustomInformation']")
	public WebElement cialAWBdetailsCOUSTOMinfoBTN;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdHouseDetails_ctl02_uxSBNo']")
	public WebElement cialAWBdetailsCSBnum;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdHouseDetails_ctl02_uxSBDate_txtDateField']")
	public WebElement cialAWBdetaisCSBdate;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdHouseDetails_ctl02_uxPieces']")
	public WebElement cialAWBdetailsPicesesfiled;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdHouseDetails_ctl02_uxGrossweight']")
	public WebElement cialAWBdetailsGrossweight;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdHouseDetails_ctl02_uxFOB']")
	public WebElement cialAWBdetailsFOBvalue;
	
	@FindBy(xpath = "//*[@id='btnSaveData']")
	public WebElement cialAWBdetailscoustomsaveBTN;
	
	@FindBy(xpath = "//*[@id='btnSendCARR']")
	public WebElement cialAWBdetailsSendCarrBTN;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdHouseDetails_ctl02_uxLEONo']")
	public WebElement cialAWBfdetailsLeonumFiled;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdHouseDetails_ctl02_uxLEODate_txtDateField']")
	public WebElement cialAWBdeatailsLEOdate;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdHouseDetails_ctl02_uxLEOTime_uxTime']")
	public WebElement cialAWBdetailsLEOtime;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdHouseDetails_ctl02_uxChargwt']")
	public WebElement cialAWBdetailschargebleweight;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAddHAWB']")
	public WebElement cialAWBdetailssaveHAWB;
	
	@FindBy(xpath = "//*[@id='btnSaveAWB']")
	public WebElement cialAWBdetailsSAVEBUTTON;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[1]/ul/li[8]/ul/li[5]/a/span")
	public WebElement cialMoreExportcustomsactionTab;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSAWBPrefixSelected']")
	public WebElement cialexportcustomactionAWBprefix;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSAWBNoSelected']")
	public WebElement cialexportcustomactionAWBnum;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSHAWNoSelected']")
	public WebElement cialexportcustomactionHAWBnofield;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnSearchShipments']")
	public WebElement cialexportcustomactionSerchBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAddHAWB']")
	public WebElement cialAWBdetailssaveHAWB6;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAddHAWB']")
	public WebElement cialAWBdetailssaveHAWB8;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAddHAWB']")
	public WebElement cialAWBdetailssaveHAWB7;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAddHAWB']")
	public WebElement cialAWBdetailssaveHAWB9;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAddHAWB']")
	public WebElement cialAWBdetailssaveHAWB10;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAddHAWB']")
	public WebElement cialAWBdetailssaveHAWB11;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAddHAWB']")
	public WebElement cialAWBdetailssaveHAWB12;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAddHAWB']")
	public WebElement cialAWBdetailssaveHAWB13;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAddHAWB']")
	public WebElement cialAWBdetailssaveHAWB14;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAddHAWB']")
	public WebElement cialAWBdetailssaveHAWB15;

	@FindBy(xpath = "//*[@id='ctl00_cp_btnHold']")
	public WebElement cialexportCustomActionHoldBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_ChkMethod_1']")
	public WebElement cialexportHoldVerbalCheckboxTik;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_txtOrderNo']")
	public WebElement cialexportCustomActionOrderNumber;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_txtAuthorityName']")
	public WebElement cialexportCustomActionAuthorityName;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_txtAuthorityDetails_txtData']")
	public WebElement cialexportCustomActionAuthorityDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnHold']")
	public WebElement cialexportCustomActionFinalHoldBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_txtRemarks_txtData']")
	public WebElement cialexportcustomactionRemarkField;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdHoldDetails_ctl02_uxEdit']")
	public WebElement cialexportToUnholdEditBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnUnhold']")
	public WebElement cialexportUnholdBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdHoldDetails_ctl02_chkSelect']")
	public WebElement cialexportSelectShipment;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdLoc_ctl02_uxLocSelect']")
	public WebElement cialEXPORTLocationSelectSeize;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnSeizeSave']")
	public WebElement cialEXPORTSeizeBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdLoc_ctl02_uxClear']")
	public WebElement cialEXPORTUnSeizeBtn;
	
	//-----------------------------now downword IMPORT xpath is present----------------------
	
	
	@FindBy(xpath = "//*[@id='3']")
	public WebElement cialIMPORTtab;
	
	@FindBy(xpath = "//*[text()='Import Manifest']")
	public WebElement cialIMPORTimportmanifest;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxFlightBox_AirNo']")
	public WebElement cialIMPORTflightnumPREFIX;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxFlightBox_FltNo']")
	public WebElement cialIMPORTflightnum;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxFlightBox_showpopup']")
	public WebElement cialIMPORTflightsearchICON;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl02_fmslblFlight']")
	public WebElement cialIMPORTflightselect1;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl03_fmslblFlight']")
	public WebElement cialIMPORTflightselect2;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxULD_FMSULDType']")
	public WebElement cialIMPORTuldTYPE;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxULD_FMSULDNumber']")
	public WebElement cialIMPORT_ULDnumber;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxULD_FMSULDOwner']")
	public WebElement cialIMPORT_carriershort;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxULDCreate']")
	public WebElement cialIMPORTadduldbtn;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div[4]/div/div/fieldset/table[4]/tbody/tr[2]/td[1]/div/div/table/tbody/tr[3]/td[5]")
	public WebElement cialIMPORTaddedULDselect;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gPrefix_FMSAirlineSelected']")
	public WebElement cialIMPORTaddedULDflightPREFIX;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gAwbNo']")
	public WebElement cialIMPORTaddedULDawbNUM;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gO_FMSAirportSelected']")
	public WebElement cialIMPORTaddedULDdestination;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gMaster']")
	public WebElement cialIMPORTconsoleTIK;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gD']")
	public WebElement cialIMPORTaddedULDnatureofGOODS;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gX']")
	public WebElement cialIMPORTaddedULDnpx;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gW_Number']")
	public WebElement cialIMPORTaddedUldnpxwt;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gCW_Number']")
	public WebElement cialIMPORTaddedULDchargebleWT;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_uxCN_FMSShipperSelected']")
	public WebElement cialIMPORTaddedULDconsignee;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl05_fmslblName']")
	public WebElement cialIMPORTaddedULDconsigneeSELECT;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_btnAdd']")
	public WebElement cialIMPORTaddbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gPrefix_FMSAirlineSelected']")
	public WebElement cialIMPORT2ndprefix;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gAwbNo']")
	public WebElement cialIMPORT2ndAWBnum;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gO_FMSAirportSelected']")
	public WebElement cialIMPORT2ndORIGIN;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gCTN_FMSCommSearchCode']")
	public WebElement cialIMPORT2ndcommodity;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gD']")
	public WebElement cialIMPORT2ndNATUREofGOODS;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gX']")
	public WebElement cialIMPORT2ndNPX;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gW_Number']")
	public WebElement cialIMPORT2ndNPXwt;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gCW_Number']")
	public WebElement cialIMPORT2ndCHARGEBLEwt;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_uxCN_FMSShipperSelected']")
	public WebElement cialIMPORT2ndconsignee;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnSaveClose']")
	public WebElement cialIMPORTAddedULDsavecloseBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_Toolbar2_btnSearchNew']")
	public WebElement cialIMPORTsearchBTN;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxCustomRef']")
	public WebElement cialIMPORTcoustomerRefNum;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxATA_txtDateField']")
	public WebElement cialIMPORTataDATE;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxATAT_uxTime']")
	public WebElement cialIMPORTtime;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxRecordFlight']")
	public WebElement cialIMPORTrecordATAbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdShipment_ctl01_uxCheckAllshipments']")
	public WebElement cialIMPORTtoSelectAllAWBnumCreated;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxMatch']")
	public WebElement cialIMPORTmatchBTN;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gNo']")
	public WebElement cialIMPORTslect_M_TOenterHAWBnum;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gO_FMSAirportSelected']")
	public WebElement cialIMPORTslect_M_TOenterOrigin;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gCTN_FMSCommSearchCode']")
	public WebElement cialIMPORTslect_M_TOenterCommodity;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gD']")
	public WebElement cialIMPORTslect_M_TOenterNatureofgoods;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gfX']")
	public WebElement cialIMPORTnpxTOEnter;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gfW_Number']")
	public WebElement cialIMPORTestWTToenter;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gfR']")
	public WebElement cialIMPORTNPXtoenter;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gfWR_Number']")
	public WebElement cialIMPORTWTrecorded;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gTX']")
	public WebElement cialIMPORThouseNPX;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gTW_Number']")
	public WebElement cialIMPORThouseWT;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_gC_Number']")
	public WebElement cialIMPORTchargebleWT;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_uxCN_FMSShipperSelected']")
	public WebElement cialIMPORTconsigneename;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl02_btnAdd']")
	public WebElement cialIMPORTaddrowplusbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gNo']")
	public WebElement cialIMPORT2ndHousenumber;

	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gO_FMSAirportSelected']")
	public WebElement cialIMPORTtoenter2ndORIGIN;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gCTN_FMSCommSearchCode']")
	public WebElement cialIMPORTtoenterCommodity;
	
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gD']")
	public WebElement cialIMPORTtoenter2ndGoodsnature;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gfX']")
	public WebElement cialIMPORTtoENTER2ndNPX;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gfW_Number']")
	public WebElement cialIMPORTtoENTER2ndNPXWT;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gfR']")
	public WebElement cialIMPORTtoEnter2ndNPR;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gfWR_Number']")
	public WebElement cialIMPORTtoEnter2ndrecordWT;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gTX']")
	public WebElement cialIMPORTtoenter2NDhouseNPX;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gTW_Number']")
	public WebElement cialIMPORTtoenter2ndHOUSEwt;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gC_Number']")
	public WebElement cialIMPORT2ndtoenterChargebleWT;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_uxCN_FMSShipperSelected']")
	public WebElement cialIMPORT2NDtoenterCONSIGNEE;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnSaveClose']")
	public WebElement cialIMPORTenterMsaveClose;
	//popup willcome after this
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxDiscrepancy']")
	public WebElement cialIMPORTDiscrepancyBTN;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[4]/table/tbody/tr[2]/td[2]/input")
	public WebElement cialIMPORTafterMatchOkBTN;  
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdShipment_ctl03_uxShipmentSelect']")
	public WebElement cialIMPORTdirectshipmentselecTIK;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdDesc_ctl02_uxtxtNPR']")
	public WebElement cialIMPORThouseDiscrepancyDirectShipmentNPR;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdDesc_ctl02_uxtxtWtRec_Number']")
	public WebElement cialIMPORThouseDiscrepancyDirectShipmentWTrecd;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxSave']")
	public WebElement cialIMPORThouseDiscrepancyDirectShipmentSaveBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxDamage']")
	public WebElement cialIMPORTdamageBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtTActualPcs']")
	public WebElement cialIMPORTdamagePICES;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtTActualValue_Number']")
	public WebElement cialIMPORTdamageWT;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtIDamageDoc_Number']")
	public WebElement cialIMPORTasPerDocumentWT;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtIDamageAct_Number']")
	public WebElement cialIMPORTasPerActuakWT;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxChkMaterial_0']")
	public WebElement cialIMPORTdamageTIK1;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxChkOPacking_0']")
	public WebElement cialIMPORTdamageTIK2;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxChkMLabels_0']")
	public WebElement cialIMPORTdamageTIK3;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxChkIPacking_0']")
	public WebElement cialIMPORTdamageTIK4;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxlblDRemarked1']")
	public WebElement cialIMPORTscroolRemark1;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtDRemarked']")
	public WebElement cialIMPORTscroolRemark1Field;

	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtRemarks_txtData']")
	public WebElement cialIMPORTscroolRemark2Field;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtGHARep']")
	public WebElement cialIMPORTGHArep;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtAirlineRep']")
	public WebElement cialIMPORTairlineREP;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxtxtSecurityRep']")
	public WebElement cialIMPORTsecurityREP;
	
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxbtnSave']")
	public WebElement cialIMPORTdamageSAVEbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxDateFlightReceiveTime_txtDateField']")
	public WebElement cialIMPORTbreakdownDocumentReciveDate;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxFlightBreakDown']")
	public WebElement cialIMPORTBreakdownBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxFlightReceiveTime_uxTime']")
	public WebElement cialIMPORTBreakdownTime;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxBtnSave']")
	public WebElement cialIMPORTSavEBtnBreakdown;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxFinaliseFlight']")
	public WebElement cialIMPORTfinalizeBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGenRno']")
	public WebElement cialIMPORTrotationalNUMgeneTAB;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGenerate']")
	public WebElement cialIMPORTRotationalnumGENERATEbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdShipment_ctl02_uxShipmentSelect']")
	public WebElement cialIMPORTconsoleShipmentSelectTik;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[2]/ul/li[4]/a/span")
	public WebElement cialIMPORTWAREHOUSElocation;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_gH_ctl03_gDT_FMSAirportSelected']")
	public WebElement cialIMPORT2ndDestinationToEnter;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div[4]/div/div/fieldset/table[4]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[2]/td[3]")
	public WebElement cialIMPORT_M_hyperlink;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSAWBPrefixSelected']")
	public WebElement cialIMPORTwarehouseAWBprefix;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSAWBNoSelected']")
	public WebElement cialIMPORTwarehouseAWBnum;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSHAWNoSelected']")
	public WebElement cialIMPORTwarehousenumber;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnSearchShipments']")
	public WebElement cialIMPORTwarehouseSEARCHbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdSplitLoc_ctl02_uxGroupId']")
	public WebElement cialIMPORTwarehouseGroupID;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdSplitLoc_ctl02_uxWHLoc_FMSWarehouseLocSelected']")
	public WebElement cialIMPORTwarehouseLOcation;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnLocSave']")
	public WebElement cialIMPORTwarehouselocationSAVEbtn;
	
	@FindBy(xpath = "//*[@id='234']")
	public WebElement cialIMPORTAWBdetailsTab;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp1_ctl00_uxAWB_FMSAWBPrefixSelected']")
	public WebElement cialIMPORTawbDEtailsPrefix;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp1_ctl00_uxAWB_FMSAWBNoSelected']")
	public WebElement cialIMPORTawbDETAILSawbnum;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp1_ctl00_uxAWB_FMSHAWNoSelected']")
	public WebElement cialIMPORTawbDETAILShawbNUM;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGenRno']")
	public WebElement cialIMPORTrotationalNUMgTAB;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGenRno']")
	public WebElement cialIMPORTrotationalNUMg;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[2]/ul/li[6]/a/span")
	public WebElement cialIMPORTAOAtab;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxFlightBox_showpopup']")
	public WebElement cialIMPORTAOAflightserachICON;
	
	
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl04_fmslblFlight']")
	public WebElement cialIMPORTAOAflightSELECT;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdAdviceOfArrival1_ctl02_uxSelect']")
	
	public WebElement cialIMPORTAOAselectSHIPMENTforEMAIL;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxNotify']")
	public WebElement cialIMPORTaoaNOTIFYbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdNotificationAddress_ctl02_uxtxtAddress']")
	public WebElement cialIMPORTAOAemailADDRESS;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxSubmit']")
	public WebElement cialIMPORTAOAemailsubmitBTN;
	
	@FindBy(xpath = "//*[@id='1229']")
	public WebElement cialIMPORTwarehousedeliveryOder;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSAWBPrefixSelected']")
	public WebElement cialIMPORTwarehousedeleveryoderAWBprefix;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSAWBNoSelected']")
	public WebElement cialIMPORTwarehousedeliveryoderAWBNUM;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxAWB_FMSHAWNoSelected']")
	public WebElement cialIMPORTwarehousedelieryHAWBno;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnSearch']")
	public WebElement cialIMPORTwarehousedeliverySERACHbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdWDO_ctl02_uxULDSelect']")
	public WebElement cialIMPORTWAREhouseDELIVERYoderDSELECT1ST;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdWDO_ctl02_txtCustomsRefNo']")
	public WebElement cialIMPORTwarehouseDELIVERYselectCOUSTOMSno;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnGenerateWDO']")
	public WebElement cialIMPORTgenerateWDObtndelivery;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnPrintWDO']")
	public WebElement cialIMPORTprintWDObtnDELIVERY;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_grdWDO_ctl03_uxULDSelect']")
	public WebElement cialIMPORT2ndtikDELIVERY;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_btnReleased']")
	public WebElement cialIMPORTrealeasedBTNdelivery;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[4]/table/tbody/tr[2]/td[2]/input")
	public WebElement cialIMPORTfinalizeOKpopBTN;
	
	@FindBy(xpath = "/html/body/form/div[3]/fieldset/fieldset[2]/table[1]/tbody/tr[1]/td/div/table/tbody/tr/td/div/table/tbody/tr[5]/td[1]")
	public WebElement cialIMPORTAOA2ndFlightSelect;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl04_fmslblFlight']")
	public WebElement cialIMPORTmanifest3rdFlightSElect;
	
	@FindBy(xpath = "/html/body/form/div[3]/fieldset/fieldset[2]/table[1]/tbody/tr[1]/td/div/table/tbody/tr/td/div/table/tbody/tr[5]/td[1]")
	public WebElement cialIMPORTAOA3RDFLIGHTselect;
	
	//CELEBI-MASTER-XPATH-----------------------------------------------------------------------------------------------------------
	
	@FindBy(xpath = "//*[@id='textfield']")
	public WebElement celibiUserNameInput;
	
	@FindBy(xpath = "//*[@id='textfield2']")
	public WebElement celibiPasswordInput;
	
	@FindBy(xpath = "//*[@id='imgButton']")
	public WebElement celibiLoginBtn;
	
	@FindBy(xpath = "//*[@id='FMSGenericMessage']")
	public WebElement celibiAlertToEnterValidUserPass;
	
	@FindBy(xpath = "//*[@id='menu_more']")
	public WebElement celibiMoreBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div/ul/li[8]/div[1]/ul/li[1]/a")
	public WebElement celibiMoreBtnSystemSetup;  //*[@id="1"]
	
	@FindBy(xpath = "//*[@id='205']")
	public WebElement celibiMoreBtnSystemSetupMaster;
	
	@FindBy(xpath = "//*[@id='ctl00_Toolbar2_btnNew']")
	public WebElement celibiNewIconBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtUserName']")
	public WebElement celibiNewUsernameInput;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtGroup_showpopup']")
	public WebElement celibiGroupselectWindow;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl04_fmslblGroupName']")
	public WebElement celibiSelectingGroupName;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtFirstName']")
	public WebElement celibiNewName;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtLastName']")
	public WebElement celibiNewLastName;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtEmail']")
	public WebElement celibiNewEmailId;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtLocationCode_showpopup']")
	public WebElement celibiNewLocationSearchIcon;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl02_fmslblCode']")
	public WebElement celibinewLocationSelect;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtLocationCode_FMSAirportSelected']")
	public WebElement celibiNewLocation;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtPassword']")
	public WebElement celibinewPassword;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtConfirmPassword']")
	public WebElement celibiconfirmNewPassword;
	
	@FindBy(xpath = "//*[@id='ctl00_Toolbar2_btnSave']")
	public WebElement celibiSaveBtn;
	
	@FindBy(xpath = "//*[@id='customerHeader1_uxlnkbtnlogout']")
	public WebElement celibiLogOutBtn;
	
	@FindBy(xpath = "//*[@id='207']")
	public WebElement celibiMoreGroupMaster;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div[1]/div/fieldset/div/div[2]/div[1]/fieldset/table/tbody/tr/td/div/table/tbody/tr[4]/td[1]")
	public WebElement celibiGroupMasterUserDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_Toolbar2_btn']")
	public WebElement celibiGroupMasterEDITbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxGroupDescription']")
	public WebElement celibiEditGroupDescription;
	
	@FindBy(xpath = "//*[@id='__tab_ctl00_cp_tc_tp3']")
	public WebElement celibiSystemAuthorization;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp3_ctl00_grdSystemAuthorisation_ctl02_uxCreate']")
	public WebElement celibiAthorizationTik1;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp3_ctl00_grdSystemAuthorisation_ctl02_uxUpdate']")
	public WebElement celibiAthorizationTik2;
	
	@FindBy(xpath = "//*[@id='995']")
	public WebElement celibiPasswordPolicyTab;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/fieldset/div/div[2]/div/fieldset/table[2]/tbody/tr[3]/td/input")
	public WebElement celibiUpdatePasswordPolicyBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tab_TabTBL_ctl00_FMSChkNotNumOrLetter']")
	public WebElement celibipaswordpolicytik1;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tab_TabTBL_ctl00_FMSChkNotExceed']")
	public WebElement celibipaswordpolicytik2;
	
	@FindBy(xpath = "//*[@id='2']")
	public WebElement celibiMasterTab;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[5]/ul/li[2]/a/span")
	public WebElement celibiMasterAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxCarrierCode']")
	public WebElement celibiCarrierCode;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxShortCode']")
	public WebElement celibiShortCode;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxAirlineName']")
	public WebElement celibiAirlineName;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxWocCode']")
	public WebElement celibiWOCcode;
	
	@FindBy(xpath = "//*[@id=ctl00_cp_tc_tp2_ctl00_txtawbwtdeviations']")
	public WebElement celibiWthDeviation;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_txtVoldeviations']")
	public WebElement celibivolumeDeviation;
	
	@FindBy(xpath = "//*[@id='__tab_ctl00_cp_tc_tp3']")
	public WebElement celibiprefixDetailsBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp3_ctl00_uxDefaultPrefix']")
	public WebElement celibiPrefixField;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp3_ctl00_uxchkCheckDigit']")
	public WebElement celibiCheckDigitTikMark;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div[1]/div/fieldset/div/div[2]/div[3]/fieldset/fieldset/table[1]/tbody/tr/td/table/tbody/tr[1]/td[4]/label")
	public WebElement celibiDefaultPrefixTikMark;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp3_ctl00_uxOk']")
	public WebElement celibiairlineOkBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_Toolbar2_btnSave']")
	public WebElement celibiFLOPPYSAVEbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp1_ctl00_grdAirline_ctl01_txtFilter1']")
	public WebElement celibicarrierCodeSearchField;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div[1]/div/fieldset/div/div[2]/div[1]/fieldset/div[1]/table/tbody/tr[2]/td[2]")
	public WebElement celibiAirlineForDetailsClick;
	
	@FindBy(xpath = "//*[@id='ctl00_Toolbar2_btn']")
	public WebElement celibieditbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxContactName']")
	public WebElement celibicontactName;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxContactNameHO']")
	public WebElement celibiHeadContactName;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[5]/ul/li[3]/a/span")
	public WebElement celibiAirlineShedule;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxAirline_FMSAirlineSelected']")
	public WebElement celibischeduleairlineNameFiled;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxFromDate_txtDateField']")
	public WebElement celibischeduleairlineFromdate;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxToDate_txtDateField']")
	public WebElement celibischeduleairlineTOdate;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxDescription_txtData']")
	public WebElement celibischeduleairlineCommentField;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div/div[2]/div[1]/fieldset/div/table/tbody/tr[14]/td[1]")
	public WebElement celibischeduleairlinedetailseditselect;
	
	@FindBy(xpath = "//*[@id='ctl00_Toolbar2_btnCancel']")
	public WebElement celibiFloppyCancleBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[5]/ul/li[4]/a/span")
	public WebElement celibiAirportCityTab;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxAirportCode']")
	public WebElement celibiAirportCityAirportCode;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxNameOfAirPort']")
	public WebElement celibiAirportCityNameAirport;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxCityCode']")
	public WebElement celibiAirportCityCode;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxAirPortCity']")
	public WebElement celibiAirportCityName;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxsitadd']")
	public WebElement celibiAirportCitySitaAddress;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxcustno']")
	public WebElement celibiAirportCityCustPermissionNum;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxCountry_FMSCountrySelected']")
	public WebElement celibiAirportCityCountryCode;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxState_FMSStateId']")
	public WebElement celibiAirportCityStateCode;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[5]/ul/li[8]/a")
	public WebElement celibiMasterMoreTab;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[5]/ul/li[8]/ul/li[1]/a/span")
	public WebElement celibiMasterMoreCountryMaster;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxCountryCode']")
	public WebElement celibiMasterMoreCountryMasterCountryCode;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtName']")
	public WebElement celibiMasterMoreCountryMasterFullName;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxtxtISDCode']")
	public WebElement celibiMasterMoreCountryMasterISDcode;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxCurrency_FMSCurrencySelected']")
	public WebElement celibiMasterMoreCountryMasterCurrency;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp1_ctl00_grdCountryMaster_ctl01_txtFilter0']")
	public WebElement celibiMasterMoreCountryMasterCountryCodeSearching;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div/fieldset/div/div[2]/div[1]/fieldset/div[1]/div/table/tbody/tr[2]/td[2]")
	public WebElement celibiMasterMoreCountryMasterCountryCodeSearchingSelect;
	
	@FindBy(xpath = "//*[@id='202']")
	public WebElement celibiMasterMoreCustomerMaster;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxShortCode']")
	public WebElement celibiMasterMoreCustomerMasterShortCode;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxCustomerName']")
	public WebElement celibiMasterMoreCustomerMasterCustomername;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxCustomerAdd1']")
	public WebElement celibiMasterMoreCustomerMasterSreetAddress;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxCustomerAdd2']")
	public WebElement celibiMasterMoreCustomerMasterplace;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxCustomerAdd3']")
	public WebElement celibiMasterMoreCustomerstate;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxCountry_FMSCountrySelected']")
	public WebElement celibiMasterMoreCustomercountry;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxPostalCode']")
	public WebElement celibiMasterMoreCustomerpostalcode;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_tc_tp2_ctl00_uxState_FMSStateId']")
	public WebElement celibiMasterMoreCustomerStatecode;
	
	@FindBy(xpath = "//*[@id='206']")
	public WebElement celibicustomermasterCurrencyMaster;
	
	@FindBy(xpath = "//*[@id='263']")
	public WebElement celibicustomercommodityMaster;
	
	@FindBy(xpath = "//*[@id='216']")
	public WebElement celibiMasterMoreFlight;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[5]/ul/li[8]/ul/li[10]/a/span")
	public WebElement celibiMasterMoreScreenerMaster;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[5]/ul/li[8]/ul/li[9]/a/span")
	public WebElement celibiMasterMorAirlineUldMapping;
	
	@FindBy(xpath = "//*[@id='__tab_ctl00_cp_tc_tp3']")
	public WebElement celibiMasterMoreflightRoutingDetails;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[3]/div[5]/ul/li[8]/ul/li[5]/a/span")
	public WebElement celibiMasterMoreflightscheduleBtn;
	
	@FindBy(xpath = "(//*[text()='Document Acceptance'])[1]")
	public WebElement DocumentAcceptanceTab;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_ucAWBNo_FMSAWBPrefixSelected']")
	public WebElement documentaccptanceAWBprefix;
	
	@FindBy(xpath = "//*[@name='ctl00$cp$ucAWBNo$FMSAWBNoSelected']")
	public WebElement documentaccptanceAWBNum;
	
	@FindBy(xpath = "//*[@name='ctl00$cp$ucdbtnSearch']")
	public WebElement documentaccptanceAWBNumSearchButton;
	
	@FindBy(xpath = "//*[@id='chkDoc_0']")
	public WebElement documentaccptanceDocument1STtik;
	
	@FindBy(xpath = "//*[@id='fileUpload_0']")
	public WebElement documentaccptanceDocumentUpload1ST;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_ucdbtnSave']")
	public WebElement documentaccptanceDocumentUploadbutton;
	
	@FindBy(xpath = "//*[@id='txtDescription_0']")
	public WebElement documentaccptanceDocumenttxtDescription1;
	
	@FindBy(xpath = "//*[@name='ctl00$cp$btnAcceptDocument']")
	public WebElement btnAcceptDocument;
	
	@FindBy(xpath = "//*[@name='ctl00$ContentPlaceHolder1$uxgrdMan$ctl03$imgUndo']")
	public WebElement tocloseULD;
	
	@FindBy(xpath = "//*[@name='ctl00$cp$uxScaleWt$Number']")
	public WebElement ScaleWtNumber;
	
	@FindBy(xpath = "//*[@name='ctl00$cp$uxSaveETV']")
	public WebElement SaveScaleWeight;
	
	@FindBy(xpath = "//*[@name='ctl00$ContentPlaceHolder1$uxFlightBuiltUp']")
	public WebElement FlightBuiltUpTab;
	
	@FindBy(xpath = "//*[@name='ctl00$cp$uxGrdFlightBuiltUp$ctl02$uxSelect']")
	public WebElement selectUldGatepass;
	
	@FindBy(xpath = "//*[@name='ctl00$cp$uxbtnGP']")
	public WebElement btnGP;
	
	@FindBy(xpath = "//*[text()='Gatepass']")
	public WebElement GatepassTab;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGridGP_ctl02_lnkGatepass']")
	public WebElement lnkGatepass;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxGrdULD_ctl02_uxSelect']")
	public WebElement ULD_ctl02_uxSelect;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxRelease']")
	public WebElement ReleaseButton;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_uxFlightBox_showpopup']")
	public WebElement searchflightInrELEASEsCREEN;
	
	@FindBy(xpath = "//*[@name='ctl00$ContentPlaceHolder1$uxFinaliseFlightdirect']")
	public WebElement FinaliseFlight;
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl02_fmslblFlight']")
	public WebElement FirstFlightTOselect;
	
	@FindBy(xpath = "//*[@name='ctl00$cp$uxBtnCancel']")
	public WebElement breakdownClose;
	
	@FindBy(xpath = "//*[@name='ctl00$cp$uxFinaliseFlight']")
	public WebElement FinaliseFlightImport;
	
	@FindBy(xpath = "//*[@name='ctl00$cp$uxTime$uxTime']")
	public WebElement documentAcceptTime;
	
	@FindBy(xpath = "")
	public WebElement celibi6911;
	
	@FindBy(xpath = "")
	public WebElement celibi7011;
	
	public String MAWBGenerate(){
		  int min = 1000001; 
	      int max = 9999999;
	      //System.out.println("Random value in int from "+ min + " to " + max + ":");
	      int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
	      System.out.println("number ="+random_int);
	      int mod =random_int%7;
	      System.out.println("mod");
	      String s1 = Integer.toString(random_int);
	      String s2 = Integer.toString(mod);
	      String mawb= s1+s2;  
	      System.out.println("mawb no="+mawb);
	        return mawb;
	}
}
