package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	
public static void main(String[] args) {
	
	  ChromeOptions options = new ChromeOptions ();
	  options.addArguments("--remote-allow-origins=*","start-maximized");
	  ChromeDriver driver = new ChromeDriver (options);
	
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	  driver.get("https://www.tamilmatrimony.in/");
	
	  WebElement registered_by = driver.findElement(By.id("REGISTERED_BY"));
      Select selectRegisteredBy = new Select(registered_by);
      selectRegisteredBy.selectByValue("1");
      
      driver.findElement(By.id("NAME")).sendKeys("abc xyz");
      
      driver.findElement(By.id("gendermale")).click();
      
      WebElement date = driver.findElement(By.id("DOBDAY"));
      Select dropDown1 = new Select(date);
      dropDown1.selectByValue("1");
      
      WebElement month = driver.findElement(By.id("DOBMONTH"));
      Select dropDown2 = new Select (month);
      dropDown2.selectByValue("1");
      
      WebElement year = driver.findElement(By.id("DOBYEAR"));
      Select dropDown3 = new Select (year);
      dropDown3.selectByValue("2001");
      
      WebElement religion = driver.findElement(By.id("RELIGION"));
      Select dropDown4 = new Select (religion);
      dropDown4.selectByValue("11");
      
      WebElement language = driver.findElement(By.id("MOTHERTONGUE"));
      Select dropDown5 = new Select (language);
      dropDown5.selectByValue("47");
      
      WebElement CountryCode = driver.findElement(By.id("M_COUNTRYCODE"));
      Select selectCountryCode = new Select(CountryCode);
      selectCountryCode.selectByValue("98");

     
      WebElement country = driver.findElement(By.id("COUNTRY"));
      Select selectCountry = new Select(country);
      selectCountry.selectByValue("98");

     
      driver.findElement(By.id("MOBILENO")).sendKeys("1234567890");
      
      driver.findElement(By.id("EMAIL")).sendKeys("12345qwerty@gmail.com");
     
      driver.findElement(By.name("PASSWD1")).sendKeys("12345qwerty@");

     
      driver.close();

      
}

}
