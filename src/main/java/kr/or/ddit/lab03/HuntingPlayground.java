package kr.or.ddit.lab03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.ddit.lab03.objs.Hunter;


public class HuntingPlayground {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new GenericXmlApplicationContext("classpath:kr/or/ddit/lab03/conf/lab03-context.xml");
		context.registerShutdownHook();
		Hunter hunter1 = context.getBean(Hunter.class);
		Hunter hunter2 = context.getBean(Hunter.class);
		Hunter hunter3 = context.getBean(Hunter.class);
	}
}
