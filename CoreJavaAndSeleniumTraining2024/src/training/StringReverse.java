package training;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method 1
		String s = "Welcome";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);

		// Method 2
		String s1 = "Welcome";
		String rev1 = "";

		char a[] = s1.toCharArray();
		System.out.println(Arrays.toString(a));
		for (int i = a.length - 1; i >= 0; i--) {
			rev1 = rev1 + a[i];
		}
		System.out.println(rev1);

		// Method 3
		StringBuffer sb = new StringBuffer("Welcome");
		System.out.println(sb.reverse());

		// Method 4
		StringBuilder sb1 = new StringBuilder("Welcome");
		StringBuilder b = sb1.reverse();
		System.out.println(b);

	}

}
