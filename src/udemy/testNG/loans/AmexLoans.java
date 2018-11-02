package udemy.testNG.loans;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AmexLoans {

	@Test
	public void amexCarLoan(){
		System.out.println("I am from Amex CarLoan");
	}
	
	@AfterMethod
	public void afterAmexLoans(){
		System.out.println("I am from Amex and executing after each Method");
	}
	
	@Test
	public void amexHomeLoan(){
		System.out.println("I am from Amex HomeLoan");
	}
	
	@Test(groups="Smoke")
	public void amexPersonalLoan(){
		System.out.println("I am from Amex PersonalLoan");
	}
}
