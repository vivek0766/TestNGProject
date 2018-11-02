package udemy.testNG.days;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test
	public void day1moring(){
	System.out.println("I am in Day1 at 9 am");	
	}
	
	@Test(groups="Smoke")
	public void day1afternoon(){
	System.out.println("I am in Day1 at 2 pm ");	
	}
	
	@BeforeSuite
	public void day1Monday(){
	System.out.println("I am in Day1 from @beforeSuite");	
	}
	
	@Test
	public void day1night(){
	System.out.println("I am in Day1 at 11 pm night");	
	}
	
	@BeforeTest
	public void day1beforeTest(){
	System.out.println("Executing @beforeTest all tests present in the testSuite and I am from Day1");	
	}
}
