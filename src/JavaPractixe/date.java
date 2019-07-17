package JavaPractixe;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss:SSS");
		System.out.println(sdf.format(d));
		
		
		Calendar cal=Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));
		cal.get(Calendar.DAY_OF_MONTH);
		cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		cal.get(Calendar.AM_PM);
	}

}
