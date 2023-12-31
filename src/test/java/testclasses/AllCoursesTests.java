package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageclasses.LoginPage;
import pageclasses.NavigationPage;
import pageclasses.SearchBarPage;
import pageclasses.ResultsPage;

import java.util.concurrent.TimeUnit;

public class AllCoursesTests {
    WebDriver driver;
    String baseURL;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        baseURL = "https://courses.letskodeit.com";
        driver.get(baseURL);
    }

    @Test
    public void verifySearchCourse() {
        LoginPage login = new LoginPage(driver);
        login.open();
        NavigationPage nav = login.signInWith("test@email.com", "abcabc");
        nav.allCourses();
        SearchBarPage search = new SearchBarPage(driver);
        ResultsPage result = search.course("rest api");
        boolean searchResult = result.verifySearchResult();
        Assert.assertTrue(searchResult);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
