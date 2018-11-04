package com.iot.web.selenium.java.ui.page.home;

import com.iot.web.selenium.java.driver.WebDriverExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Home {

    @Autowired
    private HomePage page;

    @Autowired
    private WebDriverExtension webDriverExtension;

    public boolean isPricingSectionDisplayed() {
        return webDriverExtension.isInCurrentViewPort(page.pricingHeader);
    }

    public void gotoPricingSectionByToolbar() {
        page.pricingToolbarButton.click();
    }

    public void gotoPricingSectionByArrowButton() {
        page.pricingDropDownButton.click();
    }

    public void navigateToLogin() {
        page.loginButton.click();
    }

    public boolean pageIsOpened() {
        return page.banner.isDisplayed();
    }
}
