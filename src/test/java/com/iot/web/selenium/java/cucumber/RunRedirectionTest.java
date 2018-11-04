package com.iot.web.selenium.java.cucumber;

import com.iot.web.selenium.java.TestConfiguration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/")
@ContextConfiguration(classes = TestConfiguration.class)
public class RunRedirectionTest{

}