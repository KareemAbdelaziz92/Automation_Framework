package Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.homepage;
import io.qameta.allure.Step;

public class sign_upTest extends BaseTest{
	public homepage Homepage ;
	//@Parameters({"loginname", "password"})
  @Test
  public void admin_loginTest() {
	  
	  Homepage = new homepage(driver);
	  System.out.println("Opening login page...");
	//  Homepage.login(loginame, password);

  }
	
}
