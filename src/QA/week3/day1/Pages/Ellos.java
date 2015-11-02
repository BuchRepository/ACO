package QA.week3.day1.Pages;

/**
 * Created by Администратор on 20.10.2015.
 */

import QA.week3.day1.Utils.WebDriverWrapper;
import QA.week3.day1.Utils.WebElementsActions;

/**
 * Created by ViTaLES on 18.10.2015.
 */
public class Ellos {

    public WebElementsActions web;
    public MainPage mainPage;
    public LoginPage loginPage;

    public Ellos(WebDriverWrapper driver) throws Exception {
        web = new WebElementsActions(driver);
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
    }
}
