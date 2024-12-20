package COM_DEVELOPER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
// insert new rows.
public class program3 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/PERFECT";
		String username = "root";
		String password = "root@dk";
		String QUERY = "insert into student (sId,sName,sAge,sCourse) values (?,?,?,?)";
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = con.prepareStatement(QUERY);
			System.out.println("Enter the sId: ");
			int a = in.nextInt();
			System.out.println("Enter the sName: ");
			String b = inp.nextLine();
			System.out.println();
			System.out.println("Enter the sAge: ");
			int c = in.nextInt();
			System.out.println("Enter the sCourse: ");
			String d = inp.nextLine();
			pstmt.setInt(1, a);
			pstmt.setString(2, b);
			pstmt.setInt(3, c);
			pstmt.setString(4, d);
			int x = pstmt.executeUpdate();
			System.out.println(1);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
