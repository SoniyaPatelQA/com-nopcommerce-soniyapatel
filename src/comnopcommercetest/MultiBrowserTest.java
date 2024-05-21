package comnopcommercetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static WebDriver driver;
    static String baseUrl = "https://demo.nopcommerce.com/";
    static String browserName = "chrome";

    public static void main(String[] args) {

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else {

            System.out.println("Invalid browser name");
        }

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


        // 3. Print the title of the page.
        System.out.println("page title: " + driver.getTitle());
        // 4. Print the current url.
        System.out.println("current url: " + driver.getCurrentUrl());
        // 5. Print the page source.
        System.out.println("page source: " + driver.getPageSource());
        // 6. Navigate to Url. “https://demo.nopcommerce.com/login?returnUrl=%2F”
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);

        //7. Print the current url.
        System.out.println("current url: " + driver.getCurrentUrl());
        // 8. Navigate back to the home page.
        driver.navigate().back();
        //  9. Navigate to the login page.
        driver.navigate().to(loginUrl);
        //  10. Print the current url.
        System.out.println("current url: " + driver.getCurrentUrl());
        //  11. Refresh the page.
        driver.navigate().refresh();
        //  12. Enter the email to email field.
        driver.findElement(By.id("Email")).sendKeys("test123@gmail.com");
        // 13. Enter the password to password field.
        driver.findElement(By.id("Password")).sendKeys("test123");
        //  14. Click on Login Button.
        driver.findElement(By.className("login-button")).click();
        //15. Close the browser.
        driver.quit();
    }


}
