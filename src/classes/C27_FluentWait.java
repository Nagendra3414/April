package classes;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C27_FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_timing1");

		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//*[@onclick='setTimeout(myFunction, 3000);']")).click();

//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(4));
//		w.until(ExpectedConditions.alertIsPresent());

		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver);

		Duration d1 = Duration.of(2, ChronoUnit.SECONDS);

		f.pollingEvery(d1);

		Duration d2 = Duration.of(6, ChronoUnit.SECONDS);

		f.withTimeout(d2);

		f.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();

	}

}
