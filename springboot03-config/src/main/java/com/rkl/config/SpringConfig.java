package com.rkl.config;

import com.rkl.bean.Banji;
import com.rkl.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-02 19:23
 * @Description:
 */
//标注在类上，表示这是一个配置类，相当于以前编写的Spring配置文件
@Configuration
public class SpringConfig {
	//标注在方法上，向容器中天际一个组件，将方法的返回值添加到容器中，方法名作为组件id；
	@Bean
	public Student student() {
		Student student = new Student();
		student.setId(01);
		student.setName("张三");
		student.setBanji(new Banji(02, "英语"));
		List<String> strings = new ArrayList<>();
		strings.add("list1");
		strings.add("list2");
		strings.add("list3");
		student.setLists(strings);
		Map<String, Object> stringObjectHashMap = new HashMap<>();
		stringObjectHashMap.put("k1", "k2");
		student.setMap(stringObjectHashMap);
		return student;
	}
}
