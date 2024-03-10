package arrayPractice;

public class Biggest_vaiue {

	public static void main(String[] args) {
		 int[]a = {4,2,6,11,8,9};
		 
		 int max=a[0];   // max value consider as a 0 position and remaining values compir to max for replace the big value.
		 for(int i=1; i<a.length; i++) // thats whay the value of i is starting from 1 for compairing 
		 {
			if(max < a[i]) //  
			{
				max=a[i];
			} 
		 }
		 System.out.println("Max value is " + max);

	}

}
