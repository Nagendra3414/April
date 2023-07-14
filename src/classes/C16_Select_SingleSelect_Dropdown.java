package classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C16_Select_SingleSelect_Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//*[@id ='Skills']"));

		Select s = new Select(dropdown);

		if (s.isMultiple()) {
			System.out.println("Dropdown is multi select");
		} else {
			System.out.println("Dropdown is single select");

		}

		List<WebElement> options = s.getOptions();

		System.out.println(options.size());

		System.out.println(options.get(77).getText());

		for (int i = 0; i < options.size(); i++) {

			
			s.selectByIndex(i);
			
			Thread.sleep(2000);
			
			System.out.println(options.get(i).getText());
		}

//		s.selectByVisibleText("AutoCAD");
//
//		Thread.sleep(2000);
//
//		s.selectByVisibleText("End User Support");
//
//		Thread.sleep(2000);
//
//		s.selectByIndex(76);
//
//		Thread.sleep(2000);
//		s.selectByIndex(0);
//
//		Thread.sleep(2000);
//
//		s.selectByValue("C++");
//
//		Thread.sleep(2000);
//
//		s.selectByValue("iPhone");
//
//		Thread.sleep(2000);

		driver.close();

	}

}
