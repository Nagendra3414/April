package classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C18_DivTagDropDown_Single {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://semantic-ui.com/modules/dropdown.html");

		driver.manage().window().maximize();

		List<WebElement> drop = driver.findElements(By.xpath("(//*[@class ='ui selection dropdown'])[1]/div[2]/div"));

		// to display items we need to click on dropdown. Without clicking on dropdown
		// we can't perform operations on that dropdown

		WebElement dropdown =driver.findElement(By.xpath("(//*[@class ='ui selection dropdown'])[1]"));
		//dropdown.click();
		
		for (int i = 0; i < drop.size(); i++) {
			
			dropdown.click();
			Thread.sleep(4000);
			String a = drop.get(i).getText();
			System.out.println(a);
			
			drop.get(i).click();
			Thread.sleep(4000);
			
		}
		
		
//		System.out.println(drop.size());
//		
//		
//		drop.get(1).click();
//		
//		Thread.sleep(4000);
//		
//		dropdown.click();
//		drop.get(0).click();
//		Thread.sleep(4000);
		
		driver.close();
	}

}
