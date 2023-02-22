package com.hillel.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BlogPage extends BasePage {
    @FindBy(xpath = "//button[@data-dropdown-trigger='publications']")
    public WebElement publications;
    @FindBy(xpath = "(//a[@class='btn-theme'])[1]")
    public WebElement frontEnd;
    @FindBy(xpath = "(//li[@class='site-nav-publications_item col-1'])[5]")
    public WebElement gameDev;
    @FindBy(xpath = "(//li[@class='site-nav-publications_item col-1'])[9]")
    public WebElement testing;
    @FindBy(xpath = "//div[@class='post-card_header']")
    public List<WebElement> articles;
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
    public int articlesAmount(){
        return articles.size();
    }
}
