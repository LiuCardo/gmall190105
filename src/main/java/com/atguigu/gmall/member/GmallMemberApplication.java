package com.atguigu.gmall.member;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall.member.mapper")
public class GmallMemberApplication {
	public static void main(String[] args) {
		SpringApplication.run(GmallMemberApplication.class, args);
	}

}
