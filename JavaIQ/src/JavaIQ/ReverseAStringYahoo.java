package JavaIQ;

public class ReverseAStringYahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print the string in reverse or Palindrome (MOM, DAD, MADAM)
		
		String a = "madam";  //nanhsirKanaJ
		String t = "";
		for(int i=a.length()-1; i>=0 ; i--) {
			t = t + a.charAt(i);
		}		
		
		System.out.println(t);  
 
		if(a == t)
		{ System.out.println("String reversed");
		}
	}
}
