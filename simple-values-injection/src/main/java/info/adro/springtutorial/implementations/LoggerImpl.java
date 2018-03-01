package info.adro.springtutorial.implementations;

import java.util.Date;

import info.adro.springtutorial.api.Logger;

public class LoggerImpl implements Logger{
	private int version;
	private String name;
	public void log(String message) {
		System.out.println(new Date() + " [" + name +" v." + version + "]" +": " + message);

	}

	public void setName(String name) {
		this.name = name;

	}

	public void setVersion(int version) {
		this.version = version;
		
	}

}
