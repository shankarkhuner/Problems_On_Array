package problems;

public class Check_vowelsPresent {

	public static void main(String[] args) { // to check for vowels is present or not
		
			
				System.out.println(stringContainsVowels("H")); // true // vowels is present 
				System.out.println(stringContainsVowels("tv")); // false  // vowels is not present 
			}

			public static boolean stringContainsVowels(String input) {
				return input.toLowerCase().matches(".*[aeiou].*"); 
			}

		}
	


