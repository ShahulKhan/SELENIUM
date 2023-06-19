package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver ();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get(" https://www.redbus.in/\r\n");
	
	driver.findElement(By.id("src")).sendKeys("Chennai");
	
	driver.findElement(By.className("selected")).click();
	
	driver.findElement(By.id("dest")).sendKeys("Bangalore");
	
	driver.findElement(By.xpath("//li[@class='selected']")).click();
	
	driver.findElement(By.xpath("//td[text()='11']")).click();
	
	driver.findElement(By.id("search_btn")).click();
	
	Thread.sleep(7000);
	driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
	
	driver.findElement(By.xpath("(//label[@class='cbox-label'])[6]")).click();
	
	driver.close();
}

}
