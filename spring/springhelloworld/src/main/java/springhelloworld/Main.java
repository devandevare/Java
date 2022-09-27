package springhelloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static ApplicationContext context;
	
	private static void Mian(String[] args) {
		
		context=new ClassPathXmlApplicationContext("beans.xml");
		
		HelloBean helloBean=(HelloBean) context.getBean("HelloBean");
		
		helloBean.sayHello();
	}
}
