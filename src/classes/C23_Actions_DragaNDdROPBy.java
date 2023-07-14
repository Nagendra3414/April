package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C23_Actions_DragaNDdROPBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");

		driver.manage().window().maximize();

		Actions ac = new Actions(driver);
	
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id ='slider']/span"));
		
		
		ac.pause(4000).build().perform();
		ac.dragAndDropBy(slider, 200,0).build().perform();
		ac.pause(4000).build().perform();

		ac.dragAndDropBy(slider, -200,0).build().perform();
		
		
		
	}

}
