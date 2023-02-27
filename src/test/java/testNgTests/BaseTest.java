package testNgTests;
import com.hillel.core.driver.WebDriverFactory;
import com.hillel.pages.*;
import com.hillel.util.ConfigProvider;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;

@Log4j2
public class BaseTest {
    public static WebDriver driver = WebDriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    TestingCoursesPage testingCoursesPage = new TestingCoursesPage(driver);
    QaAutomationPage qaAutomationPage = new QaAutomationPage(driver);
    WebDriverWait waiter = new WebDriverWait(driver,5);

    @BeforeMethod
    public void beforeAll(){
        driver.get(ConfigProvider.BASE_URL);
    }
    @BeforeMethod
    public void testStartedLog(Method method){
        log.info("Test " + method.getName() + " started");
    }
    @AfterMethod
    public void testFinishedLog(ITestResult result){
        if (result.isSuccess()){
            log.info("Test " + result.getName() + " finished with result success");
        } else {
            log.info("Test " + result.getName() + " finished with result fail");
        }
    }
    @AfterClass
    public static void closeDriver(){
        driver.quit();
    }
}