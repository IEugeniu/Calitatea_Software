package org.example.steps;

import com.utm.example.ChromeDriverSingleton;
import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ViewItemTest
{
    private final ChromeDriver driver = ChromeDriverSingleton.getDriver();

    @When("User click on Quick View button")
    public void clickOnQuickViewButton()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div.single-pro>div:nth-child(1)>div>div.men-thumb-item>div>div>a")).click();
    }

    @When("User hover on an item")
    public void userHoverOnAProduct()
    {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.cssSelector("div.single-pro>div:nth-child(1)>div>div.men-thumb-item>div>div"));
        WebElement quick = driver.findElement(By.cssSelector("div.single-pro>div:nth-child(1)>div>div.men-thumb-item>div>div>a")); // Quick View
        action.moveToElement(we).moveToElement(quick).click().build().perform(); // hover on element
    }

    @Then("User is redirected to item details page")
    public void userIsRedirectedToPageWithDescriptionOfAProduct() throws Exception
    {
        if (driver.findElement(By.cssSelector("div.col-md-8.single-right-left.simpleCart_shelfItem>h3")).isDisplayed())
        {
            throw new Exception("Description of [Big Wing Sneakers] is displayed instead of selected product");
        }
    }
}
