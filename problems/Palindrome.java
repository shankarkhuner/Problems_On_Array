package problems;

import java.util.Scanner;

public class Palindrome {
	
	// To find number is Palindrome or not  

	public static void main(String[] args) {
		Scanner  sc = new  Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int original = num;// to hold original value to compair in last to reverse number
		int rev=0;
		while(num != 0)
		{
			rev = rev*10+num%10;
			num = num/10;
		}
		if(original==rev) 
		{
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}

	}

}
