package com.rkl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.rkl.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRestfulApplicationTests {
	@Autowired
	private UserDao dao;
	@Autowired
	private DataSource dataSource;

	@Test
	public void contextLoads() {

		System.out.println(dao.selectList(new EntityWrapper<>()));
	}

	@Test
	public void dateConnect() throws  Exception{
		System.out.println(dataSource.getConnection());
	}
}
