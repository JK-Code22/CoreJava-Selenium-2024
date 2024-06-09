package training;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String a = "Welcome";
		String b = new String("Hii");
		String c = "Bye";
		
		//Length
		int l = a.length();
		System.out.println(l);
		System.out.println(a.length());
		
		
		//Concat
		System.out.println(a+b);
		System.out.println(a.concat(b));
		System.out.println(a.concat(b).concat(c));
		 
		//Trim - remove space before and after the string
		c= "  Hello  ";
		System.out.println("Before trim:" + c.length());//9
		String d = c.trim();
		System.out.println("After Trim:" + d.length());//5
		
		//charAt
		System.out.println(a.charAt(1));
		
		//contains
		System.out.println(a.contains("come")); //true
		System.out.println(a.contains("Come")); //false - Case Sensitive	
		System.out.println(a.contains("Welme")); // false
		
		//equals, equalIgnoreCase
		String S1 = "World";
		String S2 = "World";
		String S3 = "world";
		
		System.out.println(S1.equals(S2));//true
		System.out.println(S1.equals(S3));//false
		System.out.println(S1.equalsIgnoreCase(S3));//true
		
		//Replace
		String r = "Welcome to Selenium Java Course";
		
		System.out.println(r.replace("Course","Training"));
		System.out.println(r.replace('e','x'));
		
		//substring
		System.out.println(a.substring(0,3));
		
		//toUpperCase, toLowercase
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		//Split
		//Ex1
		a = "abc@gmail.com";
		String[] data = a.split("@");
		System.out.println(data[0]);
		System.out.println(data[1]);
		
		//Ex2
		a="abc@xyz";
		String data1[] = a.split("@");
		System.out.println(data1[0]);	 
		System.out.println(data1[1]);
		
		//Ex3
		String amount = "$15,20,25";
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		//Ex4
		//Method1
		b="abc,123@xyz";
		String[] b1 = b.split(",");
		System.out.println(b1[0]);
		System.out.println(b1[1]);
		
		String[] b2 = b1[1].split("@");
		System.out.println(b2[0]);
		System.out.println(b2[1]);
		
		//Method2
		System.out.println(b.split(",")[0]);
		System.out.println(b.split(",")[1].split("@")[0]);
		System.out.println(b.split(",")[1].split("@")[1]);
		
	}

}
