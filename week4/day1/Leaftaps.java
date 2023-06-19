package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Leaftaps {
	
public static void main(String[] args) {
	
	// Launch Edge Browser
	EdgeDriver driver = new EdgeDriver ();
	
	// Maximize the Window
	driver.manage().window().maximize();
	
	// Load the URL
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	// Enter the user name
	driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	
	// Enter the Password
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	// Click on the submit button
	driver.findElement(By.className("decorativeSubmit")).click();
	
	
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohammed");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shahul Hameed");
	
	WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
	
	}

}
