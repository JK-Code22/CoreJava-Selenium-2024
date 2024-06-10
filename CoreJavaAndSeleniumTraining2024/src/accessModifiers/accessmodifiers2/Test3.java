package accessModifiers.accessmodifiers2; 



import accessModifiers.Test1; //package and class imported
import training.ArrayAssignment;

public class Test3 extends Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t = new Test3();
		t.m1(); // can't access default method outside package
		t.m2(); //protected method accessed by inheritance
		t.m3(); //public so we accessed directly
		
		
	}

}
