package  Tests;

import Report.CustomReport;
import org.testng.annotations.Test;
import Pages.homepage;
import Pages.employee;

public class employee_test extends BaseTest {
    public employee employee;
    public homepage homepage;
    private boolean testPassed = true;


    @Test (priority = 1)
    public void verify_create_employee() throws InterruptedException {

        boolean testPassed = true;
        try {

            employee = new employee(driver);
            employee.create_employee();
        } catch (AssertionError e) {
            testPassed = false; }

        catch (Exception e) {  // Catches any other errors
            testPassed = false;}
        CustomReport.recordTestCase("Verify creation of an Employee",true, "Employee Page");
        }

    @Test (priority = 2)
    public void verify_update_employee() throws InterruptedException {

        boolean testPassed = true;
        try {

            employee = new employee(driver);
            employee.update_employee();
        } catch (AssertionError e) {
            testPassed = false; }

        catch (Exception e) {  // Catches any other errors
            testPassed = false;}
        CustomReport.recordTestCase("verify update of an employee", true, "Employee Page");
    }

    @Test (priority = 3)
    public void verify_switch_employee_role() throws InterruptedException {

        boolean testPassed = true;
        try {

            employee = new employee(driver);
            employee.switch_role_employee();
        } catch (AssertionError e) {
            testPassed = false; }

        catch (Exception e) {  // Catches any other errors
            testPassed = false;}
        CustomReport.recordTestCase("verify switching role of an employee", true, "Employee Page");
    }

    @Test (priority = 4)
    public void verify_change_employee_permission() throws InterruptedException {

        boolean testPassed = true;
        try {

            employee = new employee(driver);
            employee.change_permission_employee();
        } catch (AssertionError e) {
            testPassed = false; }

        catch (Exception e) {  // Catches any other errors
            testPassed = false;}
        CustomReport.recordTestCase("verify change employee permission", true, "Employee Page");
    }
    @Test (priority = 5)
    public void verify_change_contractor_company() throws InterruptedException {

        boolean testPassed = true;
        try {

            employee = new employee(driver);
            employee.change_contractor_company();
        } catch (AssertionError e) {
            testPassed = false; }

        catch (Exception e) {  // Catches any other errors
            testPassed = false;}
        CustomReport.recordTestCase("verify that employee cannot change contractor company", true, "Employee Page");
    }
    @Test (priority = 6)
    public void verify_delete_employee() throws InterruptedException {

        boolean testPassed = true;
        try {

            employee = new employee(driver);
            employee.delete_employee();
        } catch (AssertionError e) {
            testPassed = false; }

        catch (Exception e) {  // Catches any other errors
            testPassed = false;}
        CustomReport.recordTestCase("verify deletion of an employee", true, "Employee Page");
        if (!testPassed) {
            throw new AssertionError("Test case failed: Verify Deletion of an Employee");

        }

    }
}
