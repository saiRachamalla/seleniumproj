package Seleniumproject.Seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	      
        // Navigate to the URL
        driver.get("https://automationexercise.com/");
        System.out.println("Page title: " + driver.getTitle());

        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='login']"))).click();
        

        WebElement loginHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='New User Signup!']")));
        System.out.println("New User Signup! is visible: " + loginHeader.isDisplayed());
        
        // Enter incorrect email and password
        driver.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys("saip");
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("saipoori@gmail.com");
        // Wait and click the 'Login' button
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-qa='signup-button']"))).click();
        
        //verify enter account information text
        WebElement accinfo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2//b[text()='Enter Account Information']")));
        if (accinfo.isDisplayed()) {
        	System.out.println("text is visibile"+accinfo.getText());     
        }
        
        //title selection
        WebElement mrs=driver.findElement(By.id("id_gender2"));
        mrs.click();
        if(mrs.isSelected()) {
        	System.out.println(mrs.getCssValue("value")+"title is selected");
        }
        

	}

}
