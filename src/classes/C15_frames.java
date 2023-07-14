package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C15_frames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// driver.get("https://ui.vision/demo/webtest/frames/");

		driver.navigate().to("https://ui.vision/demo/webtest/frames/");

		driver.manage().window().maximize();

		// Note: Frames index starts from 0
//		driver.switchTo().frame(0);
//
//		driver.findElement(By.xpath("//*[@name ='mytext1']")).sendKeys("Automation 1");
//
//		driver.switchTo().defaultContent();
//
//		driver.switchTo().frame(2);
//
//		driver.findElement(By.xpath("//*[@name ='mytext3']")).sendKeys("Automation 3");
//
//		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);

		driver.findElement(By.xpath("//*[@name ='mytext3']")).sendKeys("Automation 3");

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("(//*[@class='AB7Lab Id5V1'])[3]")).click();

		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		driver.switchTo().frame(1);

		driver.findElement(By.xpath("//*[@name ='mytext2']")).sendKeys("Automation 2");

		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_timing1");

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.navigate().refresh();
	}

}
