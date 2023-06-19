package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.facebook.com");
	
	driver.findElement(By.linkText("Create new account")).click();
	
	driver.findElement(By.name("firstname")).sendKeys("abc");
	driver.findElement(By.name("lastname")).sendKeys("xyz");
	
	driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
	
	driver.findElement(By.id("password_step_input")).sendKeys("12345qwerty@");
	
	WebElement date = driver.findElement(By.id("day"));
	Select dropdown = new Select(date);
	dropdown.selectByValue("1");

	WebElement month = driver.findElement(By.name("birthday_month"));
	Select dropdown2 = new Select(month);
	dropdown2.selectByVisibleText("Jan");
	
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select dropdown3 = new Select(year);
	dropdown3.selectByVisibleText("2000");
	
	WebElement findElement4 = driver.findElement(By.xpath("//input[@value  ='2']"));
	findElement4.click();
	
	driver.close();

}

}
