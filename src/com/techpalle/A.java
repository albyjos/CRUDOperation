package com.techpalle;

import java.sql.*;

public class A {
	Connection con=null;
	Statement s=null;
	public void creating()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
			s=con.createStatement();
			s.executeUpdate("create table emp(ename varchar(30), esal int)");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				s.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void inserting(String name, int sal)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
			s=con.createStatement();
			s.executeUpdate("insert into emp  values('"+name+"',"+sal+")");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				s.close();
				con.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
	}

}
