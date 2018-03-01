package info.adro.springtutorial;

import java.util.logging.Logger;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.*;
public class SomeBean implements InitializingBean, DisposableBean{

	private Logger logger = Logger.getLogger(SomeBean.class.getName());
	public void destroy() throws Exception {
		logger.info("destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		logger.info("After propertyset");
	}
	
	@PostConstruct
	public void postConstruct() throws Exception {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() throws Exception {
		logger.info("pre destroy");
	}

	public void myInitMethod() throws Exception {
		logger.info("init method");
	}
	
	public void myDestroyMethod() throws Exception {
		logger.info("destroy method");
	}
}
