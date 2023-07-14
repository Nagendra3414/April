package dataDriven;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DataDriven_ArrayList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ArrayList<String> uid = new ArrayList<String>();
		ArrayList<String> uidCriteria = new ArrayList<String>();
		ArrayList<String> pwd = new ArrayList<String>();
		ArrayList<String> pwdCriteria = new ArrayList<String>();

//		System.out.println("Enter the number of Iteration: ");
//
//		Scanner scnr = new Scanner(System.in);
//
//		int n = Integer.parseInt(scnr.nextLine());
//
//		System.out.println(n);
//
//		for (int i = 0; i < n; i++) {
//			System.out.println("Enter UID");
//			uid.add(scnr.nextLine());
//
//			System.out.println("Enter UID cRITERIA");
//
//			uidCriteria.add(scnr.nextLine());
//
//			if (uidCriteria.get(i).equalsIgnoreCase("valid")) {
//				System.out.println("Enter pwd");
//
//				pwd.add(scnr.nextLine());
//
//				System.out.println("Enter pwd Criteria");
//
//				pwdCriteria.add(scnr.nextLine());
//			} else {
//				pwd.add("na");
//				pwdCriteria.add("Inalid");
//			}
//		}

//		uid.add("");
//		uidCriteria.add("Invalid");
//		pwd.add("na");
//		pwdCriteria.add("na");
//
//		uid.add("12345");
//		uidCriteria.add("Invalid");
//		pwd.add("na");
//		pwdCriteria.add("na");

		uid.add("testingtraining3414@gmail.com");
		uidCriteria.add("valid");
		pwd.add("");
		pwdCriteria.add("Invalid");

		uid.add("testingtraining3414@gmail.com");
		uidCriteria.add("valid");
		pwd.add("ABCDEF");
		pwdCriteria.add("Invalid");

		uid.add("testingtraining3414@gmail.com");
		uidCriteria.add("valid");
		pwd.add("Nagu@3414");
		pwdCriteria.add("Valid");

		ExtentReports er = new ExtentReports("Login.html", true);
		ExtentTest et = er.startTest("Verify the login Functionality");

		for (int i = 0; i < uid.size(); i++) {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://accounts.shopify.com/lookup");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
			
			driver.findElement(By.xpath("//*[@id ='account_email']")).sendKeys(uid.get(i));
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@name='commit']")).click();
			Thread.sleep(30000);

			try {

				if (uid.get(i).length() == 0
						&& driver.findElement(By.xpath("//*[text()='Enter a valid email address']")).isDisplayed()) {
					et.log(LogStatus.PASS, "Blank username testcase passed");
				}

				else if (uidCriteria.get(i).equalsIgnoreCase("invalid")
						&& driver.findElement(By.xpath("//*[text()='Enter a valid email address']")).isDisplayed()) {
					et.log(LogStatus.PASS, "Invalid username testcase passed");
				} else if (uidCriteria.get(i).equalsIgnoreCase("valid")
						&& driver.findElement(By.xpath("//*[@type='password']")).isDisplayed()) {
					et.log(LogStatus.PASS, "valid username testcase passed");
				} else {
					DataDriven_ArrayList obj = new DataDriven_ArrayList();

					String Screenshot = obj.screenshot(driver);

					et.log(LogStatus.FAIL, "Username testcase failed" + et.addScreenCapture(Screenshot));
				}

				driver.findElement(By.xpath("//*[@id ='account_password']")).sendKeys(pwd.get(i));
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@name ='commit']")).click();
				Thread.sleep(3000);

				if (pwd.get(i).length() == 0
						&& driver.findElement(By.xpath("//*[text()='Enter your password']")).isDisplayed()) {
					et.log(LogStatus.PASS, "Blank password testcase passed");

				} else if (pwdCriteria.get(i).equalsIgnoreCase("invalid")
						&& driver.findElement(By.xpath("//*[text()='Incorrect password']")).isDisplayed())

				{
					et.log(LogStatus.PASS, "Invalid password testcase passed");

				} else if (pwdCriteria.get(i).equalsIgnoreCase("valid")
						&& driver.findElement(By.xpath("(//*[@class='ui-nav__label ui-nav__label--parent'])[1]"))
								.isDisplayed()) {
					et.log(LogStatus.PASS, "Home page is opened");
				} else {
					DataDriven_ArrayList obj = new DataDriven_ArrayList();

					String Screenshot = obj.screenshot(driver);

					et.log(LogStatus.FAIL, "Password testcase failed" + et.addScreenCapture(Screenshot));
				}
			} catch (Exception e) {

			}

			driver.close();
			er.endTest(et);
			er.flush();
		}

	}

	public String screenshot(WebDriver driver) throws Exception {
		String ssName = "FailedTestcase.png";

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(ssName);
		FileHandler.copy(source, dest);

		return ssName;

	}

}
