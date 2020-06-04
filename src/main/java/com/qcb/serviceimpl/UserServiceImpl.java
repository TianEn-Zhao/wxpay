package com.qcb.serviceimpl;
import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.qcb.dao.UserMapper;
import com.qcb.entitys.User;
import com.qcb.services.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userDao;
	@Override
	public  User getUserById(int userId) {
		System.out.println(111);
		System.out.println(userId);
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
 
}
