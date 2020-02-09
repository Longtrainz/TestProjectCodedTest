package main.Runners;

import io.testproject.java.sdk.v2.drivers.WebDriver;
import io.testproject.java.sdk.v2.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "loginLink")
    private WebElement loginLink;

    @FindBy(id = "UserName")
    private WebElement usernameInput;

    @FindBy(id = "Password")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Log in']")
    private WebElement loginButton;


    public void clickLoginLink() {
        loginLink.click();
    }

    public void enterLoginDetails(String userName, String password) {
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
       loginButton.submit();
    }

}
