package info.adro.springtutorial.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import info.adro.springtutorial.api.Logger;
import info.adro.springtutorial.api.UserRepository;
import info.adro.springtutorial.domain.User;

@Service("usersRepository")
public class UserRepositoryImpl implements UserRepository{
	@Autowired (required = false)
	private Logger logger;
	
	@Value("${database.host}")
	private String host;
	@Value("${database.port}")
	private int port;
	@Value("${database.name}")
	private String database;
	@Value("#{systemProperties['database.user']}")
	private String user;
	@Value("#{systemProperties['database.password']}")
	private String password;
	
	public User createUser(String name) {
		if (logger != null) {
			logger.log( " New user created: " + name + " do bazy: " + host 
					+ ":" + port + "/" + database + " korzystajac z urzytkownika " + user + " i hasla " + password);
		}
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;

	}

}
