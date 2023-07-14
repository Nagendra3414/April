package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven_ExcelSheets {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fs = new FileInputStream("D:\\Selenium_Projects\\April_Project\\Book1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fs);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int Rows = sheet.getLastRowNum();

		System.out.println(Rows);

		int Columns = sheet.getRow(0).getLastCellNum();
		System.out.println(Columns);
		
		sheet.getRow(0).createCell(5).setCellValue("Result");

		for (int i = 1; i <= Rows; i++) {
			String firstname = sheet.getRow(i).getCell(0).toString();
			String lastname = sheet.getRow(i).getCell(1).toString();
			String Address = sheet.getRow(i).getCell(2).toString();
			String email = sheet.getRow(i).getCell(3).toString();
			String phone = sheet.getRow(i).getCell(4).toString();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://demo.automationtesting.in/Register.html");

			driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys(firstname);

			driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys(lastname);

			driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(Address);

			driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys(email);

			driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys(phone);

			sheet.getRow(i).createCell(5).setCellValue("PASS");
			
			Thread.sleep(3000);
			
			driver.close();	
		}
		
		FileOutputStream fo = new FileOutputStream("D:\\Selenium_Projects\\April_Project\\Book1.xlsx");
		workbook.write(fo);
		fo.close();
		fs.close();
	}

}
