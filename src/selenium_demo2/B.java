package selenium_demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B {

	public static void main(String[] args) {ClassNotFoundException
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Alok\\Desktop\\webdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String Baseurl = "https://www.google .com/";
		
		driver.get(Baseurl);
		
		
		
		String expectedTitle = "Google";
		String actualTitle = "Google";
		actualTitle = driver.getTitle();
		
		
		 
		// if (actualTitle.contentEquals(expectedTitle)){
		//    System.out.println("Test Passed!");
		// } else {
		//      System.out.println("Test Failed");
		// }	
		//System.out.println(actualTitle);
		// driver.close();
		 
	}

}
