package Project1;

import java.awt.AWTException;
 
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Link;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

public class purchase {

	//private static Object String;

	@Test 
	public void testExample() throws IOException, MailosaurException, InterruptedException{
//		String apiKey = "3hFHCyh0iXh3xUwjJl265pUvMNjn4hbb";
//	    String serverId = "nea74dgj";
//	    String serverDomain = "nea74dgj.mailosaur.net";
//	    String getlink="https://ccaas.worktual.co.uk/";
//	    

	
		WebDriver driver = new ChromeDriver();

		driver.get("https://worktual.co.uk/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Pricing'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='buttonaction onlyfullborder'])[4]")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("green");
        driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("tech");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("anything@84rojo4b.mailosaur.net");
        driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("9080935734");
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("wttestgreentech");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/form/div[3]/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/form/div[5]/div/button")).submit();
        driver.navigate().to("https://worktual.co.uk/chatbox/purchaseflow/completeregistration/\n");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/form/div[2]/div/div[2]/div/button")).click();
        
        
		   
		    //System.out.println(secondLink.href());
//		    System.out.println(firstLink.href());
//		    System.out.println(firstLink.href());
//		    System.out.println(firstLink.href());
//		    System.out.println(firstLink.href());
//		    System.out.println(firstLink.href());
//		    System.out.println(firstLink.href());
//		    System.out.println(firstLink.href());
//		    System.out.println(firstLink.href());
//		    System.out.println(firstLink.href());
		    
		    //assertNotNull(message);
		    //assertEquals("worktual", message.subject());
		    
		    

		    
		}

//		private void assertEquals(String string, String subject) {
//			// TODO Auto-generated method stub
//			
//		}

//		private void assertNotNull(Message message) {
//			// TODO Auto-generated method stub
//			
//		}

		   

		
			
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://temp-mail.org/en/");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//button[@data-clipboard-target='#mail'])[2]")).click();
//        Set<String> win1 = driver.getWindowHandles();
//		List<String> ids = new ArrayList<String>(win1);
//		driver.switchTo().window(ids.get(0));
//		System.out.println("one"); 
//	     driver.findElement(By.xpath("//input[@name='email']")).click();
//	    
//	    StringSelection ssss = new StringSelection("hello");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssss, ssss);
//		Robot probot = new Robot();
//		probot.delay(2000);
//		probot.keyPress(KeyEvent.VK_CONTROL);;
//		//Thread.sleep(2000);
//		probot.keyPress(KeyEvent.VK_V);
//		probot.delay(2000);
//		probot.keyRelease(KeyEvent.VK_V);
//		//Thread.sleep(2000);
//		probot.keyRelease(KeyEvent.VK_CONTROL);
//		
//		System.out.println("one"); 
		
//	    Thread.sleep(2000);
//		probot.keyPress(KeyEvent.VK_ENTER);
//		probot.keyRelease(KeyEvent.VK_ENTER);

	

	
}