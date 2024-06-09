package training;

public class MainMethod {

	// overload Main method
	public static void main(int a) // this main method can be invoked by creating object
	{
		System.out.println(a = a + 10);
	}

	public static void main(String[] a)
	// this method can be called by passing argument manually in run config
	{

		for (String s : a) {
			System.out.println(s);
		}

		System.out.println(a.length);

		MainMethod n = new MainMethod();
		n.main(10);

	}

}
