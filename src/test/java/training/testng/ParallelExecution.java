package training.testng;

import org.testng.annotations.Test;

public class ParallelExecution {
	
	@Test
	public void test1() {
		System.out.println("ParallelExecution Thread ID is " +Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {
		System.out.println("ParallelExecution Thread ID is " +Thread.currentThread().getId());
	}
	
	@Test
	public void test3() {
		System.out.println("ParallelExecution Thread ID is " +Thread.currentThread().getId());
	}
	
	@Test
	public void test4() {
		System.out.println("ParallelExecution Thread ID is " +Thread.currentThread().getId());
	}
	
	@Test
	public void test5() {
		System.out.println("ParallelExecution Thread ID is " +Thread.currentThread().getId());
	}

}
