package com.cts.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {

	public boolean findMatch(String data, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(data);
		// while(m.find()){
		if (m.find()) {
			System.out.println("match found");
			return true;
			// }
		}
		return false;
	}

	public static void main(String[] args) {
		RegTest test = new RegTest();
		//while (true) {
			System.out.println(test.findMatch("244 ", "[0-9]+\\s"));
		//}
	}

}
