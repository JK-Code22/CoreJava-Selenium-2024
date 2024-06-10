package accessModifiers;

public class Test1 {
	
	private int a=100;
	
	void m1() //default access modifier
	{
		System.out.println("This is m1");
	}
	
	protected void m2() 
	{
		System.out.println("This is m2");
	}

	
	public void m3() 
	{
		System.out.println("This is m3");
	}

}
