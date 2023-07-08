package StepDefinitions;

import TestBase.Base;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Pages.bundleScreen;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Objects;

public class MyStepdefs extends bundleScreen {


    @Given("^User open bundles page$")
    public void userOpenBundlesPage() {
        Base.launch();
    }

    @When("current country is KSA")
    public void currentCountryIs() {
        bundleScreen.clickOnCurrentCountry();
        String actualCountry = bundleScreen.getCurrentCountry().getText();
        String expectedCountry = "KSA";
        Assert.assertEquals(expectedCountry, actualCountry);
        bundleScreen.clickOnCurrentCountry();
    }

    @Then("^Type of the bundle should be \\\"(.*?)\\\" and price should be \\\"(.*?)\\\" and currency should be \\\"(.*?)\\\"$")
    public void typeOfTheBundleShouldBeTypeAndPriceShouldBePriceAndCurrencyShouldBeCurrency(String type, String price, String currency) {

        if (Objects.equals(type, "LITE")) {
            String actualTypeLiteBundle = bundleScreen.getBundleLite().getText();
            String TotalCurrencyLiteBundle = bundleScreen.getCurrencyLite().getText();
            String[] actualPriceLiteBundle = TotalCurrencyLiteBundle.split(" ");
            String[] actualCurrencyLiteBundle = TotalCurrencyLiteBundle.split(" ");
            Assert.assertEquals(type, actualTypeLiteBundle);
            Assert.assertEquals(price, actualPriceLiteBundle[0]);
            Assert.assertEquals(currency, actualCurrencyLiteBundle[1]);
        } else if (Objects.equals(type, "CLASSIC")) {
            String actualTypeClassicBundle = bundleScreen.getBundleClassic().getText();
            String TotalCurrencyClassicBundle = bundleScreen.getCurrencyClassic().getText();
            String[] actualPriceClassicBundle = TotalCurrencyClassicBundle.split(" ");
            String[] actualCurrencyClassicBundle = TotalCurrencyClassicBundle.split(" ");
            Assert.assertEquals(type, actualTypeClassicBundle);
            Assert.assertEquals(price, actualPriceClassicBundle[0]);
            Assert.assertEquals(currency, actualCurrencyClassicBundle[1]);
        } else if (Objects.equals(type, "PREMIUM")) {
            String actualTypePremiumBundle = bundleScreen.getBundlePremium().getText();
            String TotalCurrencyPremiumBundle = bundleScreen.getCurrencyPremium().getText();
            String[] actualPricePremiumcBundle = TotalCurrencyPremiumBundle.split(" ");
            String[] actualCurrencyPremiumBundle = TotalCurrencyPremiumBundle.split(" ");
            Assert.assertEquals(type, actualTypePremiumBundle);
            Assert.assertEquals(price, actualPricePremiumcBundle[0]);
            Assert.assertEquals(currency, actualCurrencyPremiumBundle[1]);
        }
        Base.close();
    }

    @When("^selecting a \"([^\"]*)\"$")
    public void selectingCountry(String country) {

        if (Objects.equals(country, "KSA")) {
            bundleScreen.selectKsaCountry();
        } else if (Objects.equals(country, "Bahrain")) {
            bundleScreen.selectBahrainCountry();
        } else if (Objects.equals(country, "Kuwait")) {
            bundleScreen.selectKuwaitCountry();
        }

    }
}
