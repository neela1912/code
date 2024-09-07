package Project1;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

import dev.failsafe.internal.util.Assert;

public class emailaccess {

	@Test 
	public void testExample() throws IOException, MailosaurException { 
		
		String apiKey = "E2dszDhu418qpRlOuSIhkjFiWd4svdub";
	    String serverId = "ndnud94p";
	    String serverDomain = "ndnud94p.mailosaur.net";
		// TODO Auto-generated method stub
	    MailosaurClient mailosaur = new MailosaurClient(apiKey);

	    MessageSearchParams params = new MessageSearchParams();
	    params.withServer(serverId);

	    SearchCriteria criteria = new SearchCriteria();
	    criteria.withSentTo("anything@" + serverDomain);

	    Message message = mailosaur.messages().get(params, criteria);
	    System.out.println(message.subject());
	    System.out.println(message.cc().get(0).email());
	    System.out.println(message.from().get(0).email());
	    
	    
	    assertNotNull(message);
	    assertEquals("hello", message.subject());
	    
	    

	    
	}

	private void assertEquals(String string, String subject) {
		// TODO Auto-generated method stub
		
	}

	private void assertNotNull(Message message) {
		// TODO Auto-generated method stub
		
	}

}
