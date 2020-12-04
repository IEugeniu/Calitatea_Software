package com.utm.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSingleton
{
    private static ChromeDriver driver;

    public static ChromeDriver getDriver()
    {

        if (driver == null)
        {
            System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium Web Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}