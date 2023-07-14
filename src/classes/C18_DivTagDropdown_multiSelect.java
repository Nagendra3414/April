package classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C18_DivTagDropdown_multiSelect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://semantic-ui.com/modules/dropdown.html");

		driver.manage().window().maximize();

		List<WebElement> drop = driver
				.findElements(By.xpath("(//*[contains(@class,'ui fluid dropdown')])[1]/div[2]/div"));

		System.out.println(drop.size());

		WebElement dropdown = driver.findElement(By.xpath("(//*[contains(@class,'ui fluid dropdown')])[1]"));

		dropdown.click();

//		drop.get(0).click();
//		
//		Thread.sleep(2000);
//		
//		drop.get(17).click();

		for (int i = 0; i < drop.size(); i++) {

			
			String a = drop.get(i).getText();
			System.out.println(a);

			drop.get(i).click();
		

		}
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ESCAPE).build().perform();
		
		

	}

}
