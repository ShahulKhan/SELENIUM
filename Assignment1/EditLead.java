package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

public static void main(String[] args) {
	
	EdgeDriver driver=new EdgeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohammed");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shahul Hameed");
	
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ShahulKhan");
	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA Team");
	
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Software tester");
	
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("theshahulkhan7@gmail.com");
	
	WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	
	Select dropDown=new Select(findElement);
	
	dropDown.selectByVisibleText("New York");
	
	driver.findElement(By.name("submitButton")).click();
	
	driver.findElement(By.linkText("Edit")).click();
	
	driver.findElement(By.id("updateLeadForm_description")).clear();
	
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("QA Team");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
}
}
