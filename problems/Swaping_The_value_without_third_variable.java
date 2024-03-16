package problems;

public class Swaping_The_value_without_third_variable {

	public static void main(String[] args) { // Swapping numbers without using a third variable is a 
												// three-step process that’s better visualized in

		int a = 50;
		int b = 40;

	    System.out.println("a is " + a + " and b is " + b);

		a = a + b;
		b = a - b;
		a = a - b;

	    System.out.println("After swapping, a is " + a + " and b is " + b);

	}

}
