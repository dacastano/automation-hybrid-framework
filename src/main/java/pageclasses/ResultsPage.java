package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultsPage {

    /***
     * Variables
     * URL
     * Title
     */
    public WebDriver driver;
    private String URL = "https://www.letskodeit.com/courses";
    private String COURSES_LIST = "//a[contains(@href,'courses')]";

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    /***
     * Methods
     */
    public boolean isOpen() {
        return driver.getCurrentUrl().contains(URL);
    }

    public int coursesCount() {
        List<WebElement> coursesList = driver.findElements(By.xpath(COURSES_LIST));
        return coursesList.size();
    }

    public boolean verifySearchResult() {
        boolean result = false;
        if (coursesCount() > 0) {
            result = true;
        }
        result = isOpen() && result;
        return result;
    }
}
