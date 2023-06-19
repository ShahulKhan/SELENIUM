package week8.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoInternetException {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	try {
		driver.get("https://www.redbus.in/\\r\\n");
	} 
	
	catch (Exception e) {
		WebElement Exception = driver.findElement(By.xpath("//span[text()='No Internet']"));
		System.out.println(Exception.getText());
	}
	
}

}
