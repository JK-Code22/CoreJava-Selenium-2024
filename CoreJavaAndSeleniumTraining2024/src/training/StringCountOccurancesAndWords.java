package training;

import java.util.Scanner;

public class StringCountOccurancesAndWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java Programming Java oops";
		// Count char occurrence
		int totalCount = s.length();
		System.out.println(totalCount);

		int totalCountAfterRemove = s.replace("J", "").length();
		System.out.println(totalCountAfterRemove);
		int count = totalCount - totalCountAfterRemove;

		System.out.println(count);

		// Count words
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		System.out.println(s1);

		int count1 = 1;
		for (int i = 0; i < s1.length() - 1; i++) {
			if ((s1.charAt(i) == ' ') && (s1.charAt(i + 1) != ' ')) {
				count1++;
			}
		}
		System.out.println(count1);
	}

}
