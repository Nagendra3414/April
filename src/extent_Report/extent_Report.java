package extent_Report;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extent_Report {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ExtentReports er = new ExtentReports("AutomationTesting.html", true);
		ExtentTest et = er.startTest("Verify the title of the page");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");

		String title = driver.getTitle();

		if (title.equals("Register123")) {
			et.log(LogStatus.PASS, "Title testcase is passed");
		} else {

			extent_Report obj = new extent_Report();
			String ss = obj.screenshot(driver);

			et.log(LogStatus.FAIL, "Title testcase is failed" + et.addScreenCapture(ss));
		}

		driver.close();
		er.endTest(et);
		er.flush();

	}

	public String screenshot(WebDriver driver) throws Exception {
		String ssName = "FailedTestcase.png";

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(ssName);
		FileHandler.copy(source, dest);

		return ssName;

	}

}
