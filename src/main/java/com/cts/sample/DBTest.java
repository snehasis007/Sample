package com.cts.sample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.jdbcx.JdbcDataSource;

public class DBTest {
	
	public static void main(String [] args){
		JdbcDataSource ds = new JdbcDataSource();
		ds.setURL("jdbc:h2:~/test");
		ds.setUser("sa");
		ds.setPassword("sa");
		try {
			Connection conn = ds.getConnection();
			Statement st=conn.createStatement();
			String cr="CREATE TABLE IF NOT EXISTS TEST(ID INT PRIMARY KEY,NAME VARCHAR(255))";
			//String in="INSERT INTO TEST VALUES(1,'hello')";
			String se="SELECT * from TEST";
			st.executeUpdate(cr);
			//st.executeUpdate(in);
			ResultSet rs=st.executeQuery(se);
			while(rs.next()){
				int id=rs.getInt("ID");
				String name=rs.getString("NAME");
				System.out.println("id:"+id);
				System.out.println("name:"+name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
