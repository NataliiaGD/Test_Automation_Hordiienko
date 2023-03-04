package com.hillel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertificateCheckPage extends BasePage {
    @FindBy(xpath = "//input[@name='certificate']")
    public WebElement certificate;
    @FindBy(xpath = "//button[@class='btn btn-submit -submit certificate-check_submit']")
    public WebElement checkButton;
    @FindBy(xpath = "//p[@class='certificate-check_message']")
    public WebElement certificateNotFound;
    public CertificateCheckPage(WebDriver driver) {
        super(driver);
    }
    public void clickCheckButton(){
        checkButton.click();
    }
    public void enterCertificateNumber(String number){
        certificate.sendKeys(number);
    }
    public boolean isResultVisible(){
        return certificateNotFound.isDisplayed();
    }
}
