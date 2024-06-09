package overridngAndSuperAndFinal;

class Abc
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
	
}

class Xyz extends Abc
{
	void m1(int a)
	{
		System.out.println(a*a);  //Overriding
	}
	
	void m2(int b)
	{
		System.out.println(b*b); //Overriding
	}
	
	void m2(int a, int b) //Overloading
	{
		System.out.println(a+b);
	}
}

public class OverloadingAndOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xyz obj = new Xyz();
		obj.m1(10);
		obj.m2(15);
		
		obj.m2(10, 15);

	}

}
