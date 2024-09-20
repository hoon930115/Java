package kr.or.ddit.lab01.objs.controller;

import kr.or.ddit.lab01.objs.dao.DummyDAO;
import kr.or.ddit.lab01.objs.dao.OracleDAOImpl;

public class DummyDAOFactory {
	public static DummyDAO generateDummyDAO(){
		return new OracleDAOImpl();
	}
}
