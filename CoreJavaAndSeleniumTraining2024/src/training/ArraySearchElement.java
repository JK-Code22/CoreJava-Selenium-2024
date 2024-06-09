package training;

import java.util.Scanner;

public class ArraySearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,30,40,50};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter search_num value:");
		int search_num = sc.nextInt();
		
		//Solution
		boolean status = false;
		
		for(int i=0; i<=4; i++)
		{
			if(search_num==a[i])
			{
				System.out.println("Element Found!");
				status = true;
				break;
			}
			
			/*else
			{
				System.out.println("Element not found");
			}*/  //if we use else it will print till the value gets matched
		}
		
		if(status == false)
		{
			System.out.println("element not found");
		}
		
		
		//System.out.println("Element not found"); if we use here it will always gets printed

	}

}
