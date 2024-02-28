package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.DashboardPage;

import java.time.Duration;



public class Setup {
    public WebDriver driver;
    public DashboardPage dashboardPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterTest
    public void closeDriver() throws InterruptedException {
        //This is the constructor of the DashboardPage class.
        // It takes a WebDriver object as a parameter. Inside the constructor
        ////dashboardPage = new DashboardPage((driver));
       // dashboardPage.doLogout();
        driver.quit();
    }

}
