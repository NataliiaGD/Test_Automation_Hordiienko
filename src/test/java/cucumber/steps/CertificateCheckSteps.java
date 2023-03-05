package cucumber.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CertificateCheckSteps extends BaseUiSteps{

    @And("User enters {string}")
    public void userEntersCertificateNumber(String number) {
        certificateCheckPage.enterCertificateNumber(number);
    }
    @And("User clicks on the check button")
    public void userClicksOnTheCheckButton() {
        certificateCheckPage.clickCheckButton();
    }
    @Then("User check if certificate is not found")
    public void userCheckIfCertificateIsNotFound() {
        waiter.until(ExpectedConditions.visibilityOf(certificateCheckPage.certificateNotFound));
        Assert.assertTrue(certificateCheckPage.isResultVisible());
    }
}
