package Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in");
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
	driver.findElement(By.xpath("(//span[contains(@class,'nav-search-submit-text nav-sprite nav-progressive-attribute')])")).click();
	driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[2]")).click();
	
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> switchWindow = new ArrayList<String>(windowHandles);
	driver.switchTo().window(switchWindow.get(1));
	
	WebElement findElement = driver.findElement(By.xpath("(//span[contains(@class,'a-size-large product-title')])"));
	System.out.println(findElement.getText());
	driver.close();


}

}
