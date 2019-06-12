package com.rkl.service;

import com.github.pagehelper.PageInfo;
import com.rkl.pojo.User;

import java.util.List;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-07 17:50
 * @Description:
 */
public interface UserService {
	/**
	 * 查询所有用户
	 * @return 返回list<User>
	 */
	public List<User> findAll();

	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public User findById(int id);

	/**
	 * 插入用户数据
	 * @param user 插入的对象
	 * @return 返回插入成功的User对象
	 */
	public User insert(User user);

	/**
	 * 根据id删除用户
	 * @param id 编号
	 * @return int
	 */
	public int delete(int id);


	/**
	 *
	 * @param pageNum 当前页
	 * @param pageSize 每页大小
	 * @return PageInfo<User>
	 */
	public PageInfo<User> findByPage(int pageNum,int pageSize);
}
