package com.mlgg.customer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDubbo
@EnableDubboConfiguration
public class SpringbootDubboCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboCustomerApplication.class, args);
	}

}

