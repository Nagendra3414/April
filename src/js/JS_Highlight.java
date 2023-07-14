package js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Highlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

//		js.executeScript("document.getElementsByName('q')[0].value = 'Automation'");
//		
//		js.executeScript("document.getElementsByClassName('gNO89b')[0].click()");

//		js.executeScript("document.getElementById('firstpassword').value='First Password'");

		WebElement fn = driver.findElement(By.xpath("//*[@placeholder ='First Name']"));
		WebElement male = driver.findElement(By.xpath("//*[@value ='Male']"));

//		js.executeScript("arguments[0].value = 'first name'", fn);
//
//		js.executeScript("arguments[0].click()", male);
		
		js.executeScript("arguments[0].style.border = 'green 6px dashed'", fn);
		
		js.executeScript("arguments[0].style.border = '0px'", fn);
	}

}
