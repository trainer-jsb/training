package training.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Annotations {
	
@BeforeClass
public void setup() {
	System.out.println("This is before class");
}
	
  @Test(priority = 1)
  public void testOne() {
	  //Code goes here
	  System.out.println("This is the first test method");
  }
  
  @Test(priority = 2)
  public void testTwo() {
	  System.out.println("This is the second test");
  }
  
  @Test(priority = 3)
  public void testThree() {
	  System.out.println("This is the third test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is the before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is the after method");
  }
  
  @AfterClass
  public void teardown() {
	  System.out.println("This is after class");
  }
}