package com.daily.pages.vNova;

import com.daily.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vNovaMainPage {

    public void vNovaMainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='jsb_f_keywords_i']")
    public WebElement inputSearchArea;

    @FindBy(xpath = "//input[@id='jsb_form_submit_i']")
    public WebElement searchButton;


}
