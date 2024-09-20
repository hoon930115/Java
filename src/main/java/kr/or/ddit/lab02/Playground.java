package kr.or.ddit.lab02;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.lab02.objs.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Playground {
	public static void main(String[] args) {
		try(
			ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("kr/or/ddit/lab02/conf/lab02-context.xml");
		){
		context.registerShutdownHook();
		Foo foo1 = context.getBean(Foo.class);
		Foo foo2 = context.getBean(Foo.class);
//		Foo foo3 = context.getBean(Foo.class);
//		log.info("주입된 객체 : {}", foo1);
//		log.info("foo1 == foo2 : {}", foo1==foo2);
//		log.info("foo1 == foo3 : {}", foo1==foo3);
		
		}
	}
}