package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C19_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		Actions ac = new Actions(driver);

		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));

		ac.sendKeys(username, "standard_user").build().perform();

		//ac.pause(2000).build().perform();
		
		ac.sendKeys(password, "secret_sauce").build().perform();

		//ac.pause(2000).build().perform();
		ac.click(login);

	}

}
