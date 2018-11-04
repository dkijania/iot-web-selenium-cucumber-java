package com.iot.web.selenium.java.ui.page.dashboard;

import com.iot.web.selenium.java.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dashboard {

    @Autowired
    private DashboardPage page;

    public void signOut() {
        page.userButton.click();
        page.signOutMenuOption.click();
    }

    public boolean pageIsOpened() {
        return page.dashboardHeader.isDisplayed();
    }
}
