package com.utm.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSingleton
{
    private static ChromeDriver driver;

    public static ChromeDriver getDriver()
    {
        if (driver == null)
        {
            driver = new ChromeDriver();
        }
        return driver;
    }
}