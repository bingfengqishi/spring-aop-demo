package cn.com.spring.aop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("application.xml");
		TestBean testBean = (TestBean) bf.getBean("testBean");
		testBean.test();
	}

}
