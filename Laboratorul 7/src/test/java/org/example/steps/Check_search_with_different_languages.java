package org.example.steps;
import com.utm.example.ChromeDriverSingleton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Check_search_with_different_languages
{
    public ChromeDriver driver = ChromeDriverSingleton.getDriver();
    public Boolean results1 = null;
    public Boolean results2 = null;

    @Given("Google Chrome is open")
    public void googleChromeIsOpen()
    {
        driver.get("https://www.google.com");
        driver.manage().window().setSize(new Dimension(1366, 728));
    }
    @When("User search {string} in different language")
    public void userEntersTextInSearchField(String text)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys(text);
    }

    @And("User presses Enter and check result")
    public void userPressesEnter()
    {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        if(results1 == null) {
            if(driver.findElement(By.className("g")).isDisplayed()) {
                results1 = true;
            }
        } else {
            if(driver.findElement(By.className("g")).isDisplayed()) {
                results2 = true;
            }
        }
    }

    @And("User clears search box")
    public void clearSearchBox()
    {
        driver.findElement(By.className("clear-button")).click();
    }

    @Then("Result returned")
    public void resultReturned()
    {
        Assert.assertEquals(results1, results2);
    }
}
