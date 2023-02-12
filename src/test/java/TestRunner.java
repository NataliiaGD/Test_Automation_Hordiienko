import com.hillel.core.driver.WebDriverFactory;
import com.hillel.util.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner {
        public WebDriver driver =  WebDriverFactory.getDriver();
        public WebDriverWait waiter = new WebDriverWait(driver,5);
        public By testing = By.xpath("(//a[@class='block-course-cats_link course-cat-bar'])[2]");
        public By qaAutomation = By.xpath("(//p[@class='profession-bar_title'])[2]");
        public By courseName = By.xpath("//span[@class='course-descriptor_header-text']");
    @Test
    public void openQaAutomationPage () {
        driver.get(ConfigProvider.BASE_URL);
        driver.findElement(testing).click();
        driver.findElement(qaAutomation).click();
        waiter.until(ExpectedConditions.visibilityOf(driver.findElement(courseName)));
        Assert.assertEquals(driver.findElement(courseName).getText(),"Курс QA Automation");
        driver.quit();
    }
}
