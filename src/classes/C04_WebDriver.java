package classes;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C04_WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;

		// Cross Browsing

		System.out.println("Enter a Browser name:");

		Scanner scr = new Scanner(System.in);

		String browsername = scr.nextLine();

		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("https://google.com/");

		driver.manage().window().maximize();
		
		driver.close();

	}

}
