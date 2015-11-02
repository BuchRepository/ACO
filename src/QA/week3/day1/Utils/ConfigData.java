package QA.week3.day1.Utils;

/**
 * Created by Администратор on 20.10.2015.
 */
import org.openqa.selenium.By;
import java.io.*;
import java.util.Properties;

/**
 * Created by ViTaLES on 10.10.2015.
 */
public class ConfigData {

    public static String uiMappingFile = "src/UIMapping.properties";

    public static String getValueFromFile(String key, String fileName) throws IOException {
        Properties p = new Properties();

        p.load(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));  //InputStreamReader is bridge from stream byte to character  streams

        return (p.getProperty(key));
    }

    public static By ui(String key) throws IOException {  //Question What is it?
        String[] partsOfLocators = getValueFromFile(key, uiMappingFile).split("\"");
        String findMetod = partsOfLocators[0].substring(0, partsOfLocators[0].length() - 1);//Why '0' - there --> partsOfLocators[0].length
        String target = partsOfLocators[1];

/*        System.out.println(key);                //Logo
        System.out.println(partsOfLocators[0]); //cssSelector(
        System.out.println(findMetod);          //cssSelector
        System.out.println(target);             //.ellos.active*/

        // name.
        if (findMetod.equals("id")) {
            return By.id(target);
        } else {
            if (findMetod.equals("xpath")) {
                return By.xpath(target);
            } else {
                if (findMetod.equals("cssSelector")) {
                    return By.cssSelector(target);
                } else {
                    return By.partialLinkText(target);
                }
            }
        }
    }
}

