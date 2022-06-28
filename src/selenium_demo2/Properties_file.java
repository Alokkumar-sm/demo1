package selenium_demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_file {
	
	
	public static void main(String[] args) {
		
	try {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		
		FileInputStream file = new FileInputStream("C:\\Users\\Alok\\eclipse-workspace\\selenium_demo2\\src\\objectrepo.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		driver.findElement(By.xpath(prop.getProperty("contactsales"))).click();
		driver.findElement(By.name("FullName")).sendKeys(prop.getProperty("fullname"));
		driver.findElement(By.name("CompanyName")).sendKeys(prop.getProperty("CompanyName"));
		
		
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}
	
}
