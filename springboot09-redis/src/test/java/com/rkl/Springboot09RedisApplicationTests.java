package com.rkl;

import com.rkl.pojo.User;
import com.rkl.util.JsonUtils;
import com.rkl.util.RedisUtils;
import com.rkl.util.SerializableUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot09RedisApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private RedisUtils redisUtils;


	/**
	 * 使用stringRedisTemplate
	 * Redis数据类型：String、List、Set、ZSet、Hash
	 */
	@Test
	public void test1() {
		// ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
		// ListOperations<String, String> stringStringListOperations = stringRedisTemplate.opsForList();
		// SetOperations<String, String> stringStringSetOperations = stringRedisTemplate.opsForSet();
		// ZSetOperations<String, String> stringStringZSetOperations = stringRedisTemplate.opsForZSet();
		// HashOperations<String, Object, Object> stringObjectObjectHashOperations = stringRedisTemplate.opsForHash();

		/*
		 * 操作String
		 */
		// stringRedisTemplate.opsForValue().set("username","admin");
		// System.out.println(stringRedisTemplate.opsForValue().get("username"));

		/*
		 * 操作List
		 */
		// stringRedisTemplate.opsForList().leftPush("names","tom");
		// stringRedisTemplate.opsForList().leftPushAll("names","aaa","bbb","ccc");
		// System.out.println(stringRedisTemplate.opsForList().range("names",0,-1));

		/*
		 * 存储对象
		 */
		User user = new User();
		user.setId(1001);
		user.setUsername("tom");
		user.setPassword("123");

		//将对象转换为json字符串
		String jsonString = JsonUtils.objectToJson(user);
		System.out.println(jsonString);
		stringRedisTemplate.opsForValue().set("user", jsonString);

		//将json字符串转换为对象
		String str = stringRedisTemplate.opsForValue().get("user");
		User u = JsonUtils.jsonToObject(str, User.class);
		System.out.println(u);
	}

	/**
	 * 使用redisTemplate
	 */
	@Test
	public void test2() {
		redisTemplate.opsForValue().set("sex", "male");
		Object sex = redisTemplate.opsForValue().get("sex");
		System.out.println(sex);
	}

	/**
	 * 使用工具类RedisUtils
	 */
	@Test
	public void test3() {
		redisUtils.set("age", "21", 20);
		System.out.println(redisUtils.get("age"));
	}

	/**
	 * 序列化存储redis
	 */
	@Test
	public void test4() {
		User user1 = new User(1, "张三", "123456");
		User user2 = new User(2, "李四", "321654");
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		byte[] bytes = SerializableUtil.getByte(users);
		System.out.println("序列进程");
		redisTemplate.opsForValue().set("users", bytes);
	}

	/**
	 * 序列化存储redis
	 */
	@Test
	public void test5() {
		byte[] bytes = (byte[]) redisTemplate.opsForValue().get("users");
		List<User> o = (List<User>) SerializableUtil.getObject(bytes);
		for (User user : o) {
			System.out.println(user.getId() + "\t" + user.getUsername() + "\t" + user.getPassword());
		}
	}

}
