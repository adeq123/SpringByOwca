package info.adro.springtutorial;

import info.adro.springtutorial.api.Logger;
import info.adro.springtutorial.api.UserRepository;
import info.adro.springtutorial.domain.User;
import info.adro.springtutorial.implementations.LoggerImpl;
import info.adro.springtutorial.implementations.UserRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UserRepository userRepository = new UserRepositoryImpl();
		userRepository.setLogger(logger);
		User user = userRepository.createUser("adro");
	}

}
