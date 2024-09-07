package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automate {
	
	public static void main(String[]args) {
		
		WebDriver driver =new ChromeDriver();
		
	    driver.get("https://testautomationpractice.blogspot.com/");
	    WebElement resize=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[8]/div[1]/div/div[3]"));
	    Actions action=new Actions(driver); 
	    action.dragAndDropBy(resize, 300, 500).perform();
	    try {
	    	Thread.sleep(3000);
	    	
	    }
	    catch(InterruptedException e) {
	    	
	    	e.printStackTrace();
	 
	    action.dragAndDropBy(resize, 500, 450).perform();
	    try {
	    	Thread.sleep(3000);
	    	
	    }
	    catch(InterruptedException b) {
	    	
	    	b.printStackTrace();
	    }
	}

}
}
