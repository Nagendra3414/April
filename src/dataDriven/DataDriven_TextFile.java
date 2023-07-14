package dataDriven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven_TextFile {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
//Reading data from the text file
		File f1 = new File("D:\\Selenium_Projects\\April_Project\\input.txt");
		FileReader fr1 = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr1);

		
		//Write the data
		File f2 = new File("D:\\Selenium_Projects\\April_Project\\data.txt");
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		

		String ln = "";

		while ((ln = br.readLine()) != null) {

			String[] data = ln.split(",");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://demo.automationtesting.in/Register.html");

			driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys(data[0]);

			driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys(data[1]);

			driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(data[2]);

			driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys(data[3]);

			driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys(data[4]);

			Thread.sleep(3000);
			
			bw.write(ln+" : PASS");
			bw.newLine();

			driver.close();

		}

		br.close();
		fr1.close();
		
		bw.close();
		fw.close();
	}

}
