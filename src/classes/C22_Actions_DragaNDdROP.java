package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C22_Actions_DragaNDdROP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		driver.manage().window().maximize();

		Actions ac = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		
		ac.dragAndDrop(drag, drop).build().perform();
		
		
		
		driver.get("https://jqueryui.com/slider/");
		ac.pause(4000).build().perform();
		
		WebElement slider = driver.findElement(By.xpath("//*[@id ='slider']/span"));
		
		driver.switchTo().frame(0);
		ac.pause(4000).build().perform();
		ac.dragAndDropBy(slider, 200, 0).build().perform();
		
	}

}
