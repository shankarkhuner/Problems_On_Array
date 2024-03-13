package Pattern;

public class Inverted_Half_Peramid_With_Number {

	public static void main(String[] args) {
		int n = 5;
		for(int i=1; i<=n; i++) 
		{
			for(int j=1; j<=n-i+1; j++) // +1 for adding 5-1 = 4 but we have to print n value so +1 is add the -1 value
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
