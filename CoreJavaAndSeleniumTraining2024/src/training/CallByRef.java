package training;

public class CallByRef {

	int num;
	
	void m1(CallByRef t)
	{
		t.num=t.num+10;
		System.out.println(t.num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByRef c = new CallByRef();
		c.num=100;
		System.out.println(c.num);
		c.m1(c);
		System.out.println(c.num);
		
	}

}
