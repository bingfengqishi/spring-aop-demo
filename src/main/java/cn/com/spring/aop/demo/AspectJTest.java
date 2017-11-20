package cn.com.spring.aop.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJTest {
	@Pointcut("execution(* *.test(..))")
	public void test(){
		
	}
	
	@Before("test()")
	public void beforeTest(){
		System.out.println("Before Test!");
	}
	
	@After("test()")
	public void afterTest(){
		System.out.println("After Test!");
	}
	
	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p){
		System.out.println("before hahhhh!");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("after hahhhh!");
		return o;
	}
}
