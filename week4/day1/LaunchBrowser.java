package week4.day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
	//ChromeDriver driver = new ChromeDriver();

	// How to launch empty browser ?
	// We should ask
	// Which browser do you want to launch ?
	
	EdgeDriver driver = new EdgeDriver();
	// Driver is a common object name for all drivers
	// Don't use your own object names
	
	// Load the application URL
	
	// https - hyper text transport protocol
	// without https browser doesn't load
	
	
	//driver.get("https://www.facebook.com/login/");
	
	//driver.get("https://www.instagram.com/accounts/login/");
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	// To Maximize the Browser
	driver.manage().window().maximize();
	
	// Enter the username as Demosalesmanager
	driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	
	//
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	//
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//
	driver.findElement(By.linkText("CRM/SFA")).click();
	}

}
