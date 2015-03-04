import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class scratchpad {

	public static void main(String[] args){
	
		List<Integer> original = Arrays.asList(1,2,3,4,5,6,7,8);
		Integer[] filter = {2,3};
		

		
		Set<Object> result = original.stream()
                .filter(number -> Arrays.asList(filter).contains(number))
                .collect(Collectors.toSet());

		System.out.println(result);
		
		
		/*
		ContactManagerImpl cm = new ContactManagerImpl();
		
		cm.addNewContact("Bob", "Notes");
		
		System.out.println(cm.contactlist);
	*/
		
	//Calendar old = new GregorianCalendar();
	//	old.add(Calendar.MONTH, -1);	
	//Calendar now = new GregorianCalendar();
	//System.out.println(old.compareTo(now));
		
		
	//Object test = new Integer(1);
	//Contact contact = (Contact)test; 
		
		
		
	//	Class classParam = MeetingImpl.class;
		
	//	Set<Integer> integerset = new Set<Integer>(1,2,3,4);
		/*
		Calendar calendar = new GregorianCalendar();

		System.out.println(displayCalendar(calendar));
		
		calendar.add(Calendar.MONTH, -1);
		
		System.out.println(displayCalendar(calendar));
		
	*/
	
	}
	
	public static String displayCalendar(Calendar calendar){
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH)+1;
		
		return day + "/"+month+"/"+year;
				
	}
	
	private static Object[] collateTestData(Object... data){
		return data;
	}
	
}


