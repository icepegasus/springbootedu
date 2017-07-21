package com.skcc.springboot.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","prod","queue","stack"})
public class TestServiceDefault implements TestService{
	
	//applicaton.yaml 에서 value 값 가져오기 , 해당파일에 해당항목이 없으면 "defaul value" 값
	@Value("${test.string:default value}")
	private String str;
	
	
	@Override
	public String getString() {
		
		return str;
	}
	
	

}
