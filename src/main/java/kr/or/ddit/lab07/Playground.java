package kr.or.ddit.lab07;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.lab02.objs.Foo;
import kr.or.ddit.lab07.objs.controller.Lab07DummyController;
import kr.or.ddit.lab07.objs.dao.Lab07DummyDAO;
import kr.or.ddit.lab07.objs.service.Lab07DummyService;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Playground {
	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				new ClassPathXmlApplicationContext("kr/or/ddit/lab07/conf/annotation-context.xml");
		context.registerShutdownHook();
		
		context.getBean("oracleDAO", Lab07DummyDAO.class);
		context.getBean(Lab07DummyService.class);
		context.getBean(Lab07DummyController.class);
		
//		
//		Foo foo =	context.getBean(Foo.class);
//		log.info("주입된객체:{}" , foo);
	}
}
