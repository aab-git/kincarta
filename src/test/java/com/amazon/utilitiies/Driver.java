package com.amazon.utilitiies;

import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver () {};

    private static WebDriver driver;

    public static WebDriver getDriver () {
        if (driver == null) {
            String browser = ConfigsReader.getProperty("browser").toLowerCase();

            if (browser.equals("firefox"))
                driver = FirefoxDriver.loadFirefoxDriver();
            else
                driver = ChromeDriver.loadChromeDriver();
        }

        return driver;
    }
    public static void closeDriver () {
        if (driver == null)
            return;
        try {
            driver.close();
            driver.quit();
            driver = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
