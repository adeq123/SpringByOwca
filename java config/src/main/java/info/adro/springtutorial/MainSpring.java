package info.adro.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.adro.springtutorial.api.UserRepository;
import info.adro.springtutorial.domain.User;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		UserRepository bean = context.getBean("userRepository", UserRepository.class);
		bean.createUser("ania");
	}

}
