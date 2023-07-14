package classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C17_Select_multiSelect_Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");

		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//*[@id ='cars']"));

		Select s = new Select(dropdown);

		if (s.isMultiple()) {
			System.out.println("Dropdown is multi select");
		} else {
			System.out.println("Dropdown is single select");

		}

		List<WebElement> list = s.getOptions();

		s.selectByValue("opel");

		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(3);

//		String first = s.getFirstSelectedOption().getText();
//		
//		System.out.println(first);

		List<WebElement> a = s.getAllSelectedOptions();

		for (int i = 0; i < a.size(); i++) {

			System.out.println(a.get(i).getText());
		}
		Thread.sleep(2000);

		// s.deselectAll();

		s.deselectByIndex(2);
		Thread.sleep(2000);

		s.deselectByValue("volvo");

		Thread.sleep(2000);

		s.deselectByVisibleText("Audi");

		Thread.sleep(2000);

		s.deselectAll();
		driver.close();

	}

}
