package selenium_demo2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouse_actions {
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.id("email"));
		action.moveToElement(element).click().perform();
		action.moveToElement(element).doubleClick().perform();
		action.moveToElement(element).contextClick().perform();
		
	}
	
	

}
