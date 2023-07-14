package classes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C25_ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.easemytrip.com/flights.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@class ='srchBtnSe']")).click();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text() ='Book Now'])[1]")));

		driver.findElement(By.xpath("(//*[text() ='Book Now'])[1]")).click();

		driver.navigate().back();

		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		w1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='ui-switcher']")));

		driver.findElement(By.xpath("//*[@class='ui-switcher']")).click();
//
//		// driver.close();
	}

}
