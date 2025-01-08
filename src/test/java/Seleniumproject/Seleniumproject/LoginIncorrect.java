package Seleniumproject.Seleniumproject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginIncorrect {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

      
            // Navigate to the URL
            driver.get("https://automationexercise.com/");
            System.out.println("Page title: " + driver.getTitle());

            
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();

            WebElement loginHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Login to your account']")));
            System.out.println("'Login to your account' is visible: " + loginHeader.isDisplayed());

            // Enter incorrect email and password
            driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("rachamalla@gmail.com");
            driver.findElement(By.name("password")).sendKeys("saip123");

            // Wait and click the 'Login' button
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-qa='login-button']"))).click();

            // Verify error message is visible
            WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Your email or password is incorrect!']")));
            System.out.println("Error message displayed: " + errorMessage.getText());
            
            driver.quit();
        
    }
}
