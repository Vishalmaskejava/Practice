import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.student.Student;

public class PerformOperations {
	
	public static boolean InsertStudentIntoDB(Student std) {
		boolean f = false;
			
		try {
			//Connection code (use already created in Connection Provider class)
			Connection con = ConnectionProvider.createConnection();
			String query = "insert into students (name,phone_num,city) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, std.getName());
			pstmt.setString(2, std.getPhone());
			pstmt.setString(3, std.getCity());
			
			pstmt.executeUpdate();
			f = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
		
	}

}
