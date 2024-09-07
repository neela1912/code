package Project1;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLEditorKit.LinkController;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Link;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

public class adminonboarding<LinkContainer> {
	
	@SuppressWarnings("unlikely-arg-type")
	@Test 
	public void testExamples() throws IOException, MailosaurException, InterruptedException{
    	
    	String apiKey = "3hFHCyh0iXh3xUwjJl265pUvMNjn4hbb";
        String serverId = "84rojo4b";
        String serverDomain = "84rojo4b.mailosaur.net";
        String getlink="https://ccaas.worktual.co.uk/";
    
	 
    
	
    MailosaurClient mailosaur = new MailosaurClient(apiKey);

    MessageSearchParams params = new MessageSearchParams();
    params.withServer(serverId);

    SearchCriteria criteria = new SearchCriteria();
   // driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    
    criteria.withSentTo("anything@" + serverDomain);

    Message message = mailosaur.messages().get(params, criteria);
    
    //how many links present 
    System.out.println(message.html().links().size());
    Link firstLink = message.html().links().get(0);
    Link secondLink = message.html().links().get(1);
    
    if(secondLink.equals(getlink)) {
    	
    	WebDriver driver = new ChromeDriver();
    	
    	driver.navigate().to(getlink);
    	Thread.sleep(2000);
    
    	
    	
    }
    
    
    //System.out.println(firstLink.text()); // "Google Search"
    System.out.println(firstLink.href());
    System.out.println(secondLink.href());


}
}
