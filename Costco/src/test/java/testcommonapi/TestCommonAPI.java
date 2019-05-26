package testcommonapi;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestCommonAPI extends CommonAPI {

    @Test(enabled = false)
    public void getTextFromWebElementsTest() {
        CommonAPI.getTextFromWebElements("#navigation-dropdown");
    }

    @Test(enabled = false)
    public void typeOnElementNEnterTest() {
        CommonAPI.typeOnElementNEnter("#search-field", "tables");

    }

    @Test(enabled = false)
    public void clickOnCssTest() {
        clickOnCss("#Home_Ancillary_0");
    }

    @Test(enabled = false)
    public void clickOnElementTest() {
        clickOnElement("#Home_Ancillary_2");
    }

    @Test(enabled = false)
    public void typeOnInputFieldTest() {
        typeOnElementNEnter("#search-field", "tables");
        sleepFor(5);
        clearInputField("#search-field");
    }

    @Test(enabled = false)
    public void clickByXpathTest() {
        clickByXpath("//*[@id=\"header_sign_in\"]");
        System.out.println(getCurrentPageUrl());
    }

    @Test(enabled = true)
    public void getTextByCssTest() {
        System.out.println(getTextByCss("#Home_Ancillary_7"));

    }


}


