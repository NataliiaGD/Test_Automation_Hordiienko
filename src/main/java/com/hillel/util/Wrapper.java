package com.hillel.util;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapper {
    private WebElement field;

    public Wrapper(WebElement field) {
        this.field = field;
    }

    public void clickWait(WebElement element,WebDriver driver){
        waitUntilElementIsVisible(element,driver);
        element.click();
    }
    public void checkIfElementDissapeared(WebElement logo,WebElement courseTitle,WebDriver driver){
        logo.click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.invisibilityOf(courseTitle));
    }
    public void isClickableWait(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitUntilElementIsVisible(WebElement element, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
