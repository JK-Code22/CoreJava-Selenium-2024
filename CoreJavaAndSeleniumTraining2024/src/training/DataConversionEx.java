package training;

public class DataConversionEx {

	public static void main(String[] args) {
		
		//Scenario-1
		
		//String s = "Welcome"; Cannot convert to number
		
		//unboxing
		
		//String to int
		String s1 = "10";
		String s2 = "20";
		int sum = Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(sum);
		
		//String to double
		String s3 = "10.5";
		String s4 = "10.2";
		double sum1 = Double.parseDouble(s3)+Double.parseDouble(s4);
		System.out.println(sum1);
		
		//String to boolean
		String s5 = "true";
		boolean b = Boolean.parseBoolean(s5);
		System.out.println(b);
		
		//String to char - is not possible, 
		//In string we will have multiple char so we can't covert it to char type to single character
		String s6 = "J";
		
		
		//Scenario-2
		
		//Auto boxing
		//int to String
		int a = 10;
		String x = String.valueOf(a);
		System.out.println(x);
		
		//double to String
		double d = 10.5;
		String y = String.valueOf(d);
		System.out.println(y);
		
		//boolean to String
		boolean e = true;
		String z = String.valueOf(e);
		System.out.println(z);
		
		//char to String
		char w = 'j';
		String v = String.valueOf(w);
		System.out.println(v);

		
		//Scenario-3
		
		//int to double
		int f = 10;
		double g = f;
		System.out.println(g);
		
		//double to int
		double h = 10.2;
		int i = (int) h; //not possible without type casting
		System.out.println(i);
	}

}
