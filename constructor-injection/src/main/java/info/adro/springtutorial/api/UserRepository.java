package info.adro.springtutorial.api;

import info.adro.springtutorial.domain.User;

public interface UserRepository {
	User createUser(String name);
}
