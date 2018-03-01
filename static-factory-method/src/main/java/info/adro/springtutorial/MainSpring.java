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

		
		ApplicationContext contex = new ClassPathXmlApplicationContext("configuration.xml");
		User user = contex.getBean("someUser",User.class);
		
		System.out.println(user.toString());
	}

}
