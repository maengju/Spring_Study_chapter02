package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		System.out.println("Life Cycle");
		System.out.println();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageBean bean = context.getBean("messageBeanImpl2",MessageBean.class);
		bean.helloCall();
	}

}
