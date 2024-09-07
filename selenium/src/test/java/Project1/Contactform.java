package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactform {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://worktual.co.uk/");
		driver.findElement(By.xpath("//a[text()='Contact Sales']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ajay");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("krishana");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("neelamegam.s@worktual.com");
		driver.findElement(By.xpath("//input[@id='companyName']")).sendKeys("AK private limited");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("44444989900090");
		driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("this mail is testing purpose");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(2000);
		//contact support
		
		driver.findElement(By.xpath("//a[text()='Contact Support']")).click();
		driver.findElement(By.xpath("//a[text()='Contact Sales']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vijay");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("krishana");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("neelamegam.s@worktual.com");
		driver.findElement(By.xpath("//input[@id='companyName']")).sendKeys("VK private limited");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("444449899000900");
		driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("this mail is testing purpose");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		
		

	}

}
