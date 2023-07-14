package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_03_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html"); // Open the URL

		driver.manage().window().maximize(); // For maximizing the browser window
		
		
		//driver.findElement(By.xpath("//input[@placeholder ='First Name']")).sendKeys("ABCDEF");
		
		//driver.findElement(By.cssSelector("input[placeholder ='First Name']")).sendKeys("1235612567");
		
		//driver.findElement(By.xpath("//*[@ng-model = 'Phone']")).sendKeys("678746263592");
		
		System.out.println(driver.findElement(By.xpath("//*[text() ='Phone*']")).getText());
		
		
		driver.findElement(By.xpath("//*[contains (@id , 'dpas')]")).sendKeys("gasfjgaj");
	}

}
