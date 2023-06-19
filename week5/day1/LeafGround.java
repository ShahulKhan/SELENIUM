package week5.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {
	
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions ();
	options.addArguments("--remote-allow-origins=*","start-maximized");
	ChromeDriver driver = new ChromeDriver (options);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.leafground.com/select.xhtml");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
	Select dropDown1 = new Select (tool);
	dropDown1.selectByVisibleText("Selenium");
	
	driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	driver.findElement(By.xpath("//li[text()='India']")).click();
	
	//driver.findElement(By.id("j_idt87:country_label")).click();
	//driver.findElement(By.id("j_idt87:country_3")).click();
	
	driver.findElement(By.id("j_idt87:city_label")).click();
	driver.findElement(By.id("j_idt87:city_2")).click();
	
	//Thread.sleep(5000);
	List<WebElement> findElements = driver.findElements(By.xpath("//ul[contains(@class,'uiui-selectonemenu-label ui-inputfield ui-corner-all'"));
	System.out.println(findElements.size());
	for (int i = 0; i < findElements.size(); i++) {
		String text = findElements.get(i).getText();
		System.out.println(text);		
	}
		
}
}
