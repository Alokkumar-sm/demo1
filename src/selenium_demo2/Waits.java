package selenium_demo2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void main(String[] args) {
		 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		
		// Implicit wait
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("djjjd")));
		//wait.until(ExpectedConditions.elementToBeSelected(By.name("q")));
	
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		// Explicit wait
		
		
		
		
	
	}

	
	
	
	
}
