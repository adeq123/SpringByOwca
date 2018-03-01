package info.adro.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		UserCounter bean = context.getBean("userCounter", UserCounter.class);
		
		System.out.println("bean.getPrototypeCounter1().getCounter()");
		System.out.println(bean.getPrototypeCounter1().getCounter());
		System.out.println(bean.getPrototypeCounter1().getCounter());
		System.out.println("bean.getPrototypeCounter2().getCounter()");
		System.out.println(bean.getPrototypeCounter2().getCounter());
		System.out.println(bean.getPrototypeCounter2().getCounter());
		System.out.println("bean.getSingletonCounter1().getCounter()");
		System.out.println(bean.getSingletonCounter1().getCounter());
		System.out.println(bean.getSingletonCounter1().getCounter());
		System.out.println("bean.getSingletonCounter2().getCounter()");
		System.out.println(bean.getSingletonCounter2().getCounter());
		System.out.println(bean.getSingletonCounter2().getCounter());
	}

}
