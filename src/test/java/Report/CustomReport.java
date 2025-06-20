package Report;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

public class CustomReport {
    private static final String REPORT_FOLDER = "reports";
    private static final String REPORT_FILE = REPORT_FOLDER + "/test_report.html";
    private static StringBuilder reportContent = new StringBuilder();
    private static Map<Integer, String[]> testResults = new LinkedHashMap<>();
    private static int testCaseCounter = 1;
    private static int passedTests = 0;
    private static int failedTests = 0;

    // ✅ Ensure the reports folder exists
    private static void createReportsFolder() {
        File folder = new File(REPORT_FOLDER);
        if (!folder.exists()) {
            boolean created = folder.mkdirs();
            if (!created) {
                System.err.println("⚠️ ERROR: Failed to create reports folder!");
            }
        }
    }

    // ✅ Start the Report (Initialize Header and Logo)
    public static void startReport() {
        createReportsFolder();
        reportContent.setLength(0);
        reportContent.append("<html><head><title>Test Report</title>");

        // ✅ Add Pie Chart JavaScript (Google Charts)
        reportContent.append("<script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>");
        reportContent.append("<script type=\"text/javascript\">");
        reportContent.append("google.charts.load('current', {'packages':['corechart']});");
        reportContent.append("google.charts.setOnLoadCallback(drawChart);");
        reportContent.append("function drawChart() {");
        reportContent.append("var data = google.visualization.arrayToDataTable([");
        reportContent.append("['Result', 'Count'],");
        reportContent.append("['PASSED', 0],");
        reportContent.append("['FAILED', 0]");
        reportContent.append("]);");
        reportContent.append("var options = {title: 'Test Execution Summary', is3D: true};");
        reportContent.append("var chart = new google.visualization.PieChart(document.getElementById('piechart'));");
        reportContent.append("chart.draw(data, options);}");
        reportContent.append("</script>");

        // ✅ Add Styling
        reportContent.append("<style>");
        reportContent.append("body { font-family: Arial, sans-serif; margin: 20px; padding: 20px; }");
        reportContent.append("h1 { color: #333; text-align: center; }");
        reportContent.append(".logo { display: block; margin: 0 auto; width: 150px; }");
        reportContent.append("table { width: 60%; margin: auto; border-collapse: collapse; margin-top: 20px; }");
        reportContent.append("th, td { border: 2px solid #ddd; padding: 10px; text-align: center; }");
        reportContent.append("th { background-color: #007BFF; color: white; }");
        reportContent.append("tr:nth-child(even) { background-color: #f2f2f2; }");
        reportContent.append("</style>");

        reportContent.append("</head><body>");
        reportContent.append("<img src='logo.png' class='logo' alt='Company Logo'>");
        reportContent.append("<h1>Test Execution Report</h1>");
        reportContent.append("<div id=\"piechart\" style=\"width: 600px; height: 400px; margin: auto;\"></div>");
    }

    // ✅ Capture test case number, name, result, and timestamp
    public static void recordTestCase(String testName, boolean testPassed , String Pagename) {
        String result ;
        if (testPassed== true) {
            result = "<span style='color:green;'>PASSED ✅</span>";
            passedTests++;

        } else  {
            testPassed= false ;
            result = "<span style='color:red;'>FAILED ❌</span>";
            failedTests++;
        }

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        testResults.put(testCaseCounter, new String[]{testName, result, timestamp,Pagename});
        testCaseCounter++;

        System.out.println("Total Passed: " + passedTests);
        System.out.println("Total Failed: " + failedTests);

    }


    // ✅ Generate the final report with Pie Chart Data
    public static void finalizeReport() {
        // ✅ Update Pie Chart Data
        reportContent.append("<script type=\"text/javascript\">");
        reportContent.append("function drawChart() {");
        reportContent.append("var data = google.visualization.arrayToDataTable([");
        reportContent.append("['Result', 'Count'],");
        reportContent.append("['PASSED', ").append(passedTests).append("],");
        reportContent.append("['FAILED', ").append(failedTests).append("]");
        reportContent.append("]);");
        reportContent.append("var options = {title: 'Test Execution Summary', is3D: true};");
        reportContent.append("var chart = new google.visualization.PieChart(document.getElementById('piechart'));");
        reportContent.append("chart.draw(data, options);}");
        reportContent.append("google.charts.setOnLoadCallback(drawChart);");
        reportContent.append("</script>");

        // ✅ Add Table
        reportContent.append("<table>");
        reportContent.append("<tr><th>#</th><th>Test Case Name</th><th>Result</th><th>Timestamp</th></tr>");

        for (Map.Entry<Integer, String[]> entry : testResults.entrySet()) {
            reportContent.append("<tr><td>").append(entry.getKey()).append("</td><td>")
                    .append(entry.getValue()[0]).append("</td><td>")
                    .append(entry.getValue()[1]).append("</td><td>")
                    .append(entry.getValue()[2]).append("</td></tr>");
        }

        reportContent.append("</table>");
        reportContent.append("</body></html>");

        try {
            createReportsFolder();
            File reportFile = new File(REPORT_FILE);
            try (FileWriter writer = new FileWriter(reportFile, false)) {
                writer.write(reportContent.toString());
                writer.flush();
            }

            System.out.println("✅ Test report generated: " + reportFile.getAbsolutePath());

            //✅ Automatically open the report
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(reportFile.toURI());
            } else {
                System.out.println("⚠️ Open the file manually: " + reportFile.getAbsolutePath());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
