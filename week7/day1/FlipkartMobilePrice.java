package week7.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMobilePrice {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobile",Keys.ENTER);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		List<Integer> price=new ArrayList<Integer>();

		for (int i = 0; i <findElements.size(); i++) {
			
			String rate = findElements.get(i).getText();
			
			String replaceAll = rate.replaceAll("[^0-9]", "");
			
			System.out.println(replaceAll);
			
			int parseInt = Integer.parseInt(replaceAll);
			
			price.add(parseInt);
			  
		}
		
		Integer min = Collections.min(price);
		System.out.println("Least price = " + min);

	}

}
