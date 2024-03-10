package arrayPractice;

public class Sorting_Array_simple_Way {

	public static void main(String[] args) {
		int arr[] = {4,2,6,5,1,9,8};
		int temp=0;
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=i+1; j<arr.length; j++) 
			{
				if(arr[j] < arr[i]) 
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		for(int i = 0; i<arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}
