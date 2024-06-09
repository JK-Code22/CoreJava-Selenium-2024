package JavaIQ;

public class ArrayInterviewEx {
	
	//print minimum number from the matrix
	//1 2 3
	//5 9 6
	//7 0 8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][] = {{1,2,3},{5,9,6},{7,0,8}};
		int min = abc[0][0];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(abc[i][j]<min) 
				{
					min = abc[i][j];
					
			}
		}

	}
		System.out.println(min);

}
}
