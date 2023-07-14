package classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C26_ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_timing1");

		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//*[@onclick='setTimeout(myFunction, 3000);']")).click();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(4));
		w.until(ExpectedConditions.alertIsPresent());

		// 500 milliseconds is polling wait
		
		driver.switchTo().alert().accept();
	}

}
