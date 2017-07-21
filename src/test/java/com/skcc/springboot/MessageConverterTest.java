package com.skcc.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageConverterTest {
	
	@Autowired
	private HttpMessageConverter[] converters;
	@Autowired
	private ApplicationContext context;

	@Test
	public void contextLoads() {
		
		assert converters.length > 0; /*assert : 뒤에 조건이 거짓이면 Exception 발생*/
	}

}
