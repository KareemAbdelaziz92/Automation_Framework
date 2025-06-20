package Tests;

import Pages.employee_training_attendance;
import Pages.homepage;
import Report.CustomReport;
import org.testng.annotations.Test;

public class employee_training_module_test extends BaseTest {
    public employee_training_attendance employee_training_attendance;
    public homepage homepage;
    private boolean testPassed = true;


      @Test (priority = 1)
    public void TC_01_Verify_that_trainers_can_add_employees_to_training_session() throws InterruptedException {

         boolean testPassed = true;
         try {
             employee_training_attendance = new employee_training_attendance(driver);
             employee_training_attendance.Add_employee();
         } catch (AssertionError e) {
             testPassed = false; }

         catch (Exception e) {  // Catches any other errors
             testPassed = false;}
         CustomReport.recordTestCase("verify_adding_employee_to_training_session",testPassed, "Employee_training_attendance_Page");
         }

  /*  @Test(priority = 2)
    public void TC_02_Verify_that_trainers_can_export_employee_training_attendance_pdf() throws InterruptedException {

        boolean testPassed = true;
        try {
            employee_training_attendance = new employee_training_attendance(driver);
            employee_training_attendance.export_employee_training_report_pdf();
        } catch (AssertionError e) {
            testPassed = false;
        } catch (Exception e) {  // Catches any other errors
            testPassed = false;
        }
        CustomReport.recordTestCase("Verify_that_trainers_can_export_employee_training_attendance_pdf", testPassed, "Employee_training_attendance_Page");
    }

    @Test(priority = 3)
    public void TC_03_Verify_that_trainers_can_export_employee_training_attendance_CSV() throws InterruptedException {

        boolean testPassed = true;
        try {
            employee_training_attendance = new employee_training_attendance(driver);
            employee_training_attendance.export_employee_training_report_CSV();
        } catch (AssertionError e) {
            testPassed = false;
        } catch (Exception e) {  // Catches any other errors
            testPassed = false;
        }
        CustomReport.recordTestCase("Verify_that_trainers_can_export_employee_training_attendance_CSV", true, "Employee_training_attendance_Page");
    }

    @Test (priority = 4)
    public void TC_04_Verify_that_training_types_are_selectable_from_apredefined_list() throws InterruptedException {

        boolean testPassed = true;
        try {
            employee_training_attendance = new employee_training_attendance(driver);
            employee_training_attendance.training_type_list();
        } catch (AssertionError e) {
            testPassed = false; }

        catch (Exception e) {  // Catches any other errors
            testPassed = false;}
        CustomReport.recordTestCase("Verify_that_training_types_are_selectable_from_apredefined_list",testPassed, "Employee_training_attendance_Page");
    }


    @Test (priority = 5)
    public void TC_05_Verify_that_admin_is_able_to_update_attendance  () throws InterruptedException {

        boolean testPassed = true;
        try {
            employee_training_attendance = new employee_training_attendance(driver);
            employee_training_attendance.update_training_report();
            Assert.assertTrue(false,"This is Failed Case" );
        } catch (AssertionError e) {
            testPassed = false; }

        catch (Exception e) {  // Catches any other errors
            testPassed = false;}
        CustomReport.recordTestCase("TC_05_Verify_that_admin_is_able_to_update_attendance",testPassed, "Employee_training_attendance_Page");
    }
    @Test (priority = 6)
    public void TC_06_Verify_that_admin_is_able_to_delete_attendance  () throws InterruptedException {

        boolean testPassed = true;
        try {
            employee_training_attendance = new employee_training_attendance(driver);
           employee_training_attendance.delete_training_report();
        } catch (AssertionError e) {
            testPassed = false; }

        catch (Exception e) {  // Catches any other errors
            testPassed = false;}
        CustomReport.recordTestCase("TC_06_Verify_that_admin_is_able_to_delete_attendance",testPassed, "Employee_training_attendance_Page");
    }*/
    }

