package QA.week3.day1.Pages;


import QA.week3.day1.Utils.ClassNameUtil;
import QA.week3.day1.Utils.WebDriverWrapper;
import QA.week3.day1.Utils.WebElementsActions;
import org.apache.log4j.Logger;
import org.testng.Assert;

import static QA.week3.day1.Utils.ConfigData.ui;

/**
 * Created by Администратор on 20.10.2015.
 */
public abstract class Page {

    private String PAGE_URL;
    public WebDriverWrapper driverWrapper; //?
    public WebElementsActions web;

    static final Logger log = Logger.getLogger(ClassNameUtil.getCurrentClassName());//?

    public Page (WebDriverWrapper dr, String page) {
        driverWrapper = dr;
        PAGE_URL = page;
        web = new WebElementsActions(driverWrapper);
    }

    public Page(WebDriverWrapper driver) {
        this.driverWrapper = driver;
    }

    public boolean openPage(){
        try{
            log.info("Start open page");
            driverWrapper.get(PAGE_URL);
        } catch (Exception e) {
            log.error("Error in open page");
            return false;
        }
        log.info("Page open successful");
        return true;
    }

    public boolean isOpenPage(String checkLocator){
        try{
            log.info("Page: check is page open. "+checkLocator+" is present!");
            driverWrapper.findElement(ui(checkLocator)).isEnabled();// isEnabled?
        } catch (Exception e){
            log.error("Page: Error with check page.");
            Assert.fail("Incorrect swatch");
            return  false;
        }
        log.info("Page is open");
        return true;
    }

    public  String getTitle(){
        return  driverWrapper.getTitle();
    }
}
