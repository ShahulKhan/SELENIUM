package week8.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0usmiiwuga5ty1h7v1dimfnh2d200728.node0");
	
	//driver.navigate().to(null)
    
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
	
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	
	//javaScript code
	
	/*
	 * WebElement click = driver.findElement(By.xpath("//span[text()='Open']"));
	 * driver.executeScript("arguments[0]", click);
	 */
	
	Set<String> Dashboard = driver.getWindowHandles();
	List<String> win = new ArrayList<String>(Dashboard);
	
	driver.switchTo().window(win.get(1));
	
	String text = driver.findElement(By.xpath("//span[@class='team-member'][1]")).getText();
	System.out.println(text);
	
	driver.close();
	
	driver.switchTo().window(win.get(0));
	driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	
	/*
	 * int size = win.size(); System.out.println(size);
	 */
	
	Set<String> openWindow = driver.getWindowHandles();
	List<String> open = new ArrayList<String>(openWindow);
	System.out.println(open.size());
	    
	//close tab    
	    
	driver.switchTo().window(open.get(1)); 
	driver.close();
	
	driver.switchTo().window(open.get(2));
	driver.close();
	
	driver.switchTo().window(open.get(0));
    driver.close();	
}

}
