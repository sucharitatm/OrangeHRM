package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    @FindBy(name = "username")
    public static WebElement txtUserName;

    @FindBy(name ="password")
    public static WebElement txtPassword;

    @FindBy(css = "[type = submit]")
    public  WebElement btnLogin;

    @FindBy(tagName = "p")
    public List<WebElement> lblInvalidCreds;



    // Constructor for class LoginPage
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String username,String password) throws InterruptedException {
        txtUserName.sendKeys(username);
        txtPassword.sendKeys(password);
        Thread.sleep(1000);
        btnLogin.click();

    }

    public String doLoginWithInvalidCreds(String username, String password) throws InterruptedException{
        txtUserName.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();
        Thread.sleep(1000);
        return lblInvalidCreds.get(0).getText();

    }

}
