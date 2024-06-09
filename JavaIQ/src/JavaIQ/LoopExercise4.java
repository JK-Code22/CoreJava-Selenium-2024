package JavaIQ;

public class LoopExercise4 {

public void pyramidNo3() {
		int v;
		int k = 1;
		
			for(int i = 0; i<3; i++)
			{
				for(int j = 0; j<=i; j++)
				{
				v = k*3;
				System.out.print(v);
				System.out.print("\t");	
				k++;
				
				}
				System.out.println("");
			}
				
			
			}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopExercise4 obj1 =  new LoopExercise4();
		obj1.pyramidNo3();
	}

}
