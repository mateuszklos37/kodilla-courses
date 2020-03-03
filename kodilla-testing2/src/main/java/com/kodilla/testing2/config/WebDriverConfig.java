package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public final static String FIREFOX = "FIREFOX_DRIVER";
    public final static String CHROME = "CHROME_DRIVER";

    public static WebDriver getDriver(final String driver){
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium-drivers\\Firefox\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\Chrome\\chromedriver_win32\\chromedriver.exe");

        if(driver.equals(FIREFOX)){
            return new FirefoxDriver();
        }
        else if (driver.equals(CHROME)){
            return new ChromeDriver();
        }
        else{
            return null;
        }
    }
}
