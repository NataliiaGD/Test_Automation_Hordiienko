package testNgTests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
@Log4j2
public class TestNgTest extends BaseTest{
    @Test
    public void openQaAutomationPage() {
        homePage.clickTesting();
        testingCoursesPage.clickQaAutomation();
        waiter.until(ExpectedConditions.visibilityOf(qaAutomationPage.courseTitle));
        Assert.assertEquals(qaAutomationPage.getCourseTitle(),"Курс QA Automation");
        Assert.assertEquals(qaAutomationPage.getCourseRate(),"4.9");
    }
    @Test
    public void openQaAutomationPageFail() {
        homePage.clickTesting();
        testingCoursesPage.clickQaAutomation();
        waiter.until(ExpectedConditions.visibilityOf(qaAutomationPage.courseTitle));
        Assert.assertEquals(qaAutomationPage.getCourseTitle(),"Курс QA Automation");
        Assert.assertEquals(qaAutomationPage.getCourseRate(),"4.8");
    }
}
