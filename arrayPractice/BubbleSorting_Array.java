package arrayPractice;

public class BubbleSorting_Array {

	public static void main(String[] args) {
		int[] a= {73,12,45,8,69,4,28,64,2};
		
		int temp;
		
		for(int i = 0; i < a.length; i++) 
		{
			int flag = 0;
			for(int j = 0; j<a.length-1-i; j++) 
			{
				if(a[j] > a[j+1]) 
				{
					temp = a[j];// swapping 
					a[j] = a[j+1];
					a[j+1] = temp;
					flag =1;
				}
			}
			if(flag==0) 
			{
				break;
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
