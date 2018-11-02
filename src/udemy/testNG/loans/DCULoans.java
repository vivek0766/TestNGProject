package udemy.testNG.loans;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DCULoans {

	@Test
	public void dcuCarLoan(){
		System.out.println("I am from DCU CarLoan method");
	}
	
	@Test
	public void dcuHomeLoan(){
		System.out.println("I am from DCU HomeLoan method");
	}
	
	@BeforeMethod
	public void beforeDCULoans(){
		System.out.println("I am from DCU and executing before each test");
	}
	
	@Test
	public void dcuPersonalLoan(){
		System.out.println("I am from DCU PersonalLoan method");
	}
}
