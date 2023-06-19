package Assignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class MergeContact {

public static void main(String[] args) {
	
	EdgeDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("username")).sendKeys("DemosalesManagers");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	
	
	
}

}
