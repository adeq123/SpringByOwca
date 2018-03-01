package info.adro.springtutorial.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.adro.springtutorial.api.Logger;
import info.adro.springtutorial.api.UserRepository;
import info.adro.springtutorial.domain.User;

@Service("usersRepository")
public class UserRepositoryImpl implements UserRepository{
	@Autowired(required = false)
	private Logger logger;
	public User createUser(String name) {
		if (logger != null) {
			logger.log( " New user created: " + name);
		}
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;

	}

}
