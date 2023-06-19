package week8.day1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver ();
	
	driver.manage().window().maximize();
	
	driver.get("https://erail.in/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
	fromStation.clear();
	fromStation.sendKeys("MAS",Keys.ENTER);
	
	WebElement toStation = driver.findElement(By.id("txtStationTo"));
	toStation.clear();
	toStation.sendKeys("MDU",Keys.ENTER);
	
	driver.findElement(By.id("chkSelectDateOnly")).click();
	
	List<WebElement> no = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[1]/a"));
	System.out.println(no);
	
	
}

}
