package DataAccessObjectPattern;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
	static final String JDBC_DRIVER = "org.postgresql.Driver"; // jdbc name
	static final String DB_URL = "jdbc:postgresql://localhost/MAURYA"; // jdbc url
// database credentials
	static final String USER = "postgres";
	static final String PASS = "postgres";

    public static void main(String[] args) {
        
        //Load and register driver
    
		try {
			//Request for connection
			Connection conn = DriverManager.getConnection(DB_URL,USER, PASS);
		   //Submit sql commands to the db server
			Statement stmt = conn.createStatement();
			// open a connection
			System.out.println(" connecting to database... ");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			//submit commands to the db server and execute query
			stmt = conn.createStatement();
			String sql = "SELECT * from employees";
		   ResultSet rs=stmt.executeQuery(sql);
		
		//process result
		while(rs.next()) {
			System.out.println(" connecting to database...2 "+rs.getString(1)+rs.getString(2)+rs.getString(3));	
		}
			stmt.close();
			conn.close();
    	}catch(SQLException e) {
    		System.err.println(e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
    	}
    }
}
