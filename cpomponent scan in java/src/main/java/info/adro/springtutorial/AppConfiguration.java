package info.adro.springtutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import info.adro.springtutorial.api.Logger;
import info.adro.springtutorial.api.UserRepository;
import info.adro.springtutorial.implementations.UserRepositoryImpl;
import info.adro.springtutorial.implementations.WithDateLogger;

@Configuration
@ComponentScan(basePackages = "info.adro.springtutorial.implementations")
public class AppConfiguration {

//	@Bean
//	public Logger logger() {
//		return new WithDateLogger();
//	}
//	
//	@Bean
//	public UserRepository userRepository() {
//		UserRepositoryImpl usersRepository = new UserRepositoryImpl();
//		usersRepository.setLogger(logger());
//		return usersRepository;
//	}
}
