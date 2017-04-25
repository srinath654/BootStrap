package com.javatpoint.dao;
import java.sql.*;
public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("org.gjt.mm.mysql.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	}catch(Exception ex){System.out.println(ex);}
	return con;
}
}
