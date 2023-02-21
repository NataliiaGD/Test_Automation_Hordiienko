package com.hillel.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage {
    @FindBy(xpath = "//button[@data-dropdown-trigger='publications']")
    public WebElement publications;
    @FindBy(xpath = "(//li[@class='site-nav-publications_item col-1'])[1]")
    public WebElement frontEnd;
    @FindBy(xpath = "(//li[@class='site-nav-publications_item col-1'])[5]")
    public WebElement gameDev;
    @FindBy(xpath = "(//li[@class='site-nav-publications_item col-1'])[9]")
    public WebElement testing;
    public BlogPage(WebDriver driver) {
        super(driver);
    }
    public void clickPublicationsDropdown(){
        publications.click();
    }
    public void clickFrontEnd(){
        frontEnd.click();
    }
    public void clickGameDev(){
        gameDev.click();
    }
    public void clickTesting(){
        testing.click();
    }
}
