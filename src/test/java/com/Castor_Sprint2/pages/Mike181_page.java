package com.Castor_Sprint2.pages;

import com.Castor_Sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mike181_page {
    public Mike181_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(id = "prependedInput")
    public WebElement inputUsername;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@id=\"_submit\"]")
    public WebElement logInButton;

    @FindBy(xpath = "(//a/span[@class=\"title title-level-1\"])[2]")
    public WebElement fleetDropdown;

    @FindBy(xpath = "//a[.=\"Vehicle Contracts\"]")
    public WebElement vehicleContracts;





}
