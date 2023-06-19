package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

public static void main(String[] args) {
		
	EdgeDriver driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohammed");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shahul Hameed");
	
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shahul Khan");
	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA Team");
	
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Tester");
	
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("theshahulkhan7@gmail.com");
	
	WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	
	Select dropDown=new Select(findElement);
	
	dropDown.selectByVisibleText("New York");
	
	driver.findElement(By.name("submitButton")).click();
	
	String text = driver.getTitle();
	
	System.out.println(text);
	
	driver.findElement(By.linkText("Duplicate Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	 
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf Solutions");
	
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("tcs");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	if (text.equals(title)) {
		 System.out.println("Duplicate Lead");
	} 
	else {
		System.out.println("Not duplicate");
	}
}
}
