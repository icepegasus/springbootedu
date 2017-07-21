package com.skcc.springboot.mock;

import org.springframework.stereotype.Service;

@Service
public class TestServiceCaller {
	
	private TestMockService testMockService;
	
	public TestServiceCaller(TestMockService testMockService){
		this.testMockService = testMockService;
	}
	
	public String execute(){
		return testMockService.execute();
		
	}
	
	
}
