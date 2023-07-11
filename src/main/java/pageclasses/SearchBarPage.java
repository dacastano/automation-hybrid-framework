package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBarPage {

    /***
     * Variables
     * URL
     * Title
     */
    public WebDriver driver;
    private String SEARCH_COURSE_FIELD = "input#search";
    private String SEARCH_COURSE_BUTTON = ".fa.fa-search";
    public SearchBarPage(WebDriver driver) {
        this.driver = driver;
    }

    /***
     * Methods
     */

    public void course(String courseName) {
        WebElement searchField = driver.findElement(By.cssSelector(SEARCH_COURSE_FIELD));
        searchField.clear();
        searchField.sendKeys(courseName);

        WebElement searchButton = driver.findElement(By.cssSelector(SEARCH_COURSE_BUTTON));
        searchButton.click();
    }
}
