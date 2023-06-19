package week8.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDynamicXPath {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://erail.in/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement from = driver.findElement(By.id("txtStationFrom"));
	from.clear();
	from.sendKeys("MAS",Keys.ENTER);

	WebElement to = driver.findElement(By.id("txtStationTo"));
	to.clear();
	to.sendKeys("MDU",Keys.ENTER);
	 
	// Uncheck the date
	driver.findElement(By.id("chkSelectDateOnly")).click();
	 
	// Get all the train's list
	List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]/a"));
	 
	for (int i = 2; i < findElements.size(); i++) {
		 String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
		 System.out.println(text);
	}

}

}
