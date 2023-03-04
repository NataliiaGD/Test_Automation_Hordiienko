package cucumber.steps;
import com.hillel.util.ConfigProvider;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageSteps extends BaseUiSteps {
    @Given("User is on the Home Page")
    public void openHomePage(){
        driver.get(ConfigProvider.BASE_URL);
    }
    @And("User clicks on the school dropdown")
    public void clickSchoolDropdown(){
        homePage.clickSchool();
    }
    @And("User clicks on the certificate check button")
    public void clickCheckCertificate(){
        homePage.clickCheckCertificate();
    }
    @AfterAll
    public static void quitDriver(){
        driver.quit();
    }
}
