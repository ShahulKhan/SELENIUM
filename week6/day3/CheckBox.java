package week6.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node01eom64k2rm69p1xkzja1cn6ks1185742.node0");
	
}

}
