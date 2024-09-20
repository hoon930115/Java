package kr.or.ddit.lab06.objs;

import java.util.Properties;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Playground {
	public static void main(String[] args) {
//		System.getProperties().forEach((k,v)->log.info("{}:{}", k,v));
		
		ConfigurableApplicationContext context =
				new GenericXmlApplicationContext("classpath:kr/or/ddit/lab06/conf/lab06-context.xml");
		context.registerShutdownHook();
		
		Properties dbInfo = context.getBean("dbInfo", Properties.class);
		dbInfo.forEach((k,v)->log.info("key:{}, value:{}", k,v));
		context.getBean("vo1", DbInfoVO.class);
	}
}
