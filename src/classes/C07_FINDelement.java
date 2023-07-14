package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_FINDelement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.xpath("//*[@name ='user-name']"));
		
		username.sendKeys("asfkakfsja");
		
		Thread.sleep(4000);
		
		username.clear();
		
	String text =	driver.findElement(By.xpath("//*[@class ='login_logo']")).getText();
	
	System.out.println(text);
	
	
	String value = driver.findElement(By.xpath("//*[@id ='user-name']")).getAttribute("data-test");
	System.out.println(value);
	
	driver.close();
		
	}

}
