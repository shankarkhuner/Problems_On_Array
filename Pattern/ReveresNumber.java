package Pattern;

public class ReveresNumber {

	// 5
	// 54
	// 543 
	// 5432
	// 54321
	public static void main(String[] args) {
		int spc = 4; 
		for(int i =1; i<=5; i--) 
		{
			for(int k =1;k<spc; k++) 
			{
				//System.out.print(i); 
				System.out.print(" ");
			}
			spc= spc-1;
			
			for(int j=1; j<=i; j--) 
			{
				System.out.print(j+"");
			}
			System.out.println();
		}

	}

}
