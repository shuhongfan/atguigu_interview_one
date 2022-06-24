package com.atguigu.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beans.Book;

public class SpringTest {

	//01.Spring Bean的作用域之间有什么区别

	//创建IOC容器对象
	ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
	
	@Test
	public void testBook() {
		Book book = (Book) ioc.getBean("book");
		Book book2 = (Book) ioc.getBean("book");
		System.out.println(book==book2);
	}
}
