package org.example.steps;

import com.utm.example.ChromeDriverSingleton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignUpTest
{
    private final ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @Then("User is registered successfully")
    public void user_is_registered_successfully()
    {
        driver.findElement(By.id("Register"));
    }

    @When("User fills {string} in Name box")
    public void userEntersNameInNameField(String name)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#myModal2 .styled-input:nth-child(1) > input")).click();
        driver.findElement(By.cssSelector("#myModal2 .styled-input:nth-child(1) > input")).sendKeys(name);
    }

    @When("User fills {string} in Email box")
    public void userEntersEmailInEmailField(String email)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#myModal2 .modal-body")).click();
        driver.findElement(By.cssSelector("#myModal2 .styled-input:nth-child(2) > input")).click();
        driver.findElement(By.cssSelector("#myModal2 .styled-input:nth-child(2) > input")).sendKeys(email);
    }

    @When("User clicks on SignUp button")
    public void userClicksOnSignUp()
    {
        driver.findElement(By.cssSelector("form:nth-child(2) > input:nth-child(5)")).click();
    }
}
