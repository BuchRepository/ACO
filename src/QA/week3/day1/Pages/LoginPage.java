package QA.week3.day1.Pages;

/**
 * Created by Администратор on 20.10.2015.
 */

import QA.week3.day1.Utils.WebDriverWrapper;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by lavi on 10/16/2015.
 */
public class LoginPage extends Page{


    public LoginPage(WebDriverWrapper driver) throws Exception {
        super(driver);
    }

    public void fillEmailField() throws IOException {
        web.input("EmailField","admin");
    }

    public void fillPasswordField() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        web.clckLink("PassField");
        web.inputWithoutCleaning("PassFieldInput", "admin");
    }

    public void clickloginButton() throws IOException {
        web.clckLink("LoginButton");

        if (web.isElementPresent("Logo")) {
            //log.info
        } else {

            //log.ree
        }
        Assert.assertTrue(web.isElementPresent("Logo"), "Incorrect work login form");
    }


}