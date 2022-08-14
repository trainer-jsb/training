package training.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrioritization {
	
	@Test (priority = 1, groups = {"Regression"})
	public void createPatient() {
		System.out.println("This test will create a patient");
		Assert.assertTrue(true);
	}
	
	@Test (priority = 2, dependsOnMethods = "createPatient", groups = "Regression")
	public void updatePatient() {
		System.out.println("This test will update a patient");
	}
	
	@Test (priority = 3, dependsOnMethods = "createPatient", groups = {"Regression", "Smoke"})
	public void deletePatient() {
		System.out.println("This test will delete a patient");
	}
}