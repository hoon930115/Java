package kr.or.ddit.lab07.objs.dao;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository("oracleDAO")
public class Lab07_OracleDummyDAOImpl implements Lab07DummyDAO {
	private String optionalProp; 
	
	@Required
	public void setOptionalProp(String optionalProp) {
		this.optionalProp = optionalProp;
	}
	
	@PostConstruct
	public void init() {
		log.info("생성 및 주입 완료 : {} " , this);
		
	}
	
}
