package com.iot.web.selenium.java.ui.page.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardPage {

    @FindBy(xpath = "//button[@aria-haspopup='true']")
    public WebElement userButton;

    @FindBy(xpath = "//li[text()='Sign out']")
    public WebElement signOutMenuOption;

    @FindBy(xpath = "//h1[text()='Dashboard']")
    public WebElement dashboardHeader;

    @Autowired
    public DashboardPage(final WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
