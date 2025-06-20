package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class homepage {

	public SHAFT.GUI.WebDriver driver;

	//Constructor
	public homepage(SHAFT.GUI.WebDriver  driver) {

		this.driver = driver ;
	}
	//Elements
	private final By Dashboard_Button = By.xpath("/html/body/nav[2]/ul/li[1]/a");
	private final By Browse_Button = By.id("hasSubItemsB");
	private final By Employee_Alerts_Button = By.xpath("/html/body/nav[2]/ul/li[3]/a");
	private final By online_users_Button = By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[1]/a");
	private final By connect_button = By.xpath("/html/body/nav[2]/div[2]/button[1]");
	private final By Refrence_button = By.xpath("/html/body/nav[2]/div[2]/button[2]");
	private final By link_Dashboard = By.xpath("//a[text()='Dashboard']");
	private final By User_Roles_link = By.xpath("/html/body/main/div/div/div[1]/nav/div/ul/li[1]/a");
	private final By Global_Users_link = By.xpath("//span[contains(text(),'Global Users')]");
	private final By Client_Company_Badge_Operator_link = By.xpath("//span[contains(text(),'Client Company Badge Operator')]");
	private final By Client_Company_Manager_link = By.xpath("//span[contains(text(),'Client Company Manager')]");
	private final By Contract_Holder_link = By.xpath("//span[contains(text(),'Contract Holder')]");
	private final By Contractor_Manager_link = By.xpath("//span[contains(text(),'Contractor Manager')]");
	private final By CVB_Administrator = By.xpath("(//span[contains(text(),'CVB Administrator')])[2]");
    private final By CVB_Manager_link = By.xpath("//span[contains(text(),'CVB Manager')]");
    private final By CVB_User_link = By.xpath("//span[contains(text(),'CVB User')]");
    private final By Employee_link = By.xpath("//span[text()='Employee']");
	private final By Hiring_Company_Manager_link = By.xpath("//span[contains(text(),'Hiring Company Manager')]");
	private final By Recruiter_Company_User_link = By.xpath("//span[contains(text(),'Recruiter Company User')]");
	private final By Site_Access_Approval_link = By.xpath("//span[contains(text(),'Site Access Approver')]");
	private final By Third_Party_Agent_link = By.xpath("//span[contains(text(),'Third Party Agent')]");
	private final By Verifiers_link = By.xpath("//span[contains(text(),'Verifiers')]");
	private final By Employee_page = By.xpath("//h3[contains (text(),'Employee')]");
	private final By CVB_admin_page = By.xpath("//h3[contains(text(), 'CVB Administrator')]");
	private final By CVB_user_page = By.xpath("//h3[contains(text(), 'CVB User')]");
	private final By MANAGE_GLOBAL_ROLES_page = By.xpath("//h3[contains(text(),'MANAGE GLOBAL ROLES')]");
	private final By CVB_Manager_page = By.xpath("//h3[contains (text(),'CVB Manager') ]");
	private final By Contractor_Manager_page = By.xpath("//h3[contains(text(),'Contractor Manager')]");
	private final By Client_Company_Badge_Operator_page = By.xpath("//h3[contains(text(),'Client Company Badge Operator')]");
	private final By Client_Company_Manager_page = By.xpath("//h3[contains(text(),'Client Company Manager')]");
	private final By Contract_Holder_page = By.xpath("//h3[contains(text(),'Contract Holder')]");
	private final By Hiring_Company_Manager_page = By.xpath("//h3[contains(text(),'Hiring Company Manager')]");
	private final By Recruiter_Company_User_page = By.xpath("//h3[contains(text(),'Recruiter Company User')]");
	private final By Site_Access_Approval_page = By.xpath("//h3[contains(text(),'Location Approver/Site Approver')]");
	private final By Third_Party_Agent_page = By.xpath("//h3[contains(text(),'Third Party Agent')]");
	private final By Verifiers_page = By.xpath("//h3[contains(text(),'Verifiers')]");
	private final By Manage_Competency_link = By.xpath("/html/body/main/div/div/div[1]/nav/div/ul/li[5]/a");
	private final By employee_training_attendance_link = By.xpath("//span[contains(text(),'Employee Training Attendance ')]");
	private final By Attendus_button = By.xpath("//a[contains(text(),'Attendus')]");




	public void verify_navigation_to_Employee_Page()  {

	driver.element().waitToBeReady(User_Roles_link);
	driver.element().click(User_Roles_link);
	driver.element().click(Employee_link);
	driver.element().assertThat(Employee_page).isVisible();

	}
public void verify_navigation_to_CVB_Admin_Page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(CVB_Administrator);
		driver.element().assertThat(CVB_admin_page).isVisible();
	}
	public void verify_navigation_to_Global_Users_page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(Global_Users_link);
		driver.element().assertThat(MANAGE_GLOBAL_ROLES_page).isVisible();
	}
	public void verify_navigation_to_CVB_Manager_page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(CVB_Manager_link);
		driver.element().assertThat(CVB_Manager_page).isVisible();
	}
	public void verify_navigation_to_CVB_User_Page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(CVB_User_link);
		driver.element().assertThat(CVB_user_page).isVisible();
	}
	public void verify_navigation_to_Client_Company_Badge_Operator_page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(Client_Company_Badge_Operator_link);
		driver.element().assertThat(Client_Company_Badge_Operator_page).isVisible();
	}
	public void verify_navigation_to_Client_Company_Manager_page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(Client_Company_Manager_link);
		driver.element().assertThat(Client_Company_Manager_page).isVisible();
	}
	public void verify_navigation_to_Contract_Holder_page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(Contract_Holder_link);
		driver.element().assertThat(Contract_Holder_page).isVisible();
	}
	public void verify_navigation_to_Contractor_Manager_page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(Contractor_Manager_link);
		driver.element().assertThat(Contractor_Manager_page).isVisible();
	}

	public void verify_navigation_to_Hiring_Company_Manager_page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(Hiring_Company_Manager_link);
		driver.element().assertThat(Hiring_Company_Manager_page).isVisible();
	}
	public void verify_navigation_to_Recruiter_Company_User_page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(Recruiter_Company_User_link);
		driver.element().assertThat(Recruiter_Company_User_page).isVisible();
	}
	public void verify_navigation_to_Site_Access_Approval_page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(Site_Access_Approval_link);
		driver.element().assertThat(Site_Access_Approval_page).isVisible();
	}
	public void verify_navigation_to_Third_Party_Agent_page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(Third_Party_Agent_link);
		driver.element().assertThat(Third_Party_Agent_page).isVisible();
	}
	public void verify_navigation_to_Verifiers_page(){

		driver.element().waitToBeReady(User_Roles_link);
		driver.element().click(User_Roles_link);
		driver.element().click(Verifiers_link);
		driver.element().assertThat(Verifiers_page).isVisible();
	}

	public void verify_navigation_to_employee_training_attendance(){

		driver.element().waitToBeReady(Manage_Competency_link);
		driver.element().click(Manage_Competency_link);
		driver.element().click(employee_training_attendance_link);

	}
}
