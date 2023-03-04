package com.hillel.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaAutomationPage extends BasePage{

    @FindBy(xpath = "//span[@class = 'course-descriptor_header-text']" )
    public WebElement courseTitle;

    @FindBy(xpath = "//span[@class = 'course-rating_average']")
    public WebElement courseRate;
    @FindBy(xpath = "//span[@class='course-descriptor_level c-advanced']")
    public WebElement courseLevel;

    @FindBy(xpath = "//a[@class='site-logo-link']")
    public WebElement logoHillel;

    public QaAutomationPage(WebDriver driver) {
        super(driver);
    }
    public String getCourseTitle(){
       return courseTitle.getText();
    }
    public String getCourseRate(){
        return courseRate.getText();
    }
    public String getCourseLevel(){
        return courseLevel.getText();
    }
    public void clickOnTheLogo(){
        logoHillel.click();
    }
    public boolean isTitleVisible(){
        return courseTitle.isDisplayed();
    }
}