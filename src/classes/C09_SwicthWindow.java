package classes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C09_SwicthWindow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();

		WebElement click = driver.findElement(By.xpath("//*[text() ='    click   ']"));

		click.click();

		Thread.sleep(3000);

		// List is a collection of elements
		// ArrayList is a collection of values

		// In array list index starts from 0
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(windows.get(1));

		driver.findElement(By.xpath("//*[text() ='Documentation']")).click();

		Thread.sleep(3000);

		driver.switchTo().window(windows.get(0));

		click.click();
		
		driver.quit();
		
		

	}

}
