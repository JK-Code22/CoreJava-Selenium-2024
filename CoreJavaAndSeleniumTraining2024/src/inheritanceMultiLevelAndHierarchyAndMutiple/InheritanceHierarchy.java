package inheritanceMultiLevelAndHierarchyAndMutiple;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class Child1 extends Parent //Obj for this class calls display and show method
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class Child2 extends Parent //Obj for this class calls display and print method
{
	void print(int b)
	{
		System.out.println(b);
	}
}

public class InheritanceHierarchy {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
