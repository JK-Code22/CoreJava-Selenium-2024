package training;

public class ThisEx {
	
	int a, b; //Class/instance variable
	
	void setData(int a, int b) //Local variable
	{
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisEx t = new ThisEx();
		t.setData(100, 30);
		t.display();

	}

}
