package QA.week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage search(WebDriver driver1) {
        driver1.findElement(By.cssSelector("#showlogin>span")).click();
        return new LoginPage(driver);
    }
}