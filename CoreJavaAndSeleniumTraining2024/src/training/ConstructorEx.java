package training;

public class ConstructorEx {
	int a;
	int b;
	
	ConstructorEx() //default
	{
		 a=10;
		 b=20;
		 //or
		 a=b=20; //if we are assigning same value for var
	}
	
	ConstructorEx(int x, int y) //parameterized
	{
		 a=x;
		 b=y;
	}
	
	ConstructorEx(int x)
	{
		a=b=x;
	}
	
	

	void sum()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ConstructorEx c = new ConstructorEx();
		ConstructorEx c = new ConstructorEx(100, 200);
		c.sum();

	}

}
