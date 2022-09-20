package com.daily.pages.linkedIn;

import com.daily.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class linkedInMainPage {

    public linkedInMainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn__primary--large from__button--floating']")
    public WebElement LoginButton;

    @FindBy(xpath = "(//span[@class='jobs-home-soho-search-card__truncated-text t-14 t-black t-bold'])[1]")
    public WebElement qualityAssuranceText;


    @FindBy(xpath = "//span[@id='ember261']")
    public WebElement datePosted;

    @FindBy(xpath = "(//span[@class='t-14 t-black--light t-normal'])[4]")
    public WebElement pastTwentyFourHours;


}
