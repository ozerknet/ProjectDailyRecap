package com.daily.stepDefinitions;

import com.daily.pages.vNova.vNovaMainPage;
import com.daily.utilities.BrowserUtils;
import com.daily.utilities.ConfigurationReader;
import com.daily.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;

public class vNovaStepDefs {

    vNovaMainPage mainPage = new vNovaMainPage();

    @Given("user go to website")
    public void user_go_to_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nNovaUrl"));
    }

    @Given("user write to qa search area amd click search")
    public void user_write_to_qa_search_area_amd_click_search() {
        BrowserUtils.waitFor(4);
        mainPage.inputSearchArea.sendKeys("qa"+Keys.ENTER);
        mainPage.searchButton.click();

    }

}
