package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C12_isEnabled {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.shopify.com/lookup");
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//*[text() = 'Continue with Email']"));

		if (button.isDisplayed()) {
			System.out.println("button is displayed");
		} else {
			System.out.println("button is not displayed");
		}

		if (button.isEnabled()) {
			System.out.println("Button is enabled state");
		} else {
			System.out.println("Button is disabled state");
		}

		Thread.sleep(4000);

		if (button.isEnabled()) {
			System.out.println("Button is enabled state");
		} else {
			System.out.println("Button is disabled state");
		}

		driver.close();

	}

}
