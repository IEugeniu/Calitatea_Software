package org.example.steps;

import com.utm.example.ChromeDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchItemsTest
{
    public  WebDriver driver = ChromeDriverSingleton.getDriver();

    @When("User clicks on search icon")
    public void userPressEnter()
    {
        driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
    }

    @Then("Items with {string} name are displayed")
    public void products_with_word_in_name_are_displayed(String string)
    {
        driver.findElement(By.className(string));
    }
}
