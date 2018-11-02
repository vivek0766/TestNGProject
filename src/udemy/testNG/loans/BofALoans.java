package udemy.testNG.loans;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BofALoans {

	@Test
	public void bofaCarLoan(){
		System.out.println("I am from BofA CarLoan");
	}
	
	@BeforeClass
	public void beforeBofAClass(){
		System.out.println("I am from BofA @BeforeClass - executing before the Methods in this class");
	}
	
	@Test
	public void bofaHomeLoan(){
		System.out.println("I am from BofA HomeLoan");
	}
	
	@Test
	public void bofaPersonalLoan(){
		System.out.println("I am from BofA PersonalLoan");
	}
}
