package week8.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindow {

public static void main(String[] args) throws InterruptedException {

	ChromeDriver driver = new ChromeDriver ();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.leafground.com/window.xhtml");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("j_idt88:new")).click();
	
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> switchWindow = new ArrayList<String>(windowHandles);
	driver.switchTo().window(switchWindow.get(1));
	
	driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui')]")).sendKeys("aeiou123@gmail.com");
	
	Thread.sleep(3000);
	driver.close();
	
	driver.switchTo().window(switchWindow.get(0));
	
	Thread.sleep(3000);
	driver.close();
	
}

}
