package Tests;

import org.testng.annotations.Test;
import Pages.homepage;

public class sign_up extends BaseTest{
	
	public homepage Homepage ;
	@Test 
	public void admin_login() {
		Homepage = new homepage(driver);
		Homepage.login();
	
		}
}
