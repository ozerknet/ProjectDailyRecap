package com.daily.stepDefinitions;

import com.daily.pages.linkedIn.linkedInMainPage;
import com.daily.pages.vNova.vNovaMainPage;
import com.daily.utilities.ConfigurationReader;
import com.daily.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class linkedInStepDefs {

    linkedInMainPage linkedInMainPage = new linkedInMainPage();

    @When("user go to linkedIn webpage")
    public void user_go_to_linked_in_webpage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("linkedInUrl"));
    }

    @Then("user click to sign in button")
    public void user_click_to_sign_in_button() {
        linkedInMainPage.signInButton.click();
    }

    @When("user enter username and password")
    public void user_enter_username_and_password() {
        linkedInMainPage.userNameInput.sendKeys(ConfigurationReader.getProperty("linkedInUserName"));
        linkedInMainPage.passwordInput.sendKeys(ConfigurationReader.getProperty("linkedInPassword"));
        linkedInMainPage.LoginButton.click();

    }

    @Then("user click to quality assurance text")
    public void user_click_to_quality_assurance_text() {
        linkedInMainPage.qualityAssuranceText.click();
    }

    @Then("user click Date Posted and select past twenty four hours")
    public void user_click_date_posted_and_select_past_twenty_four_hours() {
        linkedInMainPage.datePosted.click();
        linkedInMainPage.pastTwentyFourHours.click();
    }

}
