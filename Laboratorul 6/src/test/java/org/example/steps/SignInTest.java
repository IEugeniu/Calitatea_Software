package org.example.steps;

import com.utm.example.ChromeDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SignInTest
{
    private final WebDriver driver = ChromeDriverSingleton.getDriver();

    @Then("User is logged in successfully")
    public void user_is_logged_in_successfully()
    {
        driver.findElement(By.className("User"));
    }

    @And("User clicks on SignIn button")
    public void userClicksOnSignIn()
    {
        driver.findElement(By.cssSelector("form > input:nth-child(3)")).click();
    }

    /*@After()
    public void closeBrowser()
    {
        driver.quit();
    }*/
}
