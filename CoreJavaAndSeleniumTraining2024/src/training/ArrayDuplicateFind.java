package training;

public class ArrayDuplicateFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,10,30,10,40,50,10};
		
		int count = 0;
		
		for(int x:a)
		{
			if(x==10)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
