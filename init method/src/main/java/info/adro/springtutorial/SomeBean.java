package info.adro.springtutorial;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.InitializingBean;

public class   implements InitializingBean{
	public void init() {
		System.out.println("Inicjacja beana");
	}
	
	public void checkIsWorking() {
		System.out.println("Dzialam!");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
