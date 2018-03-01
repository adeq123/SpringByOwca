package info.adro.springtutorial.implementations;

import java.util.Date;

import org.springframework.stereotype.Service;

import info.adro.springtutorial.api.Logger;

@Service
public class WithDateLogger implements Logger{

	public void log(String message) {
		System.out.println(new Date() +  message);

	}



}
