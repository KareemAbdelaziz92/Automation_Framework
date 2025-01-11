package Tests;

import com.shaft.driver.SHAFT;
import Pages.homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BaseTest {
	
	private final By txt_username_web = By.id("user-name");
	private final By txt_password_web = By.id("password");
	private final By btn_login_web = By.id("login-button");
	private final By Home_Button = By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[1]/a");
	public static SHAFT.GUI.WebDriver driver;
	public homepage Homepage ;

	public  void login (String loginname , String password) {
		
		driver.element().type(txt_username_web,  loginname);
		driver.element().type(txt_password_web,  password);
		driver.element().click(btn_login_web);
		//driver.element().assertThat(Home_Button).isVisible();
	}
	@Parameters({"loginname", "password"})
		@BeforeClass(alwaysRun = true)
		public void setup(String loginname , String password) {
		    driver = new SHAFT.GUI.WebDriver();
		    driver.browser().navigateToURL("https://www.saucedemo.com/");
		    Homepage = new homepage(driver);
		    login(loginname, password);
		    }
		
		@AfterClass(alwaysRun = true)
		public void afterClass(){
		        driver.quit();
		    }
	}


