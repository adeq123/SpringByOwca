package info.adro.springtutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfiguration {

@Bean(initMethod = "myInitMethod", destroyMethod = "myDestroyMethod")
public SomeBean someBean() {
	return new SomeBean();
}
}
