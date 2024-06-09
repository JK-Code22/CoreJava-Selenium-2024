package inheritanceMultiLevelAndHierarchyAndMutiple;
	
	class A
	{
		int a;
		void display()
		{
			System.out.println(a);
		}
	}

	class B extends A
	{
		int b;
		void show()
		{
			System.out.println(b);
		}
	}
	
	class C extends B
	{
		int c;
		void print()
		{
			System.out.println(c);
		}
	}


	public class InhertitanceMultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 C obj = new C();		
		
		
		
		obj.print();
		
		
	}

}
