import com.hillel.core.driver.WebDriverFactory;
import com.hillel.util.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner {


    @Test
    public void openQaAutomationPage () {
        WebDriver driver =  WebDriverFactory.getDriver();
        driver.get(ConfigProvider.BASE_URL);
        WebElement testing = driver.findElement(
                By.xpath("(//a[@class='block-course-cats_link course-cat-bar'])[2]"));
        testing.click();
        WebElement qaAutomation = driver.findElement(
                By.xpath("(//p[@class='profession-bar_title'])[2]"));
        qaAutomation.click();
        WebElement courseName = driver.findElement(
                By.xpath("//span[@class='course-descriptor_header-text']"));
        WebDriverWait waiter = new WebDriverWait(driver,5);
        waiter.until(ExpectedConditions.visibilityOf(courseName));
        Assert.assertEquals(courseName.getText(),"Курс QA Automation");
        driver.quit();
    }
}
