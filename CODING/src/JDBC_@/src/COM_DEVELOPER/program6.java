package COM_DEVELOPER;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
// dealing with files.
public class program6 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/PERFECT";
		String username = "root";
		String password = "root@dk";
		String QUERY = "update student set s = ? where sId = ?";
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = con.prepareStatement(QUERY);
			System.out.println("Enter the sId ");
			int a = in.nextInt();

			System.out.println(x+" rows updated");
			
		} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
