package week7.day4;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver ();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node013d20y5sjr08tx2lngy13o6ss195810.node0");
	
	driver.findElement(By.xpath("//span[text()='Show']")).click();
	
	Alert simple = driver.switchTo().alert();
	
	String text1 = simple.getText();
	System.out.println(text1);
	simple.accept();
	
	driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
    Alert confirm = driver.switchTo().alert();
    
    String text2 = confirm.getText();
    System.out.println(text2);
    confirm.accept();
    
    driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
    Alert enterName = driver.switchTo().alert();
    enterName.sendKeys("ABC XYZ");
    
    String text3 = enterName.getText();
    System.out.println(text3);
    enterName.accept();

}

}
