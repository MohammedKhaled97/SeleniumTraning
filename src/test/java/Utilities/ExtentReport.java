package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import java.io.IOException;

public abstract class ExtentReport  {
  public   static ExtentHtmlReporter htmlReporter;
   public static ExtentReports extent;

    public static ExtentReports ExtentReport() throws IOException {

        htmlReporter = new ExtentHtmlReporter("ExtentReports\\ExtentReport.html");



        htmlReporter.config().setDocumentTitle("Extent Report");
        htmlReporter.config().setReportName("Extent Report");
        htmlReporter.config().setTheme(Theme.STANDARD);




        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);


        return extent;
    }


}
