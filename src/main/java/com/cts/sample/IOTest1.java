package com.cts.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.*;

public class IOTest1 {
	public List<String> load() throws IOException {
		Path file = Paths.get("datafiles/textfiles");
		//Properties prop= java.lang.System.getProperties();
		//System.out.println(prop.toString());
		//Path a=Paths.get(System.getProperty("user.home"),"db1data/data1");
		Files.createDirectories(file);
		Path abspath = Paths.get("datafiles/textfiles", "file1.txt");
		Files.newBufferedWriter(abspath, CREATE);
		BufferedReader br=Files.newBufferedReader(abspath);
		String s=null;
		List<String> data=new ArrayList<>();
		while((s=br.readLine())!=null){
			System.out.println(s);
			data.add(s);
		}
		br.close();
		return data;
	}
	
	public static void main(String [] args){
		IOTest1 s=new IOTest1();
		try {
			s.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
