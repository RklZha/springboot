package com.rkl.service.impl;

import com.github.pagehelper.PageException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rkl.dao.UserDao;
import com.rkl.pojo.User;
import com.rkl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-07 17:50
 * @Description:
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	/**
	 * 查询所有用户
	 * @return 返回list<User>
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
	public List<User> findAll() {
		return userDao.selectAll();
	}

	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
	public User findById(int id) {
		return userDao.selectById(id);
	}

	/**
	 * 插入用户数据
	 * @param user 插入的对象
	 * @return 返回插入成功的User对象
	 */
	@Override
	public User insert(User user) {
		userDao.insert(user);
		return user;
	}

	/**
	 * 根据id删除用户
	 * @param id 编号
	 * @return int
	 */
	@Override
	public int delete(int id) {
		int delete = userDao.delete(id);
		return delete;
	}

	/**
	 *
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@Override
	public PageInfo<User> findByPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<User> users = userDao.selectAll();
		PageInfo<User> userPageInfo = new PageInfo<>(users);
		return userPageInfo;
	}
}
