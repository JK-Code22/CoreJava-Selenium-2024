package training;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num = sc.nextInt();
		
		int org_num = num;
		
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		
		if(org_num==rev)
		{
			System.out.println("Its a Palindrome");
		}
		
		
		

	}

}
