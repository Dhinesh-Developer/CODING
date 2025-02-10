package com.DhineshDeveloper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EstablishConnection {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MasterJdbc","root","root@dk");
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from employee");
			
			while(res.next()) {
				String name = res.getString("eName");
				String email = res.getString("eEmail");
				String passwd = res.getString("ePasswd");
				String salary = res.getString("eSalary");
				String dept = res.getString("eDept");
				
				System.out.println(name+"    "+email+"   "+passwd+"   "+salary+"   "+dept);
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
