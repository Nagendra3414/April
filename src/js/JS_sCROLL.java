package js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_sCROLL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(4000);
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		Thread.sleep(4000);
		
		WebElement fn = driver.findElement(By.xpath("//*[@ng-model='EmailAdress']"));
		
		js.executeScript("arguments[0].scrollIntoView()", fn);
		
	}

}
