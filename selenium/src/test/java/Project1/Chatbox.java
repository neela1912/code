package Project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Chatbox {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
	
	WebDriver driver =new ChromeDriver();
	
    driver.get("https://carehome.worktual.co.uk/");
    WebElement username = driver.findElement(By.xpath("//input[@placeholder='Enter your user id']"));
    Thread.sleep(1000);
    username.sendKeys("ranev12645@dovinou.com");
     driver.findElement(By.xpath("//input[@placeholder='Enter your Password']")).sendKeys("Worktual@123");
     driver.findElement(By.xpath("//button[@class='loginnew_btnSignin__S+-aU ']")).click();
     Thread.sleep(1000);
	WebElement resi=driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div[5]/img"));
	Thread.sleep(2000);
	resi.click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/button")).click();
	Thread.sleep(1000);
	Actions action = new Actions(driver);
	WebElement dropdown=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div[1]/../."));
	dropdown.click();
	driver.findElement(By.xpath(".//div[text()='Dr']")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/input")).sendKeys("Karthi");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div[4]/input")).sendKeys("Raja");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div[5]/input")).sendKeys("KR");
	//Upload the image
	File file=new File("/selenium/Fileupload/resione.jpeg");
	System.out.println(file.getAbsolutePath());
	Thread.sleep(1000);
	WebElement upload=driver.findElement(By.xpath("//html/body/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div"));
	upload.sendKeys(file.getAbsolutePath());
	 
	 
   //Robot ro =new Robot();;
   //ro.keyPress(KeyEvent.VK_ENTER);
	


	
	
	}

}
