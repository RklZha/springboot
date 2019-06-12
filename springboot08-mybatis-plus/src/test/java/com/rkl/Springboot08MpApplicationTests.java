package com.rkl;


import com.rkl.utils.CodeGenenator;
import com.rkl.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot08MpApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private CodeGenenator codeGenenator;

	@Test
	public void contextLoads() {
		codeGenenator.genenator();
		;
	}

	/*@Test
	public void add(){
		User user = new User();
		user.setUsername("xxx");
		user.setPassword("111");
		userMapper.insert(user);
		System.out.println("-------------------------"+user);
	}

	@Test
	public void removeById(){
		userMapper.deleteById(4);
	}

	@Test
	public void modifyById(){
		User user = new User();
		user.setId(2);
		user.setPassword("666");
		userMapper.updateById(user);
	}

	@Test
	public void findById(){
		User user = userMapper.selectById(2);
		System.out.println(user);
	}

	@Test
	public void findByCondition(){
		//定义条件构造器，用来封装查询条件
		EntityWrapper<User> ew = new EntityWrapper<>();
		// ew.eq("username","tom");
		ew.like("username","%a%");
		// ew.ge("id",4); // 表示并且的关系
		ew.or().ge("id",4); //表示或者的关系

		List<User> users = userMapper.selectList(ew);
		System.out.println(users);
	}

	@Test
	public void findByPage(){
		List<User> users = userMapper.selectPage(
				new Page(2, 3),
				new EntityWrapper<User>().gt("id", 1)
		);
		System.out.println(users);
	}*/

}
