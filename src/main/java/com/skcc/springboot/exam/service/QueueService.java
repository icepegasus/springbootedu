package com.skcc.springboot.exam.service;

import java.util.LinkedList;

import com.skcc.springboot.exam.domain.ExamValue;

public interface QueueService {
	
	public LinkedList<ExamValue> queueListObject = new LinkedList<>();
	
	String put(ExamValue examvalue);
	ExamValue get();
}
