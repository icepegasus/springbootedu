package com.skcc.springboot.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skcc.springboot.user.dao.UserMapper;
import com.skcc.springboot.user.domain.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	

	@Override
	public List<User> selectAll() {
		return userMapper.selectAll();
	}

	@Override
	public User selectById(int id) {
		return userMapper.selectById(id);
	}

	@Override
	public int insert(User user) {
		
		int result = userMapper.insert(user);
		if(result != 1){
			throw new RuntimeException("insert error");
		}
		
		return result;
	}

	@Override
	public int update(User user) {
		
		int result = userMapper.update(user);
		if(result != 1){
			throw new RuntimeException("update error");
		}
		
		return result;
	}

	@Override
	public int delete(int id) {
		
		int result = userMapper.delete(id);
		if(result != 1){
			throw new RuntimeException("delete error");
		}
		
		return result;
	}

	@Transactional(noRollbackFor = RuntimeException.class)
	@Override
	public void updateWithError(User user) {
		
		userMapper.update(user);
		throw new RuntimeException("update error");
	}
	
	

}
