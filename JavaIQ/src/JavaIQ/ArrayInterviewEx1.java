package JavaIQ;

public class ArrayInterviewEx1 {
	
	//print maximum number

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = {{1,2,3},{5,9,6},{7,0,8}};
		int max = abc[0][0];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(abc[i][j]>max) 
				{
					max = abc[i][j];
					
			}
		}

	}
		System.out.println(max);
	}

}
