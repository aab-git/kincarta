package com.amazon.utilitiies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxDriver {

    public static WebDriver loadFirefoxDriver () {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }
}
