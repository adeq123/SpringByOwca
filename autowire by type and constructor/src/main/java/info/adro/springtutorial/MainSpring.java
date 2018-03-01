package info.adro.springtutorial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
Application app = context.getBean("aplikacja", Application.class);



System.out.println(app.getUsersRepository().exists("Janek"));
System.out.println(app.getDictionaryRepository().getMapValue());


	}

}