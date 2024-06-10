package training;

public class ArrayAssignment {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assignment 1
		int []a= {1,2,3,4,5};
		int sum=0;
		for(int x:a)
		{
			sum=sum+x;
		}
		
		System.out.println(sum);

	
	//Assignment 2
	
	int b[] = {1,2,3,4,5,6,7};
	int even_count=0;
	int odd_count=0;
	for(int x:b)
	{
		if(x%2==0)
		{
			even_count++;
		}
		else
		{
			odd_count++;
		}
	}
	
	System.out.println("Even: " + even_count);
	System.out.println("Odd: " + odd_count);
	
}
}
