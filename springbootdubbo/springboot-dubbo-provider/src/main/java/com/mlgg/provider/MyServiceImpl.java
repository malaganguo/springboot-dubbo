package com.mlgg.provider;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.mlgg.service.DemoService;

/**
 * @author zhang.yifei4
 * @version 1.0
 * @ClassName MyServiceImpl
 * <p>
 * Created on 2019/4/4
 * @since v9.0
 */
@Service(interfaceName = "myServiceImpl")
public class MyServiceImpl{

	private static final Logger logger = LoggerFactory.getLogger(MyServiceImpl.class);

	public String sayHello(String name) {
		logger.info("你好"+name+",请求来自："+ RpcContext.getContext().getRemoteAddress());
		return "你好"+name+",请求来自："+ RpcContext.getContext().getLocalAddress();
	}
}
