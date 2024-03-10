package arrayPractice;

public class BBSOrt {

	public static void main(String[] args) {
		
		int a[]= {90,45,78,2,16,63,1,8,95};
		int min;
		int temp;

		for(int i=0 ; i<a.length; i++) 
		{
			min=i;
			for (int j= i+1; j<a.length; j++) 
			{
				
				if(a[j] < a[min]) 
				{
				min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
			
			
		}
		for(int i =0; i<a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
