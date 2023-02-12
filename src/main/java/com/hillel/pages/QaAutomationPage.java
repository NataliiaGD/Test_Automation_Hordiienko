package com.hillel.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class QaAutomationPage{
    public WebDriver driver;
    public By courseTitle = By.xpath("//span[@class = 'course-descriptor_header-text']");
    public By courseRate = By.xpath("//span[@class = 'course-rating_average']");

    public QaAutomationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCourseTitle(){
       return driver.findElement(courseTitle).getText();
    }

    public String getCourseRate(){
        return driver.findElement(courseRate).getText();
    }
}