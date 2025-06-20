package Pages;

import com.github.javafaker.Faker;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class employee extends homepage {

    public SHAFT.GUI.WebDriver driver;
    private final Faker faker = new Faker();

    // Constructor
    public employee(SHAFT.GUI.WebDriver driver) {
        super(driver);
        this.driver = driver ;
    }

    // Elements
    private final By adduser_Button = By.xpath("//a[contains(text(),' Add User')]");
    private final By last_name_field = By.id("last_name");
    private final By first_name_field = By.id("first_name");
    private final By email_field = By.id("email");
    private final By phone_field = By.id("phone");
    private final By job_title_field = By.id("job_title");
    private final By image_field = By.name("image");

    private final By save_user_field = By.id("send_email_later");
    private final By contract_company_list = By.id("supplier_company");
    private final By save_button = By.xpath("//button[contains(text(),'SAVE')]");
    private final By success_message = By.xpath("//div[contains(text(),'User has been created successfully')]");
    private final By three_dots_button = By.xpath("//*[@id=\"tbodydata\"]/tr[1]/td[7]/div/button/img");
    private final By update_success_message = By.xpath("//div[contains(text(),'User has been updated successfully')]");
    private final By delete_success_message = By.xpath("//div[contains(text(),'Data has been deleted successfully.')]");
    private final By update_button = By.xpath("//button[contains(text(),'UPDATE')]");
    private final By created_employee = By.xpath("//*[@id=\"tbodydata\"]/tr[1]/td[2]/a");
    private final By switch_role_button = By.xpath("//*[@id=\"tbodydata\"]/tr[1]/td[7]/div/div/a[2]");
    private final By change_permission_button = By.xpath("//*[@id=\"tbodydata\"]/tr[1]/td[7]/div/div/a[3]");
    private final By change_contractor_company_button = By.xpath("//*[@id=\"tbodydata\"]/tr[1]/td[7]/div/div/a[4]");
    private final By delete_button = By.xpath("//*[@id=\"tbodydata\"]/tr[1]/td[7]/div/div/a[5]");
    private final By change_role_button = By.id("CProleID");

    private final By role = By.xpath("//option[contains(text(),'Verifiers')]");
    private final By submit_button = By.xpath("//button[contains(text(),'Submit')]");
    private final By Employee_page = By.xpath("//span[contains(text(),'Employee')]");
    private final By getChange_contractor_company_assertion = By.xpath("//h4[contains(text(),'You are not permited to access this area')]");
    private final By switch_back_to_Admin = By.xpath("//a[contains(text(),'Click here back to the Administrator')]");
    String lastname = faker.name().lastName();
    String firstname = faker.name().firstName();
    String Email = faker.internet().emailAddress();
    String Phone = faker.phoneNumber().cellPhone();
    String job = faker.name().title();
    String filePath = "D:\\project CVB\\image.png";  // Change this to your actual path

    public void create_employee() throws InterruptedException {
        try {
            verify_navigation_to_Employee_Page();
            driver.element().click(adduser_Button);
            driver.element().type(last_name_field, lastname);
            driver.element().type(first_name_field, firstname);
            driver.element().type(email_field, Email);
            driver.element().type(phone_field, Phone);
            driver.element().type(job_title_field, job);
            driver.element().typeFileLocationForUpload(image_field, filePath);
            driver.element().click(save_user_field);
            driver.element().click(contract_company_list);
            driver.element().click(By.xpath("//option[contains(text(),'Goddess')]")); // Adjust XPath
            driver.element().click(save_button);
            driver.element().assertThat(success_message).isVisible();
        } catch (Exception e) {
            throw e;
        }
    }

    public void update_employee() throws InterruptedException {
        try {
            verify_navigation_to_Employee_Page();
            driver.element().click(created_employee);
            driver.element().type(last_name_field, lastname);
            driver.element().click(update_button);
            driver.element().assertThat(update_success_message).isVisible();
        } catch (Exception e) {
            throw e;
        }
    }

    public void switch_role_employee() throws InterruptedException {
        try {
            verify_navigation_to_Employee_Page();
            driver.element().click(three_dots_button);
            driver.element().click(switch_role_button);// Accept (OK)
            driver.element().assertThat(Employee_page).isVisible();
            driver.browser().navigateBack();
        } catch (Exception e) {
            throw e;
        }
    }
    public void change_permission_employee() throws InterruptedException {
        try {
            verify_navigation_to_Employee_Page();
            driver.element().click(three_dots_button);
            driver.element().click(change_permission_button);
            driver.element().select(change_role_button,"Verifiers");
            driver.element().click(submit_button);
            driver.browser().navigateBack();
        } catch (Exception e) {
            throw e;
        }
    }
    public void change_contractor_company() throws InterruptedException {
        try {
            verify_navigation_to_Employee_Page();
            driver.element().click(three_dots_button);
            driver.element().click(change_contractor_company_button);
            driver.element().click(By.xpath("//option[contains(text(),'Goddess')]"));
            driver.element().click(update_button);
            driver.element().assertThat(update_success_message).isVisible();
        } catch (Exception e) {
            throw e;
        }
    }
    public void delete_employee() throws InterruptedException {
        try {
            verify_navigation_to_Employee_Page();
            driver.element().click(three_dots_button);
            driver.element().click(delete_button);
            driver.browser().alert().acceptAlert();  // Accept (OK)
            driver.element().assertThat(delete_success_message).isVisible();
        } catch (Exception e) {
            throw e;
        }
    }
}
