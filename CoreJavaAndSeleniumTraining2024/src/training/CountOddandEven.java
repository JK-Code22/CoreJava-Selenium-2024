package training;

import java.util.Scanner;

public class CountOddandEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num = sc.nextInt();
	
		int oddCount = 0;
		int evenCount = 0;
		
		while(num>0)
		{	
			int rem=num%10;
			
			if(rem%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			
			num=num/10;
		}
			
		System.out.println("Even:" + evenCount);
		System.out.println("Odd:" + oddCount);
	}

}
