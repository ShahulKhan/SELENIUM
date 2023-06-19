package week7.day4;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver ();
	
	driver.manage().window().maximize();
	
	driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node01eom64k2rm69p1xkzja1cn6ks1185742.node0");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	List<WebElement> tick = driver.findElements(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]"));
	
	for (WebElement all : tick) {
		all.click();
	}
	
}

}
