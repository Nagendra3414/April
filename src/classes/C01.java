package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/"); // Open the URL
		
		driver.manage().window().maximize();      // For maximizing the browser window
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");  
		
		
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		
		driver.findElement(By.name("login-button")).click();
		
		
	
		
		
		
	}

}
