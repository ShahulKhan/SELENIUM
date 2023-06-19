package week7.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node013d20y5sjr08tx2lngy13o6ss195810.node0");

	driver.findElement(By.xpath("//span[text()='Show']")).click();
	
	
	
}
}
