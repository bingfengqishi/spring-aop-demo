package cn.com.spring.aop.demo;

public class TestBean {
	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	public void test(){
		System.out.println("这是测试!");
	}
}