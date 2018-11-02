package udemy.testNG.days;

import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void day3moring() {
		System.out.println("I am in Day3 at 9 am");
	}

	@Test(dependsOnMethods = "day3night")
	public void day3afternoon() {
		System.out.println("I am in Day3 at 2 pm ");
	}

	@Test
	public void day3night() {
		System.out.println("I am in Day3 at 11 pm night");
	}

}
