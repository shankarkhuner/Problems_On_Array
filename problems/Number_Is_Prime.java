package problems;

public class Number_Is_Prime {

	public static void main(String[] args) {// to check given number is prime or not
		
		int n=11;
		/*
	int no = 41;
	int temp =0;
	 for(int i =2; i<no-1; i++) 
	 {
		 if(no%i==0)
		 {
			 temp=temp+1; 
		 }
	 }
	 if(temp==0) 
	 {
		 System.out.println("number is prime");
	 }
	 else 
	 {
		 System.out.println("number is not prime");
	 }
		*/
		
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("number is prime");
			}
		}
	}

}
