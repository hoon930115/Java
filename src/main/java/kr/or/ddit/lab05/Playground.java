package kr.or.ddit.lab05;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.ddit.lab03.objs.Hunter;
import kr.or.ddit.lab03.objs.HuntingDog;
import kr.or.ddit.lab03.objs.ShotGun;
import kr.or.ddit.lab05.objs.HuntingGameComposite;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Playground {

public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new GenericXmlApplicationContext("classpath:kr/or/ddit/lab05/conf/lab05-context.xml");
		context.registerShutdownHook();
		
		HuntingGameComposite HGC = context.getBean(HuntingGameComposite.class);
		
		List<Hunter> hunterList = HGC.getHunterList();
		for( Hunter single : hunterList) {
			log.info("{}", single);
		}
			
		Set<HuntingDog> dogSet	= HGC.getDogSet();
			log.info("사이즈:{}", dogSet.size());
		
		Map<String, ShotGun> gunMap = HGC.getGunMap();
		gunMap.forEach((k,v)->log.info("key:{}, value:{}", k,v));
		
		Properties dbInfo = context.getBean("dbInfo",Properties.class );
		dbInfo.forEach((k,v)->log.info("key:{}, value:{}", k,v));
		
			log.info("HGC의 정보:{}", HGC);
			
		String[] stringArray = HGC.getStringArray();
		log.info("array : {}" , Arrays.toString(stringArray));
		
		String[] array = context.getBean("stringArray",  String[].class);
		log.info("array : {}" , array);
		
		
	}
}
