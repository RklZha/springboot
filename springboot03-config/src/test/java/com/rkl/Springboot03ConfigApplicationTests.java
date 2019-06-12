package com.rkl;

import com.rkl.bean.Address;
import com.rkl.bean.Student;
import com.rkl.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03ConfigApplicationTests {
	@Autowired
	private User user;
	//	@Autowired
	//	private Emp emp;
	@Autowired
	private Address address;
	@Autowired
	private Student student;

	@Test
	public void contextLoads() {
		//		System.out.println(user);
		System.out.println(address);
		System.out.println(student);
	}

	@Test
	public void user() {
		System.out.println(user);
	}
}
