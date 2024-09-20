package kr.or.ddit.lab01.objs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;

import kr.or.ddit.lab01.objs.dao.MariaDBDAOImpl;
import kr.or.ddit.lab01.objs.dao.OracleDAOImpl;
import kr.or.ddit.lab01.objs.service.DummyService;
import kr.or.ddit.lab01.objs.service.DummyServiceImpl;
import kr.or.ddit.lab01.objs.view.DummyHtmlView;
// 	컨트롤러는 전략의 주입자이다.
// 아래 세줄은 스프링컨테이너 안에 있어야한다.

@Controller
public class DummyController {
	private DummyService service;
//	@Required // 생략가능
	@Autowired
	public void setService(DummyService service) {
		this.service = service;
	}
	// 뷰도 마찬가지로 빈 컨테이너에 담아줘야한다.
	private DummyHtmlView view;
	@Autowired   // 전재조건이 주입할대상이 종료되어야한다.
	public void setViewSub(DummyHtmlView view) {
		this.view = view;
	}
	
	public void receiveCommand(String param){
		String model = service.retrieveInfomation(param);
		view.generateContent(model);
	}
}
