package classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_findElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();
		
		WebElement adddress = driver.findElement(By.xpath("//*[text() = 'Address']"));
		
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@class = 'col-md-3 col-xs-3 col-sm-3 control-label']"));
		
		
		System.out.println(list.size());
		
		
		//Index starts from - 0
//	     String first = list.get(0).getText();
//		System.out.println(first);
//		
//		String last = list.get(12).getText();
//		System.out.println(last);
		
		
		for(int i= 10; i<list.size(); i++)
		{
			
			String a = list.get(i).getText();
			
			System.out.println(a);
		}
		
		
		List<WebElement> imgs =driver.findElements(By.xpath("//a"));
		System.out.println(imgs.size());
		
		
		driver.close();
		
	}

}
