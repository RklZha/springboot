package com.rkl.dao;

import com.rkl.pojo.User;

import java.util.List;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-07 17:27
 * @Description:
 */
public interface UserDao {
	/**
	 * 查询所有用户
	 * @return 返回list<User>
	 */
	public List<User> selectAll();

	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public User selectById(int id);

	/**
	 * 插入用户数据
	 * @param user 插入的对象
	 * @return 返回插入成功的User对象
	 */
	public void insert(User user);

	/**
	 * 根据id删除用户
	 * @param id 编号
	 * @return int
	 */
	public int delete(int id);
}
