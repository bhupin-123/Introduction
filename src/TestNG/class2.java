package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class2 {
	@BeforeMethod
	public void Processing() {
		
		System.out.println("Personal Loan Processing");
	}
	@BeforeClass
	public void ProcessingCheck() {
		
		System.out.println("Personal Loan Processing successful");
	}

	
	@Test
	public void ProcessingChecklate() {
		
		System.out.println("Personal Loan late Processing successful");
	}
}
