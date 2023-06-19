package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AcmeTest {
	
	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		String expectedResult ="ACME System 1 -  Dashboard";
		
		String actualResult= driver.getTitle();
		
		if(expectedResult .equals(actualResult));
		System.out.println("Print=" +expectedResult);
		
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		
		driver.close();
		
	}

}
