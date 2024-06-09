package training;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num");
		int num = sc.nextInt();
		int sum=0;
		while(num>0) {
			int rem = num%10;
			sum = sum+rem;
			num=num/10;
		}
		System.out.println("Sum of Digit:"+sum);
	}

}
