package kr.or.ddit.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.lab01.objs.controller.DummyController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Playground {
   public static void main(String[] args) {
      log.info("안녕? 출력이 되니 ?? ");
      // 컨테이너를 활용하는 것이 여기 있어야함
      // 맨처음 컨테이너 객체를 생성할때 new가 딱한번 있다.=> 어플리케이션 엔트리 포인트 
      // 어플리케이션이 실행할때 이 코드가 먼저 실행된다는것을 알자
      // ApplicationContext -> 스프링의 ㅇ모든 컨테이너에서 최상위다. (
      // 설정파일의 경로를 알려줘야한다. 그 공장이 있는 위치 -> dummycontext.xml을 알려준다.
      ApplicationContext container = new ClassPathXmlApplicationContext("kr/or/ddit/lab01/conf/dummy-context.xml"); 
      DummyController controller = container.getBean(DummyController.class); // 검색조건을 dummyController에 있는 class를 넘겨주는 것이다.
      
      String param = "P10101";
      controller.receiveCommand(param);      
   }
}
