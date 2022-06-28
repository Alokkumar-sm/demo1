package selenium_demo2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_demo{

	
	
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}
		public void takesscreenshot() {
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			
			File target = new File("C:\\Users\\Alok\\eclipse-workspace\\selenium_demo2\\screenshots.png");
			FileHandler.copy(screenshotAs, target);
		
		
		
	
	}
	

}
