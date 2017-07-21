package com.skcc.springboot;

import com.skcc.springboot.user.domain.User;
import com.skcc.springboot.user.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    
    @Test
    public void updateWithErrorTest(){
    	
    	User newUser = new User();
    	newUser.setId(0);
    	newUser.setName("Updated name");
    	newUser.setAge(50);
    	
    	try{
    		userService.updateWithError(newUser);
    	}catch (Exception e){
    		//
    	}
    	
    	User user = userService.selectById(0);
    	logger.debug("{}",user);
    	
    	
    	
    }

}