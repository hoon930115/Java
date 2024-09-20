package kr.or.ddit.jdbcboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.or.ddit.vo.JdbcBoardVO;

/**
 * JDBC_BOARD 엔터티를 대상으로 crud 를 위한 persistence layer
 *
 */
@Mapper
public interface JdbcBoardDAO {
	// 여기있는 메서드 하나하나가 쿼리문이 되어야한다.
	public int insertJdbcBoard(JdbcBoardVO boardVO);
	public List<JdbcBoardVO> selectJdbcBoardList();
	public JdbcBoardVO selectJdbcBoard(@Param("no") int boardNo);
	public int updateJdbcBoard(JdbcBoardVO boardVO);
	// 파라미터를 값만 전달해주는데 사실상 이파라미터를 참조를할때 xml에서 아무렇게나줘도 상관잉벗다
	// 하지만 여기서 문제점은 조건이 있을때 조건을 형성을 하려면 전달되는파라미터를 참조해야하는데 이름이 없으면
	// 참조할수없다. 이름이 없는 값의 형태의 파라미터에 이름을 사용해줘야할때 어노테이션 파람을써줘야한다.17라인처럼.
	// 내부적을 맵을 만들어주고 키와 밸류를 생성하고 식별자가 만들어지면 xml에서 컨트롤 스페이스바 누르면 값이 뜬다.
	public int deleteJdbcBoard(@Param("boardNo") int boardNo);
}
