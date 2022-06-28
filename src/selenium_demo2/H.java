package selenium_demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[3]/li[1]/a")).click();
		WebElement dropdown = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		// select.selectByValue("11 - 15");
		// select.selectByVisibleText(null);// 
		
	}

}
