package kr.or.ddit.lab05.objs;

import org.springframework.beans.factory.FactoryBean;
// 팩토리빈은 좀 특수해서 클래스가 아닌 클래스 안에 있는 생성되고있는 스트링어레이에서 참조객체가 된다.
// 그래서 xml에서 객체생성해줄때 id는 스트링어레이만 쓴다.
public class StringArrayFactoryBean implements FactoryBean<String[]>{

	// 배열을 하나 만들고 초기화 시켜주기
	@Override
	public String[] getObject() throws Exception {
		
		//사이즈 0짜리 배열하나 만든거임. 요 객체가 빈으로 등록
		return new String[] {"element1", "element2", "element3"};
	}

	
	// bean 클래스의 역할을 해주는게 아래의 겟오브젝트타입 메서드.
	@Override
	public Class<?> getObjectType() {
		return String[].class;
	}

}
