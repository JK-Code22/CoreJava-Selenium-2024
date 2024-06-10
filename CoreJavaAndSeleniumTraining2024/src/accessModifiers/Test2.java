package accessModifiers;

import training.ArrayAssignment;

public class Test2 {

public static void main(String [] args)
{
	Test1 t = new Test1();
	
	//System.out.println(t.a); can't access private variable in other class or outside class
	
	t.m1(); //we can access default method or var within same package
	
	
}
	
}
