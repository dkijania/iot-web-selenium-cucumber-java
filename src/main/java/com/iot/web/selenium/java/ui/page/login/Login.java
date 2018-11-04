package com.iot.web.selenium.java.ui.page.login;

import com.iot.web.selenium.java.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Login {

    @Autowired
    private LoginPage page;

    public void login(User user) {
        page.emailInput.sendKeys(user.getUsername());
        page.passwordInput.sendKeys(user.getPassword());
        page.signInButton.click();
    }

    public boolean pageIsOpened() {
        return page.signInHeader.isDisplayed();
    }
}
