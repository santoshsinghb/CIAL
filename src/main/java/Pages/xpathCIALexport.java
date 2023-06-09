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
	
	@FindBy(xpath = "/html/body/form/div[3]/fieldset/fieldset/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[2]/td[3]")
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
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl09_fmslblName']")
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
	
	@FindBy(xpath = "//*[@id='ctl00_cp_GrdSearch_ctl06_fmslblName']")
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
}
