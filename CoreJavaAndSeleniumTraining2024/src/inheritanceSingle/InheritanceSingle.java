package inheritanceSingle;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}



public class InheritanceSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj = new B();
		
		obj.a=10;
		obj.b=20;
		
		obj.display();
		obj.show();

	}

}
