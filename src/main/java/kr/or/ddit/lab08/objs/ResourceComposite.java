package kr.or.ddit.lab08.objs;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Component
@Getter
//@Data
//@RequiredArgsConstructor
public class ResourceComposite {
	
	private final Resource cpr; // required  // (클래스패스리소스). cat1.jpg
	
	private final Resource fsr; // requried  // (파일시스템리소스) , cat2.png
	@Value("#{resourceInfo.urlR}")
	private Resource urlR; // optional // (유알엘리소스)google logo
	
	public ResourceComposite(@Value("#{resourceInfo.cpr}") Resource cpr
				, @Value("#{resourceInfo.fsr}") Resource fsr
				) {
		super();
		this.cpr = cpr;
		this.fsr = fsr;
	}
	
	public void setUrlR(Resource urlR) {
		this.urlR = urlR;
	}
	
	
}
