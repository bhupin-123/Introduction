package TestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class3 {
	
	@BeforeSuite
	public void Login() {
		System.out.println("CarLoanLogin");
	}
	
	@BeforeTest
	public void LoginClearning() {
		System.out.println("CarLoanCleaning");
	}
	
	

}
