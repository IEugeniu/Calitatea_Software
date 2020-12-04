package org.example.steps;

import com.utm.example.ChromeDriverSingleton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Check_search_is_case_sensitive
{
    public ChromeDriver driver = ChromeDriverSingleton.getDriver();
    public String firstResult = null;
    public String secondResult = null;

    @When("User enters {string} in search field")
    public void userEntersTextInSearchField(String text)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys(text);
    }

    @And("User presses Enter")
    public void userPressesEnter()
    {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @And("Check result")
    public void userCheckResult()
    {
        if(firstResult == null) {
            firstResult = driver.findElements(By.className("g")).get(0).findElement(By.className("LC20lb")).getText();
        } else {
            secondResult = driver.findElements(By.className("g")).get(0).findElement(By.className("LC20lb")).getText();
        }
    }

    @Then("Get same results")
    public void getSameResults()
    {
        Assert.assertEquals(firstResult, secondResult);
    }
}
