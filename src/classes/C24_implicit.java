package classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C24_implicit {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.easemytrip.com/flights.html");

		driver.manage().window().maximize();

		// Implicitly
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //global wait

		driver.findElement(By.xpath("//*[@class ='srchBtnSe']")).click();

		driver.findElement(By.xpath("(//*[text() ='Book Now'])[1]")).click();

		driver.navigate().back();

		driver.findElement(By.xpath("//*[@class='ui-switcher']")).click();

		// driver.close();
	}

}
