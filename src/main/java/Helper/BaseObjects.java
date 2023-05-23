package Helper;

import org.openqa.selenium.WebDriver;

import Methods.CommonMethods;
import Methods.PropertyFileUtils;
import Methods.ReadExcelMethod;
import Methods.ScreenShotMethod;
import Methods.WebDriverMethod;

import Pages.CommonOprations;

import Pages.Login_Screen;
import Pages.xpathCIALexport;
import TestDataOperations.POJO;
import TestDataOperations.TestDataReader;

public class BaseObjects {

	
	public static WebDriver driver;
	public static ReadExcelMethod read;
	public static POJO pojo;
	
	public static WebDriverMethod wm;	
	public static CommonMethods cm;
	
	public static CommonOprations co;
	public static xpathCIALexport ce;
	public static ScreenShotMethod ss;
	public static PropertyFileUtils prop;
	
	
	
public static Login_Screen loginScreen;
//	public static Home_Screen homeScreen;
//	public static ExportsPage exportsScreen;
//	public static ImportsPage importscreen;
	
	public static TestDataReader testData;
	
	
	

}
