package info.adro.springtutorial.implementations;

import info.adro.springtutorial.api.Logger;
import info.adro.springtutorial.api.UserRepository;
import info.adro.springtutorial.domain.User;

public class UserRepositoryImpl implements UserRepository{
	private Logger logger;
	public User createUser(String name) {
		logger.log("New user created: " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
		
	}

}
