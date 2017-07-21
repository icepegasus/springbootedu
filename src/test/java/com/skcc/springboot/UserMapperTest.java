package com.skcc.springboot;

import com.skcc.springboot.user.dao.UserMapper;
import com.skcc.springboot.user.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        logger.debug("contextLoads() {}", userMapper != null);
    }

    @Test
    public void selectAll() {
        List<User> users = userMapper.selectAll();
        for (User user: users) {
            logger.debug("selectAll() {}", user);
        }
    }
    
    @Test(expected = DuplicateKeyException.class)
    public void create(){
    	List<User> user = userMapper.selectAll();
    	
    	assertThat(user.size(),is(1));
    	
    	User newUser = new User();
    	
    	newUser.setId(9);
    	newUser.setName("name");
    	newUser.setAge(30);
    	
    	userMapper.insert(newUser);
    	
    	assertThat(userMapper.selectAll().size(), is(2));
    	
    	userMapper.insert(newUser);
    }

}