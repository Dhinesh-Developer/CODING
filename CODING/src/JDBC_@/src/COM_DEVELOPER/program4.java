package COM_DEVELOPER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
// delete speci----------fic rows.
public class program4 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/PERFECT";
		String username = "root";
		String password = "root@dk";
		String QUERY = "delete from student where sId = ?";
		Scanner in = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = con.prepareStatement(QUERY);
			System.out.println("Enter the sId:");
			int a = in.nextInt();
			pstmt.setInt(1,a);
			int x = pstmt.executeUpdate();
			System.out.println(x);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
			
	}

}
