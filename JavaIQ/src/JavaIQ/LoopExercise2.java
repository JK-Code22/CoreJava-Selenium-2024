package JavaIQ;


public class LoopExercise2 {

	
public void pyramidNo1() {
		
		int k = 1;
		for(int i = 0; i<4; i++) {//- 2 ways
			//for(int i = 1; i<5; i++){
			
			for(int j = 1; j<=1+i; j++) {//- 2 ways
				//for(int j = 1; j<=i; j++){
				
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			System.out.println( "");
		}
			
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopExercise2 obj1 =  new LoopExercise2();
		obj1.pyramidNo1();
	}

}
