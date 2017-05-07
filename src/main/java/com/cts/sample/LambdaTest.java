package com.cts.sample;

public class LambdaTest {
	
	public interface Callback{
		public String getCallback(String data);
	}
	
	public String test(Callback c,String data){
		return c.getCallback(data);
	}
	
	public static void main(String [] args){
		LambdaTest t=new LambdaTest();
		String s="hello";
		System.out.println(t.test(s1 -> s1+ ":::test", s));
	}

}