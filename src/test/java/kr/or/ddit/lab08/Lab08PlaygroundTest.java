package kr.or.ddit.lab08;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import kr.or.ddit.lab08.objs.ResourceComposite;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringJUnitConfig(locations = "file:src/main/resources/kr/or/ddit/lab08/conf/lab08-context.xml")
class Lab08PlaygroundTest {
	
	
//	@Autowired
	@Resource(name = "resourceComposite")
	ResourceComposite resCom;
	
	
	@Test
	void test() throws IOException {
		log.info("csr:{}", resCom.getCpr().contentLength());
		log.info("fsr:{}", resCom.getFsr().contentLength());
		log.info("urlR:{}", resCom.getUrlR().contentLength());
	}

}
