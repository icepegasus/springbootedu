package com.skcc.springboot.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.springboot.exam.domain.ExamValue;
import com.skcc.springboot.exam.service.QueueService;
import com.skcc.springboot.exam.service.StackService;
import com.skcc.springboot.user.domain.User;
import com.skcc.springboot.user.service.UserService;

@RestController
@RequestMapping("/stack")
@Profile("stack")
public class StackController {
	
	
	
	
	public StackService stackService;

	
	public StackController(StackService stackService){
		this.stackService = stackService;
	}
	
	
	@RequestMapping(path = "", method = RequestMethod.GET)
	public ExamValue get(){
		return stackService.get();
	}
	
	@RequestMapping(path = "", method = RequestMethod.PUT)
	public String put(@RequestBody ExamValue examValue){
		return stackService.put(examValue);
	}




	
	
	
}
