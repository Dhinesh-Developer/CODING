package com.dk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class userDAOImpl implements userDAO{
	
	String url = "jdbc:mysql//localhost:3306/user";
	String username = "root";
	String password = "root@dk";
	String QUERY = "insert into register (uName,uEmail,uPassword) values (?,?,?)";
	@Override
	public int insertUser(user user) {
		int x = -1;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = con.prepareStatement(QUERY);
			pstmt.setString(1,user.getuName());
			pstmt.setString(2,user.getuEmail());
			pstmt.setString(3,user.getuPassword());
			x = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public List getAllUser() {
		return null;
	}

}
