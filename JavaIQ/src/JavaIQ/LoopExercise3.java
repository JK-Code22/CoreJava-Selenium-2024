package JavaIQ;

public class LoopExercise3 {
	
public void pyramidNo2() {
		
		
		
			for(int i = 1; i<5; i++){
			
			
				for(int j = 1; j<=i; j++){
				System.out.print(j);
				System.out.print("\t");
				
			}
			System.out.println( "");
		}
			
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopExercise3 obj1 =  new LoopExercise3();
		obj1.pyramidNo2();
	}

}