package Seleniumproject.Seleniumproject;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.tutorialspoint.com/");
		System.out.println(driver.getCurrentUrl());
		
		
		WebElement uname=  driver.findElement(By.id("user-name"));
//		uname.sendKeys("standard_user");	
//		WebElement pswd=driver.findElement(By.id("password"));
//		pswd.sendKeys("secret_sauce");	
//			WebElement login_btn=driver.findElement(By.id("login-button"));
//		login_btn.click();
//		
//		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='inventory_item']"));
//		System.out.println(elements);
		
		/*driver.navigate().to("https://openai.com/chatgpt/overview/");
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		driver.findElement(By.linkText("(//a[@href='https://chatgpt.com/'])[2]")).click();
		Set<String> handlers=driver.getWindowHandles();
		System.out.println(handlers);
		*/
		
		driver.navigate().to("https://www.geeksforgeeks.org/top-50-array-coding-problems-for-interviews/");
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle+" geeks for geeks");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='consent-btn']")).click();
		driver.findElement(By.xpath("//span[text()='Solve'][1]")).click();
		Set<String> handlers=driver.getWindowHandles();
		System.out.println(handlers);
		driver.close();
		
		
		
		
		
		
		driver.quit();

	}

	
}
