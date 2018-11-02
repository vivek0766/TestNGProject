package udemy.testNG.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

	@Test
	public void driveData() {
		System.out.println("executing driveData method in ParametersExample");
	}

	@Parameters({ "DATA" })
	@Test
	public void dataParameter(String value) {
		System.out.println("executing dataParameter method in ParametersExample");
		System.out.println("The data value is " + value);
		// You archive Parameterization using @DataProvider also
	}

}
