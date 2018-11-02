package udemy.testNG.days;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day2 {

	@AfterTest
	public void day2afterTest(){
	System.out.println("Executing after All tests present in the testSuite");	
	}
	
	@Test(groups="Smoke")
	public void day2moring(){
	System.out.println("I am in Day2 at 9 am");	
	}
	
	@Test
	public void day2afternoon(){
	System.out.println("I am in Day2 at 2 pm ");	
	}
	
	@Test
	public void day2night(){
	System.out.println("I am in Day2 at 11 pm night");	
	}
	
	
}
