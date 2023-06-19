package Assignment5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyTheValue {

public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://buythevalue.in/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.findElement(By.id("com-hextom-smartpushmarketing-modal-close-modal")).click();
	
	Actions actions = new Actions(driver);
	
	WebElement findElement0 = driver.findElement(By.xpath("//span[text()='ELECTRONICS']"));
	actions.moveToElement(findElement0).perform();
	
	WebElement findElement1 = driver.findElement(By.xpath("//span[text()='Computers & Accessories']"));
	actions.moveToElement(findElement1).perform();
	
	WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Computer Accessories']"));
	actions.moveToElement(findElement2).perform();
	
	WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Mouse']"));
	actions.moveToElement(findElement3).perform();
	actions.click().perform();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Mouse']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Zebronics']")).click();
	
	Thread.sleep(2000);
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='special-price']"));
	
	List<Integer> mouse = new ArrayList<Integer>();
	
	for (WebElement integer : price) {
		String text = integer.getText();
//		System.out.println(text);
		
		String all = text.replaceAll("\\D", "");
		System.out.println(all);
		
		int i = Integer.parseInt(all);
		
		mouse.add(i);
	}
	
	System.out.println(mouse);
	
	System.out.println(Collections.max(mouse));
	
	
	
}

}
