package QA.week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Администратор on 23.10.2015.
 */
public class RegistrationPage extends Page{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public  RegistrationPage setRegistrationField(WebDriver driver1){
        driver1.findElement(By.id("textEmail")).sendKeys("email");
        driver1.findElement(By.id("textRepeatEmail")).sendKeys("repeatEmail");
        driver1.findElement(By.id("textPasswordText")).sendKeys("Password");
        driver1.findElement(By.cssSelector("#ctl00_ctl00_conMain_conMain_RegisterUserControl_buttonRegister")).sendKeys("Password");
        return new RegistrationPage(driver);
    }
}
