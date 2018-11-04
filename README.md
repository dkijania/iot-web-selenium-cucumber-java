# iot-web-selenium-java
Automated test using selenium and java

## Packages

| Package | Description |
| ------- | ----------- |
| selenium | web automation |
| slf4j | logging facade |
| log4j | logging |
| spring | dependency injection |
| junit | x-unit testing |
| cucumber | BDD framework |
| lombok | boilerplate  code for moderl generation |
| hamcrest | assertion |

* - lombok may require additional setup in IDE of your preference

## How to start

### Start application under test 

iot-web> yarn start

### provide webdriver exe location

1) Download chrome driver:

http://chromedriver.chromium.org/downloads

2) Update 'selenium.chrome.driver.path' path in src/main/resources/test.properties
