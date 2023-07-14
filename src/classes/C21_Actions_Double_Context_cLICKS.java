package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C21_Actions_Double_Context_cLICKS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		Actions ac = new Actions(driver);

		WebElement address = driver.findElement(By.xpath("//*[text() ='Address']"));

		WebElement firstName = driver.findElement(By.xpath("//*[@placeholder = 'First Name']"));

		ac.doubleClick(address).build().perform();

		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).click(firstName).keyDown(Keys.CONTROL).sendKeys("v")
				.keyUp(Keys.CONTROL).build().perform();
		
		ac.pause(4000).build().perform();
		ac.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
		
		ac.pause(4000).build().perform();
		ac.contextClick(firstName).build().perform();
		
		
		
		
		
		
	}

}
