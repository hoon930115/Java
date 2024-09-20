package kr.or.ddit.lab01.objs.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mariaDAO")
public class MariaDBDAOImpl implements DummyDAO {
	public String selectByPk(String pk) {
		return String.format("%s 로 %s 에서 조회한 raw data", pk, "마리아DB");
	

	}
}
