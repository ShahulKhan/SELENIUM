package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Matrimony {
	
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tamilmatrimony.in/");
		
		driver.findElement(By.id("NAME")).sendKeys("Shahul");
		
		driver.findElement(By.id("gendermale")).click();
		
		driver.findElement(By.id("MOBILENO")).sendKeys("9842259785");
		
		driver.findElement(By.id("EMAIL")).sendKeys("theshahulkhan7@gmail.com");
		
		driver.findElement(By.name("PASSWD1")).sendKeys("1234567ytrewq");
	}

}
