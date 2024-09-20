package kr.or.ddit.lab09;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.Resource;
import javax.security.sasl.SaslServerFactory;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ddit.jdbcboard.dao.JdbcBoardDAO;
import kr.or.ddit.vo.JdbcBoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringJUnitConfig(locations = "file:src/main/resources/kr/or/ddit/lab09/conf/*-context.xml")
@Transactional
class MapperContextTest {
   
   @Autowired
   SqlSessionFactory factory;
   @Resource(name = "jdbcBoardDAO")
   JdbcBoardDAO dao;
   
   @Test
   void testInsert() {
      JdbcBoardVO board = new JdbcBoardVO();
      board.setBoardTitle("신규제목");
      board.setBoardWriter("신규 작성자");
      board.setBoardContent("테스트 작성 내용");
      
      assertEquals(1, dao.insertJdbcBoard(board)); 
   }
   
   @Test
   void testDAO() {
      dao.selectJdbcBoardList();
   }
   
   @Test
   void test() {
      log.info("주입된 factory : {}",factory);
   }

}
