package week7.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundLang {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver ();
	
	driver.manage().window().maximize();
	
	driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node01eom64k2rm69p1xkzja1cn6ks1185742.node0");
	
	List<WebElement> findElements = driver.findElements(By.xpath("//div[contains(@class,'ui-chkbox-box')]"));
	
	for (WebElement checkList : findElements) {
		System.out.println("checkList");
		
	}
}

}
