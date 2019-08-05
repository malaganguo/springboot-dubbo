package com.mlgg.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootDubboProviderApplication {

	public static void main(String[] args){
		SpringApplication.run(SpringbootDubboProviderApplication.class);
	}
}
