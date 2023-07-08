package TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Base {

    public static WebDriver driver = new ChromeDriver();


    public static void launch() {
        try {
            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
            String url = "https://subscribe.stctv.com/sa-en";
            driver.get(url);
            driver.manage().window().maximize();
            driver.wait(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        driver.close();
    }
}
