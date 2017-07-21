package com.skcc.springboot.test;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class TestServiceDev implements TestService{

	@Override
	public String getString() {
		
		return "TestServiceDev";
	}
	
}
