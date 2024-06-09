package overridngAndSuperAndFinal;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class Icici extends Bank
{
	double roi()
	{
		return 10.5; //Implementation should be different
	}
}

class Sbi extends Bank
{
	double roi()
	{
		return 11.5;
	}
}

public class OverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Icici obj = new Icici();
		System.out.println(obj.roi());
		
		Sbi sbi = new Sbi();
		System.out.println(sbi.roi());
		
	}

}
