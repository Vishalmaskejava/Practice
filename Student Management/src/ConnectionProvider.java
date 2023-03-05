import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	static Connection con;

	public static Connection createConnection() {
		
				
		try {
			//step 1 = load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//step 2 = create the connection
			String url="jdbc:mysql://localhost:3306/Student_Management";
			String user="root";
			String password="Vishal@123";
			con = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  con;
	}

}
