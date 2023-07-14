package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id = 'checkbox1']"));
		
		checkbox.click();
		
		Thread.sleep(2000);
		
		if(checkbox.isSelected())
		{
			System.out.println("CHECK BOX IS SELECTED STATE");
		}
		else
		{
			System.out.println("CHECK BOX IS not SELECTED STATE");
		}
		
		driver.close();
	}

}
