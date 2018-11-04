package com.iot.web.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.concurrent.TimeUnit;

@Configuration
@ComponentScan("com.iot.web.selenium.java")
@PropertySource("classpath:test.properties")
public class TestConfiguration {

    @Value("${applicationUnderTest.host}")
    private String host;

    @Value("${applicationUnderTest.port}")
    private String port;

    @Value("${applicationUnderTest.buildFolder}")
    private String webAppFolderPath;

    @Value("${selenium.chrome.driver.path}")
    private String chromeDriverPath;

    public String getHost() {
        return host;
    }

    public int getPort() {
        return Integer.parseInt(port);
    }

    public String getMainUrl() {
        return getHost() + ":" + getPort() + "/";
    }

    public String getWebAppFolderPath() {
        return webAppFolderPath;
    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    @Bean(destroyMethod = "quit")
    public WebDriver webDriver() {
        WebDriver webDriver = getChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return webDriver;
    }

    private WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
        return new ChromeDriver();
    }

}
