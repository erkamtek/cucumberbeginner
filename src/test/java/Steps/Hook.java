package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;


public class Hook extends BaseUtil{


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {

        System.out.println("Opening the browser");
        System.setProperty("webdriver.firefox.marionette", "‎/Users/tek/Downloads/Software/geckodriver");
        driver = new FirefoxDriver();
        driver.navigate().to("www.google.com");




    }


    @After
    public void TearDownTest(Scenario scenario) {
        driver.close();
        System.out.println("Closing the browser");
    }

}
