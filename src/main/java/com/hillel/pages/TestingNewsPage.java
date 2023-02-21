package com.hillel.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class TestingNewsPage extends BasePage{
    @FindBy(xpath = "//div[@class='post-card_header']")
    public List<WebElement> testingNewsArticles;
    public TestingNewsPage(WebDriver driver) {
        super(driver);
    }
    public int testingArticlesAmount(){
        return testingNewsArticles.size();
    }
}
