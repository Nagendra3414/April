package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.ProductsPage;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		LoginPage lpage = new LoginPage(driver);
		lpage.usernameEnter("standard_user");
		lpage.passwordEnter("secret_sauce");

		lpage.ClcikloginButton();

		ProductsPage ppage = new ProductsPage(driver);
		ppage.productDisplay();
		ppage.ClickAddCart();
		ppage.clcikShopCart();
	}

}
