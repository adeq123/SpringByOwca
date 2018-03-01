package info.adro.springtutorial;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SomeBean{
private String property;

public String getProperty() {
	return property;
}

public void setProperty(String property) {
	this.property = property;
}
	
}

