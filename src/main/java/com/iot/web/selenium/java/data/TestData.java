package com.iot.web.selenium.java.data;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TestData {
    private User incorrectUser;
    private User correctUser;

    public TestData() {
        incorrectUser = new User("", "");
        correctUser = new User("D", "K");
    }
}
