package training;

public class ArrayFindLargeAndSmallNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 100, 500, 200, 60, 30, 1000 };
		int high = a[0];
		int small = a[0];
		
		for(int i=0;i<6;i++)
		{
			if(a[i]>high)
			{
				high = a[i];
			}
			else 
			{
				small = a[i];
			}
		}
		
		System.out.println(high);
		System.out.println(small);
	}
}
