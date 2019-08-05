package com.mlgg.customer.controller;


import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.config.annotation.Reference;
import com.mlgg.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang.yifei4
 * @version 1.0
 * @ClassName DemoServiceController
 * <p>
 * Created on 2019/4/4
 * @since v9.0
 */
@RestController
public class DemoServiceController {

	private static final Logger logger = LoggerFactory.getLogger(DemoServiceController.class);

	@Reference
	private DemoService demoService;

	@RequestMapping(value = "/hello")
	public String sayHello(){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		String zzh = demoService.sayHello();
		logger.info("渣渣灰："+zzh);
		return zzh;
	}
}
