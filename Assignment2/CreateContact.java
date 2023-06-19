package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateContact {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions ();
		options.addArguments("--remote-allow-origins=*","start-maximized");
		ChromeDriver driver = new ChromeDriver (options);
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		
		
		
	}
}
