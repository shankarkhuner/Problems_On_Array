package Pattern;
//    1
//   12
//  123
// 1234
//12345
public class spacewithnumber {

	public static void main(String[] args) {
		
		int spc = 5;
		for(int i = 1; i<=6; i++)
		{
			for(int k =1; k<=spc;k=k+1)
			{
				System.out.print(" ");
			}
			spc = spc - 1;
			for(int j = 1; j<=i; j++) 
			{
				System.out.print(j+ "");
			} 
			System.out.println();
		}
		

	}

}
