package selenium_demo2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_alerts {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		
		// prompt alert
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(1000);
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("hello");
		alert2.accept();
		
		System.out.println(driver.findElement(By.id("output")).getText());
				
		
		//simple alert
		driver.findElement(By.id("alertBox")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		Thread.sleep(2000);
		alert.accept();
		
		// confirmation alert
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		
		
		
		
		
		
	}

}
