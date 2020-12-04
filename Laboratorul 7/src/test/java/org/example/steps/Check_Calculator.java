package org.example.steps;

import com.utm.example.ChromeDriverSingleton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Calculator
{
    public ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @Given("User entered nothing in search field")
    public void userEnteredNothingInSearchField()
    {
    }

    @When("User clicks on search button")
    public void userClicksOnSearchButton()
    {
        driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
    }

    @Then("Check calculator is displayed")
    public void checkCalculatorIsDisplayed()
    {
        driver.findElement(By.className("tyYmIf")).isDisplayed();
    }
}
