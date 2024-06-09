package training;

public class PolymorphismEx {
	int a=10; int b=20;
	void sum()
	{
		System.out.println(a+b);
	}

	
	void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	
	void sum(double x, int y)
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y)
	{
		System.out.println(x+y);
	}
	
	void sum(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PolymorphismEx p =new PolymorphismEx();
		p.sum();
		p.sum(30, 40);
		p.sum(10.0, 10);
		p.sum(20, 20.1);
		p.sum(10, 20, 30);
		
	}

}
