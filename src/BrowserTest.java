import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl=
 * %2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */

public class BrowserTest {

    public static void main(String[] args) {
        //  1. Setup chrome browser.
        WebDriver driver = new ChromeDriver();
        // 2. Open URL.
        driver.get("https://demo.nopcommerce.com/");
        //maximize window
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //3. Print the title of the page.
        System.out.println("Title of page: " + driver.getTitle());
        // 4. Print the current url.
        System.out.println("current Url: " + driver.getCurrentUrl());
        // 5. Print the page source.
        System.out.println(driver.getPageSource());
        //   6. Navigate to Url.“https://demo.nopcommerce.com/login?returnUrl=%2F”
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=" + "%2F");
        //   7. Print the current url.
        System.out.println("current url: " + driver.getCurrentUrl());
        //8. Navigate back to the home page.
        driver.navigate().back();
        // 9. Navigate to the login page.
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=" + "%2F");
        // 10. Print the current url.
        System.out.println("current url: " + driver.getCurrentUrl());
        // 11. Refresh the page.
        driver.navigate().refresh();
        // 12. Enter the email to email field.
        driver.findElement(By.id("Email")).sendKeys("test123@gmail.com");
        // 13. Enter the password to password field.
        driver.findElement(By.id(("Password"))).sendKeys("1234@test");
        // 14. Click on Login Button.
        driver.findElement(By.className("login-button")).click();
        // 15. Close the browser.
        driver.quit();
    }
}
