package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Uipath {
	
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions ();
	options.addArguments("--remote-allow-origins=*","start-maximized");
	ChromeDriver driver = new ChromeDriver (options);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://uibank.uipath.com/register-account");
	
	driver.findElement(By.id("firstName")).sendKeys("abc");
	
	WebElement title = driver.findElement(By.id("title"));
	Select dropDown1 = new Select (title);
	dropDown1.selectByValue("mr");
	
	driver.findElement(By.id("middleName")).sendKeys("u");
	
	driver.findElement(By.id("lastName")).sendKeys(" xyz");
	
	WebElement gender = driver.findElement(By.id("sex"));
	Select dropDown2 = new Select (gender);
	dropDown2.selectByIndex(0);
	
	WebElement work = driver.findElement(By.id("employmentStatus"));
	Select dropDown3 = new Select (work);
	dropDown3.selectByVisibleText("Unemployed");
	
	driver.findElement(By.id("numberOfDependents")).sendKeys("1234567890");
	
	driver.findElement(By.id("username")).sendKeys("xyz");
	
	driver.findElement(By.id("email")).sendKeys("12345qwerty@gmail.com");
	
	driver.findElement(By.id("password")).sendKeys("12345qwerty@");
	
	driver.close();
}

}


