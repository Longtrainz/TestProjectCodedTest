package main.Runners;

import io.testproject.java.classes.DriverSettings;
import io.testproject.java.enums.DriverType;
import io.testproject.java.sdk.v2.Runner;
import io.testproject.java.sdk.v2.drivers.WebDriver;
import main.TestCases.LoginTestCase;

public class LoginTestCaseRunner {

    private final static String devToken = "NGRb1GbU7-OPkSJchaNHPHkkRUHRbUPKlVmQV4bWeaI1";

    public static void main(String[] args) throws Exception {

        DriverSettings driverSettings = new DriverSettings(DriverType.Chrome);
        try (Runner runner = new Runner(devToken, driverSettings)) {

            LoginTestCase loginTestCase = new LoginTestCase();
            WebDriver driver = runner.getDriver(loginTestCase);
            LoginPage loginPage = new LoginPage(driver);

            //Call actual actions
            driver.navigate().to("http://eaapp.somee.com/");

            //Click login link
            loginPage.clickLoginLink();

            //Enter username and password
            loginPage.enterLoginDetails("admin", "password");

            //Click loginbutton
            loginPage.clickLoginButton();

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
