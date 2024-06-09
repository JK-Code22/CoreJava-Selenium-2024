package training;

public class CallByVal {
	
	int num;

	void m1(int num)
	{
		num = num+10;
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByVal c = new CallByVal();
		int num = 100;
		c.m1(num);
		System.out.println(num);

	}

}
