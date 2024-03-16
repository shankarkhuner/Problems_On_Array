package problems;

import java.util.Scanner;

public class CaseSensitivePalindrome {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter String");
	        String s = sc.next();

	        if (isCaseSensitivePalindrome(s)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	    }

	    // Function to check if a string is a case-sensitive palindrome
	    private static boolean isCaseSensitivePalindrome(String s) {
	        int length = s.length();
	        for (int i = 0; i < length / 2; i++) {
	            // Compare characters from the beginning and end of the string
	            if (s.charAt(i) != s.charAt(length - 1 - i)) {
	                return false;
	            }
	        }
	        return true;
	}

}
