package test2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
	  message = "Hi World";
      assertEquals(message,messageUtil.printMessage());
   }
}