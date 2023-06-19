package week7.day4;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class TargetLocations {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver ();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.leafground.com/alert.xhtml");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	
}

}
