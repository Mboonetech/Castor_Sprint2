package com.Castor_Sprint2.step_definitions;

import com.Castor_Sprint2.pages.Mike181_page;
import com.Castor_Sprint2.utilities.BrowserUtils;
import com.Castor_Sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Mike181_StepDefinitions {

    Mike181_page mike181Page = new Mike181_page();

    @Given("User is on the login page")
    public void LogInPage() {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
    }

    @And("User enters Valid {string} and {string}")
    public void usernameAndPassword(String username, String password) {
        mike181Page.inputUsername.sendKeys(username);
        mike181Page.inputPassword.sendKeys(password);

    }

    @And("User Clicks the LOGIN button")
    public void LoginButton() {
        mike181Page.logInButton.click();
    }

    @And("User Hovers over Fleet Dropdown Tab")
    public void FleetDropdownTab() {
        BrowserUtils.sleep(3);
        BrowserUtils.hover(mike181Page.fleetDropdown);
    }

    @When("User Clicks the Driver Contracts option")
    public void DriverContractsOption() {
      mike181Page.vehicleContracts.click();
    }

    @Then("User should verify the page url is {string}")
    public void VerifyThePageUrlIs(String expectedURL) {
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
    }

    @And("User should verify the page title is {string}")
    public void VerifyThePageTitleIs(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("All - Vehicle Contract - Entities - System - Car - Entities - System"));
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
