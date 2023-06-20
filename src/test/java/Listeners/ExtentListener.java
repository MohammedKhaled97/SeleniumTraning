package Listeners;

import Challenge_Tests.TestBase;
import Utilities.ExtentReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.testng.*;

import java.io.IOException;

public class ExtentListener  implements ITestListener  {

    ExtentReports extent = ExtentReport.ExtentReport();
    public static ExtentTest OB;

    public ExtentListener() throws IOException {
    }

    @Override
    public void onTestStart(ITestResult result) {
        OB = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS) {

            OB.log(Status.PASS, "Passed case :" + result.getName());
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            OB.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Failed Case", ExtentColor.RED));
            OB.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Failed Case", ExtentColor.RED));
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        if (result.getStatus() == ITestResult.SKIP) {
            OB.log(Status.SKIP, "Test Case Skip :" + result.getName());
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
    public void onFinish(ITestContext context) {

        extent.flush();
    }


}
