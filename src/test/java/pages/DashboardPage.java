package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    @FindBy(className ="oxd-userdropdown-icon")
    public WebElement btnProfileTab;


    @FindBy(className = "oxd-userdropdown-link")
    public List<WebElement> LogOutLink ;

    //@FindBy(className = "oxd-main-menu-item--name")
    //public List<WebElement> Menus;

    // DashboardPage(WebDriver driver) is a constructor for class Dashboard
    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doLogout() throws InterruptedException {
       btnProfileTab.click();
       Thread.sleep(1000);
       LogOutLink.get(3).click();
    }

}
