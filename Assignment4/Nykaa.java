package Assignment4;

import org.openqa.selenium.edge.EdgeDriver;

public class Nykaa {

public static void main(String[] args) {
	
	EdgeDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.nykaa.com/\r\n");
	
}

}
