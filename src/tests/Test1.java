package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.ProductsPage;
import pages.YourCartPage;
import pages.YourInfoPage;

public class Test1 {

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

		YourCartPage ypage = new YourCartPage(driver);
		ypage.removeDisplay();
		ypage.ClickCheckout();

		YourInfoPage yipage = new YourInfoPage(driver);
		yipage.InfoPageDisplay();
		yipage.firstNameEnter("Gowthami");
		yipage.lastNameEnter("SaiLatha");
		yipage.zipCodeEnter("12433443");

	}

}
