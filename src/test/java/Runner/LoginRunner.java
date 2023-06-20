package Runner;


import Challenge_Tests.TestBase;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/Features/Login.feature"
        ,glue = {"StepDefinition"}
        ,plugin = {"pretty","html:target/cucumber-html-report.html"},
        publish = true)
class LoginRunner extends TestBase {


}
