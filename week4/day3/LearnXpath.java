package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnXpath {
	
public static void main(String[] args) {
	
	EdgeDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.findElement(By.xpath("//input[@id='USERNAME']")).sendKeys("DemosalesManager");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	
}

}
