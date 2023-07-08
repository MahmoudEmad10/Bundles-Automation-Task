package Pages;

import java.lang.String;

import TestBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class bundleScreen extends Base {


    private static WebElement bundleLite;


    private static WebElement currencyLite;


    private static WebElement bundleClassic;


    private static WebElement currencyClassic;


    private static WebElement bundlePremium;


    private static WebElement currencyPremium;


    private static WebElement selectingKsa;


    private static WebElement selectingBahrain;


    private static WebElement selectingKuwait;


    private static WebElement currentCountry;

    public static WebElement getBundleLite() {
        return driver.findElement(By.id("name-lite"));
    }

    public static WebElement getBundleClassic() {
        return driver.findElement(By.id("name-classic"));
    }

    public static WebElement getBundlePremium() {
        return driver.findElement(By.id("name-premium"));
    }

    public static WebElement getCurrencyLite() {
        return driver.findElement(By.id("currency-lite"));
    }

    public static WebElement getCurrencyClassic() {
        return driver.findElement(By.id("currency-classic"));
    }

    public static WebElement getCurrencyPremium() {
        return driver.findElement(By.id("currency-premium"));
    }

    public static WebElement getSelectingBahrain() {
        return driver.findElement(By.id("bh"));
    }


    public static WebElement getSelectingKuwait() {
        return driver.findElement(By.id("kw"));
    }

    public static WebElement getCurrentCountry() {
        return driver.findElement(By.id("country-name"));
    }

    public static WebElement getSelectingKsa() {
        return driver.findElement(By.id("sa"));
    }

    public static void selectKsaCountry() {
        bundleScreen.getCurrentCountry().click();
        bundleScreen.getSelectingKsa().click();
    }

    public static void selectBahrainCountry() {
        bundleScreen.getCurrentCountry().click();
        bundleScreen.getSelectingBahrain().click();
    }

    public static void selectKuwaitCountry() {
        bundleScreen.getCurrentCountry().click();
        bundleScreen.getSelectingKuwait().click();
    }

    public static void clickOnCurrentCountry() {
        bundleScreen.getCurrentCountry().click();
    }

}
