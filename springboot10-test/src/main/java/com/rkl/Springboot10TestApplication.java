package com.rkl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.rkl.dao")
@SpringBootApplication
public class Springboot10TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot10TestApplication.class, args);
	}

}
