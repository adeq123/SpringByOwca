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
		SomeBean someBean = contex.getBean("someBean",SomeBean.class);
		SomeBean someBean2 = contex.getBean("someBean2",SomeBean.class);
		
		System.out.println(someBean2.getStringValue());
		System.out.println(someBean2.getUser().getName());
	}

}
