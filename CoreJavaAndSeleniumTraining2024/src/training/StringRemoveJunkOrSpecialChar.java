package training;

public class StringRemoveJunkOrSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// remove special char

		String s = "Wel&&%%())*come";

		s = s.replaceAll("[^a-zA-z0-9]", "");

		System.out.println(s);

		// Remove space

		String s1 = "We l co m e";

		s1 = s1.replaceAll("\\s", "");
		System.out.println(s1);

	}

}
