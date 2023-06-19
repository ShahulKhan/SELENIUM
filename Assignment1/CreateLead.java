package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kamal");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Hassan");
	
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("UlagaNayagan");
	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA Team");
	
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Tester");
	
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajkamal@gmail.com");
	
	WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	
	Select dropDown=new Select(findElement);
	
	dropDown.selectByVisibleText("New York");
	
	driver.findElement(By.name("submitButton")).click();
	 
	String title = driver.getTitle();
	System.out.println(title);
	
}

}
