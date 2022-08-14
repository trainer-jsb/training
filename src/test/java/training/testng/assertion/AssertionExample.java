package training.testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	@Test
	public void testOne() {
		boolean isLoggedIn = true;
		String logInText = "Log Off";
		
		Assert.assertTrue(isLoggedIn, "User login failed");
		Assert.assertEquals("Sign Off", logInText);
	}

}
