package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before
	public void beforeHooks() {
		System.out.println("before every scenario");
		
	}
	@After
	public void afterHooks() {
		System.out.println("after every scenario");
		
	}
	@Before("@first")
	public void beforeFirst() {
		System.out.println("this will run before first scenario");
	}
	
}
