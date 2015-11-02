package QA.week1;


import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

 /*
 * Created by Администратор on 07.10.2015.
 */
public class FirstTest {
     private static WebDriver driver;
     private static String baseUrl;
     static WebElementsAction web;

       @BeforeClass
        public static void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "http://ellos.se";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            web = new WebElementsAction(driver);
        }

        @Test
        public void test1() throws Exception {
            driver.get(baseUrl);

            driver.findElement(By.cssSelector("[id='showlogin']")).click(); //Logo
            driver.findElement(By.cssSelector("#showlogin>span")).click(); //login link
            driver.findElement(By.cssSelector("#ctl00_ctl00_conMain_conMain_LoginControl_LoginUsername")).click();
            driver.findElement(By.cssSelector("#ctl00_ctl00_conMain_conMain_LoginControl_LoginUsername")).sendKeys("fcmalin@gmail.com");
            driver.findElement(By.cssSelector("#LoginPasswordText")).sendKeys("vfhufhbnf1895");
            driver.findElement(By.cssSelector("#ctl00_ctl00_conMain_conMain_LoginControl_LoginButton")).click();

            Assert.assertTrue("Incorrect work login form", driver.findElement(By.cssSelector(".ellos.active")).isDisplayed());
            System.out.println("FirstTest.test1");

        }

        @AfterClass
        public static void tearDown() throws Exception {
            driver.quit();
        }
}
