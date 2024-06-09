package overridngAndSuperAndFinal;

class Test
{
	final int x=100;
}

final class Test1
{
	final void m1()
	{
		System.out.println("This is test1-m1");
	}
}

/*class Test2 extends Test1  if class is final we can't extend the class
{
	/*void m1()  // if the final method is final we can't override 
	{
		System.out.println("This is test2-m1");
	}  
}
*/

public class FinalEx {
	
	public static void main(String [] a)
	{
		Test t = new Test();
		System.out.println(t.x); //100
		//System.out.println(t.x=200); if we use final we can't change the value of x
	}

}
