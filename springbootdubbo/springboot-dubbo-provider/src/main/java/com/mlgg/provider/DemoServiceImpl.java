package com.mlgg.provider;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.mlgg.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author zhang.yifei4
 * @version 1.0
 * @ClassName DemoServiceImpl
 * <p>
 * Created on 2019/4/4
 * @since v9.0
 */
@Service
@Component
public class DemoServiceImpl implements DemoService{

	private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

	@Override
	public String sayHello() {
		System.out.println("#############DemoServiceImpl################");
		logger.info("你好"+",请求来自："+ RpcContext.getContext().getRemoteAddress());
		return "这是一条来自生产者的回复，你好"+",回复来自"+RpcContext.getContext().getLocalAddress();
	}
}
