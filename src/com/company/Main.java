package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        driver.findElement(By.id("gh-ac")).sendKeys("computer");

        driver.findElement(By.id("gh-btn")).click();

        System.out.println("ebay.com header displayed: " + driver.findElement(By.cssSelector("#gh-logo")).isDisplayed());
    }
}
