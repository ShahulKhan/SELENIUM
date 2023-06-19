package week7.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMobileName {

public static void main(String[] args) {
	
	// Launch the Browser
	ChromeDriver driver = new ChromeDriver ();
	
	// Maximize the window
	driver.manage().window().maximize();
	
	// Load the url
	driver.get("https://www.flipkart.com/");
	
	// Apply imnpliclitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	// 
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobile");
	
	//
	List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
	
		
}

}
