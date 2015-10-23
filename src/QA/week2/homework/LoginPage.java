package QA.week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage method() {
        driver.findElement(By.cssSelector("#ctl00_ctl00_conMain_conMain_LoginControl_LoginUsername")).sendKeys("fcmalin@gmail.com");
        driver.findElement(By.cssSelector("#LoginPasswordText")).sendKeys("123345");
        driver.findElement(By.cssSelector("#ctl00_ctl00_conMain_conMain_LoginControl_LoginButton>span")).click();
        return new LoginPage(driver);
    }
}