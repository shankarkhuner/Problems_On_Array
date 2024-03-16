package problems;

public class Remove_White_spqce {

	public static void main(String[] args) {
		// For remove white spaces in string 
		String str = "Java    Programming    With    shankar";
		
		System.out.println("Before removing white space   :----"+ str);
		String s=str.replaceAll("\\s", "");
		System.out.println("Before removing white space   :----"+ s);
		
	}

}
