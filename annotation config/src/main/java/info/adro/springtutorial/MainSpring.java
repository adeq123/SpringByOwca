package info.adro.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.adro.springtutorial.api.UserRepository;
import info.adro.springtutorial.domain.User;
import info.adro.springtutorial.implementations.UserRepositoryImpl;

public class MainSpring {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		UserRepositoryImpl somebean = context.getBean("userRepository",UserRepositoryImpl.class);
		System.out.println(somebean);
	}

}
