package Tests;

import Report.CustomReport;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.homepage;

public class homepage_test extends BaseTest {
	public homepage Homepage;
	//@Parameters({"loginname", "password"})
	private boolean testPassed = true;


	@Test
	public void verify_navigation_to_employee_list() throws Exception {

		boolean testPassed = true;
		System.out.println("Entering try block");
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_Employee_Page();
			Assert.assertTrue(false,"This is Failed Case" );
		}
		catch (AssertionError e) {
			testPassed = false; }

	catch (Exception e) {  // Catches any other errors
		testPassed = false;}

			CustomReport.recordTestCase("verify navigation to Employee List", testPassed, "Homepage");

	}

	@Test
	public void verify_navigation_to_CVB_admin_list() {

		boolean testPassed = true;
		try {

			Homepage = new homepage(driver);
			System.out.println("Opening login page...");
			Homepage.verify_navigation_to_CVB_Admin_Page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to CVB admin list", true, "Home Page");
	}

	@Test
	public void verify_navigation_to_CVB_User_list() {

		boolean testPassed = true;
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_CVB_User_Page();
			Assert.assertTrue(false,"This is Failed Case" );

		}catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to CVB User list", true, "Home Page");
	}

	@Test
	public void verify_navigation_to_Global_User_list() {
		boolean testPassed = true;
		try {
		//	CustomReport.startTestCase("verify navigation to Global User list");
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_Global_Users_page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to Global User Page", true, "Home Page");
	}

	@Test
	public void verify_navigation_to_CVB_Manager_List() {
		boolean testPassed = true;
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_CVB_Manager_page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to CVB Manager Page", true, "Home Page");
	}
	@Test
	public void verify_navigation_to_Contract_Manager_page() {
		boolean testPassed = true;
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_Contractor_Manager_page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to Contract Manager Page", true, "Home Page");
	}
	@Test
	public void verify_navigation_to_Contract_Holder_page() {
		boolean testPassed = true;
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_Contract_Holder_page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to Contract Holder Page", true, "Home Page");
	}
	@Test
	public void verify_navigation_to_Client_Company_Badge_Operator_page() {
		boolean testPassed = true;
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_Client_Company_Badge_Operator_page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to Client Company Badge Operator page", true, "Home Page");
	}
	@Test
	public void verify_navigation_to_Hiring_Company_Manager_page() {
		boolean testPassed = true;
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_Hiring_Company_Manager_page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to Hiring Company Manager page", true, "Home Page");
	}
	@Test
	public void verify_navigation_to_Verifiers_page() {
		boolean testPassed = true;
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_Verifiers_page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to CVerifiers_page", true, "Home Page");
	}
	@Test
	public void verify_navigation_to_Recruiter_Company_User_page() {
		boolean testPassed = true;
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_Recruiter_Company_User_page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to Recruiter Company User page", true, "Home Page");
	}
	@Test
	public void verify_navigation_to_Third_Party_Agent_page() {
		boolean testPassed = true;
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_Third_Party_Agent_page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

	catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to Third Party Agent page", true, "Home Page");
	}
	@Test
	public void verify_navigation_to_Site_Access_Approval_page() {
		boolean testPassed = true;
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_Site_Access_Approval_page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to Site Access Approval page", true, "Home Page");
	}

	public void verify_navigation_to_Client_Company_Manager_page() {
		boolean testPassed = true;
		try {
			Homepage = new homepage(driver);
			Homepage.verify_navigation_to_Client_Company_Manager_page();
			Assert.assertTrue(false,"This is Failed Case" );

		} catch (AssertionError e) {
			testPassed = false; }

		catch (Exception e) {  // Catches any other errors
			testPassed = false;}
		CustomReport.recordTestCase("verify navigation to Client Company Manager page", testPassed,"HomePage");
	}
}