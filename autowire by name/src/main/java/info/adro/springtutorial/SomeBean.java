package info.adro.springtutorial;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SomeBean {
	private InjectedBean injectedBean1;
	private InjectedBean injectedBean2;
	public InjectedBean getInjectedBean1() {
		return injectedBean1;
	}
	public void setInjectedBean1(InjectedBean injectedBean1) {
		this.injectedBean1 = injectedBean1;
	}
	public InjectedBean getInjectedBean2() {
		return injectedBean2;
	}
	public void setInjectedBean2(InjectedBean injectedBean2) {
		this.injectedBean2 = injectedBean2;
	}
	
}