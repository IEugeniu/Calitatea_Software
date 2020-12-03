package org.example.steps;

import com.utm.example.ChromeDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GeneralSteps
{
    public WebDriver driver = ChromeDriverSingleton.getDriver();

    @Given("User access home page")
    public void user_is_on_page()
    {
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html");
    }

    @When("User fills {string} in {string} box")
    public void user_enters_in_field(String string, String field)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name(field)).click();
        driver.findElement(By.name(field)).sendKeys(string);
    }

    @Given("User clicks on {string} button")
    public void userClicksOnContactTab(String link)
    {
        driver.findElement(By.linkText(link)).click();
    }

    @After
    public void endSession() {
        driver.close();
    }
}
