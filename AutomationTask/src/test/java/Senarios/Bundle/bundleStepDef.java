package Senarios.Bundle;


import DriverFactory.DriverFactory;
import Pages.BundleScreen;
import io.cucumber.java.en.*;
import org.junit.Assert;
import java.util.Objects;

public class bundleStepDef {

    BundleScreen bundleScreen = new BundleScreen(DriverFactory.getDriver());

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
