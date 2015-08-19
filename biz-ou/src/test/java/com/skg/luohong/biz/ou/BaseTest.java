package com.skg.luohong.biz.ou;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skg.luohong.biz.ou.system.service.IDaysUserService;


/**
 * 
 * 单元测试基础类
 * 直接使用开发环境的配置文件
 * @author 骆宏
 * @date 2015-08-15 12:02
 * @author 846705189@qq.com
 * @author 15013336884
 * @blog http://blog.csdn.net/u010469003
 */
@ContextConfiguration({"classpath:conf/spring-mybatis.xml", "classpath:conf/spring.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest{
	
	@Autowired
	private IDaysUserService resourceService;
	
	
	@Test
	public void add(){
		System.out.println(resourceService);
		System.out.println(resourceService.findAll());
	}
	
	
}
