package info.adro.springtutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import info.adro.springtutorial.api.Logger;
import info.adro.springtutorial.implementations.WithDateLogger;

@Configuration
public class LoggerConfiguration {

	@Bean
	@Scope("singleton")
	public Logger logger() {
		return new WithDateLogger();
	}
}
