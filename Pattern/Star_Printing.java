package Pattern;

public class Star_Printing {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) // for rows
		{
			for (int j = 1; j <= 3; j++)// for column 
				/*
				* * * 
				* * * 
				* * * 
				* * * 
				* * * 
				* * * 
				* * *
				
				*/
			{
				System.out.print("* ");
			}
			System.out.println();// For next Line
		}

	}

}
