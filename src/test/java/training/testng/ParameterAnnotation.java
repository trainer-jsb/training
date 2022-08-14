package training.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {
	
	@Parameters({"environment"})
	@Test
	public void testOne(@Optional("ism") String environment) {
		System.out.println("Parameter annotation for environment is " +environment);
	}

}
