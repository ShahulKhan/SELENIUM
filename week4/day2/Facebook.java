package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

public static void main(String[] args) {
		
	EdgeDriver driver = new EdgeDriver () ;
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login");
	
	driver.findElement(By.id("email")).sendKeys("theshahulkhan7@gmail.com");
	
	driver.findElement(By.id("pass")).sendKeys("123456qwertyg");
	
	driver.findElement(By.id("loginbutton")).click();
	
	// String text is to print
	String text = driver.findElement(By.className("_9ay7")).getText();
	System.out.println(text);
	
}
}
