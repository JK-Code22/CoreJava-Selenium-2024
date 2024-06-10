package dataAbstraction;

interface Shape {
	int lenght = 10; // final and static by default
	int width = 20;

	void circle(); //abstract method - it's will have public access modifier  by default if nothing specified

	default void square() //default method
	{
		System.out.println("This is default method - square");
	}
	
	static void rectangle() //static method
	{
		System.out.println("This is static method - rectangle");
	}
}
public class InterfaceEx implements Shape {
	
	@Override
	public void circle() //when we implement interface method we need specify access modifier public
	{
		System.out.println("This is circle");
		
	}

	 void triangle() //its default access modifier here, as we didn't specify anything for class method its default
	{
		System.out.println("This is triangle");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj = new InterfaceEx(); //here, created object for class by interface ref
		
		obj.circle();
		obj.square();
		Shape.rectangle();
		
		//obj.triangle(); -  we can't access because it belongs to class
		
		System.out.println(Shape.lenght+Shape.width);
		System.out.println(obj.lenght+obj.width);
		
		InterfaceEx n = new InterfaceEx();
		n.triangle(); //here we can call triangle as we created obj for class itself
		
		
		

	}

}
