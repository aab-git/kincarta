package com.amazon.utilitiies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriver {

    public static WebDriver loadChromeDriver () {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

}
