package com.skcc.springboot;

import java.util.LinkedList;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataStructureTest {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	LinkedList<String> list = new LinkedList<>();
	
	@Test
	public void test(){
		
		list.add("a");
		list.add("b");
		list.add("c");
		
//		logger.debug("{}", list.removeFirst());
//		logger.debug("{}", list.removeFirst());
//		logger.debug("{}", list.removeFirst());
		
		
		logger.debug("{}", list.removeLast());
		logger.debug("{}", list.removeLast());
		logger.debug("{}", list.removeLast());
		
		
		
		
	}
}
