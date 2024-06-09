package JavaIQ;

public class ClassOrInstanceVarAndLocalVarAndThisKeyword {

		int a = 20;// Global var
		
		public void add() {
			int a=10; //local var
			
			int b = this.a+a;
			System.out.println(b);
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ClassOrInstanceVarAndLocalVarAndThisKeyword obj = new ClassOrInstanceVarAndLocalVarAndThisKeyword();
			obj.add();

		}

	}
