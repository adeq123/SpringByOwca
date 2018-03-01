package info.adro.springtutorial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
//		Locale locale = Locale.getDefault();
//		Calendar calendar = GregorianCalendar.getInstance(locale);
//		
//		DateFormat formatter = SimpleDateFormat.getInstance();
//		System.out.print(calendar.getTime());
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("configuration.xml");
		Calendar calendar = contex.getBean("calendar",Calendar.class);
		DateFormat formatter = (DateFormat) contex.getBean("formater");
		
		System.out.println(formatter.format(calendar.getTime()));
	}

}
