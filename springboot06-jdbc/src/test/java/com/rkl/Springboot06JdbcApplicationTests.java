package com.rkl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot06JdbcApplicationTests {
	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() {
		System.out.println("datasource 类型 "+dataSource.getClass());
		try {
			System.out.println("datasource 类型 "+dataSource.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
