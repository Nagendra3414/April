package classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_getCuutenrURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		
		if(url.contains("https"))
		{
			System.out.println("Website is secured");
		}
		else
		{
			System.out.println("WebSite is not secured");
		}
		
		
		String sourceCode = driver.getPageSource();
		
		System.out.println(sourceCode);
		
		driver.close();
	}

}
