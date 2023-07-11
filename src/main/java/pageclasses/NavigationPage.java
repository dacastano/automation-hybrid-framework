package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class NavigationPage {

    /***
     * Variables
     * URL
     * Title
     */
    public WebDriver driver;
    private String URL = "https://www.letskodeit.com/courses";
    private String ALL_COURSES_LINK = "(//a[@href='/courses'])[1]";
    private String MY_COURSES_LINK = "//a[@href='/mycourses']";

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    /***
     * Methods
     */

    private void clickLink(String link) {
        driver.findElement(By.xpath(link)).click();
    }

    public void allCourses() {
        clickLink(ALL_COURSES_LINK);
    }

    public void myCourses() {
        clickLink(MY_COURSES_LINK);
    }
//    public boolean isOpen() {
//        return URL.equalsIgnoreCase(driver.getCurrentUrl());
//    }
}





//f you anticipate that there will be many navigation options in the future, you can consider a more flexible and scalable approach by using a navigation map or enum to store the links and their corresponding names.
/*
import java.util.HashMap;
        import java.util.Map;

public class NavigationPage {
    */
/***
     * Variables
     * URL
     * Title
     *//*

    public WebDriver driver;
    private String URL = "https://www.letskodeit.com/courses";

    private Map<String, String> navigationLinks;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
        navigationLinks = new HashMap<>();
        navigationLinks.put("All Courses", "(//a[@href='/courses'])[1]");
        navigationLinks.put("My Courses", "//a[@href='/mycourses']");
        // Add more navigation links here if needed
    }

    */
/***
     * Methods
     *//*


    private void clickLink(String link) {
        driver.findElement(By.xpath(link)).click();
    }

    public void navigateTo(String pageName) {
        String link = navigationLinks.get(pageName);
        if (link != null) {
            clickLink(link);
        } else {
            throw new IllegalArgumentException("Invalid page name: " + pageName);
        }
    }
}*/
