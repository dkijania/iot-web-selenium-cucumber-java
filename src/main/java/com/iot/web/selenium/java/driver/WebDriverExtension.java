package com.iot.web.selenium.java.driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebDriverExtension {

    @Autowired
    private WebDriver webDriver;

    public boolean isInCurrentViewPort(WebElement webElement) {
        int windowYStart = getWindowTopYPosition();
        int windowYEnd = getWindowBottomYPosition();

        int elementYStart = webElement.getRect().y;
        int elementYEnd = webElement.getRect().height + elementYStart;

        return windowYStart < elementYStart && windowYEnd > elementYEnd;
    }

    private int getWindowTopYPosition() {
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        return ((Number) executor.executeScript("return window.pageYOffset")).intValue();
    }

    private int getWindowBottomYPosition() {
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        return ((Number) executor.executeScript("return window.innerWidth")).intValue() + getWindowTopYPosition();

    }

}
