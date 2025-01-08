package Seleniumproject.Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().minimize();
		 driver.manage().window().maximize();
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.id("login-button")).click();
//		 
//		 driver.close();
//		 
	}

}

