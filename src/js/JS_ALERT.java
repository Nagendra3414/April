package js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_ALERT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("window.alert('AUTOMATION TESTING ALERT')");
		
		driver.switchTo().alert().accept();
	}

}
