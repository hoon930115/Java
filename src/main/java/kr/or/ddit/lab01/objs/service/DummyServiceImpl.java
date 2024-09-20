package kr.or.ddit.lab01.objs.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.lab01.objs.controller.DummyDAOFactory;
import kr.or.ddit.lab01.objs.dao.DummyDAO;
import kr.or.ddit.lab01.objs.dao.MariaDBDAOImpl;
import kr.or.ddit.lab01.objs.dao.OracleDAOImpl;
import lombok.RequiredArgsConstructor;


@Service
public class DummyServiceImpl implements DummyService {
	// 1. 필요한 의존객체를 new 키워드로 직접 생성 (결합력 최상).
//	private DummyDAO dao = new MariaDBDAOImpl();
	// 2. Factory object pattern 객체 생성만을 전담하는 또 다른 객
//	private DummyDAO dao = DummyDAOFactory.generateDummyDAO();
	// 3번쨰 방식. Strategy pattern (전략 구조) : 외부의(컨트롤러)전략의 주입자로부터 필요한 객체를 주입받는 구조. 여기서는 전략의 사용방법만 정의한다
	//(스프링은 전략패턴의 확장판임.)
	@Resource(name = "oracleDAO")
	private final DummyDAO dao;
	
	
	
	public DummyServiceImpl(DummyDAO dao) {
		this.dao = dao;
	}



	@Override
	public String retrieveInfomation(String pk) {
		String rawData = dao.selectByPk(pk);
		return String.format("%s 를 가공해서 만들어진 정보", rawData);
	}

}
