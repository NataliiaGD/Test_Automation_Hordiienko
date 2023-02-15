import com.hillel.core.driver.WebDriverFactory;
import com.hillel.pages.HomePage;
import com.hillel.pages.QaAutomationPage;
import com.hillel.pages.TestingCoursesPage;
import com.hillel.util.ConfigProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner {
        public WebDriver driver =  WebDriverFactory.getDriver();
        QaAutomationPage qaAutomationPage = new QaAutomationPage(driver);
        public WebDriverWait waiter = new WebDriverWait(driver,5);
        HomePage homePage = new HomePage(driver);
        TestingCoursesPage testingCoursesPage = new TestingCoursesPage(driver);

    @Test
    public void openQaAutomationPage() {
        driver.get(ConfigProvider.BASE_URL);
        homePage.clickTesting();
        testingCoursesPage.clickQaAutomation();
        waiter.until(ExpectedConditions.visibilityOf(qaAutomationPage.courseTitle));
        Assert.assertEquals(qaAutomationPage.getCourseTitle(),"Курс QA Automation");
        Assert.assertEquals(qaAutomationPage.getCourseRate(),"4.9");
        driver.quit();
    }
}
