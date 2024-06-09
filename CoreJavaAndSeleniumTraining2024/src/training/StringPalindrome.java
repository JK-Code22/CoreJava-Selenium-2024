package training;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="MADM";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		if(s.equals(rev))
			System.out.println("Its Palindrome");
		else
			System.out.println("Not Palindrome");
			

	}

}
