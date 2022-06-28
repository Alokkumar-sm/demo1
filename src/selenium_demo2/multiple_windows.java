package selenium_demo2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_windows {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/div[2]/ul/li[1]/a")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		Object[] array = windowHandles2.toArray();
		driver.switchTo().window((String) array[1]);
		
		driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[3]/li[1]/a")).click();
		
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/div[3]/ul/li[1]/a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		Object[] windid = windowHandles.toArray();
		System.out.println(windid[0]);
		driver.switchTo().window((String) windid[0]);
		 
		driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/div[3]/ul/li[1]/a")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		
		 Object[] array2 = windowHandles3.toArray();
		 driver.switchTo().window((String) array[1]);
		
	}

}
