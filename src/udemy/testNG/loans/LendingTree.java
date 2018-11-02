package udemy.testNG.loans;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LendingTree {

	@Test
	public void lendingTreeCarLoan(){
		System.out.println("I am from LendingTree CarLoan");
	}
	
	@AfterClass
	public void beforeLendingTreeClass(){
		System.out.println("I am from LendingTree @AfterClass - executing after the Methods in this class");
	}
	
	@Test
	public void lendingTreeHomeLoan(){
		System.out.println("I am from LendingTree HomeLoan");
	}
	
	@Test
	public void lendingTreePersonalLoan(){
		System.out.println("I am from LendingTree PersonalLoan");
	}
}
