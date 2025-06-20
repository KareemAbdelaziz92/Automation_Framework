package Tests;


import Report.CustomReport;
import com.shaft.driver.SHAFT;
import Pages.homepage;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class BaseTest {
	public static SHAFT.GUI.WebDriver driver;
	public static boolean upmProduct_flag = false;
	public static boolean subscribeBtn_flag = false;
	public static String reportName;
	public static String errorText = "NA";
	public static String device;
	public static boolean loginStatus;
	public static String AppEnv;
	public static String baseURL;
	public static String OSVersion;
	public static String currentAvailableCash;
	public static String transactionAmount;
	public static String BrowserType;
	public static boolean sendEmailStatus;
	public static boolean networkErrorStatus;
	public static int slNo = 0;
	public static String Screenshotstatus = System.getProperty("Screenshotstatus");
	public static String otpStatic = System.getProperty("otpStatic");
	public static String otpLogin = System.getProperty("otpLogin");
	public static String executionStatus = "No";
	public static String executionSummary = "None";
	public static int iPassCount = 0;
	public static int iFailCount = 0;
	public static int TCCount = 1;
	static Calendar calender = Calendar.getInstance();
	static SimpleDateFormat formater = new SimpleDateFormat("dd-MM-YY HH:mm:ss");
	public static String iStartTime = formater.format(calender.getTime());
	public static String SStartTime = formater.format(calender.getTime());
	public static String excelFilePath;
	public static boolean reloginStatus = false;
	public static String currentDirectory = System.getProperty("user.dir");
	public static String FullPathUPMData = currentDirectory + "/src/test/resources/testDataFiles/Onboarding_IDs.xlsx";
	public static String FullPathUPMDataIOS = currentDirectory + "/src/test/resources/testDataFiles/IOS_Onboarding_IDs.xlsx";
	public static String ID_UPM;
	public static String Mobile_UPM;
	public static String FatherMobile_UPM;
	public static String executionLocaiton;
	public static boolean UPM_Flag = true;
	private final By txt_username_web = By.name("username");
	private final By txt_password_web = By.id("password");
	private final By login_button = By.xpath("//button[text()='Login']");
	private final By Home_Button = By.xpath("/html/body/div[3]/main/div/div/div[2]/div/div/div/div/form/div[4]/button[1]");
	public homepage Homepage ;
	public boolean testPassed = true;
	public  void login (String loginname , String password) throws InterruptedException {
		
		driver.element().type(txt_username_web,  loginname);
		driver.element().type(txt_password_web,  password);
		driver.element().click(login_button);


		//driver.element().assertThat(Home_Button).isVisible();
	}

	@BeforeSuite(alwaysRun = true)
	public void clearCustomReport(){
		if (System.getProperty("os.name").contains("Windows")) {
			excelFilePath = System.getProperty("user.dir") + "\\Execution_Summary\\Execution_Summary_Report.xlsx";
		} else {
			excelFilePath = System.getProperty("user.dir") + "/Execution_Summary/Execution_Summary_Report.xlsx";
		}

	}
	@Parameters({"loginname", "password"})
		@BeforeClass(alwaysRun = true)
		public void setup(String loginname , String password) throws InterruptedException {
		System.setProperty("browserType", "firefox");
		System.setProperty("headlessExecution", "true");  
		System.setProperty("shaft.browser.headless", "true");
		System.setProperty("shaft.browser.arguments", "--no-sandbox,--disable-dev-shm-usage,--disable-gpu,--window-size=1920,1080");

		driver = new SHAFT.GUI.WebDriver();
		driver.browser().navigateToURL("https://demo.siteassured.cvbtt.com/");
		Homepage = new homepage(driver);
		login(loginname, password);
		CustomReport.startReport();
		    }
		
		@AfterClass(alwaysRun = true)
		public void afterClass(){
			CustomReport.finalizeReport();
		        driver.quit();

	}

}

