package jUnitTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Arrays;
import java.util.List;
import static com.hillel.util.Wrapper.scrollToBottom;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class JunitTest extends BaseTest{
    WebDriverWait wait = new WebDriverWait(driver,5);
    @Parameterized.Parameter
    public WebElement category;
    @Parameterized.Parameter(1)
    public int amount;
    @Parameterized.Parameters(name = "{index}: Category={0}, ExpectedAmount={1}")
    public static List<Object[]> getBlogCategories(){
        return Arrays.asList(new Object[][]{
            {blogPage.frontEnd,121},
            {blogPage.testing,87},
            {blogPage.gameDev,5}
        });
    }
    @Test
    public void checkAmountOfArticles() {
        homePage.clickBlog();
        blogPage.clickPublicationsDropdown();
        category.click();
        scrollToBottom(driver);
        assertThat(blogPage.articlesAmount()).isEqualTo(amount);
    }
}
