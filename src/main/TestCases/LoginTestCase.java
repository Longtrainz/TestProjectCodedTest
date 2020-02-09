package main.TestCases;

import io.testproject.java.sdk.v2.drivers.WebDriver;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import io.testproject.java.sdk.v2.exceptions.FailureException;
import io.testproject.java.sdk.v2.tests.WebTest;
import io.testproject.java.sdk.v2.tests.helpers.WebTestHelper;
import main.Runners.LoginPage;

public class LoginTestCase implements WebTest {


    @Override
    public ExecutionResult execute(WebTestHelper webTestHelper) throws FailureException {
        WebDriver driver = webTestHelper.getDriver();
        LoginPage loginPage = new LoginPage(driver);

        //Call actual actions
        driver.navigate().to("http://eaapp.somee.com/");

        //Click login link
        loginPage.clickLoginLink();

        //Enter username and password
        loginPage.enterLoginDetails("admin", "password");

        //Click loginbutton
        loginPage.clickLoginButton();

        return ExecutionResult.PASSED;
    }
}
