package Tests;

import com.shaft.driver.SHAFT;
import Pages.homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class BaseTest {
	
	public static SHAFT.GUI.WebDriver driver;
	public homepage Homepage ;


		@BeforeClass(alwaysRun = true)
		public void setup() {
		    driver = new SHAFT.GUI.WebDriver();
		    driver.browser().navigateToURL("https://siteassured.cvbtt.com/");
		    Homepage = new homepage(driver);
		    }
		
		@AfterClass(alwaysRun = true)
		public void afterClass(){
		        driver.quit();
		    }
	}


