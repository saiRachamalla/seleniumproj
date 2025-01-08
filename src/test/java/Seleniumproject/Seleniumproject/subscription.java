package Seleniumproject.Seleniumproject;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class subscription {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

      
            // Navigate to the URL
            driver.get("https://automationexercise.com/");
            System.out.println("Page title: " + driver.getTitle());
            
            //scroll to page bottom
            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)", "");
            //js.executeScript("scroll(0, 250);"); or
            //js.executeScript("window.scrollBy(0,-250)", ""); to scroll up or
            //js.executeScript("scroll(0, -250);");
            Thread.sleep(1000);
            
            js.executeScript("window.scrollTo(0,document.bodyHeight)");
            System.out.println("reached bottom of the page.");
            Thread.sleep(5000);
            
            //subscription text verification
            WebElement subscription=driver.findElement(By.xpath("//h2[text()='Subscription']"));
            if(subscription.isDisplayed()) {
            	if((subscription.getText()).equals("SUBSCRIPTION")) {
            		System.out.println(subscription.getText()+" is visible"); 
            	}	
            }
            else {
            	System.out.println("subscription text is not visible");
            }
            
            //enter email address
            driver.findElement(By.id("susbscribe_email")).sendKeys("sai@gmail.com");
            driver.findElement(By.id("subscribe")).click();
            Thread.sleep(500);
            
            //wait for alert and verify alert message
            WebElement alert=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-success")));
            System.out.println("alert message:"+alert.getText());
            
            driver.quit();

	}

}
