package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C11_isDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		WebElement login = driver.findElement(By.xpath("//*[@class = 'submit-button btn_action']"));

		if (login.isDisplayed()) {
			System.out.println("We are on Log in page");
		} else {
			System.out.println("We aren't on Log in page");
		}

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		login.click();

		WebElement product = driver.findElement(By.xpath("//*[text() = 'Products']"));

		if (product.isDisplayed()) {
			System.out.println("We are on Home in page");
		} else {
			System.out.println("We aren't on Home in page");
		}

		driver.close();

	}

}
