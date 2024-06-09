package JavaIQ;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //Many options there, check out
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
