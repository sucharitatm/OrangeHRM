package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage {
    @FindBy(className = "oxd-text--span")
    public List<WebElement> button;

    @FindBy(className = "oxd-topbar-body-nav-tab-item")
    public List<WebElement> addempbutton;

    @FindBy(css = "[name = firstName]")
    public WebElement txtFirstName;

    @FindBy(css = "[name = middleName]")
    public WebElement txtMiddleName;

    @FindBy(css = "[name = lastName]")
    public WebElement txtLastname;

    @FindBy(className = "oxd-input--active")
    public List<WebElement> txtEmployeeID;


    @FindBy(className = "oxd-input--active")
    public List<WebElement> txtsearchempid;

    @FindBy(tagName = "input")
    public List<WebElement> txtsearchempname;


    @FindBy(className = "oxd-switch-input")
    public WebElement btnToggle;

    @FindBy(tagName = "input")
    public List<WebElement> txtUserName;

    @FindBy(tagName = "input")
    public List<WebElement> txtPassword;

    @FindBy(tagName = "input")
    public List<WebElement> txtConfirmPassword;

    @FindBy(css= "[type = submit]")
    public WebElement Submit;

    @FindBy(tagName = "input")
    public List<WebElement> txtSearchEmpName;

    @FindBy(tagName = "button")
    public List<WebElement> btnUpdateEmployee;
    @FindBy(className = "oxd-input")
    public List<WebElement> txtUpdateEmployeeId;

    @FindBy(className = "bi-caret-down-fill")
    public List<WebElement> txtEmployeeinfodropdown;

    @FindBy(className = "oxd-topbar-body-nav-tab-item")
    public List<WebElement> txtEmployeeList;



    //constructor
    public PIMPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //Create employee with username
    public void

    createEmployee(String firstname, String middlename, String lastname, String employeeId, String username, String password, String confirmpassword) throws InterruptedException{
        button.get(1).click();
        Thread.sleep(500);
        addempbutton.get(2).click();
        txtFirstName.sendKeys(firstname);
        txtMiddleName.sendKeys(middlename);
        txtLastname.sendKeys(lastname);
        WebElement empID = txtEmployeeID.get(3);
        Thread.sleep(1000);
        empID.clear();
        empID.sendKeys(Keys.CONTROL + "a");
        empID.sendKeys(employeeId);

        btnToggle.click();

        txtUserName.get(7).sendKeys(username);
        txtPassword.get(10).sendKeys(password);
        txtConfirmPassword.get(11).sendKeys(confirmpassword);
        Thread.sleep(2000);
        Submit.click();

    }

    //Create employee without username
    public void
    createEmployeeWithoutUserName(String firstname, String middlename, String lastname, String employeeId) throws InterruptedException{
        button.get(1).click();
        Thread.sleep(2000);
        addempbutton.get(2).click();

        txtFirstName.sendKeys(firstname);
        txtMiddleName.sendKeys(middlename);
        Thread.sleep(5000);
        txtLastname.sendKeys(lastname);
        WebElement empID = txtEmployeeID.get(3);
        Thread.sleep(5000);
        empID.clear();
        empID.sendKeys(Keys.CONTROL + "a");
        empID.sendKeys(employeeId);
        Thread.sleep(5000);
        Submit.click();
            }



    // Search employee by valid id
    public void SearchEmployeeByValidId(String employeeID) throws InterruptedException {
        button.get(1).click();
        txtEmployeeList.get(1).click();
        Thread.sleep(5000);
        txtsearchempid.get(1).sendKeys(employeeID);
        //txtEmployeeID.get(1).sendKeys(employeeID);
        Thread.sleep(5000);
        Submit.click();

    }
    // Search employee by valid name
    public void SearchEmployeeByvalidname(String employeename) throws InterruptedException {
        button.get(1).click();
        txtEmployeeList.get(1).click();
        //txtEmployeeinfodropdown.get(1).click();
        Thread.sleep(5000);
        txtsearchempname.get(1).sendKeys(employeename);
        Thread.sleep(5000);
        Submit.click();

    }




}














