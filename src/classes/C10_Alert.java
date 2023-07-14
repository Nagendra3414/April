package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C10_Alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@onclick ='alertbox()']")).click();

	

		String alerttext = driver.switchTo().alert().getText();

		System.out.println(alerttext);

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//*[@class ='analystic'])[2]")).click();

		driver.findElement(By.xpath("//*[@onclick ='confirmbox()']")).click();

		String pressbutton = driver.switchTo().alert().getText();

		System.out.println(pressbutton);
		
		Thread.sleep(3000);

		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("(//*[@class ='analystic'])[3]")).click();
		driver.findElement(By.xpath("//*[@onclick ='promptbox()']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("ABCDEFGH");
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		

	}

}
