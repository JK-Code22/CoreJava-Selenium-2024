package staticEx;

public class StaticEx {

	static int a= 10;
	int b=20;
	
	static void m1()
	{
		System.out.println("Static method");

	}
	
	 void m2()
	{
		System.out.println("Non-Static method");
		
	}
	 
	 void m3() 
	 //Non static method can access all the static and non-static variables and methods
		{
			System.out.println(a);
			System.out.println(b);
			m1();
			m2();
		}
	 
	 public static void main(String [] a)
	 {
		 System.out.println(a);
		 m1();
		 StaticEx s = new StaticEx();
		 s.m3();
		System.out.println(s.a); //static var alao can be called by obj ref
	 }

}
