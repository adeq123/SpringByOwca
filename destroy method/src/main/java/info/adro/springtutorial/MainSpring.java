package info.adro.springtutorial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Component1 component1 = context.getBean("component1", Component1.class);
		Component2 component2 = context.getBean("component2", Component2.class);
		
		System.out.println(component1.getUsersRepository().getInstanceNumber());
		System.out.println(component2.getUsersRepository().getInstanceNumber());
		
	}

}
