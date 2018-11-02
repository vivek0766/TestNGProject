package udemy.testNG.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	@Test
	public void assertion(){
		//to test Listeners on test Failure we are using onTestFailure
		Assert.assertTrue(false);
	}
}
