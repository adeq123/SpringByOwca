package info.adro.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.adro.springtutorial.api.UserRepository;
import info.adro.springtutorial.domain.User;

public class MainSpring {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		UserRepository usersRepository = context.getBean("usersRepository", UserRepository.class);
		User janek = usersRepository.createUser("janek");
		System.out.println("Uzytkownik " + janek.getName() + " zosta³ utworzony");
	}

}

