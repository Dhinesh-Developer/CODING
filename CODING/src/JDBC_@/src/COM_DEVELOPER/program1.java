package COM_DEVELOPER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 // select Everything from table and print it. 
public class program1 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/PERFECT";
		String username = "root";
		String password = "root@dk";
		String QUERY = "select * from student";
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(QUERY);
			while(res.next()) {
				System.out.print(res.getInt(1)+"   ");
				System.out.print(res.getString(2)+"   ");
				System.out.print(res.getInt(3)+"   ");
				System.out.print(res.getString(4)+"   ");
				System.out.println(res.getBlob(5));
				System.out.println();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
