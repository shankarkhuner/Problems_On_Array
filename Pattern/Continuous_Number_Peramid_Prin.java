package Pattern;

public class Continuous_Number_Peramid_Prin {

	public static void main(String[] args) {
		
		/*
		 * 1 2 3 4 
		   5 6 7 
           8 9 
           10 

		 * 
		 * 
		 * */
		
		
		int n = 5;
		int number=1;
		for(int i=1; i<=n; i++)
		{
			for(int j= 1; j<n-i+1;j++) 
			{
				System.out.print(number+" ");
				number = number +1;
			}
			System.out.println();
		}
	}

}
