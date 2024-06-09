package JavaIQ;

public class LoopExercise1 {

	public void pyramidNo() {
		
		int k = 1;
		for(int i = 0; i<4; i++) {
			
			for(int j = 1; j<=4-i; j++) {
				
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			System.out.println("");
		}
			
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoopExercise1 obj1 =  new LoopExercise1();
		obj1.pyramidNo();
	}

}
	