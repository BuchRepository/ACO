package QA.week2.homework;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GoogleTestPage{
    private WebDriver driver;
    public static final Logger LOG=Logger.getLogger(GoogleTestPage.class);

    @Before
    public void before(){
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.ellos.se/");
    }

    @After
    public void after(){
        driver.close();
    }

    @Test
    public void test() {
        LOG.info("Create class HomePage --> page enters");
        HomePage page = new HomePage(driver);
        LoginPage loginPage = page.search(driver);
        loginPage.method();
        RegistrationPage reg = new RegistrationPage(driver);
        reg.setRegistrationField(driver);
    }
}