package training;

import java.util.Arrays;

public class ArraySortElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sort int
		int a[] = { 5, 6, 7, 4, 3, 1 };

		System.out.println("Before Sorting:" + Arrays.toString(a));

		Arrays.sort(a);

		System.out.println("After Sorting:" + Arrays.toString(a));
		
		//Sort String
		String b[] = {"A","E","B","F","D","G"};

		System.out.println("Before Sorting:" + Arrays.toString(b));

		Arrays.sort(b);

		System.out.println("After Sorting:" + Arrays.toString(b));
		
		//check corejavatraining20204 for another way using loop

	}

}
