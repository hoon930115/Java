package kr.or.ddit.lab05.objs;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import kr.or.ddit.lab03.objs.Hunter;
import kr.or.ddit.lab03.objs.HuntingDog;
import kr.or.ddit.lab03.objs.ShotGun;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class HuntingGameComposite {
//	hunterList : required
//	dogSet : required
//	gunMap : required
//	dbInfo : optional
	
	 private final List<Hunter> hunterList; // required
	 private final Set<HuntingDog> dogSet; // required
	 private final Map<String, ShotGun> gunMap; // required
	 
	 private Properties dbInfo; // optional
	 
	 private String[] stringArray; // optional
	 
	
	 
}
