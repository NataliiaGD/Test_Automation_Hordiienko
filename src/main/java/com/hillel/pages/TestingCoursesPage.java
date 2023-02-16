package com.hillel.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingCoursesPage extends BasePage {
    @FindBy(xpath = "(//p[@class='profession-bar_title'])[2]")
    public WebElement qaAutomation;

    public TestingCoursesPage(WebDriver driver) {
        super(driver);
    }
    public void clickQaAutomation(){
        qaAutomation.click();
    }
}
