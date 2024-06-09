package training;

import java.util.Scanner;

public class CountNoOfDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num = sc.nextInt();
		int count = 0;
		
		while(num>0)
		{
			num = num/10;//1234, 123, 12, 1
			count++;
		}
		System.out.println("Count is:" + count);
		
	}

}
