package JavaIQ;

public class ArraySwapInterviewEx {

	//swap integers
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		
		int temp;
		
		temp=a;
		a=b;
		b = temp;
		System.out.println("a equals" + "\t" + a);
		System.out.println("b equals" + "\t" + b);
		
		//without temp
		 
		int c=10;
		int d=5;
		
		c=c+d; //15
		d=c-d; //10
		c=c-d; //5
		
		System.out.println(c);
		System.out.println(d);
	}

}
