package overview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class LoginTests {

    WebDriver driver;
    String baseURL;

    @BeforeClass
    public void beForeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        baseURL = "https://courses.letskodeit.com";
        driver.get(baseURL);
    }

    @Test
    public void testLogin() {
        driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("test@email.com");
        WebElement passwordElement = driver.findElement(By.id("login-password"));
        passwordElement.clear();
        passwordElement.sendKeys("abcabc");
        driver.findElement(By.id("login")).click();
        WebElement accountImage = null;
        try {
            accountImage = driver.findElement(By.className("img-fluid"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(accountImage);
    }

    @Test
    public void testInValidLogin() {
        driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("test1@email.com");
        WebElement passwordElement = driver.findElement(By.id("login-password"));
        passwordElement.clear();
        passwordElement.sendKeys("abcabc");
        driver.findElement(By.id("login")).click();
        WebElement accountImage = null;
        try {
            accountImage = driver.findElement(By.className("img-fluid"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(accountImage);
    }
}