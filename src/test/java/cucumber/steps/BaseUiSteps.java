package cucumber.steps;
import com.hillel.core.driver.WebDriverFactory;
import com.hillel.pages.CertificateCheckPage;
import com.hillel.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUiSteps {
    public static final WebDriver driver = WebDriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    CertificateCheckPage certificateCheckPage = new CertificateCheckPage(driver);
    WebDriverWait waiter = new WebDriverWait(driver, 5);
}
