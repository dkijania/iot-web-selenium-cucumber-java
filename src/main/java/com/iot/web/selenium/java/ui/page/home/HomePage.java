package com.iot.web.selenium.java.ui.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomePage {

    @FindBy(xpath = "//button[span[text()='Login']]")
    public WebElement loginButton;

    @FindBy(xpath = "//button[span[text()='Pricing']]")
    public WebElement pricingToolbarButton;

    @FindBy(xpath = "//h1[text()='Pricing']")
    public WebElement pricingHeader;

    @FindBy(xpath = "//button[@aria-label='ArrowDropDown']")
    public WebElement pricingDropDownButton;

    @FindBy(xpath = "//h1[text()='Chariot']")
    public WebElement banner;

    @Autowired
    public HomePage(final WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
