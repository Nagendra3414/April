package dataDriven;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DataDriven_HashMap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports er = new ExtentReports("Login_HashMap.html", true);
		ExtentTest et = er.startTest("Verify the login Functionality");

		HashMap<String, String> h1 = new HashMap<String, String>();
		HashMap<String, String> h2 = new HashMap<String, String>();

		h1.put("standard_user", "");
		h2.put("valid", "valid");

		for (Map.Entry<String, String> data1 : h1.entrySet()) {

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//*[@id ='user-name']")).sendKeys(data1.getKey());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id ='password']")).sendKeys(data1.getValue());
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='login-button']")).click();
			Thread.sleep(3000);

			try {

				for (Map.Entry<String, String> data2 : h2.entrySet()) {

					if (data1.getKey().length() == 0 && driver
							.findElement(By.xpath("//*[text()='Epic sadface: Username is required']")).isDisplayed()) {
						et.log(LogStatus.PASS, "Blank username testcase passed");
					}

					else if (data2.getKey().equalsIgnoreCase("invalid") && driver.findElement(By.xpath(
							"//*[text()='Epic sadface: Username and password do not match any user in this service']"))
							.isDisplayed()) {
						et.log(LogStatus.PASS, "Invalid username testcase passed");
					} else if (data2.getKey().equalsIgnoreCase("valid")) {
						et.log(LogStatus.PASS, "valid username testcase passed");
					} else {

						et.log(LogStatus.FAIL, "Username testcase failed");
					}

					if (data1.getValue().length() == 0 && driver
							.findElement(By.xpath("//*[text()='Epic sadface: Password is required']")).isDisplayed()) {
						et.log(LogStatus.PASS, "Blank password testcase passed");

					} else if (data2.getValue().equalsIgnoreCase("invalid") && driver.findElement(By.xpath(
							"//*[text()='Epic sadface: Username and password do not match any user in this service']"))
							.isDisplayed())

					{
						et.log(LogStatus.PASS, "Invalid password testcase passed");

					} else if (data2.getValue().equalsIgnoreCase("valid")
							&& driver.findElement(By.xpath("//*[text()='Products']")).isDisplayed()) {
						et.log(LogStatus.PASS, "Home page is opened");
					} else {

						et.log(LogStatus.FAIL, "Password testcase failed");
					}
				}
			} catch (Exception e) {

			}

			driver.close();
			er.endTest(et);
			er.flush();

		}
	}

}
