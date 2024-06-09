package overridngAndSuperAndFinal;

class Animal
{
	String color = "White";
	
	void eat()
	{
		System.out.println("Eat...");
	}
	
	Animal()
	{
		System.out.println("This is constructor animal");
	}
	
	Animal(String name)
	{
		System.out.println(name);
	}

}

class Dog extends Animal
{
	String color = "Black";//we can override variables as well
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);  
		
		//if I want o get value from parent or super class color "white" I will use super keyword - 
		//invoke immediate class var or method or constructor
	}
	
	void eat()
	{
		super.eat(); 
		System.out.println("Eat well"); //Overriding
	}
	
	Dog()
	{
		super();
		//it will invoke parent class constructor(optional)... also by default parent class constructor will get invoked
		System.out.println("This is constructor dog");
	}
	
	Dog(String name)
	{
		super(name);// Passing arg to super class
	}
}


public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dog d = new Dog();
		Dog d = new Dog("Jimmy");
		d.display();
		
		
		d.eat();
		

	}

}
