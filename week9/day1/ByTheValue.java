package week9.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ByTheValue {

public static void main(String[] args) throws InterruptedException {

	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://buythevalue.in/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//div[(contains(@id,'com-hextom-smartpushmarketing-modal-close'))]")).click();
	
	Actions action = new Actions(driver);
	
	WebElement men = driver.findElement(By.xpath("//span[text()='MEN']"));
	action.moveToElement(men).perform();
	
	WebElement bag = driver.findElement(By.xpath("//span[text()='Bags']"));
	action.moveToElement(bag).perform();
	
	driver.findElement(By.xpath("//span[text()=' Laptop Bags']")).click();	
	
	List<WebElement> laptopBags = driver.findElements(By.xpath("//span[@class='special-price']"));
	System.out.println("Total Number of Bags = " + laptopBags.size());
	
	List<Integer> price = new ArrayList<Integer>();
	
	for (WebElement integer : laptopBags ) {
		String text = integer.getText();
		
		Thread.sleep(5000);
		String replace = text.replaceAll("//D", "");
		System.out.println(replace);
		
		int int1 = Integer.parseInt(replace);
		//mouse.add(int1);
	}
	
	
	
}

}
