package info.adro.springtutorial;

public class DatabaseRepository {
	private String host;
	private String port;
	private String user;
	private String password;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
public String toString() {
	return host +" "+ port +" "+ user +" "+ password;
}
}
