package databseConnectionPostgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseConnectionPractice2 {
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
	String QUERY ="INSERT INTO employees VALUES (?,?,?,?)";
	PreparedStatement pst=conn.prepareStatement(QUERY);//prepare compile
	pst.setInt(1,105);
	pst.setString(2,"nikhila");
	pst.setInt(3,20);
	pst.setDouble(4,6000000.0);
	int result =pst.executeUpdate();
	if(result==1) {
		System.out.println("1 row inserted");
	}else {
		System.out.println("0 row inserted");
	}
//			stmt.close();
			conn.close();
    	}catch(SQLException e) {
    		System.err.println(e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
    	}
    }
}
