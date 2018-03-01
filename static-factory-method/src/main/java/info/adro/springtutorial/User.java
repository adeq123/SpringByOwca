package info.adro.springtutorial;

public class User {
	private String name;
	private int age;

	private User() {

	}

	public static User getInstance(String name, int age) {
		User user = new User();
		user.name = name;
		user.age = age;
		return user;
	}

	public String toString() {
		return "name: " + name + " age: " + age;
	}
}
