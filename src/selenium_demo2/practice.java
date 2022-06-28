package selenium_demo2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[3]/li[1]/a")).click();
		driver.findElement(By.name("FullName")).sendKeys("xyz");
		driver.findElement(By.name("CompanyName")).sendKeys("abc");
		driver.findElement(By.id("Form_submitForm_JobTitle")).sendKeys("efg");
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("qwe@gmail.cm");
		driver.findElement(By.name("Comment")).sendKeys("abcxyz");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_NoOfEmployees\"]"));	
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"Form_submitForm_NoOfEmployees\"]")));
		select.selectByIndex(4); 
		
		List<WebElement> findElements = driver.findElements(By.tagName("select"));
		System.out.println(findElements.size());
		
		
		
		 
		
	}

}
