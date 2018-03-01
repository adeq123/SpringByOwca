package info.adro.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import info.adro.springtutorial.api.Logger;
import info.adro.springtutorial.api.UserRepository;
import info.adro.springtutorial.implementations.UserRepositoryImpl;

@Configuration
public class RespositoriesConifuration {
	@Autowired
	private Logger logger;
	@Bean
	public UserRepository usersRepository() {
		UserRepositoryImpl userRepository = new UserRepositoryImpl();
		userRepository.setLogger(logger);
		return userRepository;
	}
}
