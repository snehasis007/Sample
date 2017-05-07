package com.cts.sample;

public class LambdaTest {
	
	@FunctionalInterface
	public interface Callback{
		String VAL="Callback";
		public String getCallback(String data);
		public  static String defaultCallback(String data){
			return data+"::"+VAL;
		}
	}
	
	public String test(Callback c,String data){
		return c.getCallback(data);
	}
	
	public static void main(String [] args){
		LambdaTest t=new LambdaTest();
		String s="hello";
		System.out.println(t.test(s1 -> s1+ ":::test"+Callback.VAL, s));
		System.out.println(t.test(Callback::defaultCallback, s));
	}

}
