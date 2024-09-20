package kr.or.ddit.lab01;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.lab01.objs.controller.DummyController;

public class Playground2 {
	// 엔트리
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("kr/or/ddit/lab01/conf/lab01-context.xml");

		// 컨테이너는 어플리케이션 종료시 자동 종료될 수 있어야 함.
		context.registerShutdownHook();
		String param = "P10103";
		DummyController controller = context.getBean(DummyController.class);
		controller.receiveCommand(param);
		
	}
}
