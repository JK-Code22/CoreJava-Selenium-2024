package training;

import java.util.Scanner;

public class ReverseANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num = sc.nextInt();
		int rev=0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10; // will give last num always which is reminder 
			num=num/10; //will give quotient
		}

		System.out.println("Reverse Num:" + rev);
		
		//using String buffer
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev1 = sb.reverse();
		System.out.println("Reverse using String buffer:"+ rev1 );
		
		//Using String Builder
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev2 = sbl.reverse();
		System.out.println(rev2);

	}

}
