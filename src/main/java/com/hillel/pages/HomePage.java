package com.hillel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "(//a[@class='block-course-cats_link course-cat-bar'])[2]")
    public WebElement testing;

    public void clickTesting(){
        testing.click();
    }
}
