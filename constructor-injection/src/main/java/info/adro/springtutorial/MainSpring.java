package info.adro.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.adro.springtutorial.api.UserRepository;
import info.adro.springtutorial.domain.User;
import info.adro.springtutorial.implementations.SomeBean;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		UserRepository usersRepository = context.getBean("repozytoriumUzytkownikow", UserRepository.class);

		User janek = usersRepository.createUser("janek");
		
		SomeBean bean = context.getBean("someBean", SomeBean.class);
	}

}
