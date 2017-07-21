package com.skcc.springboot.exam.service;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.skcc.springboot.exam.domain.ExamValue;



@Service
public class QueueServiceImpl implements QueueService{
	
	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public String put(ExamValue examvalue) {
		
		String json="";
		queueListObject.add(examvalue);
		try {
			json = objectMapper.writeValueAsString(queueListObject);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return json;
		
	 
		
	}

	@Override
	public ExamValue get() {
		
		
		if(queueListObject.size() == 0 ){
			ExamValue examValue = new ExamValue();
			examValue.setValue("LinkedList is Empty");
			
			return examValue;
		}else {
			return queueListObject.removeFirst();
		}
		

	}



}
