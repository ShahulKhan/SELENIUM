package week9.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://buythevalue.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		driver.findElement(By.id("com-hextom-smartpushmarketing-modal-close-modal")).click();
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		WebElement electronics = driver.findElement(By.xpath("//span[text()='ELECTRONICS']"));
		action.moveToElement(electronics).perform();
		
		Thread.sleep(2000);
		WebElement computer = driver.findElement(By.xpath("//span[text()='Computers & Accessories']"));
		action.moveToElement(computer).perform();
		
		Thread.sleep(2000);
		WebElement computerAcc = driver.findElement(By.xpath("//span[text()='Computer Accessories']"));
		action.moveToElement(computerAcc).perform();
		
		Thread.sleep(2000);
		WebElement Mouse = driver.findElement(By.xpath("//span[text()='Mouse']"));
		action.moveToElement(Mouse).perform();
		action.click().perform();
				
		driver.findElement(By.xpath("//span[text()='Mouse']")).click();
				
		driver.findElement(By.xpath("//span[text()='Zebronics']")).click();
		
		Thread.sleep(3000);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='special-price']"));
		
		List<Integer> mouse = new ArrayList<Integer>();
		for (WebElement integer : price) {
			String text = integer.getText();
			//System.out.println(text);
			String replaceAll = text.replaceAll("\\D", "");
			System.out.println(replaceAll);
			int int1 = Integer.parseInt(replaceAll);
			mouse.add(int1);
					
		}
		System.out.println(mouse);	
				
		System.out.println(Collections.max(mouse));
				
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snapshort/frame.png");
		FileUtils.copyFile(src, dst);
				
		}
		
}
