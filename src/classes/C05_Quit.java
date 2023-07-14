package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Quit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		
//	driver.findElement(By.xpath("//*[text() = '    click   ']")).click();
//		
//		
//	//	driver.close();
//		
//		driver.quit();
		
		
		String title = driver.getTitle();
		
		System.out.println(title);

		
		driver.close();
	}

}
