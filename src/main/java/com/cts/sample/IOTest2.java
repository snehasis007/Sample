package com.cts.sample;

import static java.nio.file.StandardOpenOption.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOTest2 {
	public void write() throws IOException {
		Path file = Paths.get("datafiles/textfiles");
		//Properties prop= java.lang.System.getProperties();
		//System.out.println(prop.toString());
		//Path a=Paths.get(System.getProperty("user.home"),"db1data/data1");
		Files.createDirectories(file);
		Path abspath = Paths.get("datafiles/textfiles", "file1.txt");
		BufferedWriter br=Files.newBufferedWriter(abspath, CREATE,APPEND);
		String data="dgfhgd";
		br.write(data,0, data.length());
		br.flush();
		br.close();
		
	}
	public static void main(String [] args){
		IOTest2 s=new IOTest2();
		try {
			s.write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
