package org.example.steps;

import com.utm.example.ChromeDriverSingleton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendContactFormTest
{
    private final ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @When("User fills {string} in Name-box")
    public void userEntersNameInNameField(String name)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".col-md-6 .agile-styled-input-top > input")).click();
        driver.findElement(By.cssSelector(".col-md-6 .agile-styled-input-top > input")).sendKeys(name);
    }

    @When("User fills {string} in Email-box")
    public void userEntersEmailInEmailField(String email)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".col-md-6 .styled-input:nth-child(2) > input")).click();
        driver.findElement(By.cssSelector(".col-md-6 .styled-input:nth-child(2) > input")).sendKeys(email);
    }

    @When("User clicks on Send button")
    public void userClicksOnSendButton()
    {
        driver.findElement(By.cssSelector(".col-md-6 > form > input")).click();
    }

    @Then("Message is sent successfully")
    public void messageIsSentSuccessfully()
    {
        driver.findElement(By.id("Message sent"));
    }
}
