package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LenskartActionsClass {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.lenskart.com/eyeglasses/promotions.html?utm_source=google&utm_medium=cpc&utm_campaign=Google-MainAcc-LK-HomeBrand-Search-150119&utm_content=lenskart_exact&utm_source=google&utm_medium=cpc&utm_campaign=Google-MainAcc-LK-HomeBrand-Search-150119&utm_channel=search&gclid=Cj0KCQjw8qmhBhClARIsANAtboeZQqrkFXpe5iTU-qunsYRt1FysZGL-1j5DpMH76z__bgRo5fRksT4aAgQyEALw_wcB");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("wzrk-cancel")).click();
	
	WebElement computerLens = driver.findElement(By.xpath("//a[text()='COMPUTER GLASSES']"));
	
	WebElement women = driver.findElement(By.xpath("(//span[text()='women'])[2]"));
	
	Actions builder = new Actions (driver);
	
	builder.moveToElement(computerLens).moveToElement(women).perform();
	
	driver.findElement(By.xpath("(//span[text()='PREMIUM RANGE'])[2]")).click();
	
	driver.close();
}

}
