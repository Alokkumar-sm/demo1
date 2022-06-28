package selenium_demo2;


import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	
	
	
	//WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Full page screenshot
		
		TakesScreenshot ts= driver; 
		File screenshot = ts.getScreenshotAs(OutputType.FILE); // print screen
		File target = new File("C:\\Users\\Alok\\eclipse-workspace\\selenium_demo2\\screenshots.png"); // screenshot is saved
		FileHandler.copy(screenshot, target); //copying the file and stored
		driver.close();
	
		// Selected portion of page
		/*WebElement findElement = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]"));
		File screenshot = findElement.getScreenshotAs(OutputType.FILE); // print screen
		File target = new File("C:\\Users\\Alok\\eclipse-workspace\\selenium_demo2\\screenshots1.png"); // screenshot is saved
		FileHandler.copy(screenshot, target); //copying the file and stored*/
	
		
		
	
	
	/*public  void takeScreenshot(String filename) throws IOException {
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("C:\\Users\\Alok\\eclipse-workspace\\selenium_demo2\\screenshots"+filename+".png");
		
		FileHandler.copy(file, target);*/
		

	}

}

