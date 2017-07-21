package com.skcc.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skcc.springboot.exam.domain.ExamValue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamValueTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ObjectMapper objectMapper;
		
	@Test
	public void contextLoads() throws Exception{
		
		
		
		ExamValue examValue = new ExamValue();
		examValue.setValue("TEST");
		
		String json = objectMapper.writeValueAsString(examValue);  //object 를 json String으로
		
		logger.debug("===={}",json);
		
	}

}
