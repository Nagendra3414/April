package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/"); // Open the URL

		driver.manage().window().maximize(); // For maximizing the browser window
		
		
	//	driver.findElement(By.linkText("Gmail")).click();
		
	//	driver.findElement(By.linkText("Images")).click();
		
	//	driver.findElement(By.partialLinkText("Imag")).click();
		
		
	}

}
