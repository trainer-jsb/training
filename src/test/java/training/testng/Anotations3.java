package training.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Anotations3 {
	
	@BeforeClass
	public void setup() {
		System.out.println("This is before class");
	}
		
	  @Test
	  public void firstTest() {
		  //Code goes here
		  System.out.println("This is the first test method");
	  }
	  
	  @Test
	  public void secondTest() {
		  //Code goes here
		  System.out.println("This is the second test method");
	  }
	  
	  @AfterClass
	  public void teardown() {
		  System.out.println("This is after class");
	  }
}