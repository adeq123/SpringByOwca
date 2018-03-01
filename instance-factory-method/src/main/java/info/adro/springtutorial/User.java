package info.adro.springtutorial;

public class User {
	private String name;

	public String toString() {
		return "name: " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
