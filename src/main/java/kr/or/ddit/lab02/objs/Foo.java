package kr.or.ddit.lab02.objs;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
//@Data
public class Foo {
	private final int number; // required 
	
	private boolean flag; // optional
	@Autowired
	private Bar bar; // optional 관계
	
	private final Baz baz; // reqired  관계
	
	public Foo(Baz baz, @Value("5") int number) {
		super();
		this.baz = baz;
		this.number = number;
		log.info("Foo 객체가 파라미터 있는 생성자로 생성됐음.");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
		log.info("setter injection으로 flag 주입받음.{}", flag);
	}
	public void setBar(Bar bar) {
		this.bar = bar;
		log.info("setter injection으로 bar 주입받음.{}", bar);
	}
	
	@PostConstruct
	public void initas() {
		log.info("init 메소드 실행. 시점을 확인할 것.");
	}
	@PreDestroy
	public void destroyas() {
		log.info("destroy 메소드 실행. 시점을 확인할 것.");
	}
}	
