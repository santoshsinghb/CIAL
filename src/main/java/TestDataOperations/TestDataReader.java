package TestDataOperations;
import static Helper.BaseVariables.*;
import static Helper.BaseObjects.read;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;
import static Helper.Constants.LoginDetailsSheetName;
import static Helper.Constants.Business_validations;
import static Helper.Constants.export_5;

import static Helper.Constants.MasterDataSheet;

import static Helper.Constants.TestDataFile;

import Methods.ReadExcelMethod;


public class TestDataReader {
	public static void initTestDataReader() throws Exception {
		read = new ReadExcelMethod(TestDataFile);
		
	}
	
	
	
	
	public static void ReadScenarioDetails() 
	{
		
		
	}
	
	public static String AGENT_STARTPOINT(){
		String AGENT_STARTPOINT = read.GetCellDataX(LoginDetailsSheetName, "AGENT_SP", 1);
		return AGENT_STARTPOINT;
	}
	
	public static String AGENT_ENDPOINT(){
		String AGENT_ENDPOINT = read.GetCellDataX(LoginDetailsSheetName, "AGENT_EP", 1);
		return AGENT_ENDPOINT;
	}
	
	public static String GSA_STARTPOINT(){
		String AGENT_STARTPOINT = read.GetCellDataX(LoginDetailsSheetName, "AGENT_SP", 1);
		return AGENT_STARTPOINT;
	}
	
	public static String GSA_ENDPOINT(){
		String GSA_ENDPOINT = read.GetCellDataX(LoginDetailsSheetName, "GSA_EP", 1);
		return GSA_ENDPOINT;
	}
	
	public static String carriername(){
		String carriername = read.GetCellDataX(LoginDetailsSheetName, "CarrierName", 1);
		return carriername;
	}
	
	public static String carriername1(){
		String carriername1 = read.GetCellDataX(LoginDetailsSheetName, "CarrierName1", 1);
		return carriername1;
	}
	
	public static String GSAprefix(){
		String GSAprefix = read.GetCellDataX(LoginDetailsSheetName, "prefix", 1);
		return GSAprefix;
	}
	
	
	public static String carrierlocationname(){
		String carrierlocationname = read.GetCellDataX(LoginDetailsSheetName, "AirportlocationName", 1);
		return carrierlocationname;
	}
	
	public static String quantitynumber(){
		String quantitynumber = read.GetCellDataX(LoginDetailsSheetName, "quantity", 1);
		return quantitynumber;
	}
	
	public static String air_startingingpoint(){
		String air_startingingpoint = read.GetCellDataX(LoginDetailsSheetName, "air_startingingpoint", 1);
		return air_startingingpoint;
	}
	
	public static String Air_endingpoint(){
		String Air_endingpoint = read.GetCellDataX(LoginDetailsSheetName, "Air_endingpoint", 1);
		return Air_endingpoint;
	}
	
	public static String AgentStartingFrom(){
        String AgentStartingFrom = read.GetCellDataX(LoginDetailsSheetName, "AgentStartingFrom", 1);
        return AgentStartingFrom;
	}
	
	public static String AgentEndingAt(){
        String AgentEndingAt = read.GetCellDataX(LoginDetailsSheetName, "AgentEndingAt", 1);
        return AgentEndingAt;
	}
	
	public static String Remark_input(){
		String Remark_input = read.GetCellDataX(LoginDetailsSheetName, "Remark_input", 1);
		return Remark_input;
	}
	public static String shipper(){
		String Remark_input = read.GetCellDataX(Business_validations, "Shipper", 1);
		return Remark_input;
	}
	
	public static String Consignee(){
		String Consigne = read.GetCellDataX(Business_validations, "Consignee", 1);
		return Consigne;
	}
	
	public static String Destination_Airport(){
		String Destination_Airport = read.GetCellDataX(Business_validations, "Destination_Airport", 1);
		return Destination_Airport;
	}
	public static String Total_pieces(){
		String Total_pieces = read.GetCellDataX(Business_validations, "Total_pieces", 1);
		System.out.println("total pieces="+ Total_pieces);
		return Total_pieces;
	}
	
	public static String BoE(){
		String Cargo_Describtion = read.GetCellDataX(Business_validations, "BOE_Number", 1);
		return Cargo_Describtion;
	}
	
	public static String Shipper_change(){
		String Cargo_Describtion = read.GetCellDataX(Business_validations, "job_detail_Shipper", 1);
		return Cargo_Describtion;
	}
	
	public static String Gross_weight(){
		String Gross_weight = read.GetCellDataX(Business_validations, "Gross_weight", 1);
		System.out.println("total pieces="+ Gross_weight);
		return Gross_weight;
	}
	public static String Cargo_Describtion(){
		String Cargo_Describtion = read.GetCellDataX(Business_validations, "Cargo_Describtion", 1);
		return Cargo_Describtion;
	}
	public static String export_shipper(){
		String export_shipper = read.GetCellDataX(export_5, "shipper", 1);
		return export_shipper;
	}
	public static String export_consignee(){
		String export_consignee = read.GetCellDataX(export_5, "consignee", 1);
		return export_consignee;
	}
	
	public static String export_des_airport(){
		String export_des_airport = read.GetCellDataX(export_5, "des_airport", 1);
		return export_des_airport;
	}
	public static String export_total_pieces(){
		String export_total_pieces = read.GetCellDataX(export_5, "total_pieces", 1);
		return export_total_pieces;
	}
	public static String export_gross_weight(){
		String export_gross_weight = read.GetCellDataX(export_5, "gross_weight", 1);
		return export_gross_weight;
	}
	public static String export_SHC(){
		String export_SHC = read.GetCellDataX(export_5, "SHC", 1);
		return export_SHC;
	}
	public static String export_SHC2(){
		String export_SHC2 = read.GetCellDataX(export_5, "SHC", 2);
		return export_SHC2;
		
	}
	public static String export_SHC3(){
		String export_SHC3 = read.GetCellDataX(export_5, "SHC", 3);
		return export_SHC3;
	}
	public static String export_commodity(){
		String export_commodity = read.GetCellDataX(export_5, "commodity", 1);
		return export_commodity;
	}
	public static void ReadLoginDetails(String entity) throws Exception {
		int noOfRow = read.GetNoOfRow(LoginDetailsSheetName);
		for (int i = 0; i < noOfRow; i++) {
			if (read.GetCellDataX(LoginDetailsSheetName, "Entity", i).contains(entity))
			{
				System.out.println("rows= "+noOfRow);
				Username = read.GetCellDataX(LoginDetailsSheetName, "Username", i);
				Password = read.GetCellDataX(LoginDetailsSheetName, "Password", i);
				break;
			}
			else
			{
				Username = null; Password = null;
				System.out.println("Entity login details not found!!");
			}
		}	
	}

	
	

	
	public void ReadDetails(String MasterType) throws Exception
	{
		int noOfRow = read.GetNoOfRow(MasterDataSheet);
		for (int i = 0; i < noOfRow; i++) {
			if (read.GetCellDataX(MasterDataSheet, "Type", i).contains(MasterType))
			{
				System.out.println("rows= "+noOfRow);
				MasterData= read.GetCellDataX(MasterDataSheet, "LicenseNo", i);
				break;
			}
			else
			{
				MasterData = null; 
				System.out.println("Customer details not found!!");
			}
		}	
	}

}
