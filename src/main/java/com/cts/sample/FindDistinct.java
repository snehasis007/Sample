package com.cts.sample;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDistinct {
	public Set<String> distinctList(String data) {
		String[] args = data.split("\\s");
		Set<String> dataSet = new HashSet<>();
		for (String parts : args) {
			dataSet.add(parts);
		}
		return dataSet;
	}

	public static void main(String[] args) {
		IOTest1 ioTest1 = new IOTest1();
		FindDistinct fs = new FindDistinct();
		try {
			List<String> data = ioTest1.load();
			Set<String> vals = null;
			for (String line : data) {
				vals = fs.distinctList(line);
				System.out.println(vals.size() + "distinct words:" + vals);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
