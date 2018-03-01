package info.adro.springtutorial;

public class Application {
private UsersRepository usersRepository;
private DictionaryRepository dictionaryRepository;
public Application(UsersRepository usersRepository, DictionaryRepository dictionaryRepository) {
	super();
	this.usersRepository = usersRepository;
	this.dictionaryRepository = dictionaryRepository;
}

public UsersRepository getUsersRepository() {
	return usersRepository;
}
//public void setUsersRepository(UsersRepository usersRepository) {
//	this.usersRepository = usersRepository;
//}
public DictionaryRepository getDictionaryRepository() {
	return dictionaryRepository;
}
//public void setDictionaryRepository(DictionaryRepository dictionaryRepository) {
//	this.dictionaryRepository = dictionaryRepository;
//}

}
