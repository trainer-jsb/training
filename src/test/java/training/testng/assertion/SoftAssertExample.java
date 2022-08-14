package training.testng.assertion;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	
	private SoftAssert sf;
	
	@BeforeMethod
	public void setup() {
		sf = new SoftAssert();
	}
	
	@Test
	public void softAssertTest() {
		String fname = "Ayush", lname = "Thakkar", address = "123 street";
		int phone = 123456;
		
		sf.assertEquals("Abhishek", fname);		
		sf.assertEquals("Thakkar", lname);
		sf.assertEquals("123 street", address);
		sf.assertEquals(987654, phone);
		sf.assertAll();
	}
	
	@Test
	public void softAssertTest2() {
		sf.assertTrue(true);
		sf.assertAll();
	}
}
