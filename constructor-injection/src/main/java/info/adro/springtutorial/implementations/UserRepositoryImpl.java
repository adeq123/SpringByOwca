package info.adro.springtutorial.implementations;

import info.adro.springtutorial.api.Logger;
import info.adro.springtutorial.api.UserRepository;
import info.adro.springtutorial.domain.User;

public class UserRepositoryImpl implements UserRepository{
	private Logger logger;
	
	public UserRepositoryImpl(Logger logger, String localization, String dbName) {
		this.logger = logger;
		logger.log("Lokalizacja repozytorium: " + localization + "/" + dbName);
	}
	
	public User createUser(String name) {
		logger.log("New user created: " + name);
		return new User(name);
	}
	


}
