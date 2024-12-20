package COM_DEVELOPER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
// select specific row from table
public class program2 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/PERFECT";
		String username = "root";
		String password = "root@dk";
		String QUERY = "select * from student where sId = ?";
		Scanner in = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = con.prepareStatement(QUERY);
			System.out.println("Enter the id: ");
			int a = in.nextInt();
			pstmt.setInt(1, a);
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				System.out.println(res.getInt("sId")+"	"
						+res.getString("sName")+"	"
						+res.getInt("sAge")+"	"+
						res.getString("sCourse"));
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
