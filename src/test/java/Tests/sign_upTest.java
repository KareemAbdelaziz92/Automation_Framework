package Tests;

import org.testng.annotations.Test;

import Pages.homepage;

public class sign_upTest extends BaseTest{
	public homepage Homepage ;
  @Test
  public void admin_loginTest() {
	  
	  Homepage = new homepage(driver);
		Homepage.login();

  }
}
