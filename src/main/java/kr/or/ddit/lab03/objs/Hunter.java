package kr.or.ddit.lab03.objs;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@RequiredArgsConstructor
public class Hunter {
	
	private final ShotGun gun; // required 관계
	private HuntingDog dog; // optional 관계
	
	public void init() {
		log.info("사냥 준비 완료. 총:{}, 개:{}", gun, dog);
	}
	
}

