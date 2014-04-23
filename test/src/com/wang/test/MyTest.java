package com.wang.test;


public class MyTest {
	
	
	 public <T> T getMapper(T t) {
		 
		 
		 System.out.println(t.getClass().getName());
		 
		 
		 
		 return t;
	 }
	 
	 
	 public static void main(String[] args) {
		
		 MyBean mb=new MyBean();
		 MyTest mt =new MyTest();
		 
		 mt.getMapper(mb);
		 
		 
		
	}
	
	
	

}
