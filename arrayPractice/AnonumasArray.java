package arrayPractice;

public class AnonumasArray {

	public static void main(String[] args) {
		AnonumasArray.sum(new int[]{80,20,30});

	}
	static void sum(int[] no) 
	{
		int total=0;
		for(int s:no)
		{
			total = total+s;
		}
		System.out.println(total);
	}

}
