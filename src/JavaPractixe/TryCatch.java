package JavaPractixe;

import java.util.HashMap;

public class TryCatch {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[6] = 10;
		}

//		catch (ArithmeticException ea) {
//			System.out.println("for Arthemetic exception");
//
//		}

//		catch (ArrayIndexOutOfBoundsException et) {
//			System.out.println("for index exception");
//
//		} catch (Exception e) {
//			System.out.println("divide by 0 error, j is 0");
//		}

		finally {
			System.out.println("delete cookies");
		}
		System.out.println("My try of code after exception");

		
		
		
		
		
	}

}
