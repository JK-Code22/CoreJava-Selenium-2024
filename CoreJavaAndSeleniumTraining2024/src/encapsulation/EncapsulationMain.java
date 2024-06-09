package encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationAndGetSetEx e = new EncapsulationAndGetSetEx();
		
		e.setAccNo(98423);
		e.setName("Jana");
		e.setAmount(1000.0);
		
		System.out.println(e.getAccNo());
		System.out.println(e.getName());
		System.out.println(e.getAmount());
	}

}
