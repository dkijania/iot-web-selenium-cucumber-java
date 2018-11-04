package com.iot.web.selenium.java.cucumber;

import com.iot.web.selenium.java.TestConfiguration;
import com.iot.web.selenium.java.driver.WebDriverExtension;
import com.iot.web.selenium.java.ui.page.home.Home;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@ContextConfiguration(classes = TestConfiguration.class)
public class SectionRedirectStepDefinition {

    @Autowired
    protected TestConfiguration testConfiguration;

    @Autowired
    private WebDriver webDriver;

    @Autowired
    protected Home home;

    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        webDriver.get(testConfiguration.getMainUrl());
    }

    @When("^clicks 'Pricing' toolbar button$")
    public void clicks_Pricing_toolbar_button() throws Throwable {
        home.gotoPricingSectionByToolbar();
    }

    @When("^clicks 'Pricing' arrow-drop-down button$")
    public void clicks_Pricing_arrowDropDowns_button() throws Throwable {
        home.gotoPricingSectionByArrowButton();
    }

    @Then("^user is redirected to 'Pricing' section$")
    public void user_is_redirected_to_Pricing_section() throws Throwable {
        assertThat("'Pricing' section should be displayed after arrow button navigation",
                home.isPricingSectionDisplayed(), is(true));
    }
}
