package arrayPractice;

public class Smallest_Value_In_Array {

	public static void main(String[] args) {
		
		int []a = {54,69,78,3,45,76,24,5}; 
		
		int Mini_value = a[0]; // a[0] is consider as a base and other remaining values are compair to the a[0]
		
		for(int i = 1; i<a.length; i++) 
		{
			if(Mini_value > a[i]) 
			{
				  Mini_value = a[i]; // To replace the value
			}
		}
		System.out.println("Minimum Value is " + Mini_value);

	}

}
