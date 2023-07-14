package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C20_Actions_MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/");

		driver.manage().window().maximize();

		Actions ac = new Actions(driver);

		WebElement kids = driver.findElement(By.xpath("(//*[text() = 'Kids'])[1]"));
		WebElement Men = driver.findElement(By.xpath("(//*[text() = 'Men'])[1]"));

		ac.moveToElement(kids).build().perform();

		ac.pause(4000).build().perform();

		ac.moveToElement(Men).build().perform();

	}

}
