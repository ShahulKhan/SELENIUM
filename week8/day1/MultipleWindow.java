package week8.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

public static void main(String[] args) throws InterruptedException {

	ChromeDriver driver = new ChromeDriver();
	
	// For 1st tab
	driver.manage().window().maximize();
	
	driver.get("https://www.leafground.com/window.xhtml");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> SwitchWindow = new ArrayList<String>(windowHandles);
	driver.switchTo().window(SwitchWindow.get(2));
	
	// For 3rd tab
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[contains(@class,'ui-paginator')])[4]")).click();
	driver.close();
	
	driver.switchTo().window(SwitchWindow.get(1));
	// For 2nd tab
	driver.manage().window().maximize();
	driver.close();
	
	driver.switchTo().window(SwitchWindow.get(0));
	driver.close();

}

}
