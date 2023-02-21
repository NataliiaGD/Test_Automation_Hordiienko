package jUnitTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;
import static com.hillel.util.Wrapper.scrollToBottom;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class JunitTest extends BaseTest{
    @Parameterized.Parameter
    public String category;
    @Parameterized.Parameter(1)
    public int amount;
    @Parameterized.Parameters(name = "{index}: Category={0}, ExpectedAmount={1}")
    public static List<Object[]> getBlogCategories(){
        return Arrays.asList(new Object[][]{
            {"Frontend",121},
            {"Testing",87},
            {"Gamedev",5}
        });
    }
    @Test
    public void checkAmountOfArticles(){
        homePage.clickBlog();
        blogPage.clickPublicationsDropdown();
        if(category.equals("Frontend")){
            blogPage.clickFrontEnd();
            scrollToBottom(driver);
            assertThat(frondEndNewsPage.frontEndArticlesAmount()).isEqualTo(amount);
        } else if (category.equals("Testing")){
            blogPage.clickTesting();
            scrollToBottom(driver);
            assertThat(testingNewsPage.testingArticlesAmount()).isEqualTo(amount);
        } else if (category.equals("Gamedev")){
            blogPage.clickGameDev();
            scrollToBottom(driver);
            assertThat(gameDevNewsPage.gameDevArticlesAmount()).isEqualTo(amount);
        }
    }
}
