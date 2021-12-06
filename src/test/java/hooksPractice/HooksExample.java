package hooksPractice;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksExample {
	
	@Before
	public void beforescenario() {
		System.out.println("before each scenario -hooks - order 2");
	}
	@After
	public void afterscenario() {
		System.out.println("after each scenario - hooks order 0");
	}
	@Before
	public void beforescenario1() {
		System.out.println("before each scenario 2 order 1");
	}
	@After 
	public void afterscenario1() {
		System.out.println("after each scenario 2 order 1");
	}
	@After("@engineer")
	public void afterEngineeringCollege() {
		System.out.println("after engineering college");
	}
	@Before("@engineer")
	public void beforeEngineeringCollege() {
		System.out.println("before engineering college");
	}

}
