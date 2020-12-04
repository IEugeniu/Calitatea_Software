package org.example.steps;

import com.utm.example.ChromeDriverSingleton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Check_Converter
{
    public ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @Then("Check converter is displayed")
    public void checkConverterIsDisplayed() {
        driver.findElement(By.className("hntNk")).isDisplayed();
    }
}
