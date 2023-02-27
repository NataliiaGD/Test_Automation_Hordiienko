//package jUnitTests;
//import com.hillel.core.driver.WebDriverFactory;
//import com.hillel.pages.*;
//import com.hillel.util.ConfigProvider;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.openqa.selenium.WebDriver;
//
//public class BaseTest {
//    public static WebDriver driver = WebDriverFactory.getDriver();
//    HomePage homePage = new HomePage(driver);
//    static BlogPage blogPage = new BlogPage(driver);
//
//    @Before
//    public void beforeAll(){
//        driver.get(ConfigProvider.BASE_URL);
//    }
//    @AfterClass
//    public static void closeDriver(){
//        driver.quit();
//    }
//}
