package com.hillel.util;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapper {
    protected WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver,5);

    public void clickWait(WebElement element){
        isClickableWait(element);
        element.click();
    }
    public void checkIfElementDisappeared(WebElement logo, WebElement courseTitle){
        wait.until(ExpectedConditions.invisibilityOf(courseTitle));
    }
    public void isClickableWait(WebElement element){
        wait.ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
