package training;

public class MethodsEx {

	//No params no return value
	 void m1()
	 {
		 System.out.println("Hello");
	 }
	 
	 String m2()
	 {
		 return("Hello, How are you");
	 }
	 
	 void m3(int a, int b)
	 {
		 int c=a+b;
		 System.out.println(c);
	 }
	 
	 int m4(int d, int e)
	 {
		 int f=d+e;
		 return(f);
	 }
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsEx m = new MethodsEx();
		
		m.m1();
		
		
		String s = m.m2();
		System.out.println(s);
		//(or)
		System.out.println(m.m2());
		
		
		m.m3(10, 20);
		
		
		int g = m.m4(10, 20);
		System.out.println(g);

	}

}
