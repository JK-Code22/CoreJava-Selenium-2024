package training;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySortElementsUsingForLoop {
	
	public static void main(String[] args) {
		int []a = {50,20,40,10,100, 30, 25, 45};
		System.out.println(Arrays.toString(a));
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + "\t");
		}
		System.out.println(Arrays.toString(a));
		
	}
	

}
