package info.adro.springtutorial.implementations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import info.adro.springtutorial.api.Logger;

@Service
@Qualifier("counterLoggerAnnotationQualifier")
public class CounterLogger implements Logger{

	private int counter = 0;

	public void log(String message) {
		System.out.println(counter++ + ": " + message);
		
	}
	
	
}
