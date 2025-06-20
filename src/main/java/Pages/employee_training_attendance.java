package Pages;

import com.github.javafaker.Faker;
import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.Validations ;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class employee_training_attendance extends homepage {

    public SHAFT.GUI.WebDriver driver;
    private final Faker faker = new Faker();

    // Constructor
    public employee_training_attendance(SHAFT.GUI.WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    Date training_Date = faker.date().future(10, java.util.concurrent.TimeUnit.DAYS);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    long startDateMillis = training_Date.getTime();
    long additionalDaysMillis = TimeUnit.DAYS.toMillis(faker.number().numberBetween(5, 15));
    Date training_expiry_date = new Date(startDateMillis + additionalDaysMillis);
    String formatted_training_date = dateFormat.format(training_Date);
    String formatted_training_expiry_date = dateFormat.format(training_expiry_date);
    int hour24 = faker.number().numberBetween(0, 23);
    int minute = faker.number().numberBetween(0, 59);
    String timeValue = String.format("%02d:%02d", hour24, minute);

    // Elements
    private final By Attendance_button = By.xpath("//a[contains(text(),'View')]");
    private final By add_employee_training_button = By.xpath("//a[contains(@class, 'btn btn-secondary add-btn')]");
    private final By success_message = By.xpath("//div[contains(text(),'Training added successfully!')]");
    private final By Employee_dropdownElement = By.id("employee_id");
    private final By export_button = By.xpath("//button[contains(text(),'Export')]");

    private final By Training_Type_dropdownElement = By.name("training_type");
    private final By Training_name_dropdownElement = By.id("training_name");
    private final By Training_date = By.id("traning_date");
    private final By Training_expiry_date = By.id("expiry_date");
    private final By Training_Duration = By.id("duration");
    private final By Training_time = By.id("training_time");
    private final By employee_name = By.xpath("//*[@id=\"select2-employee_id-result-28qe-560\"]");
    private final By save_button = By.xpath("//button[text()='Save']");
    private final By export_pdf = By.xpath("//a[@class='dropdown-item delete_all'][1]");
    private final By export_CSV= By.xpath("//a[@class='dropdown-item delete_all'][2]");
    private final By three_dot_icon = By.xpath("//*[@id=\"tbodydata\"]/tr[1]/td[9]/div/button");

    private final By update_icon= By.xpath("//a[@class='dropdown-item' and @href='https://demo.siteassured.cvbtt.com/employee/training/attendus/edit/35']");
    private final By delete_button= By.xpath("//*[@id=\"tbodydata\"]/tr[1]/td[9]/div/div/form/button");
    private final By update_button= By.xpath("//*[@id=\"tbodydata\"]/tr[1]/td[9]/div/div/a");

    public void Add_employee()  {

            verify_navigation_to_employee_training_attendance();
            driver.element().click(Attendance_button);
            driver.element().click(add_employee_training_button);
            driver.waitUntil(ExpectedConditions.invisibilityOfElementLocated(By.id("load")));
            driver.element().click(Employee_dropdownElement);
            Select select = new Select((WebElement) Employee_dropdownElement);
            select.selectByValue("560");
            driver.element().select(Training_Type_dropdownElement, "medical");
            driver.element().type(Training_date, formatted_training_date);
            driver.element().type(Training_expiry_date, formatted_training_expiry_date);
            driver.element().type(Training_Duration, "3");
            driver.element().select(Training_name_dropdownElement, "South Coast medical");
            driver.element().type(Training_time, timeValue);
            driver.element().click(save_button);
            driver.element().assertThat(success_message).isVisible();

    }

   public void export_employee_training_report_pdf() {

            verify_navigation_to_employee_training_attendance();
            driver.element().click(Attendance_button);
            driver.element().click(export_button);
            driver.element().click(export_pdf);

    }
    public void export_employee_training_report_CSV() {

            verify_navigation_to_employee_training_attendance();
            driver.element().click(Attendance_button);
            driver.element().click(export_button);
            driver.element().click(export_CSV);

    }

    public void training_type_list() {

            verify_navigation_to_employee_training_attendance();
            driver.element().click(Attendance_button);
            driver.element().click(add_employee_training_button);
            driver.waitUntil(ExpectedConditions.invisibilityOfElementLocated(By.id("load")));
            Select dropdown = new Select(driver.getDriver().findElement(Training_Type_dropdownElement));

            // Get all options in the dropdown
            List<WebElement> allOptions = dropdown.getOptions();
            List<String> optionTexts = new ArrayList<>();
            for (WebElement option : allOptions) {
                optionTexts.add(option.getText());

                Validations.assertThat().object(optionTexts).contains("waso");
            }


        }
        public void update_training_report() {

                verify_navigation_to_employee_training_attendance();
                driver.element().click(Attendance_button);
                driver.element().click(three_dot_icon);
                driver.element().click(update_icon);
                driver.element().type(Training_Duration, "8");
                driver.element().click(update_button);
                driver.element().assertThat(export_button).isVisible();



        }
   public void delete_training_report() {

            verify_navigation_to_employee_training_attendance();
            driver.element().click(Attendance_button);
            driver.element().click(three_dot_icon);
            driver.element().click(delete_button);
            driver.alert().acceptAlert();

    }


    }







