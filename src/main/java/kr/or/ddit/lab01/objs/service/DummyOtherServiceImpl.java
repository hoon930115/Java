package kr.or.ddit.lab01.objs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.lab01.objs.controller.DummyDAOFactory;
import kr.or.ddit.lab01.objs.dao.DummyDAO;
import kr.or.ddit.lab01.objs.dao.MariaDBDAOImpl;

@Service
public class DummyOtherServiceImpl implements DummyOtherService {
	// 1번 방식 (결합력 ↑)
//	private DummyDAO dao = new MariaDBDAOImpl();
	
	// 2 번방식   //오토와이드 생성자나 셑너 없이 자동으로 연결가능하게해줌
	@Autowired
	private DummyDAO dao;
	
	@Override
	public StringBuffer readOtherInfo(String pk) {
		String rawData = dao.selectByPk(pk);
		return new StringBuffer(String.format("%s 를 가져와서 other service 가 가공한 정보", rawData));
	}

}
