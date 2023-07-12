package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BundleScreen  {

  private static WebDriver driver;
   public BundleScreen(WebDriver driver){
       this.driver=driver;
   }

    public  WebElement getBundleLite() {
        return driver.findElement(By.id("name-lite"));
    }

    public WebElement getBundleClassic() {
        return driver.findElement(By.id("name-classic"));
    }

    public WebElement getBundlePremium() {
        return driver.findElement(By.id("name-premium"));
    }

    public WebElement getCurrencyLite() {
        return driver.findElement(By.id("currency-lite"));
    }

    public WebElement getCurrencyClassic() {
        return driver.findElement(By.id("currency-classic"));
    }

    public WebElement getCurrencyPremium() {
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
        BundleScreen.getCurrentCountry().click();
        BundleScreen.getSelectingKsa().click();
    }

    public static void selectBahrainCountry() {
        BundleScreen.getCurrentCountry().click();
        BundleScreen.getSelectingBahrain().click();
    }

    public static void selectKuwaitCountry() {
        BundleScreen.getCurrentCountry().click();
        BundleScreen.getSelectingKuwait().click();
    }

    public static void clickOnCurrentCountry() {
        BundleScreen.getCurrentCountry().click();
    }

}
