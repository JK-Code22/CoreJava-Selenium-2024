package training;

public class WrapperClassEx {

	public static void main(String[] args) {
		// Convert primitive to Object type - called Auto boxing
		
		//Primitive
		int i =10;
		double d = 10.1;
		char c = 'a';
		boolean b = true;
		
		//Object type
		Integer iobj = i;
		Double dobj = d;
		Character cobj = c;
		Boolean bobj = b;
		
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		// Convert Object to primitive type - called Unboxing
		
		int intVal = iobj;
		double doubleVal = dobj;
		char charval = cobj;
		boolean booleanVal = bobj;
		
		System.out.println(intVal);
		System.out.println(doubleVal);
		System.out.println(charval);
		System.out.println(booleanVal);
		
		//diff between primitive type and wrapper class
		
		int x=20; // here its just normal variable creation 
		
		Integer y=30; 
		String s= y.toString(); //as Integer being wrapper class there will be methods that we can use
		System.out.println(s.equals("30"));
		//check dataConversion for more details

	}

}
